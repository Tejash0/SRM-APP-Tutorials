import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scn.nextLine();
        check(s);
    }

    static void check(String s) {
        String a = s;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == s.charAt(s.length() - i - 1)) {
                count++;
            }
        }
        if (count == a.length()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
