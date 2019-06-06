package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.litesoftwares.coingecko.domain.Shared.Image;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("image")
    private Image image;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Project{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", image=" + image +
                '}';
    }
}
