import java.util.*;

public class Three {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        print(a);
    }

    static void print(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.println(b[i]);
            }
        }
    }
}
