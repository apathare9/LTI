// ----- Multi Level Inheritance -----

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

class BullDog extends Dog {
    void snore() {
        System.out.println("BullDog is snoring");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        BullDog bulldog = new BullDog();
        bulldog.breathe();
        bulldog.bark();
        bulldog.snore();
        
        
    }
    
}