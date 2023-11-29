package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {
        Country country;

        System.out.println("Enter the name of the country: ");
        String countryName = SCANNER.nextLine();
        country = Country.valueOf(countryName.toUpperCase());

        // formatting:  first letter in the name of the country and the continent in upper case, other letter in lower case
        String land = country.toString().charAt(0) + country.toString().substring(1).toLowerCase();
        String kontinent = country.continent.toString().charAt(0) + country.continent.toString().substring(1).toLowerCase();

        System.out.println("Country " + land + " is located in " + kontinent + ".");
    }
}

enum Continent {
    AFRICA, NORTH_AMERICA, SOUTH_AMERICA, EURASIA, AUSTRALIA;
}

enum Country {
    UKRAINE(Continent.EURASIA),
    USA(Continent.NORTH_AMERICA),
    BOLIVIA(Continent.SOUTH_AMERICA),
    GABON(Continent.AFRICA),
    AUSTRALIA(Continent.AUSTRALIA),
    INDIA(Continent.EURASIA);

    public final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
