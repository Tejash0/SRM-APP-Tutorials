abstract class Animal {
    public abstract void makeSound();
}

class Mammal extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Mammal makes sound");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird makes sound");
    }
}

class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Fish makes sound");
    }
}

// Main class to test the code
public class Four {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal();
        animals[1] = new Bird();
        animals[2] = new Fish();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}