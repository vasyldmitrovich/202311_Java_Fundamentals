package com.softserve.edu05.hw.HomeTask1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    @DisplayName("First five elements are positive")
    //Should return true
    public void firstFiveNumbersArePositiveTest1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = Task2.firstFiveNumbersArePositive(arr);

        assertTrue(result);
    }

    @Test
    @DisplayName("First five elements have at least one negative")
    //Should return false
    public void firstFiveNumbersArePositiveTest2() {
        int[] arr = {1, 2, -3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = Task2.firstFiveNumbersArePositive(arr);

        assertFalse(result);
    }

    @Test
    @DisplayName("First five elements are positive with zero")
    //Should return true In this task, we consider that zero is positive
    public void firstFiveNumbersArePositiveTest3() {
        int[] arr = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = Task2.firstFiveNumbersArePositive(arr);
        assertTrue(result);
    }

    @Test
    @DisplayName("Correct sum of first five elements")
    void sumOfFirstFiveElementsTest1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int res = Task2.sumOfFirstFiveElements(arr);
        assertEquals(15, res);
    }

    @Test
    @DisplayName("Correct sum of first five elements with zero")
    void sumOfFirstFiveElementsTest2() {
        int[] arr = {1, 2, 3, 4, 0, 6, 7, 8, 10};
        int res = Task2.sumOfFirstFiveElements(arr);
        assertEquals(10, res);
    }

    @Test
    @DisplayName("Product of last five elements")
    public void productOfLastFiveElements1() {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4, -5};
        int res = Task2.productOfLastFiveElements(arr);
        assertEquals(-120, res);
    }

    @Test
    @DisplayName("Product of last five elements with zero")
    public void productOfLastFiveElements2() {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 0, -5};
        int res = Task2.productOfLastFiveElements(arr);
        assertEquals(0, res);
    }
}