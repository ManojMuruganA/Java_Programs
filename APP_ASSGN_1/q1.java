import java.util.Scanner;

class q1{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number :"); // Prompt the user to input a number

        int num = scan.nextInt(); 
        
        if(num%2==0){
            System.out.println("The number is even.");  // If the number is even, print this message
        }
        else{
            System.out.println("The number is odd.");   // Otherwise, print this message
        }
    }
}