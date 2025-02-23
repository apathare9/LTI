class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        Calculator objCalculator = new Calculator();
        int a = objCalculator.add(1,1);
        int b = objCalculator.add(1,1,1);
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
}