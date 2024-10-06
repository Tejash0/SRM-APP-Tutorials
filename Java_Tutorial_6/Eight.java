// Flyable interface
interface Flyable {
    void fly_obj();

    String getStatus();
}

// Spacecraft class implementing Flyable
class Spacecraft implements Flyable {
    private boolean isFlying = false;

    @Override
    public void fly_obj() {
        if (!isFlying) {
            System.out.println("The Spacecraft is taking off...");
            isFlying = true;
        } else {
            System.out.println("The Spacecraft is already flying.");
        }
    }

    @Override
    public String getStatus() {
        return "Spacecraft: " + (isFlying ? "Flying" : "Not Flying");
    }
}

// Airplane class implementing Flyable
class Airplane implements Flyable {
    private boolean isFlying = false;

    @Override
    public void fly_obj() {
        if (!isFlying) {
            System.out.println("The Airplane is taking off...");
            isFlying = true;
        } else {
            System.out.println("The Airplane is already flying.");
        }
    }

    @Override
    public String getStatus() {
        return "Airplane: " + (isFlying ? "Flying" : "Not Flying");
    }
}

// Helicopter class implementing Flyable
class Helicopter implements Flyable {
    private boolean isFlying = false;

    @Override
    public void fly_obj() {
        if (!isFlying) {
            System.out.println("The Helicopter is taking off...");
            isFlying = true;
        } else {
            System.out.println("The Helicopter is already flying.");
        }
    }

    @Override
    public String getStatus() {
        return "Helicopter: " + (isFlying ? "Flying" : "Not Flying");
    }
}

// Main class to test the Flyable interface
public class Eight {
    public static void main(String[] args) {
        boolean running = true;
        Flyable[] vehicles = new Flyable[3];

        vehicles[0] = new Spacecraft();
        vehicles[1] = new Airplane();
        vehicles[2] = new Helicopter();

        while (running) {
            System.out.println("Welcome to the Flight Simulator!");
            System.out.println("--------------------------------");

            System.out.println("Choose a vehicle to fly:");
            System.out.println("1. Spacecraft");
            System.out.println("2. Airplane");
            System.out.println("3. Helicopter");
            System.out.println("4. Display all vehicles' status");
            System.out.println("5. Exit");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();

            Flyable vehicle = null;

            switch (choice) {
                case 1:
                    vehicle = vehicles[0];
                    break;
                case 2:
                    vehicle = vehicles[1];
                    break;
                case 3:
                    vehicle = vehicles[2];
                    break;
                case 4:
                    System.out.println("Vehicles' status:");
                    for (Flyable v : vehicles) {
                        System.out.println(v.getStatus());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (vehicle != null) {
                System.out.println("You have chosen to fly the " + vehicle.getClass().getSimpleName() + ".");
                vehicle.fly_obj();
            }
            scanner.close();
        }
    }
}