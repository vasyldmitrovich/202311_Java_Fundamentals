package com.softserve.edu05.hw.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppPart1Test {
    @Test
    @DisplayName("Works with empty array")
    void test1() {
        int[] emptyArray = new int[0];
        AppPart1.getCountOfDays(5, emptyArray);
    }

    @Test
    @DisplayName("Works with number 0")
    void name() {
        int[] emptyArray = {1, 2, 3};
        AppPart1.getCountOfDays(0, emptyArray);
    }
}