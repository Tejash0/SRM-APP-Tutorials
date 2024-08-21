
//Kumar Tejash
//RA2311003011446
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    public double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder's name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Do you want to create a savings account? (yes/no): ");
        String response = scanner.nextLine();

        BankAccount account;
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter interest rate (e.g. 0.05 for 5%): ");
            double interestRate = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            account = new SavingsAccount(accountNumber, accountHolder, interestRate);
        } else {
            account = new BankAccount(accountNumber, accountHolder);
        }

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            if (account instanceof SavingsAccount) {
                System.out.println("4. Apply interest");
            }
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                    } else {
                        System.out.println("This account does not support interest.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close(); // Close the scanner
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}