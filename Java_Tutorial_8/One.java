import java.util.Random;

public class One {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        SquareThread squareThread = new SquareThread(generator);
        CubeThread cubeThread = new CubeThread(generator);

        new Thread(generator).start();
        new Thread(squareThread).start();
        new Thread(cubeThread).start();
    }
}

class RandomNumberGenerator implements Runnable {
    private int number;
    private int counter = 0;
    private boolean isFinished = false;
    private Random random = new Random();

    @Override
    public void run() {
        while (counter < 10) { // Limit to 10 iterations
            number = random.nextInt(100);
            System.out.println("Random Number Generated: " + number);
            counter++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isFinished = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFinished() {
        return isFinished;
    }
}

class SquareThread implements Runnable {
    private RandomNumberGenerator generator;

    public SquareThread(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (!generator.isFinished()) {
            if (generator.getNumber() % 2 == 0) {
                System.out.println("Square of " + generator.getNumber() + " is "
                        + (generator.getNumber() * generator.getNumber()));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubeThread implements Runnable {
    private RandomNumberGenerator generator;

    public CubeThread(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (!generator.isFinished()) {
            if (generator.getNumber() % 2 != 0) {
                System.out.println("Cube of " + generator.getNumber() + " is "
                        + (generator.getNumber() * generator.getNumber() * generator.getNumber()));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}