import java.util.Scanner;

class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not specified";
    }

    // Parameterized Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Person object using the default constructor
        Person person1 = new Person();

        // Get details for the second Person object using the parameterized constructor
        System.out.println("Enter details for the second person:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();
        
        // Create a Person object using the parameterized constructor
        Person person2 = new Person(name, age, address);

        // Display information for both Person objects
        System.out.println("\nPerson 1 Information (Default Constructor):");
        person1.displayPersonInfo();

        System.out.println("\nPerson 2 Information (Parameterized Constructor):");
        person2.displayPersonInfo();

        // Close the scanner
        scanner.close();
    }
}
