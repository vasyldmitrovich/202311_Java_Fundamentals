package com.softserve.edu03.hw.HomeTask3;

import java.util.Scanner;

public class HomeTask3 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void run() {
        Person person1 = new Person("Valera", "Valerovuch");
        person1.setBirthYear(1990);
        Person person2 = new Person("Dmytro", "Dmytrenko");
        person2.setBirthYear(1995);
        Person person3 = new Person("Vasyl", "Bazhan");
        person3.setBirthYear(2000);
        Person person4 = new Person("Person", "Personovuch");
        person4.setBirthYear(2005);
        Person person5 = new Person("Ivan", "Ivanenko");
        person5.setBirthYear(2010);

        person1.output();
        System.out.println(person1.getFirstName() + " is " + person1.getAge() + " years old");
        person2.output();
        System.out.println(person2.getFirstName() + " is " + person2.getAge() + " years old");
        person3.output();
        System.out.println(person3.getFirstName() + " is " + person3.getAge() + " years old");
        person4.output();
        System.out.println(person4.getFirstName() + " is " + person4.getAge() + " years old");
        person5.output();
        System.out.println(person5.getFirstName() + " is " + person5.getAge() + " years old");

    }

}
