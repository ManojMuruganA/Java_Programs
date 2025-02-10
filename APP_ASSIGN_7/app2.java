class SharedBuffer {
    private int data;
    private boolean isEmpty = true; // Buffer state

    // Synchronized method for the producer to produce a value
    public synchronized void produce(int value) {
        while (!isEmpty) { // Wait until the buffer is empty (the value is consumed)
            try {
                wait(); // Producer waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value; // Produce value
        System.out.println("Producer produced: " + value);
        isEmpty = false; // Mark buffer as full
        notify(); // Notify the consumer to consume
    }

    // Synchronized method for the consumer to consume the value
    public synchronized void consume() {
        while (isEmpty) { // Wait until there is a value to consume
            try {
                wait(); // Consumer waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed: " + data);
        isEmpty = true; // Mark buffer as empty
        notify(); // Notify the producer to produce again
    }
}

// Producer Thread
class Producer extends Thread {
    private SharedBuffer buffer;
    private int limit;

    Producer(SharedBuffer buffer, int limit) {
        this.buffer = buffer;
        this.limit = limit;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < limit; i++) {
            buffer.produce(value++); // Produce incremented values
            try {
                Thread.sleep(1000); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private SharedBuffer buffer;
    private int limit;

    Consumer(SharedBuffer buffer, int limit) {
        this.buffer = buffer;
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i < limit; i++) {
            buffer.consume(); // Consume value
            try {
                Thread.sleep(1500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class app2 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(); // Shared resource (buffer)

        int limit = 10; // Limit to 10 iterations

        Producer producer = new Producer(buffer, limit); // Create producer thread
        Consumer consumer = new Consumer(buffer, limit); // Create consumer thread

        producer.start(); // Start producer thread
        consumer.start(); // Start consumer thread
    }
}
