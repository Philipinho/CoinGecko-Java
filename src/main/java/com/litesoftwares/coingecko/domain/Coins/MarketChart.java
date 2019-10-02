package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketChart {
    @JsonProperty("prices")
    private List<List<String>> prices;
    @JsonProperty("market_caps")
    private List<List<String>> marketCaps;
    @JsonProperty("total_volumes")
    private List<List<String>> totalVolumes;

}
