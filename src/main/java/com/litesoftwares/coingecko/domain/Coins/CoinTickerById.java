package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Shared.Ticker;

import java.util.List;

public class CoinTickerById {
    @JsonProperty("name")
    private String name;
    @JsonProperty("tickers")
    private List<Ticker> tickers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticker> getTickers() {
        return tickers;
    }

    public void setTickers(List<Ticker> tickers) {
        this.tickers = tickers;
    }

    @Override
    public String toString() {
        return "CoinTickerById{" +
                "name='" + name + '\'' +
                ", tickers=" + tickers +
                '}';
    }
}
