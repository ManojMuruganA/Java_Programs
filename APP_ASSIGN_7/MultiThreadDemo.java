class UserThread extends Thread {
    
    UserThread(String name) {
        super(name); // Set the thread name
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo {
    
    public static void main(String[] args) {
        
        // Creating user-defined thread
        UserThread userThread = new UserThread("UserThread");
        
        // Start user thread
        userThread.start();
        
        // Main thread logic (invoked from main method)
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - iteration: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Ensure the userThread has completed before exiting the program
        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
