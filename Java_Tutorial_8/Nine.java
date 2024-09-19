public class Nine {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int[] sleepTimes = { 10, 20, 50, 70, 100 };
            for (int sleepTime : sleepTimes) {
                try {
                    System.out.println("Sleeping for " + sleepTime + " milliseconds...");
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}