import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Password");
        String a = scanner.nextLine();
        int ret;
        ret = Check(a);
        if (ret == 1) {
            System.out.println("Vaild Password");
        } else {
            System.out.println("Invalid Password");
        }
        scanner.close();
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
