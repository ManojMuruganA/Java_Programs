import java.util.Scanner; 

class q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n = scan.nextInt(); // Read the input number from the user
        
        System.out.println("Enter the limit :");
        int l = scan.nextInt(); // Read the limit from the user
        
        System.out.println("The multiplication table of " + n + " :");
        
        int i = 1; // Initialize the counter variable i
        // Use a while loop to print the multiplication table up to the specified limit
        while (i <= l) {
            // Print the current multiplication result
            System.out.println(n + " * " + i + " = " + (n * i));
            i++; // Increment the counter variable
        }
    }
}
