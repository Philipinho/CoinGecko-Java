package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusUpdates {
    @JsonProperty("status_updates")
    private List<Update> updates;

    public void setStatusUpdates(List<Update> statusUpdates) {
        this.updates = statusUpdates;
    }

}