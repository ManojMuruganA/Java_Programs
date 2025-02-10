class Calculator {
    // Method to add two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    double calculate(double a, double b) {
        return a + b;
    }

    // Method to perform an arithmetic operation based on a char operator
    int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test integer addition
        System.out.println("5 + 3 = " + calculator.calculate(5, 3));

        // Test double addition
        System.out.println("5.5 + 3.3 = " + calculator.calculate(5.5, 3.3));

        // Test arithmetic operations with operator
        System.out.println("5 + 3 = " + calculator.calculate(5, 3, '+'));
        System.out.println("5 - 3 = " + calculator.calculate(5, 3, '-'));
        System.out.println("5 * 3 = " + calculator.calculate(5, 3, '*'));
        System.out.println("6 / 3 = " + calculator.calculate(6, 3, '/'));
    }
}
