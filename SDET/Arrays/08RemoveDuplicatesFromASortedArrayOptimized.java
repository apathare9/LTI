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
     
        int k = removeDuplicates(arr);
        System.out.println(k);
        
        for(int i=0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        System.out.println(Arrays.toString(arr));
       
      
  }
  
  static int removeDuplicates(int[] arr) {
      
      int i = 0;
      for(int j=1; j<arr.length; j++) {
          if(arr[i] != arr[j]) {
              i++;
              arr[i] = arr[j];
          }
      }
      
      return i + 1;
      
      
  }
  
}