package com.softserve.edu03.hw03;

import java.time.Year;
import java.util.Scanner;

public class Person {

    Person[] personArray = new Person[5];
    private String firstName;
    private String lastName;
    private int birthYear;
    static Scanner scanner = new Scanner(System.in);

    public Person() {

    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void inputInformationOfPerson() {
        System.out.print(" Enter first name: ");
        scanner.nextLine();
        setFirstName(scanner.nextLine());
        System.out.print(" Enter last name: ");
        setLastName(scanner.nextLine());
        System.out.print(" Enter birth year: ");
        setBirthYear(scanner.nextInt());
    }

    public void outputInformationOfPerson() {
        System.out.println("\nPersonal information: \n    First Name: " + getFirstName() +
                "\n    Last Name: " + getLastName() +
                "\n    Birth Year: " + getBirthYear() +
                "\n    Age: " + getAge());
    }


    public void changeInformation(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void programMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select the desired menu\n 1. Input information about person\n 2. Get information about person\n 3. Change information about person\n 4. Exit");
            int menuInput = scanner.nextInt();
            if (menuInput == 1) {
                for (int i = 0; i < personArray.length; i++) {
                    System.out.println("insert information about " + (i + 1) + " person");
                    personArray[i] = new Person();
                    personArray[i].inputInformationOfPerson();
                }
            } else if (menuInput == 2) {
                for (int i = 0; i < personArray.length; i++) {
                    System.out.println("get information about " + (i + 1) + " person");
                    personArray[i].outputInformationOfPerson();
                }
            } else if (menuInput == 3) {
                System.out.println("Select person for change");
                Scanner sc = new Scanner(System.in);
                Scanner scannerInt = new Scanner(System.in);
                int selectedPerson = scannerInt.nextInt();
                for (int i = 0; i < personArray.length; i++) {
                    if (i == selectedPerson - 1) {
                        personArray[i].changeInformation(getFirstName(), getLastName(), getBirthYear());
                        System.out.print(" Enter first name: ");
                        personArray[i].setFirstName(sc.nextLine());
                        System.out.print(" Enter last name: ");
                        personArray[i].setLastName(sc.nextLine());
                        System.out.print(" Enter birth year: ");
                        personArray[i].setBirthYear(sc.nextInt());
                        personArray[i].outputInformationOfPerson();
                    }
                }
            } else if (menuInput == 4) {
                System.out.println("Have a nice day! Buy!");
                exit = true;
            }
        }
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
        if (Year.now().getValue() < birthYear || birthYear < 0) {
            System.out.println("This year is incorrect? please input new information about birth year");
            setBirthYear(scanner.nextInt());
        } else {
            this.birthYear = birthYear;
        }

    }
}