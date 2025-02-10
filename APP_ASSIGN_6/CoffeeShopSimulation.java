class CoffeeShop {
    private boolean coffeeReady = false; // Flag to track if coffee is ready

    // Method for barista to produce coffee
    public synchronized void makeCoffee() {
        while (coffeeReady) {
            try {
                wait(); // Wait until the customer consumes the coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Simulate making coffee
        System.out.println("Barista: Making a cup of coffee.");
        coffeeReady = true; // Coffee is ready
        notify(); // Notify the customer that coffee is ready
    }

    // Method for customer to consume coffee
    public synchronized void consumeCoffee() {
        while (!coffeeReady) {
            try {
                wait(); // Wait until the barista produces coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Simulate consuming coffee
        System.out.println("Customer: Drinking the coffee.");
        coffeeReady = false; // Coffee has been consumed
        notify(); // Notify the barista that coffee has been consumed
    }
}

class Barista extends Thread {
    private CoffeeShop shop;

    public Barista(CoffeeShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        // Barista keeps making coffee indefinitely
        while (true) {
            shop.makeCoffee();
            try {
                Thread.sleep(1000); // Simulate time taken to make coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Customer extends Thread {
    private CoffeeShop shop;

    public Customer(CoffeeShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        // Customer keeps consuming coffee indefinitely
        while (true) {
            shop.consumeCoffee();
            try {
                Thread.sleep(2000); // Simulate time taken to drink coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        // Create barista and customer threads
        Barista barista = new Barista(shop);
        Customer customer = new Customer(shop);

        // Start the threads
        barista.start();
        customer.start();
    }
}

