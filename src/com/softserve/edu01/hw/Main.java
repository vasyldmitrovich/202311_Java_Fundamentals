package Sorokotiaha.com.softserve.edu01.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var task = new Scanner(System.in);
        System.out.print("task:");
        int numberTask = task.nextInt();
        System.out.println("_____");
        switch (numberTask){
            case (1):
                Task.task1();
                break;
            case (2):
                Task.task2();
                break;
            case (3):
                Task.task3();
                break;
            default:
                System.out.print("incorrect value");
        }


    }
}

class Task {
    public static void task1() {
        final double PI = 3.1415936;
        var sc = new Scanner(System.in);
        System.out.print("Radius:");
        double r = sc.nextDouble();
        System.out.println("perimeter:" + 2*PI*r + ";area:" + PI*Math.pow(r,2));


    }

    public static void task2() {

        var sc = new Scanner(System.in);

        System.out.print("What is your name?:");
        String name = sc.nextLine();

        System.out.print("Where do you life "+ name + "?");
        String adress = sc.nextLine();
        System.out.print("" + name + " your adress:" + adress);
    }

    public static void task3() {

        var sc = new Scanner(System.in);

        System.out.print("c1:");
        double c1 = sc.nextDouble();

        System.out.print("c2:");
        double c2 = sc.nextDouble();

        System.out.print("c3:");
        double c3 = sc.nextDouble();

        System.out.print("t1:");
        double t1 = sc.nextDouble();

        System.out.print("t2:");
        double t2 = sc.nextDouble();

        System.out.print("t3:");
        double t3 = sc.nextDouble();


        System.out.println("__calculation__");
        double cc1 = c1*t1;
        System.out.println("call1");
        System.out.println("duration:" + c1);
        System.out.println("cost :" + t1);
        System.out.println("call cost :" + cc1);
        System.out.println("____________");

        double cc2 = c2*t2;
        System.out.println("call2");
        System.out.println("duration:" + c2);
        System.out.println("cost :" + t2);
        System.out.println("call cost :" + cc2);
        System.out.println("____________");

        double cc3 = c3*t3;
        System.out.println("call3");
        System.out.println("duration:" + c3);
        System.out.println("cost :" + t3);
        System.out.println("call cost :" + cc3);
        System.out.println("____________");

        System.out.println("Total :" + (cc1 + cc2+cc3));
        System.out.println("____________");



    }
}