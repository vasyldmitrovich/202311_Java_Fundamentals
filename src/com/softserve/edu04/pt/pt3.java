package com.softserve.edu04.pt;

import java.util.Scanner;
import com.softserve.pt.Continent;

public class pt3 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Country:");
        String contry = SCANNER.nextLine();
        Continent continent = Continent.getForCountry(contry);
        System.out.println(continent);
    }
}

