package com.litesoftwares.coingecko.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssetPlatforms {
    @JsonProperty("id")
    private String id;
    @JsonProperty("chain_identifier")
    private long chainIdentifier;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortname")
    private String shortname;

    }

