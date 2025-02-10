// Class to represent a process, which is a thread with a specific priority
class ProcessThread extends Thread {
    
    ProcessThread(String name) {
        super(name); // Set the thread name (process name)
    }

    // The run method will display which process is running
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }
}

public class ThreadPriorityDemo1 {
    public static void main(String[] args) {
        // Create 5 thread objects representing different processes
        ProcessThread process1 = new ProcessThread("Process-1");
        ProcessThread process2 = new ProcessThread("Process-2");
        ProcessThread process3 = new ProcessThread("Process-3");
        ProcessThread process4 = new ProcessThread("Process-4");
        ProcessThread process5 = new ProcessThread("Process-5");

        // Set different priorities for the processes
        process1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        process2.setPriority(3);                    // Priority 3
        process3.setPriority(5);                    // Priority 5 (Normal priority)
        process4.setPriority(7);                    // Priority 7
        process5.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start all the processes
        process1.start();
        process2.start();
        process3.start();
        process4.start();
        process5.start();

        // Wait for all processes to complete
        try {
            process1.join();
            process2.join();
            process3.join();
            process4.join();
            process5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All processes have finished execution.");
    }
}
