import addition.Addition;
import subtraction.Subtraction;
import multiplication.Multiplication;
import division.Division;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects for each operation
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        // Input two numbers from the user
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Perform and display results of arithmetic operations
        System.out.println("Addition of " + num1 + " and " + num2 + ": " + addition.add(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + ": " + subtraction.subtract(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + multiplication.multiply(num1, num2));
        System.out.println("Division of " + num1 + " by " + num2 + ": " + division.divide(num1, num2));

        scanner.close();
    }
}

