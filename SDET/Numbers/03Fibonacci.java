import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int first = 0, second = 1, next;
        System.out.print("Fibonacci Series is : ");
        
        // Print first number separately
        System.out.print(first + " ");
        
        // Start loop from 1 instead of 0
        for(int i = 1; i <= n; i++) {
            System.out.print(second + " ");
            
            next = first + second;
            first = second;
            second = next;
        }
        
        sc.close(); // Close the scanner
    }
}