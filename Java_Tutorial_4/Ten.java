class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }

    public int calculateHumanAge() {
        return age * 7;
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }
}

class Bird extends Pet {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan);
    }
}

public class Ten {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Ball");
        Bird bird = new Bird("Tweety", 2, 10.5);

        System.out.println("Dog Details:");
        dog.displayDetails();
        System.out.println("Human Age: " + dog.calculateHumanAge());

        System.out.println("\nBird Details:");
        bird.displayDetails();
        System.out.println("Human Age: " + bird.calculateHumanAge());
    }
}