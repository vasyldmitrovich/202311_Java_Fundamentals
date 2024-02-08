package com.softserve.edu8.hw;

abstract class Person implements Cloneable {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    String info() {
        return "First name: <" + this.fullName.getFirstName() +
                ">, Last name: <" + this.fullName.getLastName() +
                ">, Age: <" + this.age + ">";
    }

    public String activity() {
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
