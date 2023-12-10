package com.softserve.edu07.pt.PracticalTask2;

public class PracticalTask2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher(),
                new Student(),
                new Cleaner(),
        };
        for (var person : persons) {
            person.print();
            if (person instanceof Stuff staff) {
                System.out.println("My salary is " + staff.salary());
            }
            System.out.println("==================");
        }


    }

}
