package com.softserve.edu07.pt.task2;

public abstract class Person {
    private String name;//Add getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void print();
}
