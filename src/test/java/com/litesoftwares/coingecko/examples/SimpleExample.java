package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

import java.util.Map;

public class SimpleExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        Map<String, Map<String, Double>> bitcoin = client.getPrice("bitcoin",Currency.USD);

        System.out.println(bitcoin);

        double bitcoinPrice = bitcoin.get("bitcoin").get(Currency.USD);

        System.out.println(bitcoinPrice);
    }
}
