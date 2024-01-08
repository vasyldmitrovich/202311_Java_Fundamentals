package com.softserve.edu13.hw.Task1;

import java.util.Scanner;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {//Ok

        Scanner scanner = new Scanner(System.in);
        int defaultShift = 3;

        System.out.println("Enter string for encryption");
        String str = scanner.nextLine();
        System.out.println("Enter shifting position or press \"Enter\" for default value (3)");
        String input = scanner.nextLine();
        int shift = (input.trim().isEmpty() ) ? defaultShift : Integer.parseInt(input);

        String encrypted = encrypt(str,shift);
        String decrypted = decrypt(encrypted,shift);

        System.out.println("Encrypted string : " + encrypted);
        System.out.println("Decrypted string : " + decrypted );

    }

    private static String stringProcessor(String str, Function<Character, Character> transform){

        StringBuilder result = new StringBuilder();

        for (var element : str.toCharArray()){

            if(Character.isLetter(element)){//Only letters in upper or lower case
                char character = transform.apply(element);
                result.append(character);
            } else {
                result.append(element);
            }
        }
        return result.toString();
    }

    private static String encrypt(String str, int shift){
        return stringProcessor(str, c -> Character.isUpperCase(c) ?
                (char) ((c - 'A' + shift) % 26 +'A'):
                (char) ((c - 'a' + shift) % 26 +'a'));
    }

    private static String decrypt(String str, int shift){
        return stringProcessor(str, c ->Character.isUpperCase(c) ?
                (char) ((c - 'A' - shift + 26) % 26 + 'A'):
                (char) ((c - 'a' - shift + 26) % 26 + 'a'));
    }



}
