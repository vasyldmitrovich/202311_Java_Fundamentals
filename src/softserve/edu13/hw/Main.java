package softserve.edu13.hw;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;




public class Main {
    public static void main(String[] args) {
        // Task 1
        String original = "abc";
        int shift = 3;
        String encrypted = encrypt(original, shift);
        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted, shift));

        // Task 2
        String date = "01.23.22";
        System.out.println("Is date valid? " + validateDate(date));

        // Task 3
        int year = 2024;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));

        // Task 4
        LocalDate birthday = LocalDate.of(2000, Month.JANUARY, 1);
        printDayOfWeek(birthday);
    }

    // Task 1 methods
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) (base + (c - base + n) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    // Task 2 method
    public static boolean validateDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    // Task 3 method
    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

    // Task 4 method
    public static void printDayOfWeek(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek());
        LocalDate after6Months = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + after6Months.getDayOfWeek());
        LocalDate after12Months = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + after12Months.getDayOfWeek());
    }
}

