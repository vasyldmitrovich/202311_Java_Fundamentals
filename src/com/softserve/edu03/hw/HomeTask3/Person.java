package com.softserve.edu03.hw.HomeTask3;

import java.util.Calendar;

import static com.softserve.edu03.hw.HomeTask3.HomeTask3.SCANNER;

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

    public void input() {
        System.out.print("Input first name: ");
        setFirstName(SCANNER.nextLine());
        System.out.print("Input lastName: ");
        setLastName(SCANNER.nextLine());
        System.out.print("Input birth year: ");
        setBirthYear(Integer.parseInt(SCANNER.nextLine()));
    }

    public void output() {
        System.out.println("Person " + firstName + " " + lastName + ", was born in " + birthYear);
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - birthYear;
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
}
