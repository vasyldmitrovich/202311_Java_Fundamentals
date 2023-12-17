package Sorokotiaha.com.softserve.edu04.hw;

import java.util.Objects;

public class hw5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lee", Breed.BRITTANY, 7);
        Dog dog2 = new Dog("Dog", Breed.DOG, 17);
        Dog dog3 = new Dog("Lee", Breed.TERRIER, 17);

        if (Objects.equals(dog1.getName(), dog2.getName()) | Objects.equals(dog1.getName(), dog3.getName()) | Objects.equals(dog3.getName(), dog2.getName())) {
            System.out.println("there are dogs with the same names");
        }

        int maxAge = dog1.getAge();

        if (maxAge < dog2.getAge()) {
            maxAge = dog2.getAge();
        }

        if (maxAge < dog3.getAge()) {
            maxAge = dog3.getAge();
        }
        System.out.println("Oldest dog:");
        if (maxAge == dog1.getAge()){
            System.out.println("name:" + dog1.getName() + " breed:" + dog1.getBreed());
        }
        if (maxAge == dog2.getAge()){
            System.out.println("name:" + dog2.getName() + " breed:" + dog2.getBreed());
        }
        if (maxAge == dog3.getAge()){
            System.out.println("name:" + dog3.getName() + " breed:" + dog3.getBreed());
        }



    }
}

class Dog {
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

enum Breed {
    TERRIER, DOG, BRITTANY, POINTER;


}

