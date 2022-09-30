package com.tomgregory;

import org.junit.jupiter.api.Test;

import static com.tomgregory.City.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FavouriteCityGeneratorTest {
    @Test
    public void getsCountryForCity() {
        FavouriteCityGenerator favouriteCityGenerator = new FavouriteCityGenerator();

        assertEquals(BERLIN.getCountry(), favouriteCityGenerator.locateCity(BERLIN.name()));
        assertEquals(PARIS.getCountry(), favouriteCityGenerator.locateCity(PARIS.name()));
        assertEquals(LONDON.getCountry(), favouriteCityGenerator.locateCity(LONDON.name()));
    }
}