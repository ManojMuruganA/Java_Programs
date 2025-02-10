import java.util.Scanner;

// Class UserThreadPriority which extends the Thread class
class UserThreadPriority extends Thread {
    public static String k; // Shared variable for the String input
    public static char c;   // Shared variable for the Character input

    // Constructor to set the thread name
    UserThreadPriority(String name) {
        super(name); // Set the thread name
    }

    public void run() {
        // Display the thread name and values of k and c
        System.out.println(getName() + ": String k = " + k + ", Character c = " + c);
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get a String and Character from the user
        System.out.print("Enter a string (k): ");
        String userInputString = scanner.nextLine();
        
        System.out.print("Enter a character (c): ");
        char userInputChar = scanner.next().charAt(0);

        // Assign the input values to the UserThreadPriority class variables
        UserThreadPriority.k = userInputString;
        UserThreadPriority.c = userInputChar;

        // Create thread objects and set their names
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");

        // Start the threads
        threadobj1.start();
        threadobj2.start();

        // Close the scanner
        scanner.close();
    }
}
