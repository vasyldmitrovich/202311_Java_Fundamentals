package com.softserve.edu05.hw.HomeTask1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private InputStream oldIn;
    @BeforeEach
    void saveSystemIn(){
        oldIn = System.in;
    }
    @AfterEach
    void RestoreSystemIn(){
        System.setIn(oldIn);
    }


    @Test
    @DisplayName("Correct month returning by month number")
    void getMonthTest() {
        String expectedMoth = "June";
        String res = Task1.getMonth(6);
        assertEquals(expectedMoth, res);
    }

    @Test
    @DisplayName("Correct days in month returning by month number")
    void getDaysInMonthTest() {
        int expectedDays = 30;
        int res = Task1.getDaysInMonth(6);
        assertEquals(expectedDays, res);
    }

    @Test
    @DisplayName("Correct month number entered (input 1 - 12)")
    void getMonthNumberTest1() {
        provideInput("6");
        int expectedNumber = 6;
        var res = Task1.getMonthNumber();
        assertEquals(expectedNumber, res);
    }

    @Test
    @DisplayName("Correct month number entered (input NOT 1 - 12)")
    void getMonthNumberTest2() {
        provideInput("13");
        int expectedNumber = -1;
        var res = Task1.getMonthNumber();
        assertEquals(expectedNumber, res);
    }

    private void provideInput(String text){
        System.setIn(new ByteArrayInputStream(text.getBytes()));
    }
}