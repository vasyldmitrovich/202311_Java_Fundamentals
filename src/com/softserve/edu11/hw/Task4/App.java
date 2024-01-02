package com.softserve.edu11.hw.Task4;


import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);//You do not use this field
    public static void main(String[] args) {

        String firstName = checkInput("Enter your first name");
        String lastName  = checkInput("Enter your last name");
        generateGreetings(firstName,lastName);
    }

    public static String checkInput(String prompt){

        Pattern pattern = Pattern.compile("^[A-Za-z -]+$");
        Scanner scanner = new Scanner(System.in);
        String input ;

        do {
            System.out.println(prompt);
            input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                return input;
            } else {
                System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
            }
        } while (true);
    }

    public static void generateGreetings(String firstName,String lastName){

        Random random = new Random();
        int randomNumber = random.nextInt(6);

        switch (randomNumber){
            case 1 -> System.out.printf("Hello, %C%s %C%s !",firstName.charAt(0),firstName.substring(1)
                    ,lastName.charAt(0),lastName.substring(1));
            case 2 -> System.out.printf("Good job, %C%s %C%s !", firstName.charAt(0), firstName.substring(1)
                    , lastName.charAt(0), lastName.substring(1));
            case 3 -> System.out.printf("Congrats, %C%s %C%s !",firstName.charAt(0),firstName.substring(1)
                    ,lastName.charAt(0),lastName.substring(1));
            case 4 -> System.out.printf("What's up, %C%s %C%s ?",firstName.charAt(0),firstName.substring(1)
                    ,lastName.charAt(0),lastName.substring(1));
            case 5 -> System.out.printf("I'm so proud of you, %C%s %C%s !",firstName.charAt(0),firstName.substring(1)
            ,lastName.charAt(0),lastName.substring(1));
        }
    }

}

