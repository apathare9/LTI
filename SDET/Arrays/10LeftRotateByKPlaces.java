import java.util.Arrays;

public class Main {
    
    static void leftRotate(int[] arr, int n, int k) {
        
        if(n == 0) {
            return;
        }
        
        k = k % n;
        
        System.out.println(k);
        
        int[] temp = new int[k];
        
        for(int i=0; i<k; i++) {
            temp[i] = arr[i];
        }
        
        System.out.println("Temp : " + Arrays.toString(temp));
        
       for(int i=0; i<n-k; i++) {
           arr[i] = arr[i+k];
       }
       System.out.println("After adding first 2 : " + Arrays.toString(arr));
       
       
        // System.out.println(arr[n-k]);
        
        for(int i=0; i<k; i++) {
            arr[n-k+i] = temp[i];
        }
        
        
        // for(int i=n-k; i<n; i++) {
        //     int c = 0;
        //     arr[i] = temp[c];
        //     c++;
        // }
        
        System.out.println("Final : " + Arrays.toString(arr));
        
        
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        
        leftRotate(arr, n, k);
        // System.out.println("Final Array : " + Arrays.toString(arr));
        
        
        
        
    }
    
}