import java.util.Set;
import java.util.HashSet;

public class Main {
    
    static Set<String> commonElements(String[] arr1, String[] arr2) {
        
        Set<String> s1 = new HashSet<>();
        
        Set<String> s2 = new HashSet<>();
        
        for(String s : arr1) {
            s1.add(s);
        }
        
        for(String s : arr2) {
            if(s1.contains(s)) {
                s2.add(s);
            }
        }
        
        return s2;
        
        
    }
    
    public static void main(String[] args) {
        
       String[] arr1 = {"Java", "JavaScript", "C", "C++"};
       String[] arr2 = {"Python", "C#", "Java", "C++"};
       
       Set<String> ans = commonElements(arr1, arr2);
       
       System.out.println(ans);
        
        
    }
    
}