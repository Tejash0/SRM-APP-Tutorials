import java.util.Scanner;

public class Two {

    // Pure function to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Impure function: prompts the user for the radius and prints the area
    public static void promptAndPrintArea() {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Takes user input

        // Calculate the area using the pure function
        double area = calculateArea(radius);

        // Print the area
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }

    public static void main(String[] args) {
        // Call the impure function to prompt the user and print the result
        promptAndPrintArea();
    }
}
