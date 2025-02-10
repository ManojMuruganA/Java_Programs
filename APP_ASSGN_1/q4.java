import java.util.Scanner;

class q4{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the current temperature :");  // Prompt the user to enter the temperature

        int num = scan.nextInt();
        
        // Check if the temperature is greater than 30
        if(num>30){
            System.out.println("It's hot!");
        }
        // Check if the temperature is greater than 20 but less than or equal to 30
        else if(num>20 && num<=30){
            System.out.println("It's warm");
        }
        // Check if the temperature is greater than 10 but less than or equal to 20
        else if(num>10 && num<=20){
            System.out.println("It's cool.");
        }
        // If the temperature is 10 or less
        else{
            System.out.println("It's cold.");
        }
    }
}
