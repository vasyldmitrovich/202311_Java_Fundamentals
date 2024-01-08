package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("food", "2023.01.01", 120));
        products.add(new Product("food", "2022.02.01", 90));
        products.add(new Product("food", "2023.10.01", 80));
        products.add(new Product("plant", "2021.01.01", 130));
        products.add(new Product("plant", "2021.02.01", 150));
        products.add(new Product("plant", "2021.03.15", 160));
        products.add(new Product("phone", "2023.01.01", 3000));
        products.add(new Product("phone", "2021.06.25", 3600));
        products.add(new Product("phone", "2020.09.01", 4500));
        products.add(new Product("phone", "2022.08.01", 4000));

        for (var p:products) {
            System.out.println(p);
        }

        System.out.println("===========================================================");

        List<Product> sortedList = products.stream()
                                   .filter(t -> t.getCategory() == "phone")
                                   .filter(t -> t.getPrice() > 3000)
                                   .filter(t -> t.getDateOfProduct().isBefore(LocalDate.now().minusYears(1)))
                                   .sorted(Product::compareToWithPrise).toList();
        for (var s:sortedList) {
            System.out.println(s);
        }
    }
}
