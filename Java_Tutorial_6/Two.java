import java.util.Scanner;

class TrafficLight {
    private String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return this.color;
    }
}

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial color of the traffic light (red or green): ");
        String initialColor = scanner.nextLine();

        TrafficLight trafficLight = new TrafficLight(initialColor);

        while (true) {
            System.out.println("\nTraffic Light Menu");
            System.out.println("1. Check current color");
            System.out.println("2. Change color");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Current color: " + trafficLight.getColor());
                    break;
                case 2:
                    System.out.print("Enter new color (red or green): ");
                    String newColor = scanner.nextLine();
                    trafficLight.changeColor(newColor);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}