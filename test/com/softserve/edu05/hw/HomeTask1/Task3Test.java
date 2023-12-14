package com.softserve.edu05.hw.HomeTask1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    @DisplayName("Product of all even numbers")
    void productOfAllEvenNumbersTest1() {
        int[] arr = {1, -1, -2, 1, 4}; // Output: (4) (-2 2) (-8)
        long result = Task3.productOfAllEvenNumbers(arr);
        assertEquals(-8, result);
    }
    @Test
    @DisplayName("Product of all even numbers without even numbers")
    void productOfAllEvenNumbersTest2() {
        int[] arr = {1, -1, -1, 1, 1};
        long result = Task3.productOfAllEvenNumbers(arr);
        assertEquals(0, result);
    }
    @Test
    @DisplayName("Product of all even numbers with zero")
    void productOfAllEvenNumbersTest3() {
        int[] arr = {6, -1, -1, 0, 1};
        long result = Task3.productOfAllEvenNumbers(arr);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Position of minimum value")
    void minimumValuePositionTest1() {
        int[] arr = {1, -1, -2, 0, 4};
        int result = Task3.minimumValuePosition(arr);
        assertEquals(2, result);
    }

    @Test
    @DisplayName( "Position of second positive number")
    void positionOfSecondPositiveNumberTest1() {
        int[] arr = {1, -1, -2, 0, 4};
        int result = Task3.positionOfSecondPositiveNumber(arr);
        assertEquals(4, result);
    }
}