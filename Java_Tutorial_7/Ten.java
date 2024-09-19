class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

// Main class to test the code
public class Ten {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Initial length: " + rectangle.getLength());
        System.out.println("Initial width: " + rectangle.getWidth());

        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);
        System.out.println("New length: " + rectangle.getLength());
        System.out.println("New width: " + rectangle.getWidth());
    }
}