package com.softserve.edu16.pt.pt2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pt2 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/softserve/edu16/mytext.txt";
        var file = Path.of(fileName);
        if (Files.exists(file)) {
            String[] lines = Files.lines(file).toArray(String[]::new);
            Function<String, Stream<String>> wordSplitter = Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
            String vowels = "eyuioa";
            var res = Arrays.stream(lines)
                    .flatMap(wordSplitter)
                    .filter(word -> !word.isEmpty())
                    .filter(word -> vowels.contains(word.substring(0, 1)))
                    .collect(Collectors.joining(" "));
            System.out.println("______");
            System.out.println(res);
            System.out.println("______");

            var iter = Arrays.stream(lines)
                    .flatMap(wordSplitter)
                    .filter(word -> !word.isEmpty())
                    .iterator();

            String prev = iter.next();
            while (iter.hasNext()){
                String word = iter.next();
                if(word.charAt(0)==prev.charAt(prev.length()-1)){
                    System.out.println(prev + " " + word);
                }
                prev = word;
            }


        }
    }

}
