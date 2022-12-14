package com.litesoftwares.coingecko.domain.Search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Search {
    @JsonProperty("coins")
    private List<SearchCoin> coins = null;

    @JsonProperty("exchanges")
    private List<SearchExchange> exchanges = null;
    @JsonProperty("categories")
    private List<SearchCategory> categories = null;

    @JsonProperty("nfts")
    private List<SearchNft> nfts = null;
}
