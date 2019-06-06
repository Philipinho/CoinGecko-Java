package com.litesoftwares.coingecko.domain.Shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {
    @JsonProperty("base")
    private String base;
    @JsonProperty("target")
    private String target;
    @JsonProperty("market")
    private Market market;
    @JsonProperty("last")
    private double last;
    @JsonProperty("volume")
    private double volume;
    @JsonProperty("converted_last")
    private Map<String, String> convertedLast;
    @JsonProperty("converted_volume")
    private Map<String, String> convertedVolume;
    @JsonProperty("bid_ask_spread_percentage")
    private double bidAskSpreadPercentage;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("is_anomaly")
    private boolean isAnomaly;
    @JsonProperty("is_stale")
    private boolean isStale;
    @JsonProperty("trade_url")
    private String tradeUrl;
    @JsonProperty("coin_id")
    private String coinId;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Map<String, String> getConvertedLast() {
        return convertedLast;
    }

    public void setConvertedLast(Map<String, String> convertedLast) {
        this.convertedLast = convertedLast;
    }

    public Map<String, String> getConvertedVolume() {
        return convertedVolume;
    }

    public void setConvertedVolume(Map<String, String> convertedVolume) {
        this.convertedVolume = convertedVolume;
    }

    public double getBidAskSpreadPercentage() {
        return bidAskSpreadPercentage;
    }

    public void setBidAskSpreadPercentage(double bidAskSpreadPercentage) {
        this.bidAskSpreadPercentage = bidAskSpreadPercentage;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isAnomaly() {
        return isAnomaly;
    }

    public void setAnomaly(boolean anomaly) {
        isAnomaly = anomaly;
    }

    public boolean isStale() {
        return isStale;
    }

    public void setStale(boolean stale) {
        isStale = stale;
    }

    public String getTradeUrl() {
        return tradeUrl;
    }

    public void setTradeUrl(String tradeUrl) {
        this.tradeUrl = tradeUrl;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", market=" + market +
                ", last=" + last +
                ", volume=" + volume +
                ", convertedLast=" + convertedLast +
                ", convertedVolume=" + convertedVolume +
                ", bidAskSpreadPercentage=" + bidAskSpreadPercentage +
                ", timestamp='" + timestamp + '\'' +
                ", isAnomaly=" + isAnomaly +
                ", isStale=" + isStale +
                ", tradeUrl='" + tradeUrl + '\'' +
                ", coinId='" + coinId + '\'' +
                '}';
    }
}
