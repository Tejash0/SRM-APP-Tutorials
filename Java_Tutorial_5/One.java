import java.util.*;

public class One {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scn.nextLine();
        mirror(s);
    }

    static void mirror(String a) {

        if (a.length() == 0) {
            return;
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}