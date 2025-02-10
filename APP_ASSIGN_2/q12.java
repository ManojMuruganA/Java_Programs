import java.util.Scanner; 

class q12 { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the maximum exponent:"); // Prompt the user to enter the maximum exponent
        int max = scan.nextInt(); 
        
        int exp = 0; // Initialize the exponent variable 'exp' to 0
        do { // Start of the do-while loop
            System.out.println("2^" + exp + " = " + (int) Math.pow(2, exp)); // Print the value of 2 raised to the power of 'exp'
            exp++; // Increment the exponent variable by 1
        } while (exp <= max); // Continue the loop as long as 'exp' is less than or equal to 'max'
    }
}


