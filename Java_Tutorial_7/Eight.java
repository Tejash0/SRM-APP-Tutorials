class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected int numWheels;

    public Vehicle(String make, String model, int year, int numWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
    }

    public void displayVehicleInfo() {
        System.out.println(
                "Make: " + make + ", Model: " + model + ", Year: " + year + ", Number of wheels: " + numWheels);
    }
}

class Engine {
    protected String type;
    protected int horsepower;
    protected String fuelType;

    public Engine(String type, int horsepower, String fuelType) {
        this.type = type;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public void displayEngineInfo() {
        System.out.println("Type: " + type + ", Horsepower: " + horsepower + ", Fuel type: " + fuelType);
    }
}

class Car {
    private Vehicle vehicle;
    private Engine engine;

    public Car(Vehicle vehicle, Engine engine) {
        this.vehicle = vehicle;
        this.engine = engine;
    }

    public void displayCarInfo() {
        System.out.println("Car Information:");
        vehicle.displayVehicleInfo();
        engine.displayEngineInfo();
    }
}

class Truck {
    private Vehicle vehicle;
    private Engine engine;

    public Truck(Vehicle vehicle, Engine engine) {
        this.vehicle = vehicle;
        this.engine = engine;
    }

    public void displayTruckInfo() {
        System.out.println("Truck Information:");
        vehicle.displayVehicleInfo();
        engine.displayEngineInfo();
    }
}

class Motorcycle {
    private Vehicle vehicle;
    private Engine engine;

    public Motorcycle(Vehicle vehicle, Engine engine) {
        this.vehicle = vehicle;
        this.engine = engine;
    }

    public void displayMotorcycleInfo() {
        System.out.println("Motorcycle Information:");
        vehicle.displayVehicleInfo();
        engine.displayEngineInfo();
    }
}

// Main class to test the code
public class Eight {
    public static void main(String[] args) {
        Vehicle carVehicle = new Vehicle("Toyota", "Corolla", 2020, 4);
        Engine carEngine = new Engine("Gasoline", 130, "Petrol");
        Car car = new Car(carVehicle, carEngine);
        car.displayCarInfo();

        Vehicle truckVehicle = new Vehicle("Ford", "F-150", 2021, 4);
        Engine truckEngine = new Engine("Diesel", 250, "Diesel");
        Truck truck = new Truck(truckVehicle, truckEngine);
        truck.displayTruckInfo();

        Vehicle motorcycleVehicle = new Vehicle("Harley-Davidson", "Street 750", 2019, 2);
        Engine motorcycleEngine = new Engine("Gasoline", 70, "Petrol");
        Motorcycle motorcycle = new Motorcycle(motorcycleVehicle, motorcycleEngine);
        motorcycle.displayMotorcycleInfo();
    }
}