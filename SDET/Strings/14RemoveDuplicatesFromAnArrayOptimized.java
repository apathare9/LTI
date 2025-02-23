import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        // Remove duplicates from an Array
        String[] str = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
        
        Set<String> set = new HashSet<>(Arrays.asList(str));
        
        System.out.println(set);
    }
    
}