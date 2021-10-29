package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Global.DecentralizedFinanceDefi;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class DecentralizedFinanceDefiExample {

    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        DecentralizedFinanceDefi defi = client.getDecentralizedFinanceDefi();

        System.out.println(defi.getData());

        client.shutdown();

    }
}
