package com.softserve.edu04.hw.Task5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dog {
    public enum Breed{
        SPITZ,SAMOYED,BEAGLE,BULLDOG,AKITA,DALMATIAN

    }
    private final String name;
    private final Breed breed;
    private final double age;

    public Dog(String name, Breed breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public double getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog("Bob",Breed.SAMOYED, 12);
        Dog dog2 = new Dog("Bob",Breed.SPITZ, 15);
        Dog dog3 = new Dog("Joe",Breed.AKITA, 7);


        double oldestDogAge = dog1.getAge();

        if (!checkUniqueNames(dog1, dog2, dog3)) {
                System.out.println("There is two dogs with the same name.");
        } else {
            System.out.println("Ok");
        }

//        if (sameName != null){
//            System.out.printf("There is two dogs with the same name. Name is : %s\n",sameName);
//        } else {
//            System.out.println("Same names not found!");
//        }

        if(dog2.getAge() > oldestDogAge){
            oldestDogAge = dog2.getAge();
        } else if (dog3.getAge() > oldestDogAge){
            oldestDogAge = dog3.getAge();
        }

        System.out.printf("Oldest dog age is = %.2f",oldestDogAge);

    }
    private static boolean checkUniqueNames(Dog... dogs) {
        ArrayList<String> names = new ArrayList<>();
        for (Dog dog : dogs) {
            if (names.contains(dog.name)) {
                return false; // Duplicate name found
            }
            names.add(dog.name);
        }
        return true ;
    }
}
