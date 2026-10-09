public class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount(123456789L, "Siva Sekhar", 5000.0);

        account.displayDetails();

        System.out.println("\n--- Deposit ---");
        account.deposit(2000);

        System.out.println("\n--- Withdrawal ---");
        account.withdraw(1500);

        System.out.println("\n--- Final Account Details ---");
        account.displayDetails();
    }
}
