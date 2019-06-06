package com.litesoftwares.coingecko.domain.Events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventData{
        @JsonProperty("type")
        private String type;
        @JsonProperty("title")
        private String title;
        @JsonProperty("description")
        private String description;
        @JsonProperty("organizer")
        private String organizer;
        @JsonProperty("start_date")
        private String startDate;
        @JsonProperty("end_date")
        private String endDate;
        @JsonProperty("website")
        private String website;
        @JsonProperty("email")
        private String email;
        @JsonProperty("venue")
        private String venue;
        @JsonProperty("address")
        private String address;
        @JsonProperty("city")
        private String city;
        @JsonProperty("country")
        private String country;
        @JsonProperty("screenshot")
        private String screenshot;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getOrganizer() {
            return organizer;
        }

        public void setOrganizer(String organizer) {
            this.organizer = organizer;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getVenue() {
            return venue;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getScreenshot() {
            return screenshot;
        }

        public void setScreenshot(String screenshot) {
            this.screenshot = screenshot;
        }

        @Override
        public String toString() {
            return "EventData{" +
                    "type='" + type + '\'' +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", organizer='" + organizer + '\'' +
                    ", startDate='" + startDate + '\'' +
                    ", endDate='" + endDate + '\'' +
                    ", website='" + website + '\'' +
                    ", email='" + email + '\'' +
                    ", venue='" + venue + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    ", screenshot='" + screenshot + '\'' +
                    '}';
        }
    }
