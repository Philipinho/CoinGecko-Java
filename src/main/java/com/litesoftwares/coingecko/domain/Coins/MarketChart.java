package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketChart {
    @JsonProperty("prices")
    private List<List<String>> prices;
    @JsonProperty("market_caps")
    private List<List<String>> marketCaps;
    @JsonProperty("total_volumes")
    private List<List<String>> totalVolumes;

    public List<List<String>> getPrices() {
        return prices;
    }

    public void setPrices(List<List<String>> prices) {
        this.prices = prices;
    }

    public List<List<String>> getMarketCaps() {
        return marketCaps;
    }

    public void setMarketCaps(List<List<String>> marketCaps) {
        this.marketCaps = marketCaps;
    }

    public List<List<String>> getTotalVolumes() {
        return totalVolumes;
    }

    public void setTotalVolumes(List<List<String>> totalVolumes) {
        this.totalVolumes = totalVolumes;
    }

    @Override
    public String toString() {
        return "MarketChart{" +
                "prices=" + prices +
                ", marketCaps=" + marketCaps +
                ", totalVolumes=" + totalVolumes +
                '}';
    }
}
