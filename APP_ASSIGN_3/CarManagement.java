import java.util.Scanner;

class Car {
    // Attributes
    String model;
    int year;
    String color;

    // Constructor to initialize attributes
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

public class CarManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input for the first Car object
        System.out.println("Enter details for Car 1:");
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Color: ");
        String color1 = scanner.nextLine();
        
        // Create the first Car object
        Car car1 = new Car(model1, year1, color1);
        
        // Get input for the second Car object
        System.out.println("Enter details for Car 2:");
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Year: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Color: ");
        String color2 = scanner.nextLine();
        
        // Create the second Car object
        Car car2 = new Car(model2, year2, color2);
        
        // Display information
        System.out.println("\nCar 1 Information:");
        car1.displayCarInfo();
        System.out.println("\nCar 2 Information:");
        car2.displayCarInfo();
        
        scanner.close();
    }
}
