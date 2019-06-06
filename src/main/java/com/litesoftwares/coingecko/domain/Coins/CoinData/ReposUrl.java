package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReposUrl {
    @JsonProperty("github")
    private List<String> github;
    @JsonProperty("bitbucket")
    private List<Object> bitbucket;

    public List<String> getGithub() {
        return github;
    }

    public void setGithub(List<String> github) {
        this.github = github;
    }

    public List<Object> getBitbucket() {
        return bitbucket;
    }

    public void setBitbucket(List<Object> bitbucket) {
        this.bitbucket = bitbucket;
    }

    @Override
    public String toString() {
        return "ReposUrl{" +
                "github=" + github +
                ", bitbucket=" + bitbucket +
                '}';
    }
}
