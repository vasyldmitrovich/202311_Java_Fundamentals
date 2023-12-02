package com.softserve.edu04.hw.task3;

public enum HTTPError{//Move to file like HTTPError.java. Enum should not be inner
    ERROR401(401), ERROR402(402), ERROR400(400);
    private final int number;

    HTTPError(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}