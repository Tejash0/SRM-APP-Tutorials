
//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number Number");
        int a = scn.nextInt();
        if (ispalindrome(a)) {
            System.out.println("The number is a plaindrome");
        } else {
            System.out.println("The number is not a pallindrome");
        }
        scn.close();
    }

    static boolean ispalindrome(int x) {
        int rev = 0;
        int a = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if (a == rev) {
            return true;
        }
        return false;
    }
}
