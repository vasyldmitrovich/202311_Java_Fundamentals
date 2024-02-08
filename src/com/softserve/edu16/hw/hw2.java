package com.softserve.edu16.hw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class hw2 {
    public static void main(String[] args) throws IOException {

        String fileName = "src/com/softserve/edu16/javaCode.txt";
        var file = Path.of(fileName);
        String[] lines;
        if (Files.exists(file)) {
            lines = Files.lines(file).toArray(String[]::new);

            String fileName2 = "src/com/softserve/edu16/javaCode2.txt";
            OutputStream file2 = Files.newOutputStream(Path.of(fileName2));

            for (int i = 0; i < lines.length - 1; i++) {
                String text = lines[i] + "\n";

                byte[] buffer = (text.replace("public", "Private")).getBytes();
                file2.write(buffer, 0, buffer.length);
            }
            file2.close();
        }
    }
}
