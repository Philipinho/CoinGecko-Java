package com.litesoftwares.coingecko.domain.Global;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class GlobalData {
    @JsonProperty("active_cryptocurrencies")
    private long activeCryptocurrencies;
    @JsonProperty("upcoming_icos")
    private long upcomingIcos;
    @JsonProperty("ongoing_icos")
    private long ongoingIcos;
    @JsonProperty("ended_icos")
    private long endedIcos;
    @JsonProperty("markets")
    private long markets;
    @JsonProperty("total_market_cap")
    private Map<String, Double> totalMarketCap;
    @JsonProperty("total_volume")
    private Map<String, Double> totalVolume;
    @JsonProperty("market_cap_percentage")
    private Map<String, Double> marketCapPercentage;
    @JsonProperty("market_cap_change_percentage_24h_usd")
    private double marketCapChangePercentage24hUsd;
    @JsonProperty("updated_at")
    private long updatedAt;

    public long getActiveCryptocurrencies() {
        return activeCryptocurrencies;
    }

    public void setActiveCryptocurrencies(long activeCryptocurrencies) {
        this.activeCryptocurrencies = activeCryptocurrencies;
    }

    public long getUpcomingIcos() {
        return upcomingIcos;
    }

    public void setUpcomingIcos(long upcomingIcos) {
        this.upcomingIcos = upcomingIcos;
    }

    public long getOngoingIcos() {
        return ongoingIcos;
    }

    public void setOngoingIcos(long ongoingIcos) {
        this.ongoingIcos = ongoingIcos;
    }

    public long getEndedIcos() {
        return endedIcos;
    }

    public void setEndedIcos(long endedIcos) {
        this.endedIcos = endedIcos;
    }

    public long getMarkets() {
        return markets;
    }

    public void setMarkets(long markets) {
        this.markets = markets;
    }

    public Map<String, Double> getTotalMarketCap() {
        return totalMarketCap;
    }

    public void setTotalMarketCap(Map<String, Double> totalMarketCap) {
        this.totalMarketCap = totalMarketCap;
    }

    public Map<String, Double> getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Map<String, Double> totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Map<String, Double> getMarketCapPercentage() {
        return marketCapPercentage;
    }

    public void setMarketCapPercentage(Map<String, Double> marketCapPercentage) {
        this.marketCapPercentage = marketCapPercentage;
    }

    public double getMarketCapChangePercentage24hUsd() {
        return marketCapChangePercentage24hUsd;
    }

    public void setMarketCapChangePercentage24hUsd(double marketCapChangePercentage24hUsd) {
        this.marketCapChangePercentage24hUsd = marketCapChangePercentage24hUsd;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "GlobalData{" +
                "activeCryptocurrencies=" + activeCryptocurrencies +
                ", upcomingIcos=" + upcomingIcos +
                ", ongoingIcos=" + ongoingIcos +
                ", endedIcos=" + endedIcos +
                ", markets=" + markets +
                ", totalMarketCap=" + totalMarketCap +
                ", totalVolume=" + totalVolume +
                ", marketCapPercentage=" + marketCapPercentage +
                ", marketCapChangePercentage24hUsd=" + marketCapChangePercentage24hUsd +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
