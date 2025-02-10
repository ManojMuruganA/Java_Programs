import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Task class that performs a calculation and generates a report
class Task {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    // Method to perform the task (e.g., squaring the number)
    public int performCalculation() {
        return number * number;
    }

    // Method to generate a report for the task
    public void generateReport(int result) {
        System.out.println("Task Report: The square of " + number + " is " + result);
    }
}

// TaskProcessor class that processes a list of tasks sequentially
class TaskProcessor {
    // Method to process all tasks
    public void processTasks(List<Task> tasks) {
        for (Task task : tasks) {
            // Perform the task (e.g., square the number)
            int result = task.performCalculation();
            // Generate a report based on the result
            task.generateReport(result);
        }
    }
}

// Main class to test the task processing system
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        System.out.println("Enter the number of tasks to process:");
        int taskCount = scanner.nextInt();

        // Input tasks from the user
        for (int i = 0; i < taskCount; i++) {
            System.out.println("Enter a number for task " + (i + 1) + ":");
            int number = scanner.nextInt();
            tasks.add(new Task(number));
        }

        // Process all tasks sequentially
        TaskProcessor taskProcessor = new TaskProcessor();
        taskProcessor.processTasks(tasks);

        scanner.close();
    }
}
