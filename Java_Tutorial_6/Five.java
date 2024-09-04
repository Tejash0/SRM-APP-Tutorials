// Shape.java
class Shape {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Five.java
public class Five {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}