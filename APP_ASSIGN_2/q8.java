import java.util.Scanner; 

class q8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the limit
        System.out.println("Enter the limit :");
        
        int n = scan.nextInt();
        
        // Initialize variables for iteration and sum calculation
        int i = 0;
        int sum = 0;
        
        // Loop from 0 to n, inclusive
        while(i <= n){
            sum += i; // Add the current value of i to the sum
            i++; // Increment i by 1
        }
        
        // Print the final sum
        System.out.println("Sum : " + sum);
    }
}
