package com.litesoftwares.coingecko.domain.ExchangeRates;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    @JsonProperty("name")
    private String name;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("value")
    private BigDecimal value;
    @JsonProperty("type")
    private String type;

}
