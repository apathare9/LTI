import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    
    // Reverse each word in an sentence.
    public static void main(String[] args) {
        
        String str ="reverse each word in a string";
        
        String[] words =str.split(" ");
        
        
        
        System.out.println(Arrays.toString(words));
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<words.length; i++) {
            
            String word = words[i];
            
            String revWord = "";
            String[] letters = word.split("");
            
            for(int j = letters.length - 1; j>=0; j--) {
                revWord = revWord + letters[j] + "";
                
            }
            
            arr.add(revWord);
            

        }
        
        System.out.println(arr);
        
    }
    
}