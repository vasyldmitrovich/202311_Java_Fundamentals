package com.softserve.edu05.hw.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppPart2Test {

    @Test
    @DisplayName("Work with 5 first positive numbers")
    void test1() {
        int[] arr = {1, 2, 4, 5, 6, 7, 8,};
        assertTrue(18 == AppPart2.getSumOrProduct(true, arr));
    }

    @Test
    @DisplayName("Work with empty array")
    void test2() {
        int[] arr = new int[10];
        assertTrue(0 == AppPart2.getSumOrProduct(true, arr));
    }
}