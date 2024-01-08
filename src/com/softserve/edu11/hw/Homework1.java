package com.softserve.edu11.hw;

import java.util.Scanner;

public class Homework1 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.print("Please enter a sentence containing at least five words: ");
        String input = SCANNER.nextLine();

        // Identify the longest word in the sentence and display it on the console.
        String longestWord = findLongestWordInSentence(input);
        System.out.println("The longest word in the sentence is '" + longestWord + "'.");

        //Determine the number of letters in the longest word
        System.out.println("The number of letters in this word is " + findNumberOfLetters(longestWord));

        // Display the second word of the sentence in reverse order on the console
        String secondWord = find2ndWord(input);
        System.out.println("The second word with letters in reverse order is " +
                reverseLetters(secondWord));
    }

    static String findLongestWordInSentence(String input ) {
        // count the number of spaces in the sentence
        int counter = 0;
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                counter++;
            }
        }

        // record the positions of each space.  Store the indices of the positions in array 'spaces'
        int[] spaces = new int[counter];
        counter = 0;
        for (int i = 1; i <input.length(); i++) {
            if( input.charAt(i) == ' ' ) {
                spaces[counter] = i;
                counter++;
            }
        }

        /* split the sentence into individual words using space as delimiter.
         * Store individual words in array 'words'*/

        String[] words = new String[counter+1];
        words[0] = input.substring(0, spaces[0]);                           //first word
        words[counter] = input.substring(spaces[counter-1]+1);    //last word

        int zahler = 1; // iterator in the spaces array
        for (int i = 1; i < words.length-1; i++) {
            words[i] = input.substring(spaces[i-1]+1, spaces[zahler]);
            zahler++;
        }

        int maxLength = 0;
        counter = 0;
        for (int i = 0; i < words.length; i++) {
            if( words[i].length() > maxLength ) {
                maxLength = words[i].length();
                counter = i;
            }
        }
        return words[counter];
    }

    static int findNumberOfLetters(String input) {
        return input.length();
    }

    static String find2ndWord(String input) {
        String[] words = input.split(" ");
        return words[1];
    }

    static String reverseLetters( String input ) {
        char[] word = new char[input.length()];
        int counter = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            word[i] = input.charAt(counter);
            counter--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : word ) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
