import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a 1st Number : ");
        int a = scn.nextInt();
        System.out.println("Enter a 2nd Number : ");
        int b = scn.nextInt();
        check(a, b);
    }

    static void check(int a, int b) {
        if (a == b || a - b == 5 || a + b == 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
