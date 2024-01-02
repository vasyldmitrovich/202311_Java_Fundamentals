package com.softserve.edu04.hw;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
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
}
