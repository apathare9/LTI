import java.util.Arrays;

public class Main {
    
    static void swap(int[] arr, int a, int b) {
        
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 10, 5, 20, 63, 12, 57, 88, 60 };
        
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                
                if(arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                
            }
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
     
}