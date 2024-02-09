package softserve.edu14.hw;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", "Phone", LocalDate.of(2020, 10, 15), 2000));
        productList.add(new Product("Samsung", "Phone", LocalDate.of(2021, 5, 20), 4000));

        List<Product> sortedProducts = getSortedProducts(productList);
        System.out.println("Sorted Products: " + sortedProducts);

        // Task 2
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sam"));

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        System.out.println("Most popular name: " + mostPopularName.orElse("None"));
    }

    // Task 1 method
    public static List<Product> getSortedProducts(List<Product> productList) {
        return productList.stream()
                .filter(p -> p.getCategory().equals("Phone") && p.getPrice() > 3000 &&
                        p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    // Task 2 method
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCount = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}

class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

