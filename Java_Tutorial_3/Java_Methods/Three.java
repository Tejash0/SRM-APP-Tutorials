
//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Word");
        String a = scn.nextLine();
        int b = checkforvowel(a);
        if (b == 1) {
            System.out.println("False: Not all Vowels");
        } else {
            System.out.println("True: All Vowels");
        }
        scn.close();
    }

    static int checkforvowel(String x) {
        int[] count = new int[5];

        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) == 'A' || x.charAt(i) == 'a')
                count[0] = 1;

            else if (x.charAt(i) == 'E' || x.charAt(i) == 'e')
                count[1] = 1;

            else if (x.charAt(i) == 'I' || x.charAt(i) == 'i')
                count[2] = 1;

            else if (x.charAt(i) == 'O' || x.charAt(i) == 'o')
                count[3] = 1;

            else if (x.charAt(i) == 'U' || x.charAt(i) == 'u')
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
