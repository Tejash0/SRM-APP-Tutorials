class BankAccount {
    private static final double MINIMUM_BALANCE = 0.0;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance > MINIMUM_BALANCE ? initialBalance : MINIMUM_BALANCE;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Main class to test the code
public class Nine {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(2000.0); // This should print "Insufficient balance"
    }
}