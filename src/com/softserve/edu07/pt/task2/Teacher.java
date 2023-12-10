package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";
    @Override
    void salary() {
        System.out.println("Teacher's salary is 15000");
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }
}
