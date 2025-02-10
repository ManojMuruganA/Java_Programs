// BankAccount class with encapsulation
public class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 0.0; // Constant minimum balance

    // Constructor to initialize account number and initial balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= MINIMUM_BALANCE) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be less than the minimum balance.");
            this.balance = MINIMUM_BALANCE;
        }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance (no setter to protect balance modification)
    public double getBalance() {
        return balance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Withdrawal failed. Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 500.0);

        // Display account details
        account.displayAccountDetails();

        // Test deposit and withdraw methods
        account.deposit(200.0); // Should succeed
        account.withdraw(100.0); // Should succeed
        account.withdraw(700.0); // Should fail due to insufficient balance
        account.withdraw(-50.0); // Invalid withdrawal amount
    }
}