package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommunityData {
    @JsonProperty("facebook_likes")
    private double facebookLikes;
    @JsonProperty("twitter_followers")
    private double twitterFollowers;
    @JsonProperty("reddit_average_posts_48h")
    private double redditAveragePosts48h;
    @JsonProperty("reddit_average_comments_48h")
    private double redditAverageComments48h;
    @JsonProperty("reddit_subscribers")
    private double redditSubscribers;
    @JsonProperty("reddit_accounts_active_48h")
    private double redditAccountsActive48h;
    @JsonProperty("telegram_channel_user_count")
    private double telegramChannelUserCount;

    public double getFacebookLikes() {
        return facebookLikes;
    }

    public void setFacebookLikes(double facebookLikes) {
        this.facebookLikes = facebookLikes;
    }

    public double getTwitterFollowers() {
        return twitterFollowers;
    }

    public void setTwitterFollowers(double twitterFollowers) {
        this.twitterFollowers = twitterFollowers;
    }

    public double getRedditAveragePosts48h() {
        return redditAveragePosts48h;
    }

    public void setRedditAveragePosts48h(double redditAveragePosts48h) {
        this.redditAveragePosts48h = redditAveragePosts48h;
    }

    public double getRedditAverageComments48h() {
        return redditAverageComments48h;
    }

    public void setRedditAverageComments48h(double redditAverageComments48h) {
        this.redditAverageComments48h = redditAverageComments48h;
    }

    public double getRedditSubscribers() {
        return redditSubscribers;
    }

    public void setRedditSubscribers(double redditSubscribers) {
        this.redditSubscribers = redditSubscribers;
    }

    public double getRedditAccountsActive48h() {
        return redditAccountsActive48h;
    }

    public void setRedditAccountsActive48h(double redditAccountsActive48h) {
        this.redditAccountsActive48h = redditAccountsActive48h;
    }

    public double getTelegramChannelUserCount() {
        return telegramChannelUserCount;
    }

    public void setTelegramChannelUserCount(double telegramChannelUserCount) {
        this.telegramChannelUserCount = telegramChannelUserCount;
    }

    @Override
    public String toString() {
        return "CommunityData{" +
                "facebookLikes=" + facebookLikes +
                ", twitterFollowers=" + twitterFollowers +
                ", redditAveragePosts48h=" + redditAveragePosts48h +
                ", redditAverageComments48h=" + redditAverageComments48h +
                ", redditSubscribers=" + redditSubscribers +
                ", redditAccountsActive48h=" + redditAccountsActive48h +
                ", telegramChannelUserCount=" + telegramChannelUserCount +
                '}';
    }
}
