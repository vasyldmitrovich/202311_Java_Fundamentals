package com.softserve.edu04.hw.HomeTask4;

public enum Season {
    WINTER("Winter", "Exams"),
    SPRING("Spring", "Second semester"),
    SUMMER("Summer", "Vacation period"),
    AUTUMN("Autumn", "First semester"),
    ;
    private String seasonName;
    private String semester;

    Season(String seasonName, String semestr) {
        this.seasonName = seasonName;
        this.semester = semestr;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSemester() {
        return semester;
    }
}
