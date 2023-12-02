package com.softserve.edu04.hw.Task5;

import java.util.ArrayList;
import java.util.Objects;

public class Dog {
    public enum Breed{//Move to file Breed.java
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

    public static void main(String[] args) {//Move this method to class like App.java

        Dog dog1 = new Dog("Bob",Breed.SAMOYED, 12);
        Dog dog2 = new Dog("Joe",Breed.SPITZ, 15);
        Dog dog3 = new Dog("Joe",Breed.AKITA, 7);


        double oldestDogAge = dog1.getAge();

        checkUniqueNames(dog1, dog2, dog3);

        if(dog2.getAge() > oldestDogAge){
            oldestDogAge = dog2.getAge();
        } else if (dog3.getAge() > oldestDogAge){
            oldestDogAge = dog3.getAge();
        }

        System.out.printf("Oldest dog age is = %.2f",oldestDogAge);

    }
    private static void checkUniqueNames(Dog... dogs) {
        ArrayList<String> names = new ArrayList<>();
        boolean flag = false;
        String sameName = "";
        for (Dog dog : dogs) {
            if (names.contains(dog.name)) {
              flag = true;
              sameName = dog.name;
            }
            names.add(dog.name);
        }
        if(flag){
            System.out.println("There is two dogs with the same name : " + sameName);
        } else {
            System.out.println("There is no dogs with the same name");
        }

    }
}
