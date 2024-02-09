package softserve.edu10.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());
        if (words.length >= 2) {
            System.out.println("Second word in reverse order: " + reverseWord(words[1]));
        }

        // Task 2
        System.out.println("Enter a sentence with multiple spaces between words:");
        String inputSentence = scanner.nextLine();
        String correctedSentence = inputSentence.replaceAll("\\s+", " ");
        System.out.println("Corrected sentence: " + correctedSentence);

        // Task 3
        System.out.println("Enter a text containing US currency format:");
        String text = scanner.nextLine();
        displayCurrencyOccurrences(text);
    }

    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void displayCurrencyOccurrences(String text) {
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

