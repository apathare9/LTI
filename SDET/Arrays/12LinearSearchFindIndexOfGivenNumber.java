public class Main {
    
    static int findIndexOfGivenDigit(int[] arr, int num) {
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] == num) {
                return i;
            } 
            
        }
        
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int num = 3;
        
        int index = findIndexOfGivenDigit(arr, num);
        System.out.println(index);
    }
    
}