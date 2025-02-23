import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
  
    
    public static void main(String[] args) {
        
       String[] arr1 = {"Java", "JavaScript", "C", "C++"};
       String[] arr2 = {"Python", "C#", "Java", "C++"};
       
       List<String> l1 = new ArrayList<>(Arrays.asList(arr1));
       List<String> l2 = new ArrayList<>(Arrays.asList(arr2));
       
       l1.retainAll(l2);
       System.out.println("Common Elements : " + l1);
        
        
    }
    
}