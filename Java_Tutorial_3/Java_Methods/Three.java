import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word");
        String a = scanner.nextLine();
        int b = checkforvowel(a);
        if (b == 1) {
            System.out.println("Not all Vowels");
        } else {
            System.out.println("All Vowels");
        }
        scanner.close();
    }

    static int checkforvowel(String a) {
        int[] count = new int[5];

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == 'A' || a.charAt(i) == 'a')
                count[0] = 1;

            else if (a.charAt(i) == 'E' || a.charAt(i) == 'e')
                count[1] = 1;

            else if (a.charAt(i) == 'I' || a.charAt(i) == 'i')
                count[2] = 1;

            else if (a.charAt(i) == 'O' || a.charAt(i) == 'o')
                count[3] = 1;

            else if (a.charAt(i) == 'U' || a.charAt(i) == 'u')
                count[4] = 1;
        }

        for (int i = 0; i < 5; i++) {
            if (count[i] == 0) {
                return 1;
            }
        }
        return 0;
    }
}
