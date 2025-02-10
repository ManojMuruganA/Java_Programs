import java.util.Scanner;

class q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        
        // Prompt the user to enter the limit
        System.out.println("Enter the limit :");
        int l = scan.nextInt();
        
        // Print the multiplication table header
        System.out.println("The multiplication table of " + n + " :");
        
        // Use a for loop to generate and print the multiplication table
        for (int i = 1; i <= l; i++) {
            // Print the current multiplication step
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

