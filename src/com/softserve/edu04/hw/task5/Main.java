package com.softserve.edu04.hw.task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ros", "Doberman", 4);
        Dog dog2 = new Dog("Bibi", "Akita", 9);
        Dog dog3 = new Dog("Amanda", "Shepherd", 12);

        if (dog1.getName() != dog2.getName()) {
            System.out.println("Name " + dog1.getName() + " and " + dog2.getName() + " is different");
        } else System.out.println("Name " + dog1.getName() + " and " + dog2.getName() + " is identical");
        if (dog2.getName() != dog3.getName()) {
            System.out.println("Name " + dog2.getName() + " and " + dog3.getName() + " is different");
        } else System.out.println("Name " + dog2.getName() + " and " + dog3.getName() + " is identical");
        if (dog3.getName() != dog1.getName()) {
            System.out.println("Name " + dog3.getName() + " and " + dog1.getName() + " is different");
        } else System.out.println("Name " + dog1.getName() + " and " + dog1.getName() + " is identical");

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("The oldest dog is " + oldestDog.getName() + ", she is " + oldestDog.getAge());
    }
}

class Dog{
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    enum Breed {
        AFADOR, AKITA, BOXER, BULLDOG, DOBERMAN, SHEPHERD
    };

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
