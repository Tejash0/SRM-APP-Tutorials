abstract class Animal {
    protected String name;
    protected String sound;
    protected int numLegs;

    public Animal(String name, String sound, int numLegs) {
        this.name = name;
        this.sound = sound;
        this.numLegs = numLegs;
    }

    public void makeSound() {
        System.out.println(name + " " + sound);
    }

    public void walk() {
        System.out.println(name + " walks on " + numLegs + " legs");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, "barks", 4);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "meows", 4);
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name, "chirps", 2);
    }

    @Override
    public void walk() {
        System.out.println(name + " flies instead of walking");
    }
}

// Main class to test the code
public class Seven {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.makeSound();
        dog.walk();

        Cat cat = new Cat("Cat");
        cat.makeSound();
        cat.walk();

        Bird bird = new Bird("Bird");
        bird.makeSound();
        bird.walk();
    }
}