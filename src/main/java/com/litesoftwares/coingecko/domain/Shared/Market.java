package com.litesoftwares.coingecko.domain.Shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Market {
    @JsonProperty("name")
    private String name;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("has_trading_incentive")
    private boolean hasTradingIncentive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean isHasTradingIncentive() {
        return hasTradingIncentive;
    }

    public void setHasTradingIncentive(boolean hasTradingIncentive) {
        this.hasTradingIncentive = hasTradingIncentive;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", hasTradingIncentive=" + hasTradingIncentive +
                '}';
    }
}
