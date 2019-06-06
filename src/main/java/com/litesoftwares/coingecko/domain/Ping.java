package com.litesoftwares.coingecko.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ping {
    @JsonProperty("gecko_says")
    private String geckoSays;

    public String getGeckoSays() {
        return geckoSays;
    }

    public void setGeckoSays(String geckoSays) {
        this.geckoSays = geckoSays;
    }

    @Override
    public String toString() {
        return "Ping{" +
                "geckoSays='" + geckoSays + '\'' +
                '}';
    }
}
