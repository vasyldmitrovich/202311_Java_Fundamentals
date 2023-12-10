package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";
    @Override
    void salary() {
        System.out.println("Cleaner's salary is 9000");
    }

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }
}
