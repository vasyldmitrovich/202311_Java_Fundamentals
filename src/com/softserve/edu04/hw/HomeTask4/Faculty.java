package com.softserve.edu04.hw.HomeTask4;

public class Faculty {
    private int studentsCount;
    private Season season;

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "studentsCount=" + studentsCount +
                ", season=" + season.getSeasonName() +
                ", semester=" + season.getSemester() +
                '}';
    }

    public void setSeason(String season) {
        switch (season) {
            case "AUTUMN" -> this.season = Season.AUTUMN;
            case "SPRING" -> this.season = Season.SPRING;
            case "SUMMER" -> this.season = Season.SUMMER;
            case "WINTER" -> this.season = Season.WINTER;
            default -> throw new IllegalArgumentException();
        }

    }
}
