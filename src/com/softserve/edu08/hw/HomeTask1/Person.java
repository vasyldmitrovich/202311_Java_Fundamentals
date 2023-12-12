package com.softserve.edu08.hw.HomeTask1;

abstract public class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName()
                + ", Last name: " + fullName.getLastName()
                + ", Age: " + age;
    }

    abstract public String activity();
}
