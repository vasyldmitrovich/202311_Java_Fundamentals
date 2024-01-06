package com.softserve.edu14.hw.homeTask1;

import java.time.LocalDate;

public class Product {
    private ManufactureCategory manufactureCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public Product() {
    }

    public Product(ManufactureCategory manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public ManufactureCategory getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(ManufactureCategory manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product getRandomProduct() {
        return new Product(getRandomManufactureCategory(), getRandomDateOfManufacture(), createRandomIntBetween(2000, 10000));
    }

    private ManufactureCategory getRandomManufactureCategory() {
        switch (createRandomIntBetween(1, 4)) {
            case 1 -> {
                return ManufactureCategory.PHONE;
            }
            case 2 -> {
                return ManufactureCategory.TABLET;
            }
            case 3 -> {
                return ManufactureCategory.LAPTOP;
            }
            case 4 -> {
                return ManufactureCategory.COMP;
            }
            default -> {
                return null;
            }
        }
    }

    private LocalDate getRandomDateOfManufacture() {
        int randomMonth = createRandomIntBetween(1, 12);
        int randomDay = switch (randomMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> createRandomIntBetween(1, 31);
            case 2 -> createRandomIntBetween(1, 28);
            case 4, 6, 9, 11 -> createRandomIntBetween(1, 30);
            default -> 1;
        };
        return LocalDate.of(createRandomIntBetween(2020, 2023), randomMonth, randomDay);
    }


    private static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    @Override
    public String toString() {
        return manufactureCategory + "\t "
                + dateOfManufacture +
                " " + price +
                '$';
    }
}
