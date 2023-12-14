package com.softserve.edu05.hw.HomeTask2;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HomeTask2Test {
    private static final InputStream OLD_IN = System.in;

    @AfterEach
    void RestoreSystemIn() {
        System.setIn(OLD_IN);
    }

    private void provideInput(String text) {
        System.setIn(new ByteArrayInputStream(text.getBytes()));
    }

    @Test
    @DisplayName("Correct number entered")
    @Order(1)
    void getMonthNumberTest2() {
        provideInput("13\n");
        int expectedNumber = 13;
        var res = HomeTask2.getNumber();
        assertEquals(expectedNumber, res);
    }

    @Test
    @DisplayName("Correct sum")
    @Order(2)
    public void sumTest() {
        int a = 5;
        int b = 10;
        int res = HomeTask2.sum(a, b);
        assertEquals(a + b, res);
    }

    @Test
    @DisplayName("Correct answer return 1")
    @Order(3)
    public void getAnswerTest1() {
        provideInput("Yes\n");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 2")
    @Order(4)
    public void getAnswerTest2() {
        provideInput("yEs\n");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 3")
    @Order(5)
    public void getAnswerTest3() {
        provideInput("yeS\n");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 4")
    @Order(6)
    public void getAnswerTest4() {
        provideInput("YES\n");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 5")
    @Order(7)
    public void getAnswerTest5() {
        provideInput("Y\n");
        String result = HomeTask2.getAnswer();
        assertEquals("y", result);
    }


}