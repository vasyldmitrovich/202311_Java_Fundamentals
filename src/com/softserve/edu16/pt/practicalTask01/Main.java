package com.softserve.edu16.pt.practicalTask01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "src/com/softserve/edu16/pt/practicalTask01/mytext.txt";
        var file = Path.of(filename);
        if (Files.exists(file)) {
            System.out.println("It exists!");
        }
        String[] lines = Files.lines(file).toArray(String[]::new);
        System.out.println("There are " + lines.length + " lines in the file");
        for (int i = 0; i < 10; i++) {
            System.out.println(lines[i].length());
        }
        Arrays.stream(lines)
                .max(comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("=".repeat(70));
        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);

        //practicalTask02
        System.out.println("=".repeat(70));
        Function<String, Stream<String>> wordSplitter = Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
        String vowels = "aiouey";
        var res = Arrays.stream(lines)
                .limit(100)
                .flatMap(wordSplitter)
                .filter(word -> !word.isEmpty())
                .filter(word -> vowels.contains(word.substring(0, 1)))
                .limit(20)
                .collect(Collectors.joining(" "));
        System.out.println(res);

        System.out.println("=".repeat(70));
        var iter = Arrays.stream(lines)
                .limit(1000)
                .flatMap(wordSplitter)
                .filter(word -> !word.isEmpty())
                .iterator();
        String prev = iter.next();
        while (iter.hasNext()) {
            String word = iter.next();
            if (word.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + word);
            }
            prev = word;
        }
    }
}
