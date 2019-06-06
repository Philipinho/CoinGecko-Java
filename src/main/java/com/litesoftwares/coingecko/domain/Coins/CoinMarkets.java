package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.Roi;
import com.litesoftwares.coingecko.domain.Coins.CoinData.SparklineIn7d;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinMarkets {
    @JsonProperty("id")
    private String id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private String image;
    @JsonProperty("current_price")
    private long currentPrice;
    @JsonProperty("market_cap")
    private long marketCap;
    @JsonProperty("market_cap_rank")
    private long marketCapRank;
    @JsonProperty("total_volume")
    private long totalVolume;
    @JsonProperty("high_24h")
    private long high24h;
    @JsonProperty("low_24h")
    private long low24h;
    @JsonProperty("price_change_24h")
    private double priceChange24h;
    @JsonProperty("price_change_percentage_24h")
    private double priceChangePercentage24h;
    @JsonProperty("market_cap_change_24h")
    private long marketCapChange24h;
    @JsonProperty("market_cap_change_percentage_24h")
    private double marketCapChangePercentage24h;
    @JsonProperty("circulating_supply")
    private long circulatingSupply;
    @JsonProperty("total_supply")
    private long totalSupply;
    @JsonProperty("ath")
    private long ath;
    @JsonProperty("ath_change_percentage")
    private double athChangePercentage;
    @JsonProperty("ath_date")
    private String athDate;
    @JsonProperty("roi")
    private Roi roi;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("sparkline_in_7d")
    private SparklineIn7d sparklineIn7d;
    @JsonProperty("price_change_percentage_1h_in_currency")
    private double priceChangePercentage1hInCurrency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(long currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getMarketCapRank() {
        return marketCapRank;
    }

    public void setMarketCapRank(long marketCapRank) {
        this.marketCapRank = marketCapRank;
    }

    public long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public long getHigh24h() {
        return high24h;
    }

    public void setHigh24h(long high24h) {
        this.high24h = high24h;
    }

    public long getLow24h() {
        return low24h;
    }

    public void setLow24h(long low24h) {
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

    public long getMarketCapChange24h() {
        return marketCapChange24h;
    }

    public void setMarketCapChange24h(long marketCapChange24h) {
        this.marketCapChange24h = marketCapChange24h;
    }

    public double getMarketCapChangePercentage24h() {
        return marketCapChangePercentage24h;
    }

    public void setMarketCapChangePercentage24h(double marketCapChangePercentage24h) {
        this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public long getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(long totalSupply) {
        this.totalSupply = totalSupply;
    }

    public long getAth() {
        return ath;
    }

    public void setAth(long ath) {
        this.ath = ath;
    }

    public double getAthChangePercentage() {
        return athChangePercentage;
    }

    public void setAthChangePercentage(double athChangePercentage) {
        this.athChangePercentage = athChangePercentage;
    }

    public String getAthDate() {
        return athDate;
    }

    public void setAthDate(String athDate) {
        this.athDate = athDate;
    }

    public Roi getRoi() {
        return roi;
    }

    public void setRoi(Roi roi) {
        this.roi = roi;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public SparklineIn7d getSparklineIn7d() {
        return sparklineIn7d;
    }

    public void setSparklineIn7d(SparklineIn7d sparklineIn7d) {
        this.sparklineIn7d = sparklineIn7d;
    }

    public double getPriceChangePercentage1hInCurrency() {
        return priceChangePercentage1hInCurrency;
    }

    public void setPriceChangePercentage1hInCurrency(double priceChangePercentage1hInCurrency) {
        this.priceChangePercentage1hInCurrency = priceChangePercentage1hInCurrency;
    }

    @Override
    public String toString() {
        return "CoinMarkets{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", currentPrice=" + currentPrice +
                ", marketCap=" + marketCap +
                ", marketCapRank=" + marketCapRank +
                ", totalVolume=" + totalVolume +
                ", high24h=" + high24h +
                ", low24h=" + low24h +
                ", priceChange24h=" + priceChange24h +
                ", priceChangePercentage24h=" + priceChangePercentage24h +
                ", marketCapChange24h=" + marketCapChange24h +
                ", marketCapChangePercentage24h=" + marketCapChangePercentage24h +
                ", circulatingSupply=" + circulatingSupply +
                ", totalSupply=" + totalSupply +
                ", ath=" + ath +
                ", athChangePercentage=" + athChangePercentage +
                ", athDate='" + athDate + '\'' +
                ", roi=" + roi +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", sparklineIn7d=" + sparklineIn7d +
                ", priceChangePercentage1hInCurrency=" + priceChangePercentage1hInCurrency +
                '}';
    }
}

