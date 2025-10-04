package Lab4;

import java.util.Scanner;

public class Driver {

    // (Private Attributes of the Driver)
    private String driverId;
    private String driverName;
    private double baseSalary;
    private int performance;

    // Constructor has used initializing only driver ID and Name
    public Driver(String driverId, String driverName) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performance = 1;  // Default
    }

    /* Constructor initializing only base salary for unknown driver*/
    public Driver(double baseSalary) {
        this.driverId = "Unknown";         // Default ID
        this.driverName = "Unknown Driver"; // Default Name
        this.baseSalary = baseSalary;      // Given salary
        this.performance = 1;              // Default performance score
    }

    // Constructor used initializing all attributes
    public Driver(String driverId, String driverName, double baseSalary, int performance) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performance); // Using set to validate the performance score
    }

    // Setter method to ensure the performance score is valid (between 1 and 5)
    public void setPerformanceScore(int score) {
        if (score >= 1 && score <= 5) {
            this.performance = score;  // If valid, assign the given score
        } else {
            this.performance = 1;  // If invalid, set it to the minimum valid score (1)
        }
    }

    // Method to calculate the bonus based on the performance score
    public double calculateBonus() {
        double bonusRate = performance * 0.05;
        return baseSalary * bonusRate;
    }

    // Method to calculate the total salary /*Base salary + Bonus */
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus(); // Total salary includes base salary + bonus
    }

    // Method to display the driver's details
    public void displayDriverDetails() {
        System.out.println("Driver ID: " + driverId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performance);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("-----------------------------------");
    }

    // Main method to take user input and create driver objects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter number of drivers: ");
        int numDrivers = scanner.nextInt();  // Read the number of drivers
        scanner.nextLine(); // Consume the newline character left after nextInt()

        Driver[] drivers = new Driver[numDrivers]; // Array to store driver objects

        // Loop to take input for each driver
        for (int i = 0; i < numDrivers; i++) {
            System.out.println("\nEnter details for Driver " + (i + 1));

            System.out.print("Enter Driver ID: ");
            String driverId = scanner.nextLine(); // Read driver ID

            System.out.print("Enter Driver Name: ");
            String driverName = scanner.nextLine(); // Read driver Name

            System.out.print("Enter Base Salary: ");
            double baseSalary = scanner.nextDouble(); // Read base salary

            System.out.print("Enter Performance Score (1-5): ");
            int performance = scanner.nextInt(); // Read performance score
            scanner.nextLine(); // Consume the newline character

            // Create a new Driver object and store it in the array
            drivers[i] = new Driver(driverId, driverName, baseSalary, performance);
        }

        // Display details of all drivers
        System.out.println("\nDriver Details:");
        for (Driver driver : drivers) {
            driver.displayDriverDetails(); // Call method to print driver details
        }

    }
}
