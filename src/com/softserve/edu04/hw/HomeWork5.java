package com.softserve.edu04.hw;

import java.util.Objects;
import java.util.Scanner;

import static com.softserve.edu04.hw.HomeWork5.SCANNER;

public class HomeWork5 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Dog dog1 = new Dog("first");
        Dog dog2 = new Dog("second");
        Dog dog3 = new Dog("third");

        int nameEquality = compareEqualityOfNames(dog1, dog2, dog3);
        if (nameEquality == 0) {
            System.out.println("There are no dogs with identical names in our group.");
        } else if (nameEquality == 1 ){
            System.out.println("There are two dogs with identical names in our group.");
        } else {
            System.out.println("All three dogs in our group have identical names.");
        }

        findOldestDog(dog1, dog2, dog3);
    }

    static int compareEqualityOfNames(Dog dog1, Dog dog2, Dog dog3) {
        int counter = 0;

        if (dog1.getName().equals(dog2.getName())) {
            counter++;
        }

        if (dog1.getName().equals(dog3.getName())) {
            counter++;
        }

        if (dog2.getName().equals(dog3.getName())) {
            counter++;
        }
        return counter;
    }

    static void findOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
            //convert enum so that not all letters are capital letters
            String zucht = dog1.getBreed().toString().charAt(0) + dog1.getBreed().toString().substring(1).toLowerCase();
            System.out.println("Dog " + dog1.getName() + " of breed " + zucht + " has " + dog1.getAge() + " years and is the oldest dog in our group.");
        } else if ((dog2.getAge() > dog3.getAge())) {
            String zucht = dog2.getBreed().toString().charAt(0) + dog2.getBreed().toString().substring(1).toLowerCase();
            System.out.println("Dog " + dog2.getName() + " of breed " + zucht + " has " + dog2.getAge() + " years and is the oldest dog in our group.");
        } else {
            String zucht = dog3.getBreed().toString().charAt(0) + dog3.getBreed().toString().substring(1).toLowerCase();
            System.out.println("Dog " + dog3.getName() + " of breed " + zucht + " has " + dog3.getAge() + " years and is the oldest dog in our group.");
        }
    }
}

class Dog {
    private String name;
    Breed breed;
    private int age;

    public Dog(String ordinal) {
        Breed bd;

        System.out.print("Enter the name of this " + ordinal + " dog: ");
        this.name = SCANNER.nextLine();

        System.out.print("What is the breed of this " + ordinal + " dog: ");
        String breed = SCANNER.nextLine();
        this.breed = Breed.valueOf(breed.toUpperCase());

        System.out.print("What is the age of this " + ordinal + " dog: ");
        this.age = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println(); // formatting in the console
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

enum Breed {
    BULLDOG,
    POODLE,
    BEAGLE,
    DACHSHUND,
    SHEPHERD,
    LABRADOR,
    RETRIEVER,
    P, // P, L, V are needed for the purpose of testing
    L,
    V
 }
