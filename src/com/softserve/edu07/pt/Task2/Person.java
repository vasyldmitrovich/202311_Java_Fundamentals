package com.softserve.edu07.pt.Task2;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
            return name;
        }
    abstract void print();
}
