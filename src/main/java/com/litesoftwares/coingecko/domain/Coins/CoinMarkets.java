package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.Roi;
import com.litesoftwares.coingecko.domain.Coins.CoinData.SparklineIn7d;
import lombok.*;

@Data
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
    private double currentPrice;
    @JsonProperty("market_cap")
    private double marketCap;
    @JsonProperty("market_cap_rank")
    private long marketCapRank;
    @JsonProperty("fully_diluted_valuation")
    private double fullyDilutedValuation;
    @JsonProperty("total_volume")
    private double totalVolume;
    @JsonProperty("high_24h")
    private double high24h;
    @JsonProperty("low_24h")
    private double low24h;
    @JsonProperty("price_change_24h")
    private double priceChange24h;
    @JsonProperty("price_change_percentage_24h")
    private double priceChangePercentage24h;
    @JsonProperty("market_cap_change_24h")
    private double marketCapChange24h;
    @JsonProperty("market_cap_change_percentage_24h")
    private double marketCapChangePercentage24h;
    @JsonProperty("circulating_supply")
    private double circulatingSupply;
    @JsonProperty("total_supply")
    private double totalSupply;
    @JsonProperty("ath")
    private double ath;
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

}

