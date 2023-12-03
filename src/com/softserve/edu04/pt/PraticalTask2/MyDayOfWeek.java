package com.softserve.edu04.pt.PraticalTask2;

public enum MyDayOfWeek {
    SUNDAY("Неділя"),
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П\'ятниця"),
    SATURDAY("Субота");

    private String ua;
    private String en;

    MyDayOfWeek(String ua) {
        this.ua = ua;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }
}
