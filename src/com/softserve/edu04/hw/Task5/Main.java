package com.softserve.edu04.hw.Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bob", Dog.Breed.SAMOYED, 12);
        Dog dog2 = new Dog("Joe", Dog.Breed.SPITZ, 15);
        Dog dog3 = new Dog("Joe", Dog.Breed.AKITA, 7);


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
            if (names.contains(dog.getName())) {
                flag = true;
                sameName = dog.getName();
            }
            names.add(dog.getName());
        }
        if(flag){
            System.out.println("There is two dogs with the same name : " + sameName);
        } else {
            System.out.println("There is no dogs with the same name");
        }

    }
}
