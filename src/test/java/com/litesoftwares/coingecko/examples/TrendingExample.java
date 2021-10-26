package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Search.Trending;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class TrendingExample{

    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        Trending trending = client.getTrending();

        System.out.println(trending.getCoins());

        client.shutdown();
    }

}
