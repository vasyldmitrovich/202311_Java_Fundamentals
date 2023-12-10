package com.softserve.edu06.pt.PracticalTask1;

class ClassA {
    public int i = 1;

    public ClassA() {
        System.out.println("ClassA() done");
    }

    public void m1() {
        System.out.println("ClassA, method m1, i=" + i);
    }

    public void m2() {
        System.out.println("ClassA, method m2, i=" + i);
    }

    public void m3() {
        System.out.print("ClassA, method m3, running m4(): ");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, method m4");
    }

    public static void m6() {
        System.out.println("ClassA, static method m6");
    }

    protected void m8() {
        System.out.println("ClassA, method m8");
    }
}

class ClassB extends ClassA {
    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, method m1, i=" + i);
        // super.m1();
    }

    @Override
    public void m4() {
        System.out.println("ClassB, method m4, i = " + i);
    }


    // @Override
    public void m5() {
        System.out.println("ClassB, method m5");
    }

    // @Override
    public static void m6() {
        System.out.println("ClassB, static method m6");
        ClassA.m6();
    }

    // private void m8() {
    public void m8() {
        System.out.println("ClassB, method m8");
        super.m8();
    }
}


public class App {

    public static void main(String[] args) {
        System.out.println("Test ClassA.");
        ClassA a;
        a = new ClassA();
        System.out.println("a.i = " + a.i);
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        a.m6(); // static running A.m6();
        a.m8();

        System.out.println("Test ClassB.");
        ClassA b = new ClassB();
        System.out.println("b.i = " + b.i);
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        //b.m5();
        ((ClassB) b).m5();
        if (b instanceof ClassB) {
            ((ClassB) b).m5(); // No Runtime Error
        }
        b.m6(); // Running from ClassA; Architecture Error;
        ClassB.m6();
        ClassA.m6();
        b.m8();

        System.out.println("Test_0 ClassB.");
        ClassB b0 = new ClassB();
        System.out.println("b0.i = " + b0.i);
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5();
        b0.m6();
        b0.m8();
    }
}

