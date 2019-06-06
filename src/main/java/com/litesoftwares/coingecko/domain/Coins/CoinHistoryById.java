package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.*;
import com.litesoftwares.coingecko.domain.Shared.Image;
import com.litesoftwares.coingecko.domain.Shared.Ticker;
import com.litesoftwares.coingecko.domain.Status.StatusUpdates;

import java.util.List;
import java.util.Map;

public class CoinHistoryById {
    @JsonProperty("id")
    private String id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localization")
    private Map<String, String> localization;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("market_data")
    private MarketData marketData;
    @JsonProperty("community_data")
    private CommunityData communityData;
    @JsonProperty("developer_data")
    private DeveloperData developerData;
    @JsonProperty("public_interest_stats")
    private PublicInterestStats publicInterestStats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getLocalization() {
        return localization;
    }

    public void setLocalization(Map<String, String> localization) {
        this.localization = localization;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public MarketData getMarketData() {
        return marketData;
    }

    public void setMarketData(MarketData marketData) {
        this.marketData = marketData;
    }

    public CommunityData getCommunityData() {
        return communityData;
    }

    public void setCommunityData(CommunityData communityData) {
        this.communityData = communityData;
    }

    public DeveloperData getDeveloperData() {
        return developerData;
    }

    public void setDeveloperData(DeveloperData developerData) {
        this.developerData = developerData;
    }

    public PublicInterestStats getPublicInterestStats() {
        return publicInterestStats;
    }

    public void setPublicInterestStats(PublicInterestStats publicInterestStats) {
        this.publicInterestStats = publicInterestStats;
    }

    @Override
    public String toString() {
        return "CoinHistoryById{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", localization=" + localization +
                ", image=" + image +
                ", marketData=" + marketData +
                ", communityData=" + communityData +
                ", developerData=" + developerData +
                ", publicInterestStats=" + publicInterestStats +
                '}';
    }
}
