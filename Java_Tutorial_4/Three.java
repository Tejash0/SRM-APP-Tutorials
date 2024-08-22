class Rectangle {
    // Attributes of the Rectangle class
    private double width;
    private double height;

    // Constructor to initialize the Rectangle object
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the Rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the Rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to print the details of the Rectangle
    public void printDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Three {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.printDetails();
    }
}