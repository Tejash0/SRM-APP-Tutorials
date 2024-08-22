import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a even number");
        int n = scn.nextInt();
        for (int i = 0; i < n; i += 2) {
            System.out.println(i);
        }
        scn.close();
    }
}
