import java.util.Scanner;

class q5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount : ");
        double p = scan.nextDouble(); 
        
        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest : ");
        double r = scan.nextDouble(); 
        
        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years : ");
        int y = scan.nextInt(); 
        
        // Use a for loop to calculate and print the simple interest for each year
        for (int i = 1; i <= y; i++) {
            // Calculate the simple interest for the current year
            double simpleInterest = (p * r * i) / 100;
            // Print the year and the corresponding simple interest
            System.out.println("Year : " + i + " / Simple Interest : " + simpleInterest);
        }
    }
}

