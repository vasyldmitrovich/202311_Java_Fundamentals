package com.softserve.edu04.hw;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    @Override
    public String toString() {
        return "Faculty{" + "numberOfStudents=" + numberOfStudents + ", currentSeason=" + currentSeason + '}';
    }
}
