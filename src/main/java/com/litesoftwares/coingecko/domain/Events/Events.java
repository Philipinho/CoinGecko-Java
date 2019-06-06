package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {
    @JsonProperty("data")
    private List<EventData> data;
    @JsonProperty("count")
    private long count;
    @JsonProperty("page")
    private long page;

    public List<EventData> getData() {
        return data;
    }

    public void setData(List<EventData> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Events{" +
                "data=" + data +
                ", count=" + count +
                ", page=" + page +
                '}';
    }
}
