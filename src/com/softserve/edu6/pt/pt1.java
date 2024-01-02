package com.softserve.edu6.pt;

public class pt1 {
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
        ((ClassB) b0).m5();
    }

    public static class ClassA {
        public int i = 1;

        public void m1() {
            System.out.println("ClassA, method m1, i = " + i);
        }

        public void m2() {
            System.out.println("ClassA, method m2, i = " + i);
        }

        public void m3() {
            System.out.print("ClassA, method m3, running m4():");
            m4();
        }

        public void m4() {
            System.out.println("ClassA, method m4");
        }
    }

    public static class ClassB extends ClassA {
        public double i = 1.1;

        public void m1() {
            System.out.println("ClassB, method m1, i= " + i);
        }

        public void m4() {
            System.out.println("ClassB, method m4");
        }

        public void m5() {
            System.out.println("ClassB, method m5, i= " + i);
        }
    }


}
