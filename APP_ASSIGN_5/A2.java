abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Abstract method to calculate perimeter
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter method for Circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the calculateArea method for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implement the calculatePerimeter method for Rectangle
    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implement the calculateArea method for Triangle (using Heron's formula)
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implement the calculatePerimeter method for Triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class A2 {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);

        // Display the area and perimeter for each shape
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
