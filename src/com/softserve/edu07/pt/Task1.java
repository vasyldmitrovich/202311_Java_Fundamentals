package com.softserve.edu07.pt;
public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat(),
                new Cat(),
        };
        for( Animal a : animals ) {
            a.feed();
            a.voice();
        }
    }
}
interface Animal {
    void voice();
    void feed();
}
class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("the cat is chewing");
    }
}
class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("woof");
    }

    @Override
    public void feed() {
        System.out.println("the dog is gorging");
    }
}

