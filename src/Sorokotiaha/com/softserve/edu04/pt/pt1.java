package Sorokotiaha.com.softserve.edu04.pt;

import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int oddNumber = 0;

        System.out.println("First number:");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            oddNumber++;
        }
        System.out.println("Second number1:");
        int n2 = sc.nextInt();
        if (n2 % 2 == 0) {
            oddNumber++;
        }
        System.out.println("Third number:");
        int n3 = sc.nextInt();
        if (n3 % 2 == 0) {
            oddNumber++;
        }
        System.out.println("Number of odd:" + oddNumber);

    }
}
