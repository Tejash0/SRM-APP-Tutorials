import java.util.LinkedList;
import java.util.Queue;

public class Six {
    public static void main(String[] args) {
        Printer printer = new Printer();
        new Thread(new PrintJob(printer, "Job1")).start();
        new Thread(new PrintJob(printer, "Job2")).start();
        new Thread(new PrintJob(printer, "Job3")).start();
    }
}

class Printer {
    private Queue<String> printQueue = new LinkedList<>();

    public synchronized void addJob(String job) {
        printQueue.add(job);
        System.out.println("Added " + job);
    }

    public synchronized void printJob() {
        while (!printQueue.isEmpty()) {
            System.out.println("Printing " + printQueue.poll());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintJob implements Runnable {
    private Printer printer;
    private String job;

    public PrintJob(Printer printer, String job) {
        this.printer = printer;
        this.job = job;
    }

    @Override
    public void run() {
        printer.addJob(job);
        printer.printJob();
    }
}