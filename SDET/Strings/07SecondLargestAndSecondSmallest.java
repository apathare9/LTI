import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] arr = {4,2,3,1,0,6,12,15,20};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        Arrays.sort(arr);
        
        System.out.println("Second Smallest : " + arr[1]);
        System.out.println("Second Largest : " + arr[arr.length - 2]);
        
       
        // System.out.println(list);
        Collections.sort(list);
        
        System.out.println("Second Smallest : " + list.get(1));
        System.out.println("Second Largest : " + list.get( list.size() - 2 ));
        
        // System.out.println(list);
        
        
    }
    
}