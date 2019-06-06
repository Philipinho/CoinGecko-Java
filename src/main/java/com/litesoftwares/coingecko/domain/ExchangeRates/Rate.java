package com.litesoftwares.coingecko.domain.ExchangeRates;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    @JsonProperty("name")
    private String name;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("value")
    private long value;
    @JsonProperty("type")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Rates{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
