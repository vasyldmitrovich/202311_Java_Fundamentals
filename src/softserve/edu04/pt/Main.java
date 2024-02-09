package softserve.edu04.pt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1: Determine and output the number of odd numbers among three entered numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int oddCount = countOddNumbers(num1, num2, num3);
        System.out.println("Result of Task 1: Number of odd numbers: " + oddCount);

        // Task 2: Output the name of the day of the week in two languages.
        System.out.println("Task 2: Enter the number of the day of the week (1-7):");
        int dayNumber = scanner.nextInt();
        printDayName(dayNumber);

        // Task 3: Determine the continent based on the entered country.
        System.out.println("Task 3: Enter the name of the country:");
        String country = scanner.next();
        determineContinent(country);

        // Task 4: Create instances of the Product class and perform required operations.
        Product product1 = new Product("Laptop", 1200.0, 5);
        Product product2 = new Product("Smartphone", 800.0, 10);
        Product product3 = new Product("Headphones", 100.0, 15);
        Product product4 = new Product("Tablet", 600.0, 8);

        // Output the name and quantity of the most expensive item.
        Product mostExpensive = findMostExpensive(product1, product2, product3, product4);
        System.out.println("Most Expensive Item: " + mostExpensive.getName() + ", Quantity: " + mostExpensive.getQuantity());

        // Output the name of the item with the biggest quantity.
        Product maxQuantityItem = findMaxQuantityItem(product1, product2, product3, product4);
        System.out.println("Item with Biggest Quantity: " + maxQuantityItem.getName());
    }

    // Task 1 Helper Method
    private static int countOddNumbers(int num1, int num2, int num3) {
        int oddCount = 0;
        if (num1 % 2 != 0) oddCount++;
        if (num2 % 2 != 0) oddCount++;
        if (num3 % 2 != 0) oddCount++;
        return oddCount;
    }

    // Task 2 Helper Method
    private static void printDayName(int dayNumber) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Result of Task 2: Day of the week (English): " + days[dayNumber]);
        // You can provide translations for other languages as needed.
    }

    // Task 3 Helper Method
    private static void determineContinent(String country) {
        Continent continent;
        switch (country.toLowerCase()) {
            case "canada":
            case "usa":
            case "mexico":
                continent = Continent.NORTH_AMERICA;
                break;
            // Add more cases for other countries and continents as needed.
            default:
                continent = Continent.UNKNOWN;
        }
        System.out.println("Result of Task 3: The country " + country + " belongs to " + continent + ".");
    }

    private static Product findMostExpensive(Product... products) {
        Product mostExpensive = products[0];
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    private static Product findMaxQuantityItem(Product... products) {
        Product maxQuantityItem = products[0];
        for (Product product : products) {
            if (product.getQuantity() > maxQuantityItem.getQuantity()) {
                maxQuantityItem = product;
            }
        }
        return maxQuantityItem;
    }
}

// Task 3 Enum
enum Continent {
    NORTH_AMERICA,
    SOUTH_AMERICA,
    EUROPE,
    ASIA,
    AFRICA,
    AUSTRALIA,
    ANTARCTICA,
    UNKNOWN
}

// Task 4 Class
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
