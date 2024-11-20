package NOV_24.ex_12Nov_Abstraction;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Subclass (inherited from Animal)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Use the abstract class
class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof
        dog.sleep();     // Output: Zzz...

        cat.makeSound(); // Output: Meow
        cat.sleep();     // Output: Zzz...
    }
}

