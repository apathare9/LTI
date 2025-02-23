
interface Animal {
    
    void animalSound();
    void sleep();
}

class Dog implements Animal {
    
    public void animalSound() {
        System.out.println("Wooof!");
    }    
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    
}

class Cat implements Animal {
    
    public void animalSound() {
        System.out.println("Meow!");
    }    
    
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
    
    
}


public class Main {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.animalSound();
        dog.sleep();
        
        cat.animalSound();
        cat.sleep();
        
    }
    
}