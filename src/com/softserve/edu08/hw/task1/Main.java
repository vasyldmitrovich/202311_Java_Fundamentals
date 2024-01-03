package com.softserve.edu08.hw.task1;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Artur", "Ivanov");
        Person person = new Person(fullName, 22) {
            @Override
            public String activity() {
                return null;
            }
        };

        System.out.println(person.info());
    }
}
