
//Kumar Tejash
//RA2311003011446
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Rectangle Area: " + rectangle.calculateArea());
                System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
                break;
            case 2:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Circle Area: " + circle.calculateArea());
                System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter the lengths of the triangle sides:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Triangle Area: " + triangle.calculateArea());
                System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}

// Shape.java (Abstract Class)
abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

// Rectangle.java (Subclass)
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Circle.java (Subclass)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle.java (Subclass)
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Using Heron's Formula
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}