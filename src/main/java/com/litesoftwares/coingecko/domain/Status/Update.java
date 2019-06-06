package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public boolean isPin() {
        return pin;
    }

    public void setPin(boolean pin) {
        this.pin = pin;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "StatusUpdate{" +
                "description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", user='" + user + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", pin=" + pin +
                ", project=" + project +
                '}';
    }
}
