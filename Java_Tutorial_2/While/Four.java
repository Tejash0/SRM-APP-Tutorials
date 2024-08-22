import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int a = scn.nextInt();
        int[] b;
        b = new int[a];
        int avg = 0, c = 0, d = 0;

        while (c < a) {
            System.out.println("Enter the number: ");
            b[c] = scn.nextInt();
            c++;
        }
        while (d < a) {
            avg += b[d];
            d++;
        }

        System.out.println("The average is : " + (avg / a));
        scn.close();
    }
}
