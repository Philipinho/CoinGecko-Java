package com.litesoftwares.coingecko.domain.Global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DecentralizedFinanceDefiData {

    @JsonProperty("defi_market_cap")
    private String defiMarketCap;
    @JsonProperty("eth_market_cap")
    private String ethMarketCap;
    @JsonProperty("defi_to_eth_ratio")
    private String defiToEthRatio;
    @JsonProperty("trading_volume_24h")
    private String tradingVolume24h;
    @JsonProperty("defi_dominance")
    private String defiDominance;
    @JsonProperty("top_coin_name")
    private String topCoinName;
    @JsonProperty("top_coin_defi_dominance")
    private double topCoinDefiDominance;

}
