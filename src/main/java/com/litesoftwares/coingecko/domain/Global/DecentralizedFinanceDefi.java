package com.litesoftwares.coingecko.domain.Global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DecentralizedFinanceDefi {
    @JsonProperty("data")
    private DecentralizedFinanceDefiData data;
}


