package com.softserve.edu05.hw.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void mainTest() {
    }

    @Test
    @DisplayName("With empty array")
    void getCarNullOfYear() {
        Car[] carstest = new Car[4];
        App.getCarOfYear(2011, carstest);
    }

    @Test
    @DisplayName("Test with certain array")
    void getCarOfYearTest() {

        Car[] testcars = new Car[3];
        testcars[0] = new Car("1", 2013, 3000);
        testcars[1] = new Car("2", 2012, 3500);
        testcars[2] = new Car("3", 2011, 1600);

        assertTrue(1 == App.getCarOfYear(2011, testcars));

    }

    @Test
    void sortCarByYearTest() {

        Car[] testcars = new Car[3];
        testcars[2] = new Car("3", 2011, 1600);
        testcars[0] = new Car("1", 2013, 3000);
        testcars[1] = new Car("2", 2012, 3500);

        App.sortCarByYear(testcars);
        assertTrue(testcars[2].getYearOfProduction() == 2013);

    }
}