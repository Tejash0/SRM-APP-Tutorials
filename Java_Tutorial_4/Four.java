//Kumar Tejash
//RA2311003011446
class Circle {
    // Attribute of the Circle class
    private double radius;

    // Constructor to initialize the Circle object
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to access the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to modify the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the Circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to print the details of the Circle
    public void printDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class Four {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle(5.0);

        // Print the details of the circle
        System.out.println("Details of the Circle:");
        circle.printDetails();

        // Modify the radius of the circle
        circle.setRadius(10.0);

        // Print the updated details of the circle
        System.out.println("\nUpdated Details of the Circle:");
        circle.printDetails();
    }
}
