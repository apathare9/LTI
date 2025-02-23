import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        String[] arr1 = {"4","2","3","1","6"};
        
        List<Integer> list = new ArrayList<>();
        
        for(String s : arr1) {
            list.add( Integer.parseInt(s) );
        }
        
        System.out.println(list);
        
        System.out.println("First Digit : " + list.get(0));
        System.out.println("Last Digit : " + list.get(list.size() - 1));
        
        
        
    }
    
}