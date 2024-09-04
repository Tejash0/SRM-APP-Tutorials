import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee Management Program!");
        System.out.println("--------------------------------------------");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create an Employee");
            System.out.println("2. Create an HR Manager");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the employee's name: ");
                    String name = scanner.next();
                    System.out.print("Enter the employee's salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(name, salary);
                    System.out.println("Employee created successfully!");
                    break;
                case 2:
                    System.out.print("Enter the HR Manager's name: ");
                    String managerName = scanner.next();
                    System.out.print("Enter the HR Manager's salary: ");
                    double managerSalary = scanner.nextDouble();
                    HRManager hrManager = new HRManager(managerName, managerSalary);
                    System.out.println("HR Manager created successfully!");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " is managing employees.");
    }

    public void addEmployee(Employee employee) {
        System.out.println("Added employee " + employee.getName());
    }

    public String getName() {
        return super.getClass().getSimpleName();
    }
}