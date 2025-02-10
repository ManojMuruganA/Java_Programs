import java.util.Scanner; 

class q11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the limit :"); 
        int n = scan.nextInt();
        
        int sum = 0; // Initializing the variable 'sum' to store the sum of even numbers
        int i = 1; // Initializing the counter variable 'i' to 1
        
        // Using a do-while loop to iterate through numbers from 1 to 'n'
        do {
            if (i % 2 == 0) { // Checking if the current number 'i' is even
                sum += i; // Adding the even number to 'sum'
            }
            i++; // Incrementing the counter 'i' by 1
        } while (i <= n); // Continuing the loop until 'i' is less than or equal to 'n'
        
        System.out.println("Sum : " + sum); // Printing the sum of even numbers
    }
}
