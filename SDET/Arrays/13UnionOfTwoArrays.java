import java.util.Set;
import java.util.HashSet;

public class Main {
    
    static Set<Integer> union(int[] arr1, int[] arr2) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr1) {
            
            set.add(num);
            
        }
        
        for(int num : arr2) {
            
            set.add(num);
            
        }
        
        return set;
        
    }
    
    public static void main(String[] args) {
        
    
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,3,5};
        
        Set<Integer> val = union(arr1, arr2);
        
        Integer[] finalVal = new ArrayList<>();
        finalVal.addAll(val);
        
        System.out.println(val);
        System.out.println(finalVal);
        
        
    }
}