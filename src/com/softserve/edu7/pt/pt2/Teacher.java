package com.softserve.edu7.pt.pt2;

class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    @Override
    public void print() {
        System.out.println("" + getName() + ":" + TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 30000;
    }

    public Teacher(String name) {
        super(name);
    }
}
