import java.util.Scanner;

class q4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        
        int n = scan.nextInt();
        
        // Print the header for the list of odd numbers
        System.out.println("Odd numbers from 1 to " + n + " :");
        
        // Use a for loop to iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is odd
            if (i % 2 != 0) {
                // Print the odd number
                System.out.println(i);
            }
        }
    }
}

