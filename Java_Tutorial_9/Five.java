public class Five {

    private double balance;

    public Five(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Mutable function: Updates the balance (modifies the state of the object)
    public void updateBalance(double amount) {
        balance += amount; // Increases or decreases the balance
        System.out.println("Updated balance: " + balance);
    }

    // Immutable function: Calculates interest without modifying the balance
    public double calculateInterest(double interestRate) {
        return balance * (interestRate / 100); // Returns the interest earned based on the balance
    }

    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000
        Five account = new Five(1000);

        // Mutable operation: Update the balance by depositing or withdrawing money
        System.out.println("Initial balance: " + account.getBalance());
        account.updateBalance(500); // Deposit $500
        account.updateBalance(-200); // Withdraw $200

        // Immutable operation: Calculate the interest earned (doesn't affect the
        // balance)
        double interestRate = 5.0; // 5% interest rate
        double interest = account.calculateInterest(interestRate);
        System.out.println("Interest earned at " + interestRate + "%: " + interest);
    }
}
