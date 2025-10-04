public class Employee {
    // Private variables to store employee details
    private String name;
    private double basicSalary;
    private int performanceRating;
    
    // Constructor to initialize the employee details
    public Employee(String name, double basicSalary, int performanceRating) {
        this.name = name;
        this.basicSalary = basicSalary;
        setPerformanceRating(performanceRating); // Ensure rating is valid
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for basic salary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Getter method for performance rating
    public int getPerformanceRating() {
        return performanceRating;
    }
    
    // Setter method for performance rating with validation
    public void setPerformanceRating(int performanceRating) {
        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }
    
    // Method to calculate the bonus based on the performance rating
    public double calculateBonus() {
        double bonus = 0;
        switch (performanceRating) {
            case 5:
                bonus = basicSalary * 0.20; // 20% bonus for rating 5
                break;
            case 4:
                bonus = basicSalary * 0.15; // 15% bonus for rating 4
                break;
            case 3:
                bonus = basicSalary * 0.10; // 10% bonus for rating 3
                break;
            case 2:
                bonus = basicSalary * 0.05; // 5% bonus for rating 2
                break;
            case 1:
                bonus = 0; // No bonus for rating 1
                break;
        }
        return bonus;
    }
    
    // Method to calculate the total salary including the bonus
    public double calculateTotalSalary() {
        return basicSalary + calculateBonus(); // Total Salary = Basic Salary + Bonus
    }
    
    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an employee object with sample details
        Employee employee = new Employee("John Doe", 50000, 4);
        
        // Displaying employee details and salary
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Performance Rating: " + employee.getPerformanceRating());
        System.out.println("Bonus: " + employee.calculateBonus());
        System.out.println("Total Salary: " + employee.calculateTotalSalary());
    }
}
