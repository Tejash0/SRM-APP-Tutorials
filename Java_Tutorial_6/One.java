import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // Define the Person class
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of people
        System.out.print("How many people would you like to create? ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Create an array to store the people
        Person[] people = new Person[numPeople];

        // Loop through each person and get their details
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter person " + (i + 1) + "'s name: ");
            String name = scanner.nextLine();
            System.out.print("Enter person " + (i + 1) + "'s age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            // Create a new Person and add it to the array
            people[i] = new Person(name, age);
        }

        // Print out the people's details
        System.out.println("\nHere are the people's details:");
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Name: " + people[i].getName() + ", Age: " + people[i].getAge());
        }
        scanner.close();
    }
}