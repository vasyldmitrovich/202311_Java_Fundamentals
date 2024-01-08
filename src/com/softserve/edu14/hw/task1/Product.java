package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private String category;
    private LocalDate dateOfProduct;
    private double price;

    public Product(String category, String dateOfProduct, double price) {
        this.category = category;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        this.dateOfProduct = LocalDate.parse(dateOfProduct, formatter);
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfProduct() {
        return dateOfProduct;
    }

    public void setDateOfProduct(LocalDate dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareToWithPrise(Product other){
        return (int) (this.getPrice() - other.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", dateOfProduct=" + dateOfProduct +
                ", price=" + price +
                '}';
    }
}
