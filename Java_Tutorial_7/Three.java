abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public abstract void getEmployeeDetails();
}

class RegularEmployee extends Employee {
    private double salary;

    public RegularEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Regular Employee: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Contract Employee: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Hourly Employee: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

// Main class to test the code
public class Three {
    public static void main(String[] args) {
        RegularEmployee regularEmployee = new RegularEmployee("John", 1, 5000);
        regularEmployee.getEmployeeDetails();

        ContractEmployee contractEmployee = new ContractEmployee("Jane", 2, 50, 40);
        contractEmployee.getEmployeeDetails();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Doe", 3, 20, 20);
        hourlyEmployee.getEmployeeDetails();
    }
}