package com.litesoftwares.coingecko.domain.Global;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
public class GlobalData {
    @JsonProperty("active_cryptocurrencies")
    private long activeCryptocurrencies;
    @JsonProperty("upcoming_icos")
    private long upcomingIcos;
    @JsonProperty("ongoing_icos")
    private long ongoingIcos;
    @JsonProperty("ended_icos")
    private long endedIcos;
    @JsonProperty("markets")
    private long markets;
    @JsonProperty("total_market_cap")
    private Map<String, Double> totalMarketCap;
    @JsonProperty("total_volume")
    private Map<String, Double> totalVolume;
    @JsonProperty("market_cap_percentage")
    private Map<String, Double> marketCapPercentage;
    @JsonProperty("market_cap_change_percentage_24h_usd")
    private double marketCapChangePercentage24hUsd;
    @JsonProperty("updated_at")
    private long updatedAt;

}
