public class CountdownThread {
    public static void main(String[] args) {
        // Create a new thread
        Thread countdownThread = new Thread(new CountdownRunnable());

        // Start the thread
        countdownThread.start();
    }

    static class CountdownRunnable implements Runnable {
        @Override
        public void run() {
            try {
                // Loop from 5 to 1
                for (int i = 5; i >= 1; i--) {
                    // Print the current count
                    System.out.println("Count: " + i);

                    // Sleep for 6 seconds
                    Thread.sleep(6000);

                    // Change the thread name
                    Thread.currentThread().setName("CountdownThread-" + i);
                    System.out.println("Thread name changed to: " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        }
    }
}