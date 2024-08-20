import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scanner.nextInt();
        int b = isprime(a);
        if (b == 0) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Not prime");
        }
        System.out.println("The Prime numbers between 1 and 500");
        for (int i = 2; i < 500; i++) {
            if (printprime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    static int isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return 1;
            }
        }
        return 0;
    }

    static boolean printprime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
