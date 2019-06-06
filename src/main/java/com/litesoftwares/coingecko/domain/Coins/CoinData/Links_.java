package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links_ {
    @JsonProperty("web")
    private String web;
    @JsonProperty("blog")
    private String blog;
    @JsonProperty("github")
    private String github;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("telegram")
    private String telegram;
    @JsonProperty("whitepaper")
    private String whitepaper;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getWhitepaper() {
        return whitepaper;
    }

    public void setWhitepaper(String whitepaper) {
        this.whitepaper = whitepaper;
    }

    @Override
    public String toString() {
        return "Links_{" +
                "web='" + web + '\'' +
                ", blog='" + blog + '\'' +
                ", github='" + github + '\'' +
                ", twitter='" + twitter + '\'' +
                ", facebook='" + facebook + '\'' +
                ", telegram='" + telegram + '\'' +
                ", whitepaper='" + whitepaper + '\'' +
                '}';
    }
}
