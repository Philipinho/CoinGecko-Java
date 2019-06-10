package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.ExchangeRates.ExchangeRates;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class ExchangeRatesExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        ExchangeRates exchangeRates = client.getExchangeRates();
        System.out.println(exchangeRates);

    }
}
