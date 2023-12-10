package com.softserve.edu07.pt.task2;

public class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " +  name);
    }
}
