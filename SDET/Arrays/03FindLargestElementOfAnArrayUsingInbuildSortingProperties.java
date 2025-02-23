import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// ----- Q: Find largest element in an Array.

public class Main {
  
  public static void main(String[] args) {
      
       Integer[] arr = {13, 46, 24, 52, 20, 9};
       
       // using array list
       List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
       
       Collections.sort(arrList);
       
       System.out.println(arrList);
       int ld = arrList.size() - 1;
       
       System.out.println(arrList.get(ld));
       
       // using Arrays
       Arrays.sort(arr);
       int ldArr = arr.length - 1;
       System.out.println(arr[ldArr]);
      
  }
  
}