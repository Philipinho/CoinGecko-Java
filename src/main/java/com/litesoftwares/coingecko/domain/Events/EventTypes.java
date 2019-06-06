package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventTypes {
    @JsonProperty("data")
    private List<String> data;
    @JsonProperty("count")
    private long count;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "EventTypes{" +
                "data=" + data +
                ", count=" + count +
                '}';
    }
}
