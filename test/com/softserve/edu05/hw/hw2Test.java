package com.softserve.edu05.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hw2Test {
    @Test
    @DisplayName("array sum")
    void test1() {

        int[]  arr = {1,2};

        int res = hw2.sumArray(arr);

        assertEquals(3,res);
    }


}