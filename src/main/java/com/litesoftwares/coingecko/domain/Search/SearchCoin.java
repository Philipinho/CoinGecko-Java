package com.litesoftwares.coingecko.domain.Search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchCoin {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("api_symbol")
    private String apiSymbol;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("market_cap_rank")
    private int marketCapRank;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("large")
    private String large;

}
