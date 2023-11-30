package com.softserve.edu04.hw.task5;

public class Dog {
    String name;
    Breed breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = Breed.valueOf(breed);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = Breed.valueOf(breed);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
