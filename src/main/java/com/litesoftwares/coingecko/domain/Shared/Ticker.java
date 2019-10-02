package com.litesoftwares.coingecko.domain.Shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {
    @JsonProperty("base")
    private String base;
    @JsonProperty("target")
    private String target;
    @JsonProperty("market")
    private Market market;
    @JsonProperty("last")
    private double last;
    @JsonProperty("volume")
    private double volume;
    @JsonProperty("converted_last")
    private Map<String, String> convertedLast;
    @JsonProperty("converted_volume")
    private Map<String, String> convertedVolume;
    @JsonProperty("bid_ask_spread_percentage")
    private double bidAskSpreadPercentage;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("is_anomaly")
    private boolean isAnomaly;
    @JsonProperty("is_stale")
    private boolean isStale;
    @JsonProperty("trade_url")
    private String tradeUrl;
    @JsonProperty("coin_id")
    private String coinId;

}
