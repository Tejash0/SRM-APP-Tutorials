import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int s = scn.nextInt();
        check(s);
    }

    static void check(int num) {
        int count = 0;
        if (num <= 1) {
            System.out.println("The number is not prime");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println("The number is not prime");
        } else {
            System.out.println("The number is prime");
        }
    }
}
