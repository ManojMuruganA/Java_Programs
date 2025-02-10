class Printer {
    private int currentJob = 1; // Keeps track of the current job to be printed

    // Method to print a specific job in order
    public synchronized void printJob(int jobId) {
        while (jobId != currentJob) { // Wait until it's this job's turn
            try {
                wait(); // Job waits if it's not its turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the job when it's the job's turn
        System.out.println("Job " + jobId + " is being printed");

        // Move to the next job
        currentJob++;

        // Notify all waiting threads to check if it's their turn
        notifyAll();
    }
}

// JobThread class to represent each print job as a separate thread
class JobThread extends Thread {
    private Printer printer;
    private int jobId;

    JobThread(Printer printer, int jobId) {
        this.printer = printer;
        this.jobId = jobId;
    }

    public void run() {
        printer.printJob(jobId); // Print job when thread runs
    }
}

public class PrinterSyncDemo {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Shared printer resource

        // Creating job threads for printing jobs 1 to 5 in order
        JobThread job1 = new JobThread(printer, 1);
        JobThread job2 = new JobThread(printer, 2);
        JobThread job3 = new JobThread(printer, 3);
        JobThread job4 = new JobThread(printer, 4);
        JobThread job5 = new JobThread(printer, 5);

        // Starting the threads in any order
        job5.start();
        job2.start();
        job1.start();
        job4.start();
        job3.start();
    }
}
