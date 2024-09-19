public class Seven {
    public static void main(String[] args) {
        String k = "abc123";

        Thread threadA = new Thread(() -> {
            int dc = 0;
            for (char c : k.toCharArray()) {
                if (Character.isDigit(c)) {
                    dc++;
                }
            }
            System.out.println("ThreadA:digitscount = " + dc);
        });

        Thread threadB = new Thread(() -> {
            int cc = 0;
            for (char c : k.toCharArray()) {
                if (Character.isLetter(c)) {
                    cc++;
                }
            }
            System.out.println("ThreadB:charscount = " + cc);
        });

        threadA.start();
        threadB.start();
    }
}