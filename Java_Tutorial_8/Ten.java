public class Ten {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " with priority "
                        + Thread.currentThread().getPriority() + " is running");
            });
            thread.setName("Thread" + i);
            thread.setPriority(i);
            thread.start();
        }
    }
}