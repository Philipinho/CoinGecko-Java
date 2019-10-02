package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links_ {
    @JsonProperty("web")
    private String web;
    @JsonProperty("blog")
    private String blog;
    @JsonProperty("github")
    private String github;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("telegram")
    private String telegram;
    @JsonProperty("whitepaper")
    private String whitepaper;

}
