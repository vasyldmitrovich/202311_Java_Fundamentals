package com.softserve.edu05.hw.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getSumTest() {
        int n1 = 123;
        int n2 = 1250;
        assertTrue(1373 == (n1 + n2));
    }
}