import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phone number : ");
        int n = scn.nextInt();
        check(n);
    }

    static void check(int nu) {
        int count = 0;
        while (nu != 0) {
            nu /= 10;
            count++;
        }
        System.out.println("Number of digits missing: "10 - count);
    }
}
