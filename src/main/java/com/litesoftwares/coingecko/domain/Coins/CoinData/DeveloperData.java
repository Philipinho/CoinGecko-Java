package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeveloperData {
    @JsonProperty("forks")
    private long forks;
    @JsonProperty("stars")
    private long stars;
    @JsonProperty("subscribers")
    private long subscribers;
    @JsonProperty("total_issues")
    private long totalIssues;
    @JsonProperty("closed_issues")
    private long closedIssues;
    @JsonProperty("pull_requests_merged")
    private long pullRequestsMerged;
    @JsonProperty("pull_request_contributors")
    private long pullRequestContributors;
    @JsonProperty("code_additions_deletions_4_weeks")
    private CodeAdditionsDeletions4Weeks codeAdditionsDeletions4Weeks;
    @JsonProperty("commit_count_4_weeks")
    private long commitCount4Weeks;
    @JsonProperty("last_4_weeks_commit_activity_series")
    private List<Long> last4WeeksCommitActivitySeries;

    public long getForks() {
        return forks;
    }

    public void setForks(long forks) {
        this.forks = forks;
    }

    public long getStars() {
        return stars;
    }

    public void setStars(long stars) {
        this.stars = stars;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(long subscribers) {
        this.subscribers = subscribers;
    }

    public long getTotalIssues() {
        return totalIssues;
    }

    public void setTotalIssues(long totalIssues) {
        this.totalIssues = totalIssues;
    }

    public long getClosedIssues() {
        return closedIssues;
    }

    public void setClosedIssues(long closedIssues) {
        this.closedIssues = closedIssues;
    }

    public long getPullRequestsMerged() {
        return pullRequestsMerged;
    }

    public void setPullRequestsMerged(long pullRequestsMerged) {
        this.pullRequestsMerged = pullRequestsMerged;
    }

    public long getPullRequestContributors() {
        return pullRequestContributors;
    }

    public void setPullRequestContributors(long pullRequestContributors) {
        this.pullRequestContributors = pullRequestContributors;
    }

    public CodeAdditionsDeletions4Weeks getCodeAdditionsDeletions4Weeks() {
        return codeAdditionsDeletions4Weeks;
    }

    public void setCodeAdditionsDeletions4Weeks(CodeAdditionsDeletions4Weeks codeAdditionsDeletions4Weeks) {
        this.codeAdditionsDeletions4Weeks = codeAdditionsDeletions4Weeks;
    }

    public long getCommitCount4Weeks() {
        return commitCount4Weeks;
    }

    public void setCommitCount4Weeks(long commitCount4Weeks) {
        this.commitCount4Weeks = commitCount4Weeks;
    }

    public List<Long> getLast4WeeksCommitActivitySeries() {
        return last4WeeksCommitActivitySeries;
    }

    public void setLast4WeeksCommitActivitySeries(List<Long> last4WeeksCommitActivitySeries) {
        this.last4WeeksCommitActivitySeries = last4WeeksCommitActivitySeries;
    }

    @Override
    public String toString() {
        return "DeveloperData{" +
                "forks=" + forks +
                ", stars=" + stars +
                ", subscribers=" + subscribers +
                ", totalIssues=" + totalIssues +
                ", closedIssues=" + closedIssues +
                ", pullRequestsMerged=" + pullRequestsMerged +
                ", pullRequestContributors=" + pullRequestContributors +
                ", codeAdditionsDeletions4Weeks=" + codeAdditionsDeletions4Weeks +
                ", commitCount4Weeks=" + commitCount4Weeks +
                ", last4WeeksCommitActivitySeries=" + last4WeeksCommitActivitySeries +
                '}';
    }
}
