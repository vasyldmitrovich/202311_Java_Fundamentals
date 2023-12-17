package edu03.hw;
import java.util.Scanner;
public class app {//Name of class should start from Upper case
    public static double area(double a, double height) {
        return 0.5 * a * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = area(base, height);
        System.out.println("The area of the triangle is: " + area);
    }
}
