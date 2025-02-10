// Base class Animal
class Animal {
    String name;
    String sound;
    int num_legs;

    // Constructor
    public Animal(String name, String sound, int num_legs) {
        this.name = name;
        this.sound = sound;
        this.num_legs = num_legs;
    }

    // Method to make sound (to be overridden by subclasses)
    public void make_sound() {
        System.out.println(name + " makes a " + sound + " sound.");
    }

    // Method to simulate walking (to be overridden by subclasses)
    public void walk() {
        System.out.println(name + " walks on " + num_legs + " legs.");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Constructor
    public Dog() {
        super("Dog", "bark", 4);
    }

    // Overriding make_sound() for Dog
    @Override
    public void make_sound() {
        System.out.println("Dog barks.");
    }

    // Overriding walk() for Dog
    @Override
    public void walk() {
        System.out.println("Dog walks on 4 legs.");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Constructor
    public Cat() {
        super("Cat", "meow", 4);
    }

    // Overriding make_sound() for Cat
    @Override
    public void make_sound() {
        System.out.println("Cat meows.");
    }

    // Overriding walk() for Cat
    @Override
    public void walk() {
        System.out.println("Cat walks gracefully on 4 legs.");
    }
}

// Derived class Bird
class Bird extends Animal {
    // Constructor
    public Bird() {
        super("Bird", "chirp", 2);
    }

    // Overriding make_sound() for Bird
    @Override
    public void make_sound() {
        System.out.println("Bird chirps.");
    }

    // Overriding walk() for Bird
    @Override
    public void walk() {
        System.out.println("Bird hops on 2 legs.");
    }

    // Bird-specific method to fly
    public void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

// Main class to demonstrate behavior
public class I1 {
    public static void main(String[] args) {
        // Creating objects for each class
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // Demonstrating behaviors
        dog.make_sound(); // Output: Dog barks.
        dog.walk();       // Output: Dog walks on 4 legs.

        cat.make_sound(); // Output: Cat meows.
        cat.walk();       // Output: Cat walks gracefully on 4 legs.

        bird.make_sound(); // Output: Bird chirps.
        bird.walk();       // Output: Bird hops on 2 legs.
        bird.fly();        // Output: Bird flies in the sky.
    }
}
