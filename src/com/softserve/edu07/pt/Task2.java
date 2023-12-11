package com.softserve.edu07.pt;

public class Task2 {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher(),
            new Cleaner(),
            new Student(),
            new Cleaner(),
            new Student(),
            new Teacher(),
        };
        for( Person p : people ) {
            p.print();
            if( p instanceof Staff staff ) {
                System.out.println("My salary is " + staff.salary());
            }
            System.out.println(">>>>>>");
        }
    }
}
abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void print();
}
class Student extends Person {
    private static final String TYPE_PERSON = "Student";
    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
abstract class Staff extends Person {

    @Override
    public void print() {
        System.out.println("I am a ");
    }

   public abstract double salary();
}
class Teacher extends Staff {
    private static final String TYPE_PERSON = "Teacher";
    @Override
    public double salary() {
        return 100;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";
    @Override
    public double salary() {
        return 90;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}