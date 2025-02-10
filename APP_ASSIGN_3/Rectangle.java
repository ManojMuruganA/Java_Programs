import java.util.Scanner;

public class Rectangle {
    // Attributes of the Rectangle class
    private double width;
    private double height;

    // Constructor to initialize Rectangle objects
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to set the dimensions of the rectangle
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Main method to create Rectangle objects and interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions from the user
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Create a Rectangle object with the provided dimensions
        Rectangle rectangle = new Rectangle(width, height);

        // Calculate area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
