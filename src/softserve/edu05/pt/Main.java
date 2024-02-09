package softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task 1: Create a string array and sort it
        String[] stringArray = {"banana", "apple", "orange", "grape", "kiwi"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        // Task 2: Create an array with 5 elements and calculate the average value
        int[] intArray = {5, 10, 15, 20, 25};
        double average = calculateAverage(intArray);
        System.out.println("Average of the Int Array: " + average);

        // Task 3: Check if the array contains a value entered from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the array: ");
        int searchValue = scanner.nextInt();
        boolean containsValue = Arrays.stream(intArray).anyMatch(value -> value == searchValue);
        System.out.println("Array contains " + searchValue + ": " + containsValue);

        // Task 4: Check if the entered number is prime
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static double calculateAverage(int[] array) {
        int sum = Arrays.stream(array).sum();
        return (double) sum / array.length;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

