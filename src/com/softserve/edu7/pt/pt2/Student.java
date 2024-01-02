package com.softserve.edu7.pt.pt2;

class Student extends Person {
    private final String TYPE_PERSON = "Student";

    @Override
    public void print() {
        System.out.println("" +getName() + ":" + TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
    }
}
