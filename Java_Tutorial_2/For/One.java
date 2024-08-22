import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int a = scn.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
        scn.close();
    }
}
