package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicInterestStats {
    @JsonProperty("alexa_rank")
    private long alexaRank;
    @JsonProperty("bing_matches")
    private long bingMatches;

    @JsonProperty("alexa_rank")
    public long getAlexaRank() {
        return alexaRank;
    }

    @JsonProperty("alexa_rank")
    public void setAlexaRank(long alexaRank) {
        this.alexaRank = alexaRank;
    }

    @JsonProperty("bing_matches")
    public long getBingMatches() {
        return bingMatches;
    }

    @JsonProperty("bing_matches")
    public void setBingMatches(long bingMatches) {
        this.bingMatches = bingMatches;
    }

    @Override
    public String toString() {
        return "PublicInterestStats{" +
                "alexaRank=" + alexaRank +
                ", bingMatches=" + bingMatches +
                '}';
    }
}
