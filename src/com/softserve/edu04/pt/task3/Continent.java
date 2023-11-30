package com.softserve.edu04.pt.task3;

public enum Continent {
    ASIA("Asia", "Азія"), AFRICA("Africa", "Африка"), NORTH_AMERICA("North America", "Північна Америка"),
    SOUTH_AMERICA("South America", "Південна Америка"), EUROPE("Europe","Європа"), AUSTRALIA("Australia", "Австралія");
    private final String en;
    private final String ua;

    Continent(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}
