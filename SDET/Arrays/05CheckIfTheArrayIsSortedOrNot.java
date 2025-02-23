import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

// ----- Q: Find second largest element in an Array.

public class Main {
  
  public static void main(String[] args) {
      
       int[] arr = {1,2,1,3,4};
       int[] arr2 = {1,2,3,4,5};
       
       boolean b = true;
       for(int i=1; i<arr2.length; i++) {
           
           if(arr2[i] >= arr2[i-1]) {
                
           } else {
               b = false;
           }
           
       }
       
       System.out.println(b);
       
      if (b == true) {
          System.out.println("Sorted");
      } else {
          System.out.println("Not Sorted");
      }
       
       
       
    
      
  }
  
}