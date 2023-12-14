package Sorokotiaha.com.softserve.edu4.pt;

import java.util.Scanner;
public class pt3 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Country:");
        String contry = SCANNER.nextLine();
        Continent continent = Continent.getForCountry(contry);
        System.out.println(continent);
    }
}

enum Continent {
    EURASIA, AFRICA, NORTHAMERICA, SOUTHAMERICA, ANTARCTICA, AUSTRALIA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
    public static Continent getForCountry(String country) {
        return switch (country) {
            case "Ukraine", "France", "Italia" -> EURASIA;
            case "Morocco", "Egypt", "Algeria" -> AFRICA;
            case "USA", "CANADA", "Mexico" -> NORTHAMERICA;
            case "Brazil", "Argentina", "Peru" -> SOUTHAMERICA;
            case "Antarctica" -> ANTARCTICA;
            case "australia" -> AUSTRALIA;
            default -> throw new IllegalStateException("Unexpected value: " + country);
        };
    }
}
