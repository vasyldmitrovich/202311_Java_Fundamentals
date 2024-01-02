package com.softserve.edu08.hw.Task1;

import com.softserve.edu08.hw.Task2.Student;

public abstract class Person  {

    protected FullName fullName;//Do fields private
    protected int age;

    public Person (FullName fullName, int age) {
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

        return "First name: " +
                fullName.getFirstName() +
                ", Last name : " +
                fullName.getLastName() +
                ", Age : " + this.age;
    }



   public abstract String activity();
}
