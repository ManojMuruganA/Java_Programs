import java.util.Scanner;

public class BankAccount {
    // Attributes of the BankAccount class
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize BankAccount objects
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the final balance
    public void displayBalance() {
        System.out.println("Final balance: " + balance);
    }

    // Main method to create BankAccount object and interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get account details from the user
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a BankAccount object with the provided details
        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);

        // Perform deposit and withdrawal operations
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);

        // Display the final balance
        bankAccount.displayBalance();

        // Close the scanner
        scanner.close();
    }
}
