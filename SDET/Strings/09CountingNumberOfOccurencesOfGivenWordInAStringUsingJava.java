import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        String string = "Java is a programming language. Java is widely used in software testing";
        
        String[] words = string.toLowerCase().split(" ");
        
        String word = "java";
        
        System.out.println(Arrays.toString(words));
        
        int count = 0;
        for(int i=0; i<words.length; i++) {
            if(words[i].equals(word)) {
                count++;
            }
        }
        
        System.out.println("Count of " + word + " : " + count);
        
    }
    
}