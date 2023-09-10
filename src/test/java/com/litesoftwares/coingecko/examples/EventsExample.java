package com.litesoftwares.coingecko.examples;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.domain.Events.EventCountries;
import com.litesoftwares.coingecko.domain.Events.EventTypes;
import com.litesoftwares.coingecko.domain.Events.Events;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class EventsExample {
    public static void main(String[] args) {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
        Events events = client.getEvents();
        System.out.println(events);

        long eventCount = events.getCount();
        System.out.println(eventCount);

        EventCountries eventCountries = client.getEventsCountries();
        System.out.println(eventCountries);

        EventTypes eventsTypes = client.getEventsTypes();
        System.out.println(eventsTypes);
    }
}
