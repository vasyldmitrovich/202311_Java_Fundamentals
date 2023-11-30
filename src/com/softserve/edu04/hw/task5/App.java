package com.softserve.edu04.hw.task5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rich", "DALMATIAN", 20);
        Dog dog2 = new Dog("Rich", "BOXER", 15);
        Dog dog3 = new Dog("Lupul", "DACHSHUND", 10);
        String nameOldestDog = (getOldestDog(dog1, dog2, dog3)).getName();
        Breed breedOldestDog = (getOldestDog(dog1, dog2, dog3)).getBreed();
        System.out.println("The oldest dog is: " + nameOldestDog + ", it's breed: " + breedOldestDog);
        checkName(dog1, dog2, dog3);
    }

    static Dog getOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldestDog = dog1;
        if (dog2.age > dog1.age) {
            oldestDog = dog2;
        }
        if (dog3.age > oldestDog.age) {
            oldestDog = dog3;
        }
        return oldestDog;
    }

    static void checkName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.name.equals(dog2.name)) {
            System.out.println("The names of the dog1 and the dog2 match");
        } else if (dog2.name.equals(dog3.name)) {
            System.out.println("The names of the dog2 and the dog3 match");
        } else if (dog1.name.equals(dog3.name)) {
            System.out.println("The names of the dog1 and the dog3 match");
        }

    }

}
