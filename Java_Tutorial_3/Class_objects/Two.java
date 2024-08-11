class Rectangle {
    double Height;
    double Width;

    public void set(double a, double b) {
        Height = a;
        Width = b;
    }

    public void area() {
        System.out.println("The Area: " + (Height * Width));
    }

    public void perimeter() {
        System.out.println("The Perimeter: " + 2 * (Height + Width));
    }
}

public class Two {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.set(10, 44);
        r1.perimeter();
        r1.area();
    }
}
