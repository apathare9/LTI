import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++) {
            
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                 System.out.println(i + " is odd.");
            }
            
        }
        
        System.out.println(n);
        
        
    }
    
}