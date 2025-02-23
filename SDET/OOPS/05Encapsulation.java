class Animal {
    
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}


public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.setName("Cat");
        System.out.println(animal.getName());
        
    }
    
}