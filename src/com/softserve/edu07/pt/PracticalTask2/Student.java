package com.softserve.edu07.pt.PracticalTask2;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
