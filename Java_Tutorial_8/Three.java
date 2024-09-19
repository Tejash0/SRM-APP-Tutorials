public class Three {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Current Thread Name: " + Thread.currentThread().getName());
                System.out.println("Sleeping for 5 seconds...");
                Thread.sleep(5000);
                Thread.currentThread().setName("Name");
                System.out.println("New Thread Name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}