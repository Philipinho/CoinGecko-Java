package com.litesoftwares.coingecko.domain.Exchanges;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Shared.Ticker;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangesTickersById {
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
        return "ExchangesTickersById{" +
                "name='" + name + '\'' +
                ", tickers=" + tickers +
                '}';
    }
}
