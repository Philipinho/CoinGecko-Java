package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Global.Global;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;


public class GlobalExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        Global global = client.getGlobal();

        System.out.println(global);

        long markets = global.getData().getMarkets();
        System.out.println(markets);

        long activeCryptoCurrencies = global.getData().getActiveCryptocurrencies();
        System.out.println(activeCryptoCurrencies);

    }
}
