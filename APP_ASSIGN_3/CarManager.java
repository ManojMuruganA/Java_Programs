import java.util.Scanner;

class Car {
    // Attributes
    String model;
    int year;
    String color;

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

public class CarManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create first Car object
        Car car1 = new Car();
        System.out.println("Enter details for Car 1:");
        System.out.print("Model: ");
        car1.model = scanner.nextLine();
        System.out.print("Year: ");
        car1.year = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Color: ");
        car1.color = scanner.nextLine();
        
        // Create second Car object
        Car car2 = new Car();
        System.out.println("Enter details for Car 2:");
        System.out.print("Model: ");
        car2.model = scanner.nextLine();
        System.out.print("Year: ");
        car2.year = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Color: ");
        car2.color = scanner.nextLine();
        
        // Display information
        System.out.println("\nCar 1 Information:");
        car1.displayCarInfo();
        System.out.println("\nCar 2 Information:");
        car2.displayCarInfo();
        
        scanner.close();
    }
}

