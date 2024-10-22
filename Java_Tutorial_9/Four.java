import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Four {

    // Student class to store individual student information
    static class Student {
        private String name;
        private int age;
        private double grade;

        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
        }
    }

    // Mutable function: Adds a new student to the list (modifies the original list)
    public static void addStudent(List<Student> students, String name, int age, double grade) {
        Student newStudent = new Student(name, age, grade);
        students.add(newStudent); // Mutates the list by adding a new student
        System.out.println("Student added: " + newStudent);
    }

    // Immutable function: Calculates the average age of students without modifying
    // the list
    public static double calculateAverageAge(List<Student> students) {
        if (students.isEmpty()) {
            return 0; // Avoid division by zero
        }
        int totalAge = 0;
        for (Student student : students) {
            totalAge += student.getAge(); // Sum the ages
        }
        return (double) totalAge / students.size(); // Return the average age
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(); // List to hold student records

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        // Menu to manage student records
        while (continueLoop) {
            System.out.println("\nStudent Records Manager");
            System.out.println("1. Add a new student");
            System.out.println("2. Calculate average age");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Add a new student (Mutable operation)
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    // Handling incorrect grade input
                    double grade = 0;
                    boolean validGrade = false;
                    while (!validGrade) {
                        try {
                            System.out.print("Enter grade (as a number): ");
                            grade = scanner.nextDouble();
                            validGrade = true; // Exit loop if valid input
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a numeric grade.");
                            scanner.next(); // Clear invalid input
                        }
                    }

                    addStudent(studentList, name, age, grade);
                    break;
                case 2:
                    // Calculate average age (Immutable operation)
                    double averageAge = calculateAverageAge(studentList);
                    System.out.println("The average age of students is: " + averageAge);
                    break;
                case 3:
                    // Display all students
                    System.out.println("Student List:");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    // Exit the loop
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        scanner.close();
    }
}
