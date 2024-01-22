package com.softserve.edu16.hw.Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {

        var file1Name = "file1.txt";
        var file2Name = "file2.txt";
        var myData = "Name: Maxim Cazanli\nDate of birth: 16.03.2001";

        var file1 = Path.of(file1Name);
        var info = Files.lines(file1).toArray(String[]::new);


        try(var writer = new BufferedWriter(new FileWriter(file2Name))){
            var linesCount = Arrays.stream(info).count();
            writer.write("text1.txt lines count = " + linesCount +"\n");
            var longestLine =
                    Arrays.stream(info)
                            .max(Comparator.comparingInt(String::length));
            writer.write("The longest line : \n" + longestLine.get() + "\n");
            writer.write(myData);
        }




    }
}
