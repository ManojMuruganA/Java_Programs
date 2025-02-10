// Base class Calculator
class Calculator {
    // Method to perform addition
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Subclass for subtraction
class SubtractionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Subclass for multiplication
class MultiplicationCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Subclass for division
class DivisionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        // Handle division by zero
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Main class to test the implementation
public class P3 {
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        Calculator subtraction = new SubtractionCalculator();
        Calculator multiplication = new MultiplicationCalculator();
        Calculator division = new DivisionCalculator();

        double a = 10.0, b = 5.0;

        System.out.println("Addition: " + addition.calculate(a, b)); // Output: 15.0
        System.out.println("Subtraction: " + subtraction.calculate(a, b)); // Output: 5.0
        System.out.println("Multiplication: " + multiplication.calculate(a, b)); // Output: 50.0
        System.out.println("Division: " + division.calculate(a, b)); // Output: 2.0
    }
}
