package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {
    @JsonProperty("data")
    private List<EventData> data;
    @JsonProperty("count")
    private long count;
    @JsonProperty("page")
    private long page;

}
