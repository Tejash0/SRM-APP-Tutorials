class Student {
    String name;
    int age;
    String reg_no;
    double cgpa;
    String address;

    public Student(String a, int b, String c, double d, String e) {
        this.name = a;
        this.age = b;
        this.reg_no = c;
        this.cgpa = d;
        this.address = e;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + reg_no);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Address: " + address);
    }
}

public class One {
    public static void main(String[] args) {
        Student s1 = new Student("Tejash", 19, "RA2311003011446", 9.28, "108-Sannasi_A");
        Student s2 = new Student("Rahul", 20, "RA2311003011445", 8.9, "311-Man0");

        System.out.println("Details of student 1: ");
        s1.print();
        System.out.println("Details of student 1: ");
        s2.print();
    }
}