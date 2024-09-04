import java.util.Scanner;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working...");
    }

    public double getSalary() {
        return salary;
    }
}

// HRManager.java
class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources...");
    }

    public void addEmployee(Employee employee) {
        System.out.println("Adding new employee: " + employee.getSalary());
    }
}

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee Management System!");
        System.out.println("-----------------------------------------");

        System.out.print("Enter the salary of the employee: ");
        double employeeSalary = scanner.nextDouble();
        Employee employee = new Employee(employeeSalary);

        System.out.println("Employee is working...");
        System.out.println("Salary: " + employee.getSalary());

        System.out.print("Enter the salary of the HR Manager: ");
        double hrManagerSalary = scanner.nextDouble();
        HRManager hrManager = new HRManager(hrManagerSalary);

        System.out.println("HR Manager is managing human resources...");
        System.out.println("Salary: " + hrManager.getSalary());

        System.out.print("Do you want to add the employee to the HR Manager's team? (yes/no): ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            hrManager.addEmployee(employee);
        } else {
            System.out.println("Employee not added to the HR Manager's team.");
        }
    }
}