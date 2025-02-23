import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

       int n = 12345;
       
       int counter = 0;
       
       while (n != 0) {
           n = n / 10;
           counter++;
       }
       
       System.out.println(counter);
       

    }
    
}