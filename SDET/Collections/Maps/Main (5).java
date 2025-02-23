import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
        
        Set<String> st = languages.values();
      
        
        
        
        
    }
    
    
}