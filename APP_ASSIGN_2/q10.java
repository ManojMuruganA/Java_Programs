import java.util.Scanner; 

class q10 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the limit :"); // Prompting the user to enter a limit
        int n = scan.nextInt(); 
        int i = 1; // Initializing a counter variable to 1
        System.out.println("Numbers from 1 to " + n + " :"); 
        while(i <= n) { // Starting a while loop that runs until the counter variable exceeds the limit
            System.out.println(i); // Printing the current value of the counter variable
            i++; // Incrementing the counter variable by 1
        }
    }
}

