package com.softserve.edu03.hw.task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public int Age() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - birthYear;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter your birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void outputInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }

        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", birthYear = " + birthYear +
                ", age = " + Age();
    }
}
