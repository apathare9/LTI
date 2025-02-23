import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        String str = "This is an example";
        
        Map<String, Integer> hm = new HashMap<>();
        
        String[] words = str.split("");
        
        for(String word : words) {
            
            if(hm.containsKey(word)) {
                hm.put(word, hm.get(word) + 1);
            } else {
                hm.put(word, 1);
            }
            
        }
        
        System.out.println(hm);
        
        
        
    }
    
}