package Lab6;

public class Vehicle {
    protected String vehicleName; // Name of the vehicle

    // Paramiter Constructor to initialize the vehicle name
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Method to display the vehicle's name
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Default method to return speed (for a general vehicle, speed is 0.0)
    public double calculateSpeed() {
        return 0.0;
    }

    // Overloaded method to scale speed by a given factor
    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}

// Subclass representing a Car, which is a type of Vehicle
class Car extends Vehicle {
    private int engineCapacity;
    private double topSpeed;

    // Constructor to initialize car properties
    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName); // Call parent class (Vehicle) constructor
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    // Override method to return the car's actual top speed

    public double calculateSpeed() {
        return topSpeed;
    }

    // Override method to display car details including engine capacity and speed
  
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Call the parent method to show vehicle name
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

// Subclass representing a Bicycle, which is a type of Vehicle
class Bicycle extends Vehicle {
    private int gearCount;        // Number of gears in the bicycle
    private double maxPedalSpeed; // Maximum speed achievable by pedaling in km/h

    // Constructor to initialize bicycle properties
    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName); // Call parent class (Vehicle) constructor
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    // Override method to return the bicycle's actual pedaling speed
    
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    // Override method to display bicycle details including gear count and speed

    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Call the parent method to show vehicle name
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Pedal Speed: " + maxPedalSpeed + " km/h");
    }
}



