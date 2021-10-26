package com.litesoftwares.coingecko.domain.Search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrendingCoinItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("coin_id")
    private int coinId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("market_cap_rank")
    private int marketCapRank;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("price_btc")
    private double priceBtc;
    @JsonProperty("score")
    private int score;
}
