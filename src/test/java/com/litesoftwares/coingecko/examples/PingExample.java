package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class PingExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
        System.out.println(client.ping());

    }
}
