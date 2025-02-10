import java.util.Scanner;  // Import the Scanner class for taking input from the user

class q14 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the number : "); 
        int n = scan.nextInt();  
        int fac = 1, i = 1;  // Initialize variables: fac for factorial result, i for iteration

        // Check if the input number is greater than 0
        if (n > 0) {
            // Calculate the factorial using a do-while loop
            do {
                fac *= i;  // Multiply fac by i
                i++;  // Increment i
            } while (i <= n);  // Continue the loop until i is greater than n

            // Print the factorial result
            System.out.println("Factorial : " + fac);
        }
        // Check if the input number is less than or equal to 0
        else if (n <= 0) {
            System.out.println("Enter a positive integer.");  
        }
        //Handling invalid choices
        else {
            System.out.println("Invalid choice.");  
        }
    }
}
