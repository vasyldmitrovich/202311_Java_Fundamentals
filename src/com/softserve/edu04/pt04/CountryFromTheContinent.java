package com.softserve.edu04.pt04;

import java.util.Scanner;

public class CountryFromTheContinent {
    private static final Scanner SCANNER = new Scanner(System.in);

    static Continent getContinentForCountry(String countryName) {
        return switch (countryName.toUpperCase()) {
            case "UKRAINE", "GERMANY", "FRANCE" -> Continent.EUROPE;
            case "USA", "CANADA" -> Continent.NORTH_AMERICA;
            case "CHINA", "INDIA" -> Continent.ASIA;
            case "UGANDA", "EGYPT" -> Continent.AFRICA;
            default -> throw new IllegalArgumentException();
        };

    }


    public static void main(String[] args) {
        System.out.println("Enter the country name: ");
        String countryName = SCANNER.nextLine();
        Continent continent = getContinentForCountry(countryName);
        System.out.println("Country " + countryName + " belongs to continent " + continent);

    }
}
