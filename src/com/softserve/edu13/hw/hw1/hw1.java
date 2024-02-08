package com.softserve.edu13.hw.hw1;

public class hw1 {

    public static void main(String[] args) {
        String text = "abc$";
        System.out.println("Was:" + text);

        String encrypted = Encrypt(text, 3);
        System.out.println("encrypted:" + encrypted);

        String decrypt = Decrypt(encrypted, 3);
        System.out.println("deciphered:" + decrypt);


    }

    static String Encrypt(String s, int n) {
        return Calculate(s, n);
    }

    static String Decrypt(String s, int n) {

        return Calculate(s, -n);
    }

    static String Calculate(String s, int n) {
        var arr = s.toCharArray();
        String res = "";
        for (char a : arr) {
            int b = (int) a + n;
            res += (char) b;

        }
        return res;

    }
}
