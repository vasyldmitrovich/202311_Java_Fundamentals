package com.softserve.edu07.pt.task2;

public class Student extends Person{

    @Override
    void print() {
        System.out.println("I am a " + getClass().getSimpleName().toLowerCase());
    }
}
