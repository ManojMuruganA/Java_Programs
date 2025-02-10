import java.util.Scanner;

class q3{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Press 1 for juice or 2 for soda."); // Prompt the user to make a choice

        int num = scan.nextInt();   // Read the input as an integer
        
        // Check the user's input and respond accordingly
        if(num==1){
            System.out.println("Dispensing juice.");
        }
        else if(num==2){
            System.out.println("Dispensing soda.");
        }
        else{
            System.out.println("Invalid choice.");
        }
    }
}
