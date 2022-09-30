package com.tomgregory;

import org.junit.jupiter.api.Test;

import static com.tomgregory.City.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CityLocatorTest {
    @Test
    public void getsCountryForCity() {
        CityLocator cityLocator = new CityLocator();

        assertEquals(BERLIN.getCountry(), cityLocator.locateCity(BERLIN.name()));
        assertEquals(PARIS.getCountry(), cityLocator.locateCity(PARIS.name()));
        assertEquals(LONDON.getCountry(), cityLocator.locateCity(LONDON.name()));
    }
}