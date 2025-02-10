import java.util.Arrays;
import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 30;
        int[] grades = new int[NUM_STUDENTS];
        Random random = new Random();

        // Step 2: Populate the array with random grades between 0 and 100
        for (int i = 0; i < NUM_STUDENTS; i++) {
            grades[i] = random.nextInt(101); // Generates a random integer between 0 and 100
        }

        // Step 3: Calculate and print the average grade of the class
        double average = calculateAverage(grades);
        System.out.printf("Average grade: %.2f%n", average);

        // Step 4: Find and print the highest and lowest grades
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // Step 5: Sort the grades in descending order and print the top 5 scores
        Arrays.sort(grades);
        System.out.println("Top 5 scores:");
        for (int i = NUM_STUDENTS - 1; i >= NUM_STUDENTS - 5; i--) {
            System.out.println(grades[i]);
        }
    }

    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    private static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}