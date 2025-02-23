import java.util.Arrays;

// Selection Sort - TC O(N^2), SC )(1)
public class Main {
    
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main (String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        
        for (int i=0; i<n-1; i++) {
            int mini = i;
            for(int j=i+1; j<n; j++) {
             
                if (arr[j] < arr[mini]) {
                    mini = j;
                    
                }
                
            }
            
            swap(arr, i, mini);
            
        }
        
        System.out.println(Arrays.toString(arr));
        
        
        
        
    }
    
}