import java.lang.StringBuilder;

public class Main {
    
    public static void main(String[] args) {
        
        String str = "ayknija";
        char[] arr = str.toCharArray();
        
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            
            s++;
            e--;
        }
        
        System.out.println(arr);
        
        

    }
    
}