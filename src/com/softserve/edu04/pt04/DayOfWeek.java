package com.softserve.edu04.pt04;

public enum DayOfWeek {
    SUNDAY("Неділля"), MONDAY("Понеділок"), TUESDAY("Вівторок"), WEDNESDAY("Середа"), THURSDAY("Четвер"), FRIDAY("П'ятниця"), SATURDAY("Субота");

    String ua;

    DayOfWeek() {
    }

    DayOfWeek(String ua) {
        this.ua = ua;
    }

    String getUa() {
        return ua;
    }

    String getEn() {
        String res = name();
        return res.charAt(0) + res.substring(1).toLowerCase();

    }

}
