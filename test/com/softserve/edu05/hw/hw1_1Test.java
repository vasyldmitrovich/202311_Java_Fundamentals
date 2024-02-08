package com.softserve.edu05.hw;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hw1_1Test {

    @Test
    @DisplayName("hw1_1 test main")
    void test1() {

        hw1_1.daysInMonth(0);
        hw1_1.daysInMonth(13);
        hw1_1.daysInMonth(-1);
        hw1_1.daysInMonth(6);

    }

}