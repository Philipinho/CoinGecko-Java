package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusUpdates {
    @JsonProperty("status_updates")
    private List<Update> updates;

    public List<Update> getUpdates() {
        return updates;
    }

    public void setStatusUpdates(List<Update> statusUpdates) {
        this.updates = statusUpdates;
    }

    @Override
    public String toString() {
        return "StatusUpdates{" +
                "updates=" + updates +
                '}';
    }
}