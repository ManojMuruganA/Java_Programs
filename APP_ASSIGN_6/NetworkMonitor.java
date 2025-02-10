public class NetworkMonitor extends Thread {
    private String serviceName;
    private int sleepDuration; // in milliseconds

    // Constructor to initialize the network monitoring task
    public NetworkMonitor(String serviceName, int sleepDuration) {
        this.serviceName = serviceName;
        this.sleepDuration = sleepDuration;
        this.setName("Checking " + serviceName); // Initial thread name
    }

    // Simulate the network check task
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Network check started.");
            // Simulate network check by putting the thread to sleep
            Thread.sleep(sleepDuration);
            System.out.println(Thread.currentThread().getName() + ": Network check completed.");

            // Change the thread name to reflect its new status
            this.setName("Service " + serviceName + " - Status: OK");
            System.out.println("Thread name updated to: " + this.getName());

        } catch (InterruptedException e) {
            System.out.println("Network check interrupted.");
        }
    }

    // Main method to test the network monitoring system
    public static void main(String[] args) {
        // Create and start threads simulating network checks for different services
        NetworkMonitor service1 = new NetworkMonitor("Service1", 3000); // 3 seconds sleep
        NetworkMonitor service2 = new NetworkMonitor("Service2", 5000); // 5 seconds sleep

        service1.start();
        service2.start();
    }
}

