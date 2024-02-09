package softserve.edu01.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Calculate the perimeter and area of a flower bed
        System.out.println("Task 1: Calculate the perimeter and area of a flower bed");
        System.out.print("Enter the radius of the flower bed: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n%n", area);

        // Task 2: Read name and address from the console
        System.out.println("Task 2: Read name and address from the console");
        System.out.print("What is your name? ");
        String name = scanner.next();

        System.out.printf("Where do you live, %s? ", name);
        scanner.nextLine(); // Consume the newline character
        String address = scanner.nextLine();

        System.out.printf("Complete Information: Name - %s,  City - %s%n%n", name, address);

        // Task 3: Calculate the cost of phone calls
        System.out.println("Task 3: Calculate the cost of phone calls");

        System.out.print("Enter the cost per minute for call 1: ");
        double c1 = scanner.nextDouble();

        System.out.print("Enter the duration of call 1 in minutes: ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 2: ");
        double c2 = scanner.nextDouble();

        System.out.print("Enter the duration of call 2 in minutes: ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 3: ");
        double c3 = scanner.nextDouble();

        System.out.print("Enter the duration of call 3 in minutes: ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.printf("Cost of call 1: %.2f%n", cost1);
        System.out.printf("Cost of call 2: %.2f%n", cost2);
        System.out.printf("Cost of call 3: %.2f%n", cost3);
        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}
