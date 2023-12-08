package com.softserve.edu04.pt.task3;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the name of the country: ");
        String countryName = scanner.nextLine();
        Continent continent =Continent.getContinent(countryName);
        System.out.print(countryName + " is in the continent " + continent);
    }
}

enum Continent {
    ASIA, AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) +name.substring(1).toLowerCase();
    }
    public static Continent getContinent(String country) {
        return switch (country) {
            case "India", "China", "Indonesia" -> ASIA;
            case "Nigeria", "Ethiopia", "Egypt" -> AFRICA;
            case "Germany", "United Kingdom", "France" -> EUROPE;
            case "USA", "Mexico", "Canada" -> NORTH_AMERICA;
            case "Brazil", "Colombia", "Argentina" -> SOUTH_AMERICA;
            case "Australia", "Micronesia", "New Zealand" -> AUSTRALIA;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };
    }
}

