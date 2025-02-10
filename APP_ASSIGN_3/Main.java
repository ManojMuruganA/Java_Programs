import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to get total price of this product
    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price + ", Quantity: " + quantity;
    }
}

class ShoppingCart {
    private List<Product> items;

    // Constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Added: " + product);
    }

    // Method to remove a product from the cart
    public void removeProduct(String productName) {
        Product toRemove = null;
        for (Product product : items) {
            if (product.getName().equalsIgnoreCase(productName)) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            items.remove(toRemove);
            System.out.println("Removed: " + toRemove);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to calculate the total price of all items in the cart
    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getTotalPrice();
        }
        return total;
    }

    // Method to display all products in the cart
    public void displayProducts() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Products in the cart:");
            for (Product product : items) {
                System.out.println(product);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Calculate Total");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1: // Add Product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Product product = new Product(name, price, quantity);
                    cart.addProduct(product);
                    break;

                case 2: // Remove Product
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    break;

                case 3: // Calculate Total
                    double total = cart.calculateTotal();
                    System.out.println("Total Price: $" + total);
                    break;

                case 4: // Display Products
                    cart.displayProducts();
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
