import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scn.nextLine();
        count(s);
    }

    static void count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Length of String: " + count);
    }
}
