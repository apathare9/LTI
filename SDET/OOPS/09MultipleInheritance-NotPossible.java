class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("World");
    }
}

class C extends A, B {
    
}


public class Main {
    
    public static void main(String[] args) {
        
        C obj = new C();
        obj.msg();
        
    }
    
}