import java.lang.StringBuilder;

public class Main {
    
    public static void main(String[] args) {
        
        String reversedName = "ayknija";
        
        StringBuilder str = new StringBuilder(reversedName);
        String name = str.reverse().toString();
        
        System.out.println(name);
        
        
       

    }
    
}