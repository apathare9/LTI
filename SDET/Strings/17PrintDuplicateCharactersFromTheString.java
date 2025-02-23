import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        String str = "apple is fruit";
        
        char[] arr = str.toLowerCase().toCharArray();
        
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
                
            }
        }
        
        
        
        
        
    }
    
}