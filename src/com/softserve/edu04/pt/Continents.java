package com.softserve.edu04.pt;

import java.util.Locale;
import java.util.Scanner;

public class Continents {
    public static Scanner scanner = new Scanner(System.in);

    public enum Continent{

        EUROPE,ASIA,AFRICA,NORTH_AMERICA,SOUTH_AMERICA,AUSTRALIA;

       public static Continent getContinentByCountry(String input){

           return switch(input){

               case "UKRAINE","GERMANY","AUSTRIA","MOLDOVA","FRANCE" -> Continent.EUROPE;
               case "CHINA","INDIA","THAILAND","KAZAKHSTAN"-> Continent.ASIA;
               case "GHANA","ZIMBABWE","NIGERIA","CHAD","SUDAN" -> Continent.AFRICA;
               case "CHILI","ARGENTINA","BRAZIL" -> Continent.SOUTH_AMERICA;
               case "USA","CANADA","MEXICO" -> Continent.NORTH_AMERICA;
               case "AUSTRALIA" -> Continent.AUSTRALIA;
               default -> throw new IllegalStateException("Unexpected value: " + input);
           };
        }
    }

    public static void main(String[] args) {

        System.out.println("Input country name to check continent");
        String input = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.printf("The country %s is from %s\n", input, Continent.getContinentByCountry(input));

    }
}
