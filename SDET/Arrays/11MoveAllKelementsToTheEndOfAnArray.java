
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        int [] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        
        Scanner sc = new Scanner(System.in);
        // int k = sc.nextInt();
        int k = 0;
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        int counter = 0;
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] != k) {
                arr2.add(arr[i]); 
            } else {
                counter++;
            }
            
        }
        
        if(counter == 0) {
            System.out.println("No Such " + k + " is present in Array.");
        }else {
            
            for (int i=0; i<counter; i++) {
                arr2.add(k);
            }
            
        }
        
        
        
        System.out.println(arr2);
        
    }
    
}