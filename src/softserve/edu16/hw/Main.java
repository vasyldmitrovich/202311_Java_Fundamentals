package softserve.edu16.hw;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Task 1: Read from file1.txt and write to file2.txt
            readWriteFile();

            // Task 2: Replace "public" with "private" in Java code file
            replacePublicWithPrivate("input.java", "output.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Task 1 method
    public static void readWriteFile() throws IOException {
        // Read from file1.txt
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        // Write to file2.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"))) {
            // Write number of lines
            writer.write("Number of lines in file1.txt: " + lines.size());
            writer.newLine();

            String longestLine = "";
            for (String line : lines) {
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }
            writer.write("Longest line in file1.txt: " + longestLine);
            writer.newLine();

            writer.write("My name: John Doe");
            writer.newLine();
            writer.write("Birthday date: 2000-01-01");
        }
    }

    // Task 2 method
    public static void replacePublicWithPrivate(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

