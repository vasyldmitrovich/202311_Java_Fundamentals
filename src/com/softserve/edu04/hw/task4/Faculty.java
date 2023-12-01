package com.softserve.edu04.hw.task4;

enum Season{
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

public class Faculty {
    int numberOfStudents;
    Season season;

    public Faculty() {
    }

    public Faculty(int numberOfStudents, String season) {
        this.numberOfStudents = numberOfStudents;
        this.season = Season.valueOf(season.toUpperCase());
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setSeason(String season) {
        this.season = Season.valueOf(season.toUpperCase());
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", season=" + season +
                '}';
    }
}
