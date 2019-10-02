package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
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

}