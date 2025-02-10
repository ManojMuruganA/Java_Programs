abstract class Animal {
    // Abstract method for making sound
    abstract void makeSound();

    // Abstract method for eating
    abstract void eat();
}

class Dog extends Animal {
    // Implement the makeSound method for Dog
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Implement the eat method for Dog
    @Override
    void eat() {
        System.out.println("Dog is eating dog food.");
    }
}

class Cat extends Animal {
    // Implement the makeSound method for Cat
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // Implement the eat method for Cat
    @Override
    void eat() {
        System.out.println("Cat is eating cat food.");
    }
}

class Bird extends Animal {
    // Implement the makeSound method for Bird
    @Override
    void makeSound() {
        System.out.println("Tweet! Tweet!");
    }

    // Implement the eat method for Bird
    @Override
    void eat() {
        System.out.println("Bird is eating seeds.");
    }
}

public class A1 {
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Bird
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Call the methods on each object
        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}