package com.litesoftwares.coingecko;

import com.litesoftwares.coingecko.exception.CoinGeckoApiException;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

public class CoinGeckoApi {
    private final String API_BASE_URL = "https://api.coingecko.com/api/v3/";

    private OkHttpClient okHttpClient = null;
    private Retrofit retrofit = null;

    public <S> S createService(Class<S> serviceClass, Long connectionTimeoutSeconds, Long readTimeoutSeconds, Long writeTimeoutSeconds){
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(connectionTimeoutSeconds, TimeUnit.SECONDS)
                .readTimeout(readTimeoutSeconds, TimeUnit.SECONDS)
                .writeTimeout(writeTimeoutSeconds, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(serviceClass);
    }

    public <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else if(response.code() == 429) {
                // When the client gets rate limited the response is a CloudFlare error page,
                // not a regular error body.
                CoinGeckoApiError apiError = new CoinGeckoApiError();
                apiError.setCode(1015);
                apiError.setMessage("Rate limited");
                throw new CoinGeckoApiException(apiError);
            } else {
                try {
                    CoinGeckoApiError apiError = getCoinGeckoApiError(response);
                    apiError.setCode(response.code());
                    throw new CoinGeckoApiException(apiError);
                } catch (IOException e) {
                    throw new CoinGeckoApiException(response.toString(), e);
                }
            }
        } catch (IOException e) {
            throw new CoinGeckoApiException(e);
        }
    }

    public void shutdown() {
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
    }

    private CoinGeckoApiError getCoinGeckoApiError(Response<?> response) throws IOException{
        return (CoinGeckoApiError) retrofit.responseBodyConverter(CoinGeckoApiError.class,new Annotation[0])
                .convert(response.errorBody());

    }
}
