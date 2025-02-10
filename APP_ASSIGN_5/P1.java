abstract class Animal {
    // Abstract method to make a sound
    abstract void makeSound();
}

class Mammal extends Animal {
    private String name;

    // Constructor
    Mammal(String name) {
        this.name = name;
    }

    // Implement the makeSound method for Mammal
    @Override
    void makeSound() {
        System.out.println(name + " says: Roar!");
    }
}

class Bird extends Animal {
    private String name;

    // Constructor
    Bird(String name) {
        this.name = name;
    }

    // Implement the makeSound method for Bird
    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

class Fish extends Animal {
    private String name;

    // Constructor
    Fish(String name) {
        this.name = name;
    }

    // Implement the makeSound method for Fish
    @Override
    void makeSound() {
        System.out.println(name + " says: Blub blub!");
    }
}

public class P1 {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        
        // Populate the array with different types of animals
        animals[0] = new Mammal("Lion");
        animals[1] = new Bird("Parrot");
        animals[2] = new Fish("Goldfish");

        // Iterate through the array and call the makeSound() method for each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
