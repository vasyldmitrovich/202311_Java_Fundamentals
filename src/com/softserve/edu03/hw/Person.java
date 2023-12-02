package com.softserve.edu03.hw;

import java.time.LocalDateTime;
import java.util.Scanner;

//Where is App.java class and in this class should be main method


public class Person {
    static Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;
    int birthYear;
    private static int Year;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input() {

        System.out.println("Enter the firstname: ");
        String fName = scanner.nextLine();
        System.out.println("Enter the lastname: ");
        String lName = scanner.nextLine();
        this.changeName(fName, lName);
        System.out.println("Enter the birthday year: ");
        this.birthYear = Integer.parseInt(scanner.nextLine());

    }

    public void output() {
        System.out.println(this);
        System.out.println(this.firstName + " " + this.lastName + " is " + this.getAge()
                + " years old.");
    }

    public int getAge() {
        int currentYear = LocalDateTime.now().getYear();
        return currentYear - this.birthYear;
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }
}
