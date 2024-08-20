import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void calgrade() {
        System.out.println("Enter the marks");
        if (marks > 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("B");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("C");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("D");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }

    public void displayStudentInfo() {
        System.out.println("The name of the student : " + name);
        System.out.println("The roll number of the student : " + rollNumber);
        System.out.println("The marks of the student : " + marks);
    }
}

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int r = scanner.nextInt();
        int m = scanner.nextInt();

        Student s1 = new Student(n, r, m);

        s1.calgrade();
        s1.displayStudentInfo();
        scanner.close();
    }
}