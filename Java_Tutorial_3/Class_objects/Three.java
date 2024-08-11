import java.util.*;

class Bank_Account {
    long Account_Number;
    String Holder_Name;
    double Balance;

    public void set(long a, String b) {
        Account_Number = a;
        Holder_Name = b;
        Balance = 0;
    }

    public void deposit(Scanner sn) {
        System.out.println("Enter the amount to deposit: ");
        float dep = sn.nextFloat();
        Balance += dep;
        System.out.println("The Final Balance is: " + Balance);
    }

    public void withdraw(Scanner sn) {
        System.out.println("Enter The Amount to Withdraw: ");
        float wit = sn.nextFloat();

        if (wit <= Balance) {
            Balance -= wit;
            System.out.println("Withdrawing...");
            System.out.println("Money Dispensed");
            System.out.println("The Final Balance is: " + Balance);
        } else {
            System.out.println("Insufficient balnce: ");
            System.out.println("Current Balance: " + Balance);
        }
    }
}

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Account_Number: ");
        long n = scn.nextLong();
        String na = scn.nextLine();
        System.out.println("Enter Holder_Name: ");
        na = scn.nextLine();

        Bank_Account b1 = new Bank_Account();
        b1.set(n, na);
        int a;

        while (true) {
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice");

            a = scn.nextInt();

            if (a == 1) {
                b1.deposit(scn);
            } else if (a == 2) {
                b1.withdraw(scn);
            } else if (a == 3) {
                System.out.println(" Thank you ");
                break;
            } else {
                System.out.println("Enter a Valid Choice");
            }
        }

        scn.close();
    }
}
