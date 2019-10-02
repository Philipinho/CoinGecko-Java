package com.litesoftwares.coingecko.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ping {
    @JsonProperty("gecko_says")
    private String geckoSays;

}
