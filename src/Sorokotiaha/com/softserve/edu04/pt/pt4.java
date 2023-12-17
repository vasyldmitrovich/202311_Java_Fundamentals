package Sorokotiaha.com.softserve.edu04.pt;

public class pt4 {
    public static void main(String[] args) {
        Product product1 = new Product("Cat food 1", 15, 10);
        Product product2 = new Product("Cat food 2", 24, 44);
        Product product3 = new Product("Cat food 3", 24, 44);
        Product product4 = new Product("Cat food 4", 22.5, 22);

        Product mostEspinsive = product1;

        if (mostEspinsive.getPrice() < product2.getPrice()) {
            mostEspinsive = product2;
        }

        if (mostEspinsive.getPrice() < product3.getPrice()) {
            mostEspinsive = product3;
        }
        if (mostEspinsive.getPrice() < product4.getPrice()) {
            mostEspinsive = product4;
        }
        System.out.println("The most expensive product is:\n  name: " + mostEspinsive.getName() + "; q:" + mostEspinsive.getQuantity());

        int maxQuantity = product1.getQuantity();
        if (maxQuantity < product2.getQuantity()) {
            maxQuantity = product2.getQuantity();
        }
        if (maxQuantity < product3.getQuantity()) {
            maxQuantity = product3.getQuantity();
        }
        if (maxQuantity < product4.getQuantity()) {
            maxQuantity = product4.getQuantity();
        }

        if (maxQuantity == product1.getQuantity()) {
            System.out.println("max quantity Name:" + product1.getName());
        }

        if (maxQuantity == product2.getQuantity()) {
            System.out.println("max quantity Name:" + product2.getName());
        }
        if (maxQuantity == product3.getQuantity()) {
            System.out.println("max quantity Name:" + product3.getName());
        }
        if (maxQuantity == product4.getQuantity()) {
            System.out.println("max quantity Name:" + product4.getName());
        }

    }


}

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}