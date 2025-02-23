import java.util.Arrays;

public class Main {
    
    // Helper function to swap elements
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        
        for (int i = n-1; i >= 0; i--) {
            boolean swapped = false;  // Changed to boolean
            
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);  // Using helper function
                    swapped = true;
                }
            }
            
            if(swapped = false) {  // Check outside inner loop
                break;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}