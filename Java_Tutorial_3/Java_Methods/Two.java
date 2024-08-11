
//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Password");
        String a = scn.nextLine();
        int b;
        b = Check(a);
        if (b == 1) {
            System.out.println("Vaild Password");
        } else {
            System.out.println("Invalid Password");
        }
        scn.close();
    }

    static int Check(String x) {
        int a = x.length();
        int c = 0;
        if (a >= 8) {
            if (x.charAt(0) > 64 && x.charAt(0) < 91) {
                for (int j = 0; j < a; j++) {
                    if (x.charAt(j) > 47 && x.charAt(j) < 58) {
                        c = 1;
                    }
                }
            }
        } else {
            c = 0;
        }
        return c;
    }
}
