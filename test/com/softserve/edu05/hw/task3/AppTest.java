package com.softserve.edu05.hw.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void mainTest() {
    }

    @Test
    @DisplayName("With empty array")
    void getCarOfYear() {
        Car[] carstest = new Car[4];
        App.getCarOfYear(2011, carstest);
    }

    @Test
    void sortCarByYear() {
    }
}