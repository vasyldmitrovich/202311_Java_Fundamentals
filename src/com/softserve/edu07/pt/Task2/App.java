package com.softserve.edu07.pt.Task2;

public class App {
    public static void main(String[] args) {

        Person[] persons = new Person[] {

                new Cleaner("Joe"),
                new Student("Mark"),
                new Teacher("Vadim"),
                new Cleaner("Lara"),
                new Student("Jora"),
                new Teacher("Vladislav"),
        };

        for (Person person: persons){
            person.print();

            if(person instanceof Staff){
                System.out.println( "Salary = " + ((Staff) person).salary());
            }
            System.out.println("--------");
        }
    }
}
