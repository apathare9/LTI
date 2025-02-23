// Constructor

class Student {
    
    String name;
    String college;
    
    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }
    
    
}

public class Main {
    
    public static void main(String[] args) {
        
        Student obj1 = new Student("Ajinkya", "College");
        
        System.out.println(obj1.name);
        System.out.println(obj1.college);
    }
    
}