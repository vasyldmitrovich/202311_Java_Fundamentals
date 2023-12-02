package com.softserve.edu04.hw.task4;

public enum Season {
    WINTER("Winter exams"), SPRING("Second semester"), SUMMER("Vacation period"), AUTUMN("First semester");
    final String engName;

    Season(String engName) {
        this.engName = engName;
    }

    @Override
    public String toString() {
        return "Season{" +
                "engName='" + engName + '\'' +
                '}';
    }
}
