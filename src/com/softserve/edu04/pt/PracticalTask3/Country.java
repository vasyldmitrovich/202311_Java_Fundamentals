package com.softserve.edu04.pt.PracticalTask3;

public enum Country {
    UKRAINE(Continent.EUROPE),
    USA(Continent.AMERIKA);

    public final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
