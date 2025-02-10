class ReverseThread extends Thread {

    ReverseThread(String name) {
        super(name); // Set the initial name of the thread
    }

    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Thread " + getName() + " counting: " + i);
            try {
                Thread.sleep(6000); // Sleep for 6 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Change the thread name for each iteration
            setName("Thread-" + i);
        }
    }
}

public class ReverseThreadDemo {
    public static void main(String[] args) {
        ReverseThread reverseThread = new ReverseThread("Initial-Thread");
        reverseThread.start(); // Start the reverse countdown thread
    }
}
