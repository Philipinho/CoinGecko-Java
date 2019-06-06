package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventCountryData {
    @JsonProperty("country")
    private String country;
    @JsonProperty("code")
    private String code;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "EventCountryData{" +
                "country='" + country + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
