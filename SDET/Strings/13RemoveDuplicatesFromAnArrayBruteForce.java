import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        
        
        String[] str = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
        
        List<String> arr = new ArrayList<>();
        
        
        for(int i=0; i<str.length - 1; i++) {
            
            for(int j=i+1; j<str.length; j++) {
                
                if(str[i] == str[j]) {
                    arr.add(str[i]);
                }
                
            }
            
        }
     
        System.out.println(arr);
        
    }
    
}