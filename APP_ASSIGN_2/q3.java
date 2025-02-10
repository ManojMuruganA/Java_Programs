import java.util.Scanner;

class q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        
        int n = scan.nextInt();
        
        // Print the header for the list of even numbers
        System.out.println("Even numbers from 1 to " + n + " :");
        
        // Use a for loop to iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                // Print the even number
                System.out.println(i);
            }
        }
    }
}
