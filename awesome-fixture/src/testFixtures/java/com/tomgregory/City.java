package com.tomgregory;

public enum City {
    LONDON("United Kingdom"), PARIS("France"), BERLIN("Germany");

    private final String country;

    City(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
