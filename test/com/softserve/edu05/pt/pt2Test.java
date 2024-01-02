package com.softserve.edu05.pt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class pt2Test {
    @Test
    @DisplayName("isPrime")
    void test1() {

        assertEquals(true,pt2.isPrime(2));
        assertEquals(false,pt2.isPrime(4));

    }
}