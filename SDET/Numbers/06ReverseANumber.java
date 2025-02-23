import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int n = 54321;
        
        int reversedNumber = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
        }
        
        System.out.println(reversedNumber);
        
        

    }
    
}