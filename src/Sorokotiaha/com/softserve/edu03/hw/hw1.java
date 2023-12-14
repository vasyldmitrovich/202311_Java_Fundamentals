package Sorokotiaha.com.softserve.edu03.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
      var sc = new Scanner(System.in);

        System.out.println("Input side 1:");
        int a = sc.nextInt();

        System.out.println("Input side 2:");
        int b = sc.nextInt();

        System.out.println("Input side 3:");
        int c = sc.nextInt();

        area(a,b,c);

    }
    public static void area(int a,int b,int c){

      double p = (a+b+c)/2;
      double s = Math.pow(p*(p-a)*(p-b)*(p-c),0.5);

      System.out.println("The area of the treangle is " + s);
    }
}
