package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Roi {
    @JsonProperty("times")
    private float times;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("percentage")
    private float percentage;

}
