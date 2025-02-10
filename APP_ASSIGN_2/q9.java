import java.util.Scanner; 

class q9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); 

        // Asking the user how many numbers they want to enter
        System.out.println("How many numbers want to enter?");
        int n = scan.nextInt(); 
        int arr[] = new int[n]; // Declaring an array of integers with size 'n'
        int i = 0; // Initializing the index variable

        // Prompting the user to enter the numbers
        System.out.println("Enter the numbers:");
        while(i < n){
            arr[i] = scan.nextInt(); // Reading each number and storing it in the array
            i++; // Incrementing the index variable
        }

        // Resetting the index variable for the next loop
        i = 0;
        int sum = 0; // Initializing the sum variable

        // Calculating the sum of the array elements
        while(i < n){
            sum += arr[i]; // Adding each element to the sum
            i++; // Incrementing the index variable
        }

        // Calculating the average by dividing the sum by the number of elements
        double average = (double) sum / n; 
        // Printing the calculated average
        System.out.println("Average: " + average);
    }
}
