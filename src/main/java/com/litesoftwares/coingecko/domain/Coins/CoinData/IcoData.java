package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IcoData {
    @JsonProperty("ico_start_date")
    private String icoStartDate;
    @JsonProperty("ico_end_date")
    private String icoEndDate;
    @JsonProperty("short_desc")
    private String shortDesc;
    @JsonProperty("description")
    private String description;
    @JsonProperty("links")
    private Links_ links;
    @JsonProperty("softcap_currency")
    private String softcapCurrency;
    @JsonProperty("hardcap_currency")
    private String hardcapCurrency;
    @JsonProperty("total_raised_currency")
    private String totalRaisedCurrency;
    @JsonProperty("softcap_amount")
    private Object softcapAmount;
    @JsonProperty("hardcap_amount")
    private Object hardcapAmount;
    @JsonProperty("total_raised")
    private Object totalRaised;
    @JsonProperty("quote_pre_sale_currency")
    private String quotePreSaleCurrency;
    @JsonProperty("base_pre_sale_amount")
    private Object basePreSaleAmount;
    @JsonProperty("quote_pre_sale_amount")
    private Object quotePreSaleAmount;
    @JsonProperty("quote_public_sale_currency")
    private String quotePublicSaleCurrency;
    @JsonProperty("base_public_sale_amount")
    private String basePublicSaleAmount;
    @JsonProperty("quote_public_sale_amount")
    private String quotePublicSaleAmount;
    @JsonProperty("accepting_currencies")
    private String acceptingCurrencies;
    @JsonProperty("country_origin")
    private String countryOrigin;
    @JsonProperty("pre_sale_start_date")
    private Object preSaleStartDate;
    @JsonProperty("pre_sale_end_date")
    private Object preSaleEndDate;
    @JsonProperty("whitelist_url")
    private String whitelistUrl;
    @JsonProperty("whitelist_start_date")
    private Object whitelistStartDate;
    @JsonProperty("whitelist_end_date")
    private Object whitelistEndDate;
    @JsonProperty("bounty_detail_url")
    private String bountyDetailUrl;
    @JsonProperty("amount_for_sale")
    private Object amountForSale;
    @JsonProperty("kyc_required")
    private boolean kycRequired;
    @JsonProperty("whitelist_available")
    private Object whitelistAvailable;
    @JsonProperty("pre_sale_available")
    private Object preSaleAvailable;
    @JsonProperty("pre_sale_ended")
    private boolean preSaleEnded;

    public String getIcoStartDate() {
        return icoStartDate;
    }

    public void setIcoStartDate(String icoStartDate) {
        this.icoStartDate = icoStartDate;
    }

    public String getIcoEndDate() {
        return icoEndDate;
    }

    public void setIcoEndDate(String icoEndDate) {
        this.icoEndDate = icoEndDate;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public String getSoftcapCurrency() {
        return softcapCurrency;
    }

    public void setSoftcapCurrency(String softcapCurrency) {
        this.softcapCurrency = softcapCurrency;
    }

    public String getHardcapCurrency() {
        return hardcapCurrency;
    }

    public void setHardcapCurrency(String hardcapCurrency) {
        this.hardcapCurrency = hardcapCurrency;
    }

    public String getTotalRaisedCurrency() {
        return totalRaisedCurrency;
    }

    public void setTotalRaisedCurrency(String totalRaisedCurrency) {
        this.totalRaisedCurrency = totalRaisedCurrency;
    }

    public Object getSoftcapAmount() {
        return softcapAmount;
    }

    public void setSoftcapAmount(Object softcapAmount) {
        this.softcapAmount = softcapAmount;
    }

    public Object getHardcapAmount() {
        return hardcapAmount;
    }

    public void setHardcapAmount(Object hardcapAmount) {
        this.hardcapAmount = hardcapAmount;
    }

    public Object getTotalRaised() {
        return totalRaised;
    }

    public void setTotalRaised(Object totalRaised) {
        this.totalRaised = totalRaised;
    }

    public String getQuotePreSaleCurrency() {
        return quotePreSaleCurrency;
    }

    public void setQuotePreSaleCurrency(String quotePreSaleCurrency) {
        this.quotePreSaleCurrency = quotePreSaleCurrency;
    }

    public Object getBasePreSaleAmount() {
        return basePreSaleAmount;
    }

    public void setBasePreSaleAmount(Object basePreSaleAmount) {
        this.basePreSaleAmount = basePreSaleAmount;
    }

    public Object getQuotePreSaleAmount() {
        return quotePreSaleAmount;
    }

    public void setQuotePreSaleAmount(Object quotePreSaleAmount) {
        this.quotePreSaleAmount = quotePreSaleAmount;
    }

    public String getQuotePublicSaleCurrency() {
        return quotePublicSaleCurrency;
    }

    public void setQuotePublicSaleCurrency(String quotePublicSaleCurrency) {
        this.quotePublicSaleCurrency = quotePublicSaleCurrency;
    }

    public String getBasePublicSaleAmount() {
        return basePublicSaleAmount;
    }

    public void setBasePublicSaleAmount(String basePublicSaleAmount) {
        this.basePublicSaleAmount = basePublicSaleAmount;
    }

    public String getQuotePublicSaleAmount() {
        return quotePublicSaleAmount;
    }

    public void setQuotePublicSaleAmount(String quotePublicSaleAmount) {
        this.quotePublicSaleAmount = quotePublicSaleAmount;
    }

    public String getAcceptingCurrencies() {
        return acceptingCurrencies;
    }

    public void setAcceptingCurrencies(String acceptingCurrencies) {
        this.acceptingCurrencies = acceptingCurrencies;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public Object getPreSaleStartDate() {
        return preSaleStartDate;
    }

    public void setPreSaleStartDate(Object preSaleStartDate) {
        this.preSaleStartDate = preSaleStartDate;
    }

    public Object getPreSaleEndDate() {
        return preSaleEndDate;
    }

    public void setPreSaleEndDate(Object preSaleEndDate) {
        this.preSaleEndDate = preSaleEndDate;
    }

    public String getWhitelistUrl() {
        return whitelistUrl;
    }

    public void setWhitelistUrl(String whitelistUrl) {
        this.whitelistUrl = whitelistUrl;
    }

    public Object getWhitelistStartDate() {
        return whitelistStartDate;
    }

    public void setWhitelistStartDate(Object whitelistStartDate) {
        this.whitelistStartDate = whitelistStartDate;
    }

    public Object getWhitelistEndDate() {
        return whitelistEndDate;
    }

    public void setWhitelistEndDate(Object whitelistEndDate) {
        this.whitelistEndDate = whitelistEndDate;
    }

    public String getBountyDetailUrl() {
        return bountyDetailUrl;
    }

    public void setBountyDetailUrl(String bountyDetailUrl) {
        this.bountyDetailUrl = bountyDetailUrl;
    }

    public Object getAmountForSale() {
        return amountForSale;
    }

    public void setAmountForSale(Object amountForSale) {
        this.amountForSale = amountForSale;
    }

    public boolean isKycRequired() {
        return kycRequired;
    }

    public void setKycRequired(boolean kycRequired) {
        this.kycRequired = kycRequired;
    }

    public Object getWhitelistAvailable() {
        return whitelistAvailable;
    }

    public void setWhitelistAvailable(Object whitelistAvailable) {
        this.whitelistAvailable = whitelistAvailable;
    }

    public Object getPreSaleAvailable() {
        return preSaleAvailable;
    }

    public void setPreSaleAvailable(Object preSaleAvailable) {
        this.preSaleAvailable = preSaleAvailable;
    }

    public boolean isPreSaleEnded() {
        return preSaleEnded;
    }

    public void setPreSaleEnded(boolean preSaleEnded) {
        this.preSaleEnded = preSaleEnded;
    }

    @Override
    public String toString() {
        return "IcoData{" +
                "icoStartDate='" + icoStartDate + '\'' +
                ", icoEndDate='" + icoEndDate + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", description='" + description + '\'' +
                ", links=" + links +
                ", softcapCurrency='" + softcapCurrency + '\'' +
                ", hardcapCurrency='" + hardcapCurrency + '\'' +
                ", totalRaisedCurrency='" + totalRaisedCurrency + '\'' +
                ", softcapAmount=" + softcapAmount +
                ", hardcapAmount=" + hardcapAmount +
                ", totalRaised=" + totalRaised +
                ", quotePreSaleCurrency='" + quotePreSaleCurrency + '\'' +
                ", basePreSaleAmount=" + basePreSaleAmount +
                ", quotePreSaleAmount=" + quotePreSaleAmount +
                ", quotePublicSaleCurrency='" + quotePublicSaleCurrency + '\'' +
                ", basePublicSaleAmount='" + basePublicSaleAmount + '\'' +
                ", quotePublicSaleAmount='" + quotePublicSaleAmount + '\'' +
                ", acceptingCurrencies='" + acceptingCurrencies + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", preSaleStartDate=" + preSaleStartDate +
                ", preSaleEndDate=" + preSaleEndDate +
                ", whitelistUrl='" + whitelistUrl + '\'' +
                ", whitelistStartDate=" + whitelistStartDate +
                ", whitelistEndDate=" + whitelistEndDate +
                ", bountyDetailUrl='" + bountyDetailUrl + '\'' +
                ", amountForSale=" + amountForSale +
                ", kycRequired=" + kycRequired +
                ", whitelistAvailable=" + whitelistAvailable +
                ", preSaleAvailable=" + preSaleAvailable +
                ", preSaleEnded=" + preSaleEnded +
                '}';
    }
}