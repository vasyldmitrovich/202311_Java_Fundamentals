package com.softserve.edu04.hw.HomeTask5;

public class HomeTask5 {
    public static void run() {
        Dog dog1 = new Dog("Cooper", Breed.FRENCH_BULLDOG, 2);
        Dog dog2 = new Dog("Charlie", Breed.LABRADOR, 3);
        Dog dog3 = new Dog("Max", Breed.POODLE, 8);

        if (isUniqName(dog1, dog2) & isUniqName(dog2, dog3) & isUniqName(dog1, dog3)) {
            System.out.println("All names are unique");
        } else {
            System.out.println("Not all names are unique");
        }

        Dog oldestdog = olderDog(olderDog(dog1, dog2), dog3);

        System.out.println("The older dog is " + oldestdog.getName() + ". He is " + oldestdog.getBreed() + ". He is " + oldestdog.getAge() + " years old.");


    }

    public static boolean isUniqName(Dog dog1, Dog dog2) {
        if (!dog1.getName().equals(dog2.getName())) {
            return true;
        } else {
            return false;
        }
    }

    public static Dog olderDog(Dog dog1, Dog dog2) {
        return dog1.getAge() > dog2.getAge() ? dog1 : dog2;
    }


}
