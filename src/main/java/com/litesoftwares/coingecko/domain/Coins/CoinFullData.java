package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.*;
import com.litesoftwares.coingecko.domain.Shared.Image;
import com.litesoftwares.coingecko.domain.Shared.Ticker;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinFullData {
    @JsonProperty("id")
    private String id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("block_time_in_minutes")
    private long blockTimeInMinutes;
    @JsonProperty("categories")
    private List<Object> categories;
    @JsonProperty("localization")
    private Map<String, String> localization;
    @JsonProperty("description")
    private Map<String, String> description;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("country_origin")
    private String countryOrigin;
    @JsonProperty("genesis_date")
    private String genesisDate;
    @JsonProperty("contract_address")
    private String contractAddress;
    @JsonProperty("ico_data")
    private IcoData icoData;
    @JsonProperty("market_cap_rank")
    private long marketCapRank;
    @JsonProperty("coingecko_rank")
    private long coingeckoRank;
    @JsonProperty("coingecko_score")
    private double coingeckoScore;
    @JsonProperty("developer_score")
    private double developerScore;
    @JsonProperty("community_score")
    private double communityScore;
    @JsonProperty("liquidity_score")
    private double liquidityScore;
    @JsonProperty("public_interest_score")
    private double publicInterestScore;
    @JsonProperty("market_data")
    private MarketData marketData;
    @JsonProperty("community_data")
    private CommunityData communityData;
    @JsonProperty("developer_data")
    private DeveloperData developerData;
    @JsonProperty("public_interest_stats")
    private PublicInterestStats publicInterestStats;
    @JsonProperty("status_updates")
    private List<Object> statusUpdates;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("tickers")
    private List<Ticker> tickers;

}
