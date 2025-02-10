// ThreadA class to count digits in the string
class ThreadA extends Thread {
    private String str;
    private int dc = 0; // Variable to store digit count

    // Constructor to pass the string to the thread
    ThreadA(String str) {
        this.str = str;
    }

    public void run() {
        // Count the digits in the string
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                dc++;
            }
        }
        // Print the number of digits
        System.out.println("ThreadA:digitscount = " + dc);
    }
}

// ThreadB class to count alphabetic characters in the string
class ThreadB extends Thread {
    private String str;
    private int cc = 0; // Variable to store character count

    // Constructor to pass the string to the thread
    ThreadB(String str) {
        this.str = str;
    }

    public void run() {
        // Count the alphabetic characters in the string
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                cc++;
            }
        }
        // Print the number of alphabetic characters
        System.out.println("ThreadB:charcount = " + cc);
    }
}

public class MultiThreadCount {
    public static void main(String[] args) {
        String k = "abc123def456"; // The string to be processed

        // Create ThreadA and ThreadB instances
        ThreadA threadA = new ThreadA(k);
        ThreadB threadB = new ThreadB(k);

        // Start both threads
        threadA.start();
        threadB.start();

        // Join the threads to ensure both complete before the program ends
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}