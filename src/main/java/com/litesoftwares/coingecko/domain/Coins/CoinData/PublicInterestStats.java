package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicInterestStats {

    @JsonProperty("alexa_rank")
    private long alexaRank;
    @JsonProperty("bing_matches")
    private long bingMatches;

}
