package com.litesoftwares.coingecko.domain.Coins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Coins.CoinData.*;
import com.litesoftwares.coingecko.domain.Shared.Image;
import com.litesoftwares.coingecko.domain.Shared.Ticker;

import java.util.List;
import java.util.Map;

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

    public long getBlockTimeInMinutes() {
        return blockTimeInMinutes;
    }

    public void setBlockTimeInMinutes(long blockTimeInMinutes) {
        this.blockTimeInMinutes = blockTimeInMinutes;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public Map<String, String> getLocalization() {
        return localization;
    }

    public void setLocalization(Map<String, String> localization) {
        this.localization = localization;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getGenesisDate() {
        return genesisDate;
    }

    public void setGenesisDate(String genesisDate) {
        this.genesisDate = genesisDate;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public IcoData getIcoData() {
        return icoData;
    }

    public void setIcoData(IcoData icoData) {
        this.icoData = icoData;
    }

    public long getMarketCapRank() {
        return marketCapRank;
    }

    public void setMarketCapRank(long marketCapRank) {
        this.marketCapRank = marketCapRank;
    }

    public long getCoingeckoRank() {
        return coingeckoRank;
    }

    public void setCoingeckoRank(long coingeckoRank) {
        this.coingeckoRank = coingeckoRank;
    }

    public double getCoingeckoScore() {
        return coingeckoScore;
    }

    public void setCoingeckoScore(double coingeckoScore) {
        this.coingeckoScore = coingeckoScore;
    }

    public double getDeveloperScore() {
        return developerScore;
    }

    public void setDeveloperScore(double developerScore) {
        this.developerScore = developerScore;
    }

    public double getCommunityScore() {
        return communityScore;
    }

    public void setCommunityScore(double communityScore) {
        this.communityScore = communityScore;
    }

    public double getLiquidityScore() {
        return liquidityScore;
    }

    public void setLiquidityScore(double liquidityScore) {
        this.liquidityScore = liquidityScore;
    }

    public double getPublicInterestScore() {
        return publicInterestScore;
    }

    public void setPublicInterestScore(double publicInterestScore) {
        this.publicInterestScore = publicInterestScore;
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

    public List<Object> getStatusUpdates() {
        return statusUpdates;
    }

    public void setStatusUpdates(List<Object> statusUpdates) {
        this.statusUpdates = statusUpdates;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Ticker> getTickers() {
        return tickers;
    }

    public void setTickers(List<Ticker> tickers) {
        this.tickers = tickers;
    }

    @Override
    public String toString() {
        return "CoinFullData{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", blockTimeInMinutes=" + blockTimeInMinutes +
                ", categories=" + categories +
                ", localization=" + localization +
                ", description=" + description +
                ", links=" + links +
                ", image=" + image +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", genesisDate='" + genesisDate + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                ", icoData=" + icoData +
                ", marketCapRank=" + marketCapRank +
                ", coingeckoRank=" + coingeckoRank +
                ", coingeckoScore=" + coingeckoScore +
                ", developerScore=" + developerScore +
                ", communityScore=" + communityScore +
                ", liquidityScore=" + liquidityScore +
                ", publicInterestScore=" + publicInterestScore +
                ", marketData=" + marketData +
                ", communityData=" + communityData +
                ", developerData=" + developerData +
                ", publicInterestStats=" + publicInterestStats +
                ", statusUpdates=" + statusUpdates +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", tickers=" + tickers +
                '}';
    }
}
