import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number Number");
        int a = scanner.nextInt();
        if (ispalindrome(a)) {
            System.out.println("The number is a plaindrome");
        } else {
            System.out.println("The number is not a pallindrome");
        }
        scanner.close();
    }

    static boolean ispalindrome(int x) {
        int reversed = 0;
        int a = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        if (a == reversed) {
            return true;
        }
        return false;
    }
}
