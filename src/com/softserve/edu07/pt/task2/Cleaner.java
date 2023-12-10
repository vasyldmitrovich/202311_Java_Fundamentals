package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";
    @Override
    void salary() {
        System.out.println("Cleaner's salary is 9000");
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " +  this.name);
    }

    public Cleaner(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
}
