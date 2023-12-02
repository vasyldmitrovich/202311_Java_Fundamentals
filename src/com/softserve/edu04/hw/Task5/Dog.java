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

}
