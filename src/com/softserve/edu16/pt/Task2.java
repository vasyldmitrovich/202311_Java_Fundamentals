package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        // part 1
        // find and output to the console all words starting with a vowel
        Pattern vowel = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        //       String filename = "D:\\Java SoftServe\\myText.txt";
        String filename = "./src/myText.txt";
        var file = Path.of(filename);

        if (Files.exists(file)) {
            System.out.println("It exists");
            var lines = Files.lines(file).toArray(String[]::new);
            Arrays.stream(lines)
                    .forEach((line) -> {
                        var arr = line.split(" ");
                        Arrays.stream(arr)
                                .filter(i -> !i.isEmpty())
                                .filter(i -> vowel.matcher(i.substring(0, 1)).matches())
                                .forEach(System.out::println);
                    });

            // part 2
            // find and output to the console all words for which the last letter of one word matches
            // the first letter of the next word
            System.out.println("===============================================================");
            var iterator = Arrays.stream(lines)
                    .filter(i -> !i.isEmpty())
                    .flatMap(Pattern.compile("[^a-zA-Z'-]+")::splitAsStream).iterator();

            String oneWord = iterator.next();
            while (iterator.hasNext()) {
                String anotherWord = iterator.next();
                try {
                    if (anotherWord.charAt(0) == oneWord.charAt(oneWord.length() - 1)) {
                        System.out.println(oneWord + " " + anotherWord);
                    }
                    oneWord = anotherWord;
                } catch (Exception e) {
                    System.out.println("There is a mistake: " + oneWord + " " + anotherWord);
                }
            }
        }
    }
}
