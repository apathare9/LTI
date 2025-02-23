// ----- Heirarchal Level Inheritance -----

class Animal {
    void breathe() {
        System.out.println("Animal is Breathing");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Bird extends Animal {
    void chirp() {
        System.out.println("Bird is chirping");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        
        dog.breathe();
        dog.bark();
        
        cat.breathe();
        cat.meow();
        
        bird.breathe();
        bird.chirp();
        
    }
    
}