import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
}

public class Nine {

    public static void main(String[] args) {
        // Sample student list
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 85.5),
                new Student("Bob", 22, 90.0),
                new Student("Charlie", 19, 78.0),
                new Student("David", 21, 88.5),
                new Student("Eve", 23, 92.0));

        // 1. Create a new list containing only the names of the students
        List<String> studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Student Names: " + studentNames);

        // 2. Filter the students who are above a certain age threshold (e.g., 21)
        int ageThreshold = 21;
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > ageThreshold)
                .collect(Collectors.toList());

        System.out.println("Students above age " + ageThreshold + ": ");
        filteredStudents.forEach(student -> System.out.println(student.getName() + " - Age: " + student.getAge()));

        // 3. Calculate the average grade of all students
        double averageGrade = students.stream()
                .collect(Collectors.averagingDouble(Student::getGrade));

        System.out.println("Average Grade of all students: " + averageGrade);
    }
}
