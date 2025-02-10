import java.util.Random;

class NumberGenerator extends Thread {
    private int limit;

    NumberGenerator(int limit) {
        this.limit = limit;
    }

    public void run() {
        Random random = new Random();
        int count = 0;
        while (count < limit) {
            int num = random.nextInt(100); // Generates a random number between 0 and 99
            System.out.println("Generated Number: " + num);

            if (num % 2 == 0) {
                EvenNumberThread evenThread = new EvenNumberThread(num);
                evenThread.start();
            } else {
                OddNumberThread oddThread = new OddNumberThread(num);
                oddThread.start();
            }

            count++;

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number generation stopped after " + limit + " iterations.");
    }
}

class EvenNumberThread extends Thread {
    private int number;

    EvenNumberThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Even Number: " + number + ", Square: " + (number * number));
    }
}

class OddNumberThread extends Thread {
    private int number;

    OddNumberThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Odd Number: " + number + ", Cube: " + (number * number * number));
    }
}

public class app {
    public static void main(String[] args) {
        // Set the limit to stop after generating 10 random numbers
        NumberGenerator generator = new NumberGenerator(10);
        generator.start();
    }
}