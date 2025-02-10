import java.util.Scanner;

class q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        // Loop until a positive number is entered
        do {
            System.out.println("Please enter a positive number:");
            num = scan.nextInt(); 

            // Check if the entered number is not positive
            if (num <= 0) {
                // Inform the user that the input is invalid
                System.out.println("That's not a positive number. Try again.");
            }
        } while (num <= 0); // Continue looping until a positive number is entered

        // Print a thank you message with the valid positive number
        System.out.println("Thank you! You entered a positive number: " + num);
    }
}
