package com.litesoftwares.coingecko.exception;

import com.litesoftwares.coingecko.CoinGeckoApiError;

public class CoinGeckoApiException extends RuntimeException {
    private final static long serialVersionUID = -4298738252483677889L;
    private CoinGeckoApiError error;

    public CoinGeckoApiException(CoinGeckoApiError error) {
        this.error = error;
    }

    public CoinGeckoApiException(Throwable cause) {
        super(cause);
    }

    public CoinGeckoApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinGeckoApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.toString();
        }
        return super.getMessage();
    }
}
