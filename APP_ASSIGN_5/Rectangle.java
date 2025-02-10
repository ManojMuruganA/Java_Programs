// Rectangle class with encapsulation
public class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle();

        // Set length and width using setter methods
        rect.setLength(5.0);
        rect.setWidth(3.0);

        // Display the rectangle's dimensions
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());

        // Calculate and display area and perimeter
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
