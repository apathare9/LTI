import java.util.Map;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        
        String str = "Alice is girl and Bob is boy";
        
        Map<String, Integer> hm = new HashMap<>();
        
        String[] words = str.split(" ");
        
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