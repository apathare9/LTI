import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

       int n = 153;
       int reversedNumber = 0;
       
       while(n != 0) {
           int lastDigit = n % 10;
           reversedNumber = lastDigit * lastDigit * lastDigit + reversedNumber;
           n = n / 10;
           
       }
       
       System.out.println(reversedNumber);

    }
    
}