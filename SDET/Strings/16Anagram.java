import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        String str1 = "Army";
        String str2 = "Mary";
        
        if(str1.length() == str2.length()) {
            
            char[] s1 = str1.toLowerCase().toCharArray();
            char[] s2 = str2.toLowerCase().toCharArray();
        
            Arrays.sort(s1);
            Arrays.sort(s2);
            
            System.out.println(s1);
            System.out.println(s2);
            
            boolean result = Arrays.equals(s1, s2);
            if(result == true) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not a Anagram");
            }
            
            
        } else {
            System.out.println("Not a Anagram");
        }
        
        
        
        
        
        
    }
    
}