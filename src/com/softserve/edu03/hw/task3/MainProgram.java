package com.softserve.edu03.hw.task3;

public class MainProgram {
    public static void main(String[] args) {
        class Person {
            private String firstName;
            private String lastName;
            private int birthYear;

            public Person() {
            }

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public int getBirthYear() {
                return birthYear;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public void setBirthYear(int birthYear) {
                this.birthYear = birthYear;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }
        }

    }
}
