package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {
    @JsonProperty("homepage")
    private List<String> homepage;
    @JsonProperty("blockchain_site")
    private List<String> blockchainSite;
    @JsonProperty("official_forum_url")
    private List<String> officialForumUrl;
    @JsonProperty("chat_url")
    private List<String> chatUrl;
    @JsonProperty("announcement_url")
    private List<String> announcementUrl;
    @JsonProperty("twitter_screen_name")
    private String twitterScreenName;
    @JsonProperty("facebook_username")
    private String facebookUsername;
    @JsonProperty("bitcointalk_thread_identifier")
    private Object bitcointalkThreadIdentifier;
    @JsonProperty("telegram_channel_identifier")
    private String telegramChannelIdentifier;
    @JsonProperty("subreddit_url")
    private String subredditUrl;
    @JsonProperty("repos_url")
    private ReposUrl reposUrl;

    public List<String> getHomepage() {
        return homepage;
    }

    public void setHomepage(List<String> homepage) {
        this.homepage = homepage;
    }

    public List<String> getBlockchainSite() {
        return blockchainSite;
    }

    public void setBlockchainSite(List<String> blockchainSite) {
        this.blockchainSite = blockchainSite;
    }

    public List<String> getOfficialForumUrl() {
        return officialForumUrl;
    }

    public void setOfficialForumUrl(List<String> officialForumUrl) {
        this.officialForumUrl = officialForumUrl;
    }

    public List<String> getChatUrl() {
        return chatUrl;
    }

    public void setChatUrl(List<String> chatUrl) {
        this.chatUrl = chatUrl;
    }

    public List<String> getAnnouncementUrl() {
        return announcementUrl;
    }

    public void setAnnouncementUrl(List<String> announcementUrl) {
        this.announcementUrl = announcementUrl;
    }

    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }

    public String getFacebookUsername() {
        return facebookUsername;
    }

    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    public Object getBitcointalkThreadIdentifier() {
        return bitcointalkThreadIdentifier;
    }

    public void setBitcointalkThreadIdentifier(Object bitcointalkThreadIdentifier) {
        this.bitcointalkThreadIdentifier = bitcointalkThreadIdentifier;
    }

    public String getTelegramChannelIdentifier() {
        return telegramChannelIdentifier;
    }

    public void setTelegramChannelIdentifier(String telegramChannelIdentifier) {
        this.telegramChannelIdentifier = telegramChannelIdentifier;
    }

    public String getSubredditUrl() {
        return subredditUrl;
    }

    public void setSubredditUrl(String subredditUrl) {
        this.subredditUrl = subredditUrl;
    }

    public ReposUrl getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(ReposUrl reposUrl) {
        this.reposUrl = reposUrl;
    }

    @Override
    public String toString() {
        return "Links{" +
                "homepage=" + homepage +
                ", blockchainSite=" + blockchainSite +
                ", officialForumUrl=" + officialForumUrl +
                ", chatUrl=" + chatUrl +
                ", announcementUrl=" + announcementUrl +
                ", twitterScreenName='" + twitterScreenName + '\'' +
                ", facebookUsername='" + facebookUsername + '\'' +
                ", bitcointalkThreadIdentifier=" + bitcointalkThreadIdentifier +
                ", telegramChannelIdentifier='" + telegramChannelIdentifier + '\'' +
                ", subredditUrl='" + subredditUrl + '\'' +
                ", reposUrl=" + reposUrl +
                '}';
    }
}
