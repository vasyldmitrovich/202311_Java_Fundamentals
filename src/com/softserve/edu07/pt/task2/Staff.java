package com.softserve.edu07.pt.task2;

public abstract class Staff extends Person {
    final String TYPE_PERSON = "Staff";
    abstract void salary();
    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " +  this.name);
    }
}
