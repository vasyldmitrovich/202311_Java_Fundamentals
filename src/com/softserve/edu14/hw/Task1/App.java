package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone","Nokia", LocalDate.of(2020,11,4),3200));
        products.add(new Product("Laptop","MacBook", LocalDate.of(2019,8,6),4200));
        products.add(new Product("Car","Peugeot", LocalDate.of(2024,1,3),30000));
        products.add(new Product("Laptop","MacBook", LocalDate.of(2023,5,4),5000));
        products.add(new Product("Phone","Nokia", LocalDate.of(2021,8,9),4500));
        products.add(new Product("Phone","Nokia", LocalDate.of(2022,5,23),4000));
        products.add(new Product("Laptop","Huawei", LocalDate.of(2010,12,1),8000));
        products.add(new Product("Car","Pontiac", LocalDate.of(2001,4,28),90000));
        products.add(new Product("Car","Mercedes", LocalDate.of(2023,12,28),110000));
        products.add(new Product("Laptop","Asus", LocalDate.of(2023,4,5),5800));
        products.add(new Product("Phone","iPhone", LocalDate.of(2023,11,4),3000));
        products.add(new Product("Laptop","Huawei", LocalDate.of(2019,8,6),4200));
        products.add(new Product("Car","Xiaomi",LocalDate.of(2024,1,3),30000));
        products.add(new Product("Laptop","Xiaomi", LocalDate.of(2023,5,4),5000));
        products.add(new Product("Phone", "Nokia",LocalDate.of(2023,8,9),4500));
        products.add(new Product("Phone", "Nokia",LocalDate.of(2022,5,23),2000));
        products.add(new Product("Laptop","MacBook", LocalDate.of(2010,12,1),8000));
        products.add(new Product("Car","Cadillac", LocalDate.of(2001,4,28),90000));
        products.add(new Product("Car", "Peugeot",LocalDate.of(2023,12,28),110000));
        products.add(new Product("Laptop", "Huawei",LocalDate.of(2023,4,5),5800));

        sortProducts(products);
    }

    private static void sortProducts(List<Product> products){

         products.stream().
                filter(item -> item.getManufactureCategory().equals("Phone")).
                filter(item -> item.getPrice() > 3000).
                filter(item -> item.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1))).
                sorted(Comparator.comparingDouble(Product::getPrice)).
                forEach(System.out::println);
    }

}
