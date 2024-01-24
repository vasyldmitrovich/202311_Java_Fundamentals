package com.softserve.edu16.pt.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws IOException {

        var fileName = "mytext.txt";
        var file = Path.of(fileName);
        var lines = Files.lines(file).toArray(String[]::new);

        Function<String,Stream<String>> splitter =
                Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
        var vowels = "aeouiyAEOUIY";

        Arrays.stream(lines)
                .flatMap(splitter)
                .filter(word -> vowels.contains(word.substring(0,1)))
                .forEach(System.out::println);

        var iter = Arrays.stream(lines)
                .flatMap(splitter)
                .filter(word -> !word.isEmpty())
                .iterator();

        var prev = iter.next();

        while(iter.hasNext()){
            var word = iter.next();
           if(word.charAt(0) == prev.charAt(prev.length()-1)){
               System.out.println(prev + " " + word);
           }
        }
    }

}

