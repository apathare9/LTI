
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;

public class Main {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> languages = new HashMap<Integer, String>();
        
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        
        System.out.println("HashMap : " + languages); // HashMap : {1=Java, 2=Python, 3=JavaScript}
        
        System.out.print("Keys : ");
        for (Integer key : languages.keySet()) {
            System.out.print(key + " "); // Keys : 1 2 3 
        }
        
        System.out.println();
        
        System.out.print("Values : ");
        for (String value : languages.values()) {
            System.out.print(value + " "); // Values : Java Python JavaScript 
        }
        
        System.out.println();
        
        for(Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry + ", "); // 1=Java, 2=Python, 3=JavaScript, 
        }
        
        // ------------------
        
        System.out.println();
        System.out.print("Key Sets : ");
        
        Set<Integer> st = languages.keySet();
        for(Integer i : st) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.print("Values : ");
        
        Collection val = languages.values();
        for(Object v : val) {
            System.out.print(v + " ");
        }
        
         System.out.println();
        
        for(Entry<Integer, String> e : languages.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
      
        
        
        
        
    }
    
    
}