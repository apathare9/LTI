import java.lang.StringBuilder;
import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        
       String str = "ayknijA erahtaP";
       
       String[] arr = str.split(" ");
       
       for(int i=0; i< arr.length; i++) {
           
            char[] ch = arr[i].toCharArray();
           
            for(int j=0; j < ch.length / 2; j++) {
               
                Swap(ch, j, ch.length - j - 1);
               
            }
           
           arr[i] = new String(ch);
           
       }
       
       System.out.println(Arrays.toString(arr));
       
        
    }
    
    static void Swap(char[] ch, int a, int b) {
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
    
}