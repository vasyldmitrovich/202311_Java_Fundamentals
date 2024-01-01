package com.softserve.edu7.pt.pt2;

public class pt2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Cleaner("Vasya"),
                new Student("Petyz"),
                new Teacher("Lee"),
        };
        for (var person:persons){
            person.print();
            if (person instanceof Staff staff){
                System.out.println("Salary:" + staff.salary());
            }
            System.out.println("____________");
        }
    }

}

