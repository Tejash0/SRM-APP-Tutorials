public class Two {
    public static void main(String[] args) {
        Shared shared = new Shared();
        new Producer(shared).start();
        new Consumer(shared).start();
    }
}

class Shared {
    private int number;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return number;
    }

    public synchronized void put(int number) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        available = true;
        notifyAll();
    }
}

class Producer extends Thread {
    private Shared shared;

    public Producer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            shared.put(i);
            System.out.println("Producer put: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Shared shared;

    public Consumer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer got: " + shared.get());
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}