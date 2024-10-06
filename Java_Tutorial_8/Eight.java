import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String k = scanner.nextLine();
        System.out.println("Enter a character:");
        char c = scanner.next().charAt(0);

        UserThreadPriority threadobj1 = new UserThreadPriority(k, c);
        threadobj1.setName("ThreadA");
        threadobj1.start();

        UserThreadPriority threadobj2 = new UserThreadPriority(k, c);
        threadobj2.setName("ThreadB");
        threadobj2.start();
        scanner.close();
    }
}

class UserThreadPriority extends Thread {
    private String k;
    private char c;

    public UserThreadPriority(String k, char c) {
        this.k = k;
        this.c = c;
    }

    @Override
    public void run() {
        int count = 0;
        for (char character : k.toCharArray()) {
            if (character == c) {
                count++;
            }
        }
        System.out.println(getName() + ": " + count);
    }
}