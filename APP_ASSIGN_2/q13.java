import java.util.Scanner;  

class q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter the number :");  
        int n = scan.nextInt();  
        System.out.println("Enter the limit :");  // Prompting the user to enter the limit
        int l = scan.nextInt();  
        System.out.println("The multiplication table of " + n + " :");  // Displaying the multiplication table header
        int i = 1;  // Initializing the counter variable
        do {
            // Printing the multiplication of the number with the counter
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;  // Incrementing the counter
        } while (i <= l);  // Loop continues until the counter exceeds the limit
    }
}
