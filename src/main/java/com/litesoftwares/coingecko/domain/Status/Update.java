package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {
    @JsonProperty("description")
    private String description;
    @JsonProperty("category")
    private String category;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("user")
    private String user;
    @JsonProperty("user_title")
    private String userTitle;
    @JsonProperty("pin")
    private boolean pin;
    @JsonProperty("project")
    private Project project;

}
