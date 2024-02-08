package com.softserve.edu6.hw.hw1;

public class hw1 {
    public static void main(String[] args) {
        Bird[] arrBird = {
                new Eagle(true, true),
                new Kiwi(false, true),
                new Penguin(true, true),
                new Swallow(true, true),

        };
        for (Bird curentBird : arrBird) {
            curentBird.Fly();
            System.out.println(curentBird.toString());
        }
    }

}
