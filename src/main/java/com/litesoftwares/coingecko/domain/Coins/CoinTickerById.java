package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Shared.Ticker;
import lombok.*;

import java.util.List;

@Data
public class CoinTickerById {
    @JsonProperty("name")
    private String name;
    @JsonProperty("tickers")
    private List<Ticker> tickers;

}
