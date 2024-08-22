import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = scn.nextInt();
        int sum = 0;

        while (a != 0) {
            sum += a;
            a--;
        }

        System.out.println("The sum : " + sum);
        scn.close();
    }
}
