package com.softserve.edu7.pt.pt1;

class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("woof");
    }

    @Override
    public void feed() {
        System.out.println("The dog is fed");
    }
}
