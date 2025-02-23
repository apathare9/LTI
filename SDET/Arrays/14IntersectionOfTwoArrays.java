import java.util.Set;
import java.util.HashSet;

public class Main {
    
    static Set<Integer> intersection(int[] arr1, int[] arr2) {
        
        Set<Integer> set1 = new HashSet<>();
        
        Set<Integer> result = new HashSet<>();
        
        for(int num : arr1) {
            set1.add(num);
        }
        
        for(int num : arr2) {
            if(set1.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
        
        
    }
    
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,3,5};
        
        Set<Integer> ans = intersection(arr1, arr2);
        
        System.out.println(ans);
        
        
    }
    
}