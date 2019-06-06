package com.litesoftwares.coingecko.domain.Shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "Image{" +
                "thumb='" + thumb + '\'' +
                ", small='" + small + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
