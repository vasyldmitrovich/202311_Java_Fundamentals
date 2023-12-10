package com.softserve.edu07.pt.Task2;

public class Cleaner extends Staff{

    private final String TYPE_PERSON = "Cleaner";


    public Cleaner(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void print() {
        super.print();
        System.out.println(TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 100;
    }
}
