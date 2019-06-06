package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SparklineIn7d {
    @JsonProperty("price")
    private List<Double> price;

    public List<Double> getPrice() {
        return price;
    }

    public void setPrice(List<Double> price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SparklineIn7d{" +
                "price=" + price +
                '}';
    }
}
