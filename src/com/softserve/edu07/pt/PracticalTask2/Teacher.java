package com.softserve.edu07.pt.PracticalTask2;

class Teacher extends Stuff {
    private static final String TYPE_PERSON = "Teacher";

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 100;
    }
}
