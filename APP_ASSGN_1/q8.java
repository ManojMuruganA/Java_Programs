import java.util.Scanner;

class q8{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the year :");

        int num = scan.nextInt();   // Prompt the user to input a number

        if(num%4==0 && num%100!=0){
            // If the year is divisible by 4 and not divisible by 100, it's a leap year
            System.out.println("It's a leap year");
        }
        else if(num%100==0 && num%400==0){
            // If the year is divisible by 100 and also divisible by 400, it's a leap year
            System.out.println("It's a leap year");
        }
        else{
            // If neither condition is met, it's not a leap year
            System.out.println("It's not a leap year");
        }
    }
}