import java.util.Arrays;

// ----- Q: Find largest element in an Array.

public class Main {
  
  public static void main(String[] args) {
      
       int[] arr = {13, 46, 24, 52, 20, 9};
       
       int largest = arr[0];
       
       for(int i=0; i<arr.length - 1; i++) {
           
           if (arr[i] < arr[i+1]) {
               largest = arr[i+1];
           }
           
       }
       
       System.out.println(largest);
      
  }
  
}