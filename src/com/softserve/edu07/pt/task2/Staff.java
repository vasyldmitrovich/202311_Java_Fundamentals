package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person{

    @Override
    void print() {
        System.out.println("I am a " + getClass().getSimpleName().toLowerCase());
    }

    abstract void salary();
}
