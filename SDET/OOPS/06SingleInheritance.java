// ----- Inheritance -----

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

public class Main {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.breathe();
        dog.bark();
        
        
    }
    
}