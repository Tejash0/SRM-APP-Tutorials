import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sum(a, b);
        scanner.close();
    }

    static void sum(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }
}