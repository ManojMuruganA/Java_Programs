import java.util.Scanner;

public class Student {
    // Attributes of the Student class
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize Student objects
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student's Details :");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to create Student objects and interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details from the user
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the student's roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter the student's marks: ");
        double marks = scanner.nextDouble();

        // Create a Student object with the provided details
        Student student = new Student(name, rollNumber, marks);

        // Display the student's information along with the grade
        student.displayStudentInfo();

        // Close the scanner
        scanner.close();
    }
}
