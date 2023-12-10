package com.softserve.edu07.pt.Task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("*doggy* Mnom-mnom!");
    }
}
