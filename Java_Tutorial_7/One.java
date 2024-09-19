abstract class Animal {
    public abstract void makeSound();

    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }

    @Override
    public void eat() {
        System.out.println("The bird eats");
    }
}

public class One {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();

        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();

        Bird bird = new Bird();
        bird.makeSound();
        bird.eat();
    }
}