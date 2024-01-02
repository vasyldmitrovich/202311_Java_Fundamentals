package com.softserve.pt;

public enum Continent {//Do not make this class inner, create file Continent.java and move this enum here
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
