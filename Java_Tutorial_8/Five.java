public class Five {
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            try {
                System.out.println("User Thread started");
                Thread.sleep(1000);
                System.out.println("User Thread ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        userThread.start();

        try {
            System.out.println("Main Thread started");
            Thread.sleep(1000);
            System.out.println("Main Thread ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}