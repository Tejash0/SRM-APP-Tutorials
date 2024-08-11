class Car {
    int year;
    String model;
    String color;

    public void CarInfo(int x, String s, String d) {
        year = x;
        model = s;
        color = d;
    }
}

public class One {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = c;
        c.CarInfo(2014, "XUV700", "RED");
        System.out.println("Model: " + c.model);
        System.out.println("Year: " + c1.year);
        System.out.println("Color: " + c1.color);
    }
}
