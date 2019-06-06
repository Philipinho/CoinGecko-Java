package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CodeAdditionsDeletions4Weeks {
    @JsonProperty("additions")
    private long additions;
    @JsonProperty("deletions")
    private long deletions;

    public long getAdditions() {
        return additions;
    }

    public void setAdditions(long additions) {
        this.additions = additions;
    }

    public long getDeletions() {
        return deletions;
    }

    public void setDeletions(long deletions) {
        this.deletions = deletions;
    }

    @Override
    public String toString() {
        return "CodeAdditionsDeletions4Weeks{" +
                "additions=" + additions +
                ", deletions=" + deletions +
                '}';
    }
}
