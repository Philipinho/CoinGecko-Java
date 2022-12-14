package com.litesoftwares.coingecko.domain.Search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchExchange {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("market_type")
    private String marketType;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("large")
    private String large;
}
