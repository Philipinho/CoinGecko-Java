package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class coinListPriceExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        List<String> list = Arrays.asList("bitcoin", "ethereum");

        Map<String, Map<String, Double>> tokensPrice = client.getPrice(list, Currency.USD);

        double bitcoinPrice = tokensPrice.get("bitcoin").get(Currency.USD);
        double ethereumPrice = tokensPrice.get("ethereum").get(Currency.USD);

        System.out.println(bitcoinPrice);
        System.out.println(ethereumPrice);
    }
}
