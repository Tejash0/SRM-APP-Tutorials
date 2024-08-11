class Car {
    private String model;
    private int year;
    private String color;

    // Constructor to initialize the attributes
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display the car's information
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class one {
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Toyota Corolla", 2020, "Red");
        Car car2 = new Car("Honda Civic", 2022, "Blue");

        // Displaying information of the two cars
        System.out.println("Car 1 Information:");
        car1.displayCarInfo();

        System.out.println("Car 2 Information:");
        car2.displayCarInfo();
    }
}