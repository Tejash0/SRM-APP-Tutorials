import java.util.*;

public class Nine {
    public static void printCombinations(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] digits;
        digits = new int[3];
        System.out.println("Enter a 3 digit number: ");
        Scanner sc = new Scanner(System.in);
        digits[0] = sc.nextInt();
        digits[1] = sc.nextInt();
        digits[2] = sc.nextInt();
        printCombinations(digits);
        sc.close();
    }
}
