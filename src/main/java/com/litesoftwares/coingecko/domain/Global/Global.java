package com.litesoftwares.coingecko.domain.Global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Global {
    @JsonProperty("data")
    private GlobalData data;

    public GlobalData getData() {
        return data;
    }

    public void setData(GlobalData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Global{" +
                "data=" + data +
                '}';
    }


}