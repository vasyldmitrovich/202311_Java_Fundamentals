package com.softserve.edu04.hw;

enum Season {
    WINTER("the period of winter exams"), SPRING("second semester"), SUMMER("the vacation period"), AUTUMN("first semester");
    private String semester;

    Season(String semester) {
        this.semester = semester;
    }

    public static Season getSeason(String season) {
        return switch (season) {
            case "WINTER" -> WINTER;
            case "SPRING" -> SPRING;
            case "SUMMER" -> SUMMER;
            case "AUTUMN" -> AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + season);
        };


    }
}
