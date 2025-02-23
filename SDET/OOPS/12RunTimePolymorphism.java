// ----- Method Overriding/Runtime time polymorphism -----

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
} 

class AdvancedCalculator extends Calculator {
    
    public int add(int a, int b) {
        return a + b + 1;
    }
    
}


public class Main {
    
    public static void main(String[] args) {
        
        Calculator objCalculator = new Calculator();
        AdvancedCalculator objAdvancedCalculator = new AdvancedCalculator();
        int a = objCalculator.add(1,1);
        int b = objAdvancedCalculator.add(1,1);
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
}