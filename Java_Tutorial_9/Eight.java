import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

public class Eight {

    public static void main(String[] args) {
        // Sample employee list
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000, "IT"),
                new Employee("Bob", 50000, "HR"),
                new Employee("Charlie", 70000, "IT"),
                new Employee("David", 40000, "Finance"),
                new Employee("Eve", 80000, "HR"));

        // 1. Create a new list containing employee names and their corresponding
        // salaries
        List<String> employeeDetails = employees.stream()
                .map(emp -> emp.getName() + ": " + emp.getSalary())
                .collect(Collectors.toList());

        System.out.println("Employee Names and Salaries: " + employeeDetails);

        // 2. Filter employees who belong to a specific department (e.g., "IT")
        String departmentToFilter = "IT";
        List<Employee> itEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equals(departmentToFilter))
                .collect(Collectors.toList());

        System.out.println("Employees in " + departmentToFilter + " Department: ");
        itEmployees.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));

        // 3. Calculate the average salary for employees in each department
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salaries by Department: " + averageSalaries);
    }
}
