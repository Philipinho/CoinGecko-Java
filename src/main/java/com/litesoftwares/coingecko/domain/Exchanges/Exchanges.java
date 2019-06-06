package com.litesoftwares.coingecko.domain.Exchanges;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Exchanges {
    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("year_established")
    long yearEstablished;
    @JsonProperty("country")
    String country;
    @JsonProperty("description")
    Object description;
    @JsonProperty("url")
    String url;
    @JsonProperty("image")
    String image;
    @JsonProperty("has_trading_incentive")
    boolean hasTradingIncentive;
    @JsonProperty("trade_volume_24h_btc")
    double tradeVolume24hBtc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(long yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isHasTradingIncentive() {
        return hasTradingIncentive;
    }

    public void setHasTradingIncentive(boolean hasTradingIncentive) {
        this.hasTradingIncentive = hasTradingIncentive;
    }

    public double getTradeVolume24hBtc() {
        return tradeVolume24hBtc;
    }

    public void setTradeVolume24hBtc(double tradeVolume24hBtc) {
        this.tradeVolume24hBtc = tradeVolume24hBtc;
    }

    @Override
    public String toString() {
        return "Exchanges{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", country=" + country +
                ", description=" + description +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", hasTradingIncentive=" + hasTradingIncentive +
                ", tradeVolume24hBtc=" + tradeVolume24hBtc +
                '}';
    }
}
