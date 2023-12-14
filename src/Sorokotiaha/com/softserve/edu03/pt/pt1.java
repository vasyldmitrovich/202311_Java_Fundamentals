package Sorokotiaha.com.softserve.edu03.pt;

import java.util.Scanner;
public class pt1 {
    public static void main(String[] args) {

        int n1 = getNumber("Enter the first number:");
        int n2 = getNumber("Enter the second number:");
        System.out.println("The sum of " + n1 +" and " +n2 +" is " + getTotal(n1,n2));
        System.out.println("The average of " + n1 +" and " +n2 +" is " + getAverage(n1,n2));
    }
    public static int getTotal(int a, int b) {
        return a + b;
    }
    public static double getAverage(int a, int b) {
        return (double) (a + b) / 2;
    }
    public static int getNumber(String prompt) {
        var sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }
}
