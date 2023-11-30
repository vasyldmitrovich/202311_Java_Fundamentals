package com.softserve.edu04.pt.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of country: ");
        String name = scanner.nextLine();
        Continent continent = Continent.EUROPE;
        String result = switch (name.toUpperCase()) {
            case "ROMANIA","UCRAINE","GERMANY"-> Continent.EUROPE.getUa();
            case "TURKEY", "CHINA", "JAPAN", "INDIA" -> Continent.ASIA.getUa();
            case "BRAZIL", "COLOMBIA", "ARGENTINA", "PERU" -> Continent.SOUTH_AMERICA.getUa();
            case "CANADA", "UNITED STATES", "MEXICO" -> Continent.NORTH_AMERICA.getUa();
            case "AUSTRALIA" -> Continent.AUSTRALIA.getUa();
            default -> "Континент не визначено";
        };
        System.out.println(result);
    }
}
