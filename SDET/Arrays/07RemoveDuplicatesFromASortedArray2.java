import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

// ----- Q. Remove duplicates in place from Sorted Array...

public class Main {
  
  public static void main(String[] args) {
      
     
       
       int[] arr = {1,1,2,2,2,3,3,3,3};
       
       Set<Integer> hst = Arrays.stream(arr).boxed().collect(Collectors.toSet());
       
       System.out.println(hst);
       
       
      
  }
  
}