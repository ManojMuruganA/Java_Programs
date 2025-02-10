abstract class Employee {
    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Abstract method to get employee details
    abstract String getEmployeeDetails();
}

class RegularEmployee extends Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    // Constructor
    RegularEmployee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implement the calculateSalary method for RegularEmployee
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implement the getEmployeeDetails method for RegularEmployee
    @Override
    String getEmployeeDetails() {
        return "Regular Employee: " + name;
    }
}

class ContractEmployee extends Employee {
    private String name;
    private double fixedPayment;

    // Constructor
    ContractEmployee(String name, double fixedPayment) {
        this.name = name;
        this.fixedPayment = fixedPayment;
    }

    // Implement the calculateSalary method for ContractEmployee
    @Override
    double calculateSalary() {
        return fixedPayment;
    }

    // Implement the getEmployeeDetails method for ContractEmployee
    @Override
    String getEmployeeDetails() {
        return "Contract Employee: " + name;
    }
}

class HourlyEmployee extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement the calculateSalary method for HourlyEmployee
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implement the getEmployeeDetails method for HourlyEmployee
    @Override
    String getEmployeeDetails() {
        return "Hourly Employee: " + name;
    }
}

public class A3 {
    public static void main(String[] args) {
        // Create instances of RegularEmployee, ContractEmployee, and HourlyEmployee
        Employee regularEmployee = new RegularEmployee("Alice", 50000, 5000);
        Employee contractEmployee = new ContractEmployee("Bob", 60000);
        Employee hourlyEmployee = new HourlyEmployee("Charlie", 20, 160);

        // Display employee details and salary for each type of employee
        System.out.println(regularEmployee.getEmployeeDetails() + ", Salary: " + regularEmployee.calculateSalary());
        System.out.println(contractEmployee.getEmployeeDetails() + ", Salary: " + contractEmployee.calculateSalary());
        System.out.println(hourlyEmployee.getEmployeeDetails() + ", Salary: " + hourlyEmployee.calculateSalary());
    }
}
