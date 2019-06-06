package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventCountries {
    @JsonProperty("data")
    private List<EventCountryData> data;
    @JsonProperty("count")
    private String count;

    public List<EventCountryData> getData() {
        return data;
    }

    public void setData(List<EventCountryData> data) {
        this.data = data;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "EventCountries{" +
                "data=" + data +
                ", count='" + count + '\'' +
                '}';
    }
}
