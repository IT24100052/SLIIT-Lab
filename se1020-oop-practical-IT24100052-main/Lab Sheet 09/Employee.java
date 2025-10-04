
interface Payable {
    void generatePayslip();
}

public abstract class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class PermanentEmployee extends Employee implements Payable {
    private double monthlySalary;

    public PermanentEmployee(int empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void generatePayslip() {
        System.out.println("Permanent Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(int empId, String name, double hourlyRate, int hoursWorked) {
        super(empId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void generatePayslip() {
        System.out.println("Contract Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class Main {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee(101, "Alice", 50000);
        ContractEmployee cEmp = new ContractEmployee(102, "Bob", 500, 40);

        pEmp.generatePayslip();
        cEmp.generatePayslip();
    }
}
