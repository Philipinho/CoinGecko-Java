package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
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

}
