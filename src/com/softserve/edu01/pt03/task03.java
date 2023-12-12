package com.softserve.edu01.pt03;

import java.util.Scanner;

enum Continent {
    ASIA, AFRICA, EUROPE, AMERICA;
}

enum Country {
    UKRAINE(Continent.EUROPE),
    USA(Continent.AMERICA);


    public final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }

}

public class task03 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the country name: ");
        String countryName = SCANNER.nextLine();
        Continent continent = getContinentForCountry(countryName);
        System.out.println("Country " + countryName + " belongs to continent " + continent);
    }

    static Continent getContinentForCountry(String countryName) {
        return switch (countryName.toUpperCase()) {
            case "UKRAINE" -> Continent.EUROPE;
            case "USA" -> Continent.AMERICA;
            default -> throw new IllegalArgumentException();
        };
    }
}
