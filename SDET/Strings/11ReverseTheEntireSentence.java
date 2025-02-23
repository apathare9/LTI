import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        String str = "Madrid Real is club football favourite My";
        
        String[] words = str.split(" ");
        
        String val = "";
        
        System.out.println(Arrays.toString(words));
        
        
        for(int i= words.length - 1; i>=0; i--) {
            val = val + words[i] + " ";
        }
        
        System.out.println(val);
        
        
    }
    
}