import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int n = 12345;
        
        int sum = 0;
        
        while(n!=0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        
        System.out.println(sum);
       

    }
    
}