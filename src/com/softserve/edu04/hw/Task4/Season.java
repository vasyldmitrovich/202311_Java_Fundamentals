package com.softserve.edu04.hw.Task4;

public enum Season {
    WINTER("Exams period"),
    SPRING("Second semester"),
    SUMMER("Vacation period"),
    AUTUMN("First semester");


    private final String seasonType;

    Season(String seasonType) {
        this.seasonType = seasonType;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public static String getSeasonType (String choice){

        Season currentSeason = switch (choice) {

            case "WINTER" -> Season.WINTER;
            case "SPRING" -> Season.SPRING;
            case "SUMMER" -> Season.SUMMER;
            case "AUTUMN" -> Season.AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        return currentSeason.getSeasonType();
    }
}
