package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.Roi;

import java.util.Map;

public class MarketData {
    @JsonProperty("current_price")
    private Map<String, Double> currentPrice;
    @JsonProperty("roi")
    private Roi roi;
    @JsonProperty("ath")
    private Map<String, Double> ath;
    @JsonProperty("ath_change_percentage")
    private Map<String, Double> athChangePercentage;
    @JsonProperty("ath_date")
    private Map<String, String> athDate;
    @JsonProperty("market_cap")
    private Map<String, Double> marketCap;
    @JsonProperty("market_cap_rank")
    private long marketCapRank;
    @JsonProperty("total_volume")
    private Map<String, Double> totalVolume;
    @JsonProperty("high_24h")
    private Map<String, Double> high24h;
    @JsonProperty("low_24h")
    private Map<String, Double> low24h;
    @JsonProperty("price_change_24h")
    private double priceChange24h;
    @JsonProperty("price_change_percentage_24h")
    private double priceChangePercentage24h;
    @JsonProperty("price_change_percentage_7d")
    private double priceChangePercentage7d;
    @JsonProperty("price_change_percentage_14d")
    private double priceChangePercentage14d;
    @JsonProperty("price_change_percentage_30d")
    private double priceChangePercentage30d;
    @JsonProperty("price_change_percentage_60d")
    private double priceChangePercentage60d;
    @JsonProperty("price_change_percentage_200d")
    private double priceChangePercentage200d;
    @JsonProperty("price_change_percentage_1y")
    private double priceChangePercentage1y;
    @JsonProperty("market_cap_change_24h")
    private double marketCapChange24h;
    @JsonProperty("market_cap_change_percentage_24h")
    private double marketCapChangePercentage24h;
    @JsonProperty("price_change_24h_in_currency")
    private Map<String, Double> priceChange24hInCurrency;
    @JsonProperty("price_change_percentage_1h_in_currency")
    private Map<String, Double> priceChangePercentage1hInCurrency;
    @JsonProperty("price_change_percentage_24h_in_currency")
    private Map<String, Double> priceChangePercentage24hInCurrency;
    @JsonProperty("price_change_percentage_7d_in_currency")
    private Map<String, Double> priceChangePercentage7dInCurrency;
    @JsonProperty("price_change_percentage_14d_in_currency")
    private Map<String, Double> priceChangePercentage14dInCurrency;
    @JsonProperty("price_change_percentage_30d_in_currency")
    private Map<String, Double> priceChangePercentage30dInCurrency;
    @JsonProperty("price_change_percentage_60d_in_currency")
    private Map<String, Double> priceChangePercentage60dInCurrency;
    @JsonProperty("price_change_percentage_200d_in_currency")
    private Map<String, Double> priceChangePercentage200dInCurrency;
    @JsonProperty("price_change_percentage_1y_in_currency")
    private Map<String, Double> priceChangePercentage1yInCurrency;
    @JsonProperty("market_cap_change_24h_in_currency")
    private Map<String, Double> marketCapChange24hInCurrency;
    @JsonProperty("market_cap_change_percentage_24h_in_currency")
    private Map<String, Double> marketCapChangePercentage24hInCurrency;
    @JsonProperty("total_supply")
    private long totalSupply;
    @JsonProperty("circulating_supply")
    private double circulatingSupply;
    @JsonProperty("last_updated")
    private String lastUpdated;

    public Map<String, Double> getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Map<String, Double> currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Roi getRoi() {
        return roi;
    }

    public void setRoi(Roi roi) {
        this.roi = roi;
    }

    public Map<String, Double> getAth() {
        return ath;
    }

    public void setAth(Map<String, Double> ath) {
        this.ath = ath;
    }

    public Map<String, Double> getAthChangePercentage() {
        return athChangePercentage;
    }

    public void setAthChangePercentage(Map<String, Double> athChangePercentage) {
        this.athChangePercentage = athChangePercentage;
    }

    public Map<String, String> getAthDate() {
        return athDate;
    }

    public void setAthDate(Map<String, String> athDate) {
        this.athDate = athDate;
    }

    public Map<String, Double> getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Map<String, Double> marketCap) {
        this.marketCap = marketCap;
    }

    public long getMarketCapRank() {
        return marketCapRank;
    }

    public void setMarketCapRank(long marketCapRank) {
        this.marketCapRank = marketCapRank;
    }

    public Map<String, Double> getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Map<String, Double> totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Map<String, Double> getHigh24h() {
        return high24h;
    }

    public void setHigh24h(Map<String, Double> high24h) {
        this.high24h = high24h;
    }

    public Map<String, Double> getLow24h() {
        return low24h;
    }

    public void setLow24h(Map<String, Double> low24h) {
        this.low24h = low24h;
    }

    public double getPriceChange24h() {
        return priceChange24h;
    }

    public void setPriceChange24h(double priceChange24h) {
        this.priceChange24h = priceChange24h;
    }

    public double getPriceChangePercentage24h() {
        return priceChangePercentage24h;
    }

    public void setPriceChangePercentage24h(double priceChangePercentage24h) {
        this.priceChangePercentage24h = priceChangePercentage24h;
    }

    public double getPriceChangePercentage7d() {
        return priceChangePercentage7d;
    }

    public void setPriceChangePercentage7d(double priceChangePercentage7d) {
        this.priceChangePercentage7d = priceChangePercentage7d;
    }

    public double getPriceChangePercentage14d() {
        return priceChangePercentage14d;
    }

    public void setPriceChangePercentage14d(double priceChangePercentage14d) {
        this.priceChangePercentage14d = priceChangePercentage14d;
    }

    public double getPriceChangePercentage30d() {
        return priceChangePercentage30d;
    }

    public void setPriceChangePercentage30d(double priceChangePercentage30d) {
        this.priceChangePercentage30d = priceChangePercentage30d;
    }

    public double getPriceChangePercentage60d() {
        return priceChangePercentage60d;
    }

    public void setPriceChangePercentage60d(double priceChangePercentage60d) {
        this.priceChangePercentage60d = priceChangePercentage60d;
    }

    public double getPriceChangePercentage200d() {
        return priceChangePercentage200d;
    }

    public void setPriceChangePercentage200d(double priceChangePercentage200d) {
        this.priceChangePercentage200d = priceChangePercentage200d;
    }

    public double getPriceChangePercentage1y() {
        return priceChangePercentage1y;
    }

    public void setPriceChangePercentage1y(double priceChangePercentage1y) {
        this.priceChangePercentage1y = priceChangePercentage1y;
    }

    public double getMarketCapChange24h() {
        return marketCapChange24h;
    }

    public void setMarketCapChange24h(double marketCapChange24h) {
        this.marketCapChange24h = marketCapChange24h;
    }

    public double getMarketCapChangePercentage24h() {
        return marketCapChangePercentage24h;
    }

    public void setMarketCapChangePercentage24h(double marketCapChangePercentage24h) {
        this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    }

    public Map<String, Double> getPriceChange24hInCurrency() {
        return priceChange24hInCurrency;
    }

    public void setPriceChange24hInCurrency(Map<String, Double> priceChange24hInCurrency) {
        this.priceChange24hInCurrency = priceChange24hInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage1hInCurrency() {
        return priceChangePercentage1hInCurrency;
    }

    public void setPriceChangePercentage1hInCurrency(Map<String, Double> priceChangePercentage1hInCurrency) {
        this.priceChangePercentage1hInCurrency = priceChangePercentage1hInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage24hInCurrency() {
        return priceChangePercentage24hInCurrency;
    }

    public void setPriceChangePercentage24hInCurrency(Map<String, Double> priceChangePercentage24hInCurrency) {
        this.priceChangePercentage24hInCurrency = priceChangePercentage24hInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage7dInCurrency() {
        return priceChangePercentage7dInCurrency;
    }

    public void setPriceChangePercentage7dInCurrency(Map<String, Double> priceChangePercentage7dInCurrency) {
        this.priceChangePercentage7dInCurrency = priceChangePercentage7dInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage14dInCurrency() {
        return priceChangePercentage14dInCurrency;
    }

    public void setPriceChangePercentage14dInCurrency(Map<String, Double> priceChangePercentage14dInCurrency) {
        this.priceChangePercentage14dInCurrency = priceChangePercentage14dInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage30dInCurrency() {
        return priceChangePercentage30dInCurrency;
    }

    public void setPriceChangePercentage30dInCurrency(Map<String, Double> priceChangePercentage30dInCurrency) {
        this.priceChangePercentage30dInCurrency = priceChangePercentage30dInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage60dInCurrency() {
        return priceChangePercentage60dInCurrency;
    }

    public void setPriceChangePercentage60dInCurrency(Map<String, Double> priceChangePercentage60dInCurrency) {
        this.priceChangePercentage60dInCurrency = priceChangePercentage60dInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage200dInCurrency() {
        return priceChangePercentage200dInCurrency;
    }

    public void setPriceChangePercentage200dInCurrency(Map<String, Double> priceChangePercentage200dInCurrency) {
        this.priceChangePercentage200dInCurrency = priceChangePercentage200dInCurrency;
    }

    public Map<String, Double> getPriceChangePercentage1yInCurrency() {
        return priceChangePercentage1yInCurrency;
    }

    public void setPriceChangePercentage1yInCurrency(Map<String, Double> priceChangePercentage1yInCurrency) {
        this.priceChangePercentage1yInCurrency = priceChangePercentage1yInCurrency;
    }

    public Map<String, Double> getMarketCapChange24hInCurrency() {
        return marketCapChange24hInCurrency;
    }

    public void setMarketCapChange24hInCurrency(Map<String, Double> marketCapChange24hInCurrency) {
        this.marketCapChange24hInCurrency = marketCapChange24hInCurrency;
    }

    public Map<String, Double> getMarketCapChangePercentage24hInCurrency() {
        return marketCapChangePercentage24hInCurrency;
    }

    public void setMarketCapChangePercentage24hInCurrency(Map<String, Double> marketCapChangePercentage24hInCurrency) {
        this.marketCapChangePercentage24hInCurrency = marketCapChangePercentage24hInCurrency;
    }

    public long getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(long totalSupply) {
        this.totalSupply = totalSupply;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "MarketData{" +
                "currentPrice=" + currentPrice +
                ", roi=" + roi +
                ", ath=" + ath +
                ", athChangePercentage=" + athChangePercentage +
                ", athDate=" + athDate +
                ", marketCap=" + marketCap +
                ", marketCapRank=" + marketCapRank +
                ", totalVolume=" + totalVolume +
                ", high24h=" + high24h +
                ", low24h=" + low24h +
                ", priceChange24h=" + priceChange24h +
                ", priceChangePercentage24h=" + priceChangePercentage24h +
                ", priceChangePercentage7d=" + priceChangePercentage7d +
                ", priceChangePercentage14d=" + priceChangePercentage14d +
                ", priceChangePercentage30d=" + priceChangePercentage30d +
                ", priceChangePercentage60d=" + priceChangePercentage60d +
                ", priceChangePercentage200d=" + priceChangePercentage200d +
                ", priceChangePercentage1y=" + priceChangePercentage1y +
                ", marketCapChange24h=" + marketCapChange24h +
                ", marketCapChangePercentage24h=" + marketCapChangePercentage24h +
                ", priceChange24hInCurrency=" + priceChange24hInCurrency +
                ", priceChangePercentage1hInCurrency=" + priceChangePercentage1hInCurrency +
                ", priceChangePercentage24hInCurrency=" + priceChangePercentage24hInCurrency +
                ", priceChangePercentage7dInCurrency=" + priceChangePercentage7dInCurrency +
                ", priceChangePercentage14dInCurrency=" + priceChangePercentage14dInCurrency +
                ", priceChangePercentage30dInCurrency=" + priceChangePercentage30dInCurrency +
                ", priceChangePercentage60dInCurrency=" + priceChangePercentage60dInCurrency +
                ", priceChangePercentage200dInCurrency=" + priceChangePercentage200dInCurrency +
                ", priceChangePercentage1yInCurrency=" + priceChangePercentage1yInCurrency +
                ", marketCapChange24hInCurrency=" + marketCapChange24hInCurrency +
                ", marketCapChangePercentage24hInCurrency=" + marketCapChangePercentage24hInCurrency +
                ", totalSupply=" + totalSupply +
                ", circulatingSupply=" + circulatingSupply +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
