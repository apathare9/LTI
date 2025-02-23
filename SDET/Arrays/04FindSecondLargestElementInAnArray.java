import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

// ----- Q: Find second largest element in an Array.

public class Main {
  
  public static void main(String[] args) {
      
       Integer[] arr = {1,2,4,7,7,5};
       
       int largest = arr[0];
       
       for(int i=0; i<arr.length; i++) {
           if(arr[i] > largest) {
               largest = arr[i];
           }
       }
       
       System.out.println(largest);
       
       int slargest = -1;
       for(int i=0; i<arr.length; i++) {
           
           if(arr[i] > slargest && arr[i] != largest) {
               slargest = arr[i];
           }
           
       }
       
       System.out.println(slargest);
       
    
      
  }
  
}