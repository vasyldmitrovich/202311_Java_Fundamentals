package com.softserve.edu05.hw.HomeTask2;

import com.softserve.edu05.hw.HomeTask1.Task1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask2Test {
    private InputStream oldIn;
    @BeforeEach
    void saveSystemIn(){
        oldIn = System.in;
    }
    @AfterEach
    void RestoreSystemIn(){
        System.setIn(oldIn);
    }
    private void provideInput(String text){
        System.setIn(new ByteArrayInputStream(text.getBytes()));
    }
    @Test
    @DisplayName("Correct number entered")
    void getMonthNumberTest2() {
        provideInput("13");
        int expectedNumber = 13;
        var res = HomeTask2.getNumber();
        assertEquals(expectedNumber, res);
    }

    @Test
    @DisplayName("Correct sum")
    public void sumTest() {
        int a = 5;
        int b = 10;
        int res = HomeTask2.sum(a,b);
        assertEquals(15, res);
    }

    @Test
    @DisplayName("Correct answer return 1")
    public void getAnswerTest1() {
        provideInput("Yes");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }
    @Test
    @DisplayName("Correct answer return 2")
    public void getAnswerTest2() {
        provideInput("yEs");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }
    @Test
    @DisplayName("Correct answer return 3")
    public void getAnswerTest3() {
        provideInput("yeS");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 4")
    public void getAnswerTest4() {
        provideInput("YES");
        String result = HomeTask2.getAnswer();
        assertEquals("yes", result);
    }

    @Test
    @DisplayName("Correct answer return 5")
    public void getAnswerTest5() {
        provideInput("Y");
        String result = HomeTask2.getAnswer();
        assertEquals("y", result);
    }



}