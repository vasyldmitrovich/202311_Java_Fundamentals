package com.softserve.edu14.hw.hw1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Phone", LocalDate.of(2023, Month.SEPTEMBER, 30), 500.14));
        productList.add(new Product("NotePad", LocalDate.of(2022, Month.AUGUST, 23), 1500.14));
        productList.add(new Product("watch", LocalDate.of(2023, Month.SEPTEMBER, 2), 2500.14));
        productList.add(new Product("Phone", LocalDate.of(2019, Month.SEPTEMBER, 30), 3500.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.SEPTEMBER, 30), 4500.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.JANUARY, 30), 5500.14));
        productList.add(new Product("watch", LocalDate.of(2022, Month.SEPTEMBER, 30), 500.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.SEPTEMBER, 30), 6500.14));
        productList.add(new Product("NotePad", LocalDate.of(2022, Month.SEPTEMBER, 30), 8500.14));
        productList.add(new Product("Phone", LocalDate.of(2023, Month.SEPTEMBER, 30), 5800.14));
        productList.add(new Product("iPhone", LocalDate.of(2022, Month.AUGUST, 30), 5900.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.JANUARY, 30), 600.14));
        productList.add(new Product("watch", LocalDate.of(2022, Month.SEPTEMBER, 30), 50.14));
        productList.add(new Product("NotePad", LocalDate.of(2022, Month.JANUARY, 30), 51.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.SEPTEMBER, 30), 52.14));
        productList.add(new Product("NotePad", LocalDate.of(2022, Month.AUGUST, 30), 53.14));
        productList.add(new Product("Phone", LocalDate.of(2022, Month.SEPTEMBER, 30), 96.14));
        productList.add(new Product("NotePad", LocalDate.of(2022, Month.AUGUST, 30), 150.14));
        productList.add(new Product("watch", LocalDate.of(2022, Month.SEPTEMBER, 30), 999.14));
        productList.add(new Product("iPhone", LocalDate.of(2022, Month.SEPTEMBER, 30), 1999.99));
        System.out.println(productList);

        LocalDate filterDay = LocalDate.now().minusYears(1);
        System.out.println("With filters(Category:Phones, price more than 3000, production date more than +" + filterDay + "):");
        var phone = productList.stream()
                .filter(s -> s.getManufactureCategory().equals("Phone") &&
                        s.getPrice() > 3000 &&
                        s.getDateOfmanufacture().isBefore(filterDay))
                .toList();
        System.out.println(phone);

    }
}
