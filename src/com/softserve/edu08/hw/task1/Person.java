package com.softserve.edu08.hw.task1;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "Name: " + fullName.getFirstName() + ", Surname: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();
}
