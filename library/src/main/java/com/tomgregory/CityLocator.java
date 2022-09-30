package com.tomgregory;

public class CityLocator {
    public String locateCity(String city) {
        if (city.equalsIgnoreCase("Berlin")) {
            return "Germany";
        } else if (city.equalsIgnoreCase("Paris")) {
            return "France";
        } else if (city.equalsIgnoreCase("London")) {
            return "United Kingdom";
        }

        throw new IllegalStateException();
    }
}
