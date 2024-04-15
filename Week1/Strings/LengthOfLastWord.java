import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World";

        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        
        System.out.println( arr[ arr.length-1 ].length() );
        


    }
}