package softserve.edu05.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Calculate days in a month
        System.out.print("Enter a month number: ");
        int monthNumber = scanner.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Number of days in month " + monthNumber + ": " + daysInMonth[monthNumber]);
        } else {
            System.out.println("Invalid month number.");
        }

        // Task 2: Numbers operations
        System.out.println("Enter 10 integer numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = calculateSumOrProduct(numbers);
        System.out.println("Result: " + result);

        // Task 3: Find position of second positive number, minimum value, and its position
        System.out.println("Enter 5 integer numbers:");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        int secondPositivePosition = findSecondPositivePosition(array);
        int[] minResult = findMinValueAndPosition(array);

        System.out.println("Position of second positive number: " + secondPositivePosition);
        System.out.println("Minimum value: " + minResult[0] + " at position: " + minResult[1]);

        // Task 4: Do-while loop for sum calculation
        char repeat;

        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
    }

    private static int calculateSumOrProduct(int[] array) {
        int result;
        if (array[0] + array[1] + array[2] + array[3] + array[4] > 0) {
            result = array[0] + array[1] + array[2] + array[3] + array[4];
        } else {
            result = array[5] * array[6] * array[7] * array[8] * array[9];
        }
        return result;
    }

    private static int findSecondPositivePosition(int[] array) {
        int countPositives = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositives++;
                if (countPositives == 2) {
                    return i + 1; // Position is 1-based
                }
            }
        }
        return -1; // Not found
    }

    private static int[] findMinValueAndPosition(int[] array) {
        int min = array[0];
        int position = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            }
        }

        int[] result = {min, position + 1}; // Position is 1-based
        return result;
    }
}
