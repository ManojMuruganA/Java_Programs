// Base class Vehicle
class Vehicle {
    String make;
    String model;
    int year;
    int num_wheels;

    // Constructor
    public Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Wheels: " + num_wheels);
    }
}

// Interface Engine (multiple inheritance via interface)
interface Engine {
    String getEngineType();
    int getHorsePower();
    String getFuelType();
}

// Derived class Car
class Car extends Vehicle implements Engine {
    String engineType;
    int horsePower;
    String fuelType;

    // Constructor
    public Car(String make, String model, int year, int horsePower, String fuelType) {
        super(make, model, year, 4); // Car has 4 wheels
        this.engineType = "Internal Combustion"; // Default engine type for simplicity
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    // Car-specific method
    public void drive() {
        System.out.println("Car is driving.");
    }
}

// Derived class Truck
class Truck extends Vehicle implements Engine {
    String engineType;
    int horsePower;
    String fuelType;
    int payloadCapacity;

    // Constructor
    public Truck(String make, String model, int year, int horsePower, String fuelType, int payloadCapacity) {
        super(make, model, year, 6); // Truck usually has 6 wheels
        this.engineType = "Diesel";
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    // Truck-specific method
    public void loadCargo() {
        System.out.println("Truck is loading cargo with capacity: " + payloadCapacity + " kg.");
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle implements Engine {
    String engineType;
    int horsePower;
    String fuelType;

    // Constructor
    public Motorcycle(String make, String model, int year, int horsePower, String fuelType) {
        super(make, model, year, 2); // Motorcycle has 2 wheels
        this.engineType = "Internal Combustion";
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    // Motorcycle-specific method
    public void ride() {
        System.out.println("Motorcycle is riding.");
    }
}

// Main class to demonstrate functionality
public class I2 {
    public static void main(String[] args) {
        // Creating objects for Car, Truck, and Motorcycle
        Car car = new Car("Toyota", "Camry", 2022, 200, "Gasoline");
        Truck truck = new Truck("Ford", "F-150", 2021, 400, "Diesel", 10000);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, 75, "Gasoline");

        // Display vehicle information and engine details
        car.displayInfo();
        System.out.println("Engine Type: " + car.getEngineType() + ", HorsePower: " + car.getHorsePower() + ", Fuel Type: " + car.getFuelType());
        car.drive();

        truck.displayInfo();
        System.out.println("Engine Type: " + truck.getEngineType() + ", HorsePower: " + truck.getHorsePower() + ", Fuel Type: " + truck.getFuelType());
        truck.loadCargo();

        motorcycle.displayInfo();
        System.out.println("Engine Type: " + motorcycle.getEngineType() + ", HorsePower: " + motorcycle.getHorsePower() + ", Fuel Type: " + motorcycle.getFuelType());
        motorcycle.ride();
    }
}