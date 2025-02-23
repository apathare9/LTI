import java.util.Arrays;

public class Main {
    
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        
        for(int i=0; i<n-1; i++) {
            
            int mini = i;
            
            for(int j=i+1; j<n; j++) {
                if(arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            
            swap(arr, mini, i);
            
        }
        
        int largestElement = arr[n-1];
        
        System.out.println(Arrays.toString(arr));
        System.out.println(largestElement);
    }
}