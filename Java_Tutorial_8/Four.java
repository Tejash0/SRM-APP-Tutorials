public class Four {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                for (int i = 5; i >= 1; i--) {
                    System.out.println(i);
                    Thread.sleep(6000);
                }
                Thread.currentThread().setName("New Thread Name");
                System.out.println("New Thread Name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}