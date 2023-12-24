package com.softserve.edu05.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class hw3Test {
    @Test
    @DisplayName("sortByYear")
    void test1() {

        Car[] arr = hw3.initialization();
        Car[] arrRes = arr.clone();


        hw3.sortByYear(arr);

        assertEquals(2023,arr[0].getYearOfProduction());



    }

 /*   @Test
    @DisplayName("showByYear")
    void test2() {

        Car[] arr = hw3.initialization();
        Car[] arrRes = arr.clone();


        hw3.sortByYear(arr);





    }*/
}