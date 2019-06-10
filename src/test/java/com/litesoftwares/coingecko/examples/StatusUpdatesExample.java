package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Status.StatusUpdates;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class StatusUpdatesExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        StatusUpdates statusUpdates = client.getStatusUpdates();
        System.out.println(statusUpdates);

        long totalStatusUpdates = statusUpdates.getUpdates().size();
        System.out.println(totalStatusUpdates);
    }
}
