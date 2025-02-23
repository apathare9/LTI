// ----- Multiple Inheritance -> Not Possible -----

interface A {
    void msg();
}

interface B {
    void msg();
}

class C implements A, B {
    @Override
    public void msg() {
        System.out.println("Hello World");
    }
}


public class Main {
    
    public static void main(String[] args) {
        
        C obj = new C();
        obj.msg();
        
    }
    
}