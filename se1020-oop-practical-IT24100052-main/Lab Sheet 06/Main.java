package Lab6;

// Main class
    public class Main {
        public static void main(String[] args) {
            // Creating a Car object
            Car car = new Car("Toyota", 1800, 240.0);

            // Creating a Bicycle object
            Bicycle bicycle = new Bicycle("Mountain Bike", 18, 30.0);

            // Display speeds
            System.out.println("Car Speed: " + car.calculateSpeed() + " km/h");
            System.out.println("Car Scaled Speed (1.5x): " + car.calculateSpeed(1.5) + " km/h");

            System.out.println("Bicycle Speed: " + bicycle.calculateSpeed() + " km/h");
            System.out.println("Bicycle Scaled Speed (1.2x): " + bicycle.calculateSpeed(1.2) + " km/h");

            // Display vehicle details
            System.out.println("\nCar Details:");
            car.displayVehicleDetails();

            System.out.println("\nBicycle Details:");
            bicycle.displayVehicleDetails();
        }
    }
