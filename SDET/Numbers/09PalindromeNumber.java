import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

       int n = 12321;
       
       int val = n;
       int reversedNumber = 0;
       
       while(val != 0) {
           int lastDigit = val % 10;
           reversedNumber = reversedNumber * 10 + lastDigit;
           val = val / 10;
       }
       
       System.out.println(reversedNumber);
       
       if (n == reversedNumber) {
           System.out.println("Palindrome");
       } else {
           System.out.println("Not a Palindrome");
       }
       
       

    }
    
}