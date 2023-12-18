package com.softserve.edu04.pt04;

public enum Country {
    UKRAINE(Continent.EUROPE), USA(Continent.NORTH_AMERICA);
    public final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
