class Person {
    private String name;
    private int age;
    private String address;

    public Person() 
    {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    public Person(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayPersonInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class Two 
{
    public static void main(String[] args) 
    {

        Person person1 = new Person();

        Person person2 = new Person("Tejash", 19, "Delhi");

        System.out.println("Person 1 Information:");
        person1.displayPersonInfo();

        System.out.println("Person 2 Information:");
        person2.displayPersonInfo();
    }
}