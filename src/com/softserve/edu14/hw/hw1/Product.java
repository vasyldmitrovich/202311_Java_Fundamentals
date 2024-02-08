package com.softserve.edu14.hw.hw1;

import java.time.LocalDate;

class Product implements Comparable {
    String manufactureCategory;
    LocalDate dateOfmanufacture;
    double price;

    public Product(String manufactureCategory, LocalDate dateOfmanufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfmanufacture = dateOfmanufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return '\n' +"Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfmanufacture=" + dateOfmanufacture +
                ", price=" + price +
                '}';
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateOfmanufacture() {
        return dateOfmanufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
