package com.softserve.edu04.pt.PracticalTask3;

import static com.softserve.edu04.pt.App.SCANNER;

public class PracticalTask3 {
    public static void run() {

        //version #1
        versionWithEnum();

        //version #2
        versionWithSwitch();
    }

    public static Continent getContinentForCountry(String countryName) {
        return switch (countryName.toUpperCase()) {
            case "UKRAINE", "MOLDOVA" -> Continent.EUROPE;
            case "USA", "CANADA" -> Continent.AMERIKA;
            default -> throw new IllegalArgumentException();
        };

    }

    public static void versionWithEnum() {
        System.out.println("Enter the country name: ");
        String countryName = SCANNER.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println("Country " + country + " belongs to continent " + country.continent);
    }

    public static void versionWithSwitch() {
        System.out.println("Enter the country name: ");
        String countryName1 = SCANNER.nextLine();
        Continent continent1 = getContinentForCountry(countryName1);
        System.out.println("Country " + countryName1 + " belongs to continent " + continent1);
    }


}
