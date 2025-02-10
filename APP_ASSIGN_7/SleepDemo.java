// Class to extend Thread and implement sleep method
class CustomThread extends Thread {
    private long sleepTime; // Time to sleep in nanoseconds

    // Constructor to set the sleep time for each thread
    CustomThread(String name, long sleepTime) {
        super(name); // Set thread name
        this.sleepTime = sleepTime; // Set the sleep time in nanoseconds
    }

    public void run() {
        try {
            // Sleep method in nanoseconds
            System.out.println(getName() + " is going to sleep for " + sleepTime + " ns");
            Thread.sleep(0, (int) sleepTime); // First argument is milliseconds (set to 0), second is nanoseconds
            System.out.println(getName() + " woke up after " + sleepTime + " ns");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        // Create threads with different sleep times in nanoseconds
        CustomThread thread1 = new CustomThread("Thread-1", 10);
        CustomThread thread2 = new CustomThread("Thread-2", 20);
        CustomThread thread3 = new CustomThread("Thread-3", 50);
        CustomThread thread4 = new CustomThread("Thread-4", 70);
        CustomThread thread5 = new CustomThread("Thread-5", 100);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
