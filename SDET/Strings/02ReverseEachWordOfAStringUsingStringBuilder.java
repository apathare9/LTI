import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.StringBuilder;


public class Main {
    
    public static void main(String[] args) {
        
       String str = "ayknijA erahtaP";
       
       String[] arr = str.split(" ");
       
       StringBuilder stbldr;
       
       for(int i=0; i< arr.length; i++) {
           stbldr = new StringBuilder(arr[i]);
           
           arr[i] = stbldr.reverse().toString();
           
       }
       
       System.out.println(Arrays.toString(arr));
       
        

    }
    
}