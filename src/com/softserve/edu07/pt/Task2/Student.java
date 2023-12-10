package com.softserve.edu07.pt.Task2;

public class Student extends Person{

    private final String TYPE_PERSON = "Student";


    public Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void print() {
        System.out.println("My name is " + getName());
        System.out.println("I am a " + TYPE_PERSON);
    }
}
