package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Search.Search;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class SearchExample {

    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        String query = "bitcoin";
        Search search = client.getSearchResult(query);

        System.out.println(search);

        client.shutdown();
    }

}
