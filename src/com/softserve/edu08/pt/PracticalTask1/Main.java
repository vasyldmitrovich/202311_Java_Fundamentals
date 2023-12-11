package com.softserve.edu08.pt.PracticalTask1;

public class Main {
    public static void main(String[] args) {
        Department.Address department1 = new Department("Java").new Address("Vinnitsya", "Soborna", 50);
        Department.Address department2 = department1.clone();

        System.out.println(department1);
        System.out.println(department2);

        department2.setCity("Kyiv");

        System.out.println(department1);
        System.out.println(department2);
    }
}
