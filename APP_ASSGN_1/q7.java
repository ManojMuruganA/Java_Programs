import java.util.Scanner;

class q7{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction :");

        int num = scan.nextInt();    // Prompt the user to input a number
        
        // Check if the user chose addition
        if(num==1){
            System.out.println("Enter the two numbers :");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Sum = "+(num1+num2));   // Calculate and print the sum of the two numbers
        }
        // Check if the user chose subtraction
        else if(num==2){
            System.out.println("Enter the two numbers :");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Difference = "+(num1-num2));    // Calculate and print the difference of the two numbers
        }
        // Handle invalid choices
        else{
            System.out.println("Invalid choice.");
        }
    }
}