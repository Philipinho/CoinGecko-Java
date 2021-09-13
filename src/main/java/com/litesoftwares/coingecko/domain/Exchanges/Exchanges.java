package com.litesoftwares.coingecko.domain.Exchanges;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Exchanges {
    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("year_established")
    long yearEstablished;
    @JsonProperty("country")
    String country;
    @JsonProperty("description")
    Object description;
    @JsonProperty("url")
    String url;
    @JsonProperty("image")
    String image;
    @JsonProperty("has_trading_incentive")
    boolean hasTradingIncentive;
    @JsonProperty("trade_volume_24h_btc")
    double tradeVolume24hBtc;
    @JsonProperty("trust_score")
    int trustScore;
    @JsonProperty("trust_score_rank")
    int trustScoreRank;
}
