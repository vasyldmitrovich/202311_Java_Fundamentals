package com.softserve.edu07.pt.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Teacher(),
                new Cleaner(),
                new Student(),
                new Teacher(),
                new Student(),
        };

        for (var person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println("-------------------------");
        }
    }
}
