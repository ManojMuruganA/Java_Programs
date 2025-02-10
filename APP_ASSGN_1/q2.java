import java.util.Scanner;

class q2{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your age :"); // Prompt the user to input their age

        int num = scan.nextInt();   // Read the input as an integer
        
        //Condition to check whether the given age is eligible or not
        if(num>=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}
