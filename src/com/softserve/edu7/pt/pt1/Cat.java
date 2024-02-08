package com.softserve.edu7.pt.pt1;

class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("he cat is fed");
    }
}
