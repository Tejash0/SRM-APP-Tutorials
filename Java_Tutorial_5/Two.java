import java.util.*;

public class Two {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scn.nextLine();
        System.out.println("Enter a reversed string : ");
        String r = scn.nextLine();
        check(s, r);
    }

    static void check(String a, String b) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(b.length() - i - 1)) {
                count++;
            }
        }
        if (count == a.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
