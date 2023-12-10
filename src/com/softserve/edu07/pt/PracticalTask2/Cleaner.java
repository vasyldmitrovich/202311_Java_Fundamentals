package com.softserve.edu07.pt.PracticalTask2;

public class Cleaner extends Stuff {
    private static final String TYPE_PERSON = "Cleaner";

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 30;
    }
}
