import java.util.Scanner;

class q5{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number :");

        int num = scan.nextInt();   // Read the input as an integer
        
        // Check if the number is greater than 0
        if(num>0){
            System.out.println("The number is positive.");
        }
        // Check if the number is less than 0
        else if(num<0){
            System.out.println("The number is negative.");
        }
        // If the number is neither greater than 0 nor less than 0, it must be 0
        else{
            System.out.println("The number is zero.");
        }
    }
}
