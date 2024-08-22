import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int a = scn.nextInt();
        int i = 1;

        while (i != a + 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
        scn.close();
    }
}
