//Kumar Tejash
//RA2311003011446
class Dog {
    String name;
    String breed;

    public Dog(String a, String b) {
        this.name = a;
        this.breed = b;
    }

    public void setter(String x, String y) {
        this.name = x;
        this.breed = y;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Two {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno", "German_Shepherd");
        d1.setter("Mille", "Labrador");
        d1.print();
    }
}