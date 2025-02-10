import java.util.Random;

// First thread: generates random integers every 1 second
class RandomNumberGenerator extends Thread {
    public static int number;

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            // Generate a random number between 1 and 100
            number = random.nextInt(100) + 1;
            System.out.println("Generated Number: " + number);

            // If number is even, invoke the second thread for square
            if (number % 2 == 0) {
                new SquareCalculator(number).start();
            } 
            // If number is odd, invoke the third thread for cube
            else {
                new CubeCalculator(number).start();
            }

            // Wait for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Second thread: computes the square of even numbers
class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Third thread: computes the cube of odd numbers
class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

// Main class to start the threads
public class MultiThreadApplication {
    public static void main(String[] args) {
        // Start the random number generator thread
        RandomNumberGenerator generator = new RandomNumberGenerator();
        generator.start();
    }
}
