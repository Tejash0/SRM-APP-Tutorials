class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class one {
    public static void main(String[] args) {
        Car car1 = new Car("Maruti Suzuki", 2020, "Green");
        Car car2 = new Car("Honda City", 2022, "Blue");
        System.out.println("Car 1 Information:");
        car1.displayCarInfo();
        System.out.println("Car 2 Information:");
        car2.displayCarInfo();
    }
}
