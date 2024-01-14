package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.Roi;
import com.litesoftwares.coingecko.domain.Coins.CoinData.SparklineIn7d;
import java.math.BigDecimal;
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
    private BigDecimal currentPrice;
    @JsonProperty("market_cap")
    private BigDecimal marketCap;
    @JsonProperty("market_cap_rank")
    private long marketCapRank;
    @JsonProperty("fully_diluted_valuation")
    private BigDecimal fullyDilutedValuation;
    @JsonProperty("total_volume")
    private BigDecimal totalVolume;
    @JsonProperty("high_24h")
    private BigDecimal high24h;
    @JsonProperty("low_24h")
    private BigDecimal low24h;
    @JsonProperty("price_change_24h")
    private BigDecimal priceChange24h;
    @JsonProperty("price_change_percentage_24h")
    private BigDecimal priceChangePercentage24h;
    @JsonProperty("market_cap_change_24h")
    private BigDecimal marketCapChange24h;
    @JsonProperty("market_cap_change_percentage_24h")
    private BigDecimal marketCapChangePercentage24h;
    @JsonProperty("circulating_supply")
    private BigDecimal circulatingSupply;
    @JsonProperty("total_supply")
    private BigDecimal totalSupply;
    @JsonProperty("max_supply")
    private BigDecimal maxSupply;
    @JsonProperty("ath")
    private BigDecimal ath;
    @JsonProperty("ath_change_percentage")
    private BigDecimal athChangePercentage;
    @JsonProperty("ath_date")
    private String athDate;
    @JsonProperty("atl")
    private BigDecimal atl;
    @JsonProperty("atl_change_percentage")
    private BigDecimal atlChangePercentage;
    @JsonProperty("atl_date")
    private String atlDate;
    @JsonProperty("roi")
    private Roi roi;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("sparkline_in_7d")
    private SparklineIn7d sparklineIn7d;
    @JsonProperty("price_change_percentage_1h_in_currency")
    private BigDecimal priceChangePercentage1hInCurrency;
    @JsonProperty("price_change_percentage_24h_in_currency")
    private BigDecimal priceChangePercentage24hInCurrency;
    @JsonProperty("price_change_percentage_7d_in_currency")
    private BigDecimal priceChangePercentage7dInCurrency;
    @JsonProperty("price_change_percentage_14d_in_currency")
    private BigDecimal priceChangePercentage14dInCurrency;
    @JsonProperty("price_change_percentage_30d_in_currency")
    private BigDecimal priceChangePercentage30dInCurrency;
    @JsonProperty("price_change_percentage_200d_in_currency")
    private BigDecimal priceChangePercentage200dInCurrency;
    @JsonProperty("price_change_percentage_1y_in_currency")
    private BigDecimal priceChangePercentage1yInCurrency;
}

