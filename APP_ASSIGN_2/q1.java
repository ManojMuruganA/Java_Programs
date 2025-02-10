import java.util.Scanner;

class q1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int n = scan.nextInt();
        
        // Initialize a variable to store the factorial result
        int fac = 1;
        
        // Check if the entered number is positive
        if (n > 0) {
            // Calculate the factorial using a for loop
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
            // Print the calculated factorial
            System.out.println("Factorial : " + fac);
        }
        // Check if the entered number is zero or negative
        else if (n <= 0) {
            System.out.println("Enter a positive integer.");
        }
        // Handling invalid choices
        else {
            System.out.println("Invalid choice.");
        }
    }
}
