package com.litesoftwares.coingecko;

import com.litesoftwares.coingecko.domain.*;
import com.litesoftwares.coingecko.domain.Coins.*;
import com.litesoftwares.coingecko.domain.Events.EventCountries;
import com.litesoftwares.coingecko.domain.Events.EventTypes;
import com.litesoftwares.coingecko.domain.Events.Events;
import com.litesoftwares.coingecko.domain.ExchangeRates.ExchangeRates;
import com.litesoftwares.coingecko.domain.Exchanges.*;
import com.litesoftwares.coingecko.domain.Global.Global;
import com.litesoftwares.coingecko.domain.Status.StatusUpdates;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

public interface CoinGeckoApiService {
    @GET("ping")
    Call<Ping> ping();

    @GET("simple/price")
    Call<Map<String,Map<String, Double>>> getPrice(@Query("ids") String ids,
                                      @Query("vs_currencies") String vsCurrencies,
                                      @Query("include_market_cap") boolean includeMarketCap,
                                      @Query("include_24hr_vol") boolean include24hrVol,
                                      @Query("include_24hr_change") boolean include24hrChange,
                                      @Query("include_last_updated_at") boolean includeLastUpdatedAt);

    @GET("simple/token_price/{id}")
    Call<Map<String,Map<String, Double>>> getTokenPrice(@Path("id") String id, @Query("contract_addresses") String contractAddress,
                               @Query("vs_currencies") String vsCurrencies, @Query("include_market_cap") boolean includeMarketCap,
                               @Query("include_24hr_vol") boolean include24hrVol, @Query("include_24hr_change") boolean include24hrChange,
                               @Query("include_last_updated_at") boolean includeLastUpdatedAt);

    @GET("simple/supported_vs_currencies")
    Call<List<String>> getSupportedVsCurrencies();

    @GET("coins/list")
    Call<List<CoinList>> getCoinList();

    @GET("coins/markets")
    Call<List<CoinMarkets>> getCoinMarkets(@Query("vs_currency") String vsCurrency, @Query("ids") String ids,
                                           @Query("order") String order, @Query("per_page") Integer perPage,
                                           @Query("page") Integer page, @Query("sparkline") boolean sparkline,
                                           @Query("price_change_percentage") String priceChangePercentage);

    @GET("coins/{id}")
    Call<CoinFullData> getCoinById(@Path("id") String id, @Query("localization") boolean localization, @Query("tickers") boolean tickers,
                               @Query("market_data") boolean marketData, @Query("community_data") boolean communityData,
                               @Query("developer_data") boolean developerData, @Query("sparkline") boolean sparkline);

    @GET("coins/{id}/tickers")
    Call<CoinTickerById> getCoinTickerById(@Path("id") String id, @Query("exchange_ids") String exchangeIds,
                                           @Query("page") Integer page,@Query("order") String order);

    @GET("coins/{id}/history")
    Call<CoinHistoryById> getCoinHistoryById(@Path("id") String id, @Query("date") String date,
                                             @Query("localization") boolean localization);

    @GET("coins/{id}/market_chart")
    Call<MarketChart> getCoinMarketChartById(@Path("id") String id, @Query("vs_currency") String vsCurrency,
                                        @Query("days") Integer days);

    @GET("coins/{id}/market_chart/range")
    Call<MarketChart> getCoinMarketChartRangeById(@Path("id") String id, @Query("vs_currency") String vsCurrency,
                                                  @Query("from") String from, @Query("to") String to);

    @GET("coins/{id}/status_updates")
    Call<StatusUpdates> getCoinStatusUpdateById(@Path("id") String id, @Query("per_page") Integer perPage, @Query("page") Integer page);

    @GET("coins/{id}/contract/{contract_address}")
    Call<CoinFullData> getCoinInfoByContractAddress(@Path("id") String id, @Path("contract_address") String contractAddress);

    @GET("exchanges")
    Call<List<Exchanges>> getExchanges();

    @GET("exchanges/list")
    Call<List<ExchangesList>> getExchangesList();

    @GET("exchanges/{id}")
    Call<ExchangeById> getExchangesById(@Path("id") String id);

    @GET("exchanges/{id}/tickers")
    Call<ExchangesTickersById> getExchangesTickersById(@Path("id") String id, @Query("coin_ids") String coinIds,
                                                       @Query("page") Integer page, @Query("order") String order);

    @GET("exchanges/{id}/status_updates")
    Call<StatusUpdates> getExchangesStatusUpdatesById(@Path("id") String id, @Query("per_page")Integer perPage,
                                                               @Query("page") Integer page);

    @GET("exchanges/{id}/volume_chart")
    Call<List<List<String>>> getExchangesVolumeChart(@Path("id") String id,@Query("days") Integer days);

    @GET("status_updates")
    Call<StatusUpdates> getStatusUpdates();

    @GET("status_updates")
    Call<StatusUpdates> getStatusUpdates(@Query("category") String category, @Query("project_type") String projectType,
                                  @Query("per_page") Integer perPage, @Query("page") Integer page);

    @GET("events")
    Call<Events> getEvents();

    @GET("events")
    Call<Events> getEvents(@Query("country_code") String countryCode, @Query("type") String type,
                           @Query("page") Integer page, @Query("upcoming_events_only") boolean upcomingEventsOnly,
                           @Query("from_date") String fromDate, @Query("to_date") String toDate);

    @GET("events/countries")
    Call<EventCountries> getEventsCountries();

    @GET("events/types")
    Call<EventTypes> getEventsTypes();

    @GET("exchange_rates")
    Call<ExchangeRates> getExchangeRates();

    @GET("global")
    Call<Global> getGlobal();
}
