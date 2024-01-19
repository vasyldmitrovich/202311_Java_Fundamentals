package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
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
        }
    }
}
