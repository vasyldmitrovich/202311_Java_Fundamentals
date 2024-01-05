package edu11.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        //task1
        System.out.println(checkSubString());

        //task2
        workWithFistMiddleLastName();

        //task3
        checkUserName();

    }

    static boolean checkSubString() {
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        return str2.contains(str1);
    }

    static void workWithFistMiddleLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the middle name: ");
        String middleName = scanner.nextLine();

        System.out.println(lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);

    }

    static void checkUserName() {
        Pattern p = Pattern.compile("[a-zA-Z_0-9]{3,15}");
        List<String> names = new ArrayList<>();
        names.add("Olena");
        names.add("Petro");
        names.add("Андрій");
        names.add("Petro1-");
        names.add("Olena_Seretin19");
        names.add("FoarteLungNumeleSiPrenumele");

        for (var n : names) {
            Matcher m = p.matcher(n);
            System.out.println(n + " " + m.matches());
        }


    }


}
