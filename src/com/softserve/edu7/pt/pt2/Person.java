package com.softserve.edu7.pt.pt2;

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();

    public Person(String name) {
        this.name = name;
    }
}
