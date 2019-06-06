package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Roi {
    @JsonProperty("times")
    private float times;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("percentage")
    private float percentage;

    public float getTimes() {
        return times;
    }

    public void setTimes(float times) {
        this.times = times;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Roi{" +
                "times=" + times +
                ", currency='" + currency + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
