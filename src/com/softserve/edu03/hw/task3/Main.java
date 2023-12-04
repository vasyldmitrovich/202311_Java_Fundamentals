package com.softserve.edu03.hw.task3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Artur", "Ivanov", 2001);
        Person person2 = new Person("Taras", "Shevchenko", 1814);
        Person person3 = new Person("Oleksandr", "Usyk", 1987);
        Person person4 = new Person("Lys", "Mykyta", 1931);
        Person person5 = new Person("Marta", "Skif", 1994);

        System.out.println(person1.toString());
        person1.changeName("Maksym", "Velykii");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person2.Age());
    }
}
