package com.softserve.edu11.hw.Task1;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {//Good

        //String string ="I am learning Java Fundamental"; // you can enable it while testing )
        System.out.println("Enter five words string");
        String string = SCANNER.nextLine();

        String longestWord = findLongestWord(string);
        String secondWord = findSecondWord(string);
        StringBuilder reversedString = new StringBuilder(secondWord);

        System.out.printf("Longest word : %s%n",longestWord);
        System.out.printf("Size of longest word = %d%n",longestWord.length());
        System.out.printf("Reversed second word %s%n",reversedString.reverse().toString());
    }

    public static String findSecondWord(String string){

        String[] words = string.split("\\s+");
        if(words.length >= 2) {
            return words[1];
        } else{
            return "Not enough words";
        }
    }

    public static String findLongestWord(String string){
        String[] words = string.split("\\s+");
        String longestWord = "";

        for (var word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }
}
