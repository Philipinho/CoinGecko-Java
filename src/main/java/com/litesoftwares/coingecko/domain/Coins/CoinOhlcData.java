package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = false)
//@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class CoinOhlcData {

    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    OhlcSample[] ohlcSamples;

}
