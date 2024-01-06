package com.softserve.edu14.hw.homeTask1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
       /* productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2000, Month.AUGUST,13),1000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2024, Month.JANUARY,1),5000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2022, Month.JANUARY,10),5000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2021, Month.JULY,8),15000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2020, Month.JUNE,7),5000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2015, Month.NOVEMBER,6),2000));
        productList.add(new Product(ManufactureCategory.PHONE, LocalDate.of(2010, Month.SEPTEMBER,15),5000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2023, Month.MARCH,20),1000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2022, Month.APRIL,23),2000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2021, Month.AUGUST,25),3000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2019, Month.JUNE,20),4000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2015, Month.JULY,19),5000));
        productList.add(new Product(ManufactureCategory.COMPUTER, LocalDate.of(2010, Month.SEPTEMBER,15),6000));
        productList.add(new Product(ManufactureCategory.LAPTOP, LocalDate.of(2020, Month.OCTOBER,16),1000));
        productList.add(new Product(ManufactureCategory.LAPTOP, LocalDate.of(2023, Month.FEBRUARY,10),2000));
        productList.add(new Product(ManufactureCategory.LAPTOP, LocalDate.of(2022, Month.JULY,7),3000));
        productList.add(new Product(ManufactureCategory.LAPTOP, LocalDate.of(2021, Month.JANUARY,5),4000));
        productList.add(new Product(ManufactureCategory.TABLET, LocalDate.of(2015, Month.NOVEMBER,4),5000));
        productList.add(new Product(ManufactureCategory.TABLET, LocalDate.of(2010, Month.JANUARY,2),6000));
        productList.add(new Product(ManufactureCategory.TABLET, LocalDate.of(2008, Month.AUGUST,1),7000));*/
        for (int i = 0; i < 20; i++) {
            productList.add(new Product().getRandomProduct());
        }

        var sortedProductWithSatisfactoryPriceAndYear = productList.stream()
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> LocalDate.now().minusYears(1).isAfter(product.getDateOfManufacture()))
                .filter(product -> product.getManufactureCategory().equals(ManufactureCategory.PHONE))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .toList();

        System.out.println("All list: ");
        print(productList);

        System.out.println("=========\nSorted phones by price (" + sortedProductWithSatisfactoryPriceAndYear.size() + "ps):");
        print(sortedProductWithSatisfactoryPriceAndYear);


    }

    private static void print(List<Product> productList){
        for (var product : productList){
            System.out.println(product);
        }
    }
}
