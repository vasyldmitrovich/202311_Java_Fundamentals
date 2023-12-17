package com.softserve.edu06.pt.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Start of application");
        ClassA a = new ClassA();
        System.out.println("Test ClassA: ");
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        ClassB b = new ClassB();
        System.out.println("Test ClassB:");
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        ClassA b0 = new ClassB();
        System.out.println("Test_0 ClassB:");
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5(); // what will be?
    }
}

class ClassA {
    int m1, m2, m3, m4;

    void m1() {
        System.out.println("m1 in A");
    }
    void m2() {
        System.out.println("m2 in A");
    }
    void m3() {
        System.out.println("m3 in A");
    }
    void m4() {
        System.out.println("m4 in A");
    }
    void m5() {
        System.out.println("m5 in A");
    }
}

class ClassB extends ClassA {
    int m5;
}
