import java.util.HashSet;
import java.util.Arrays;

public class ReverseWordsInString {
    public static void main (String[] args) {
        String s = "Let's take LeetCode contest";
        
        // tsetnoc edoCteeL ekat s'teL ----- For this output!
        StringBuilder rev = new StringBuilder(s);
        System.out.println(rev.toString());

        rev = rev.reverse();
        System.out.println(rev.toString());

        // s'teL ekat edoCteeL tsetnoc ----- For this output!
        String ss = "Let's take LeetCode contest";
        String[] arr = ss.split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }

        String ans = String.join(" ", arr);
        System.out.println(ans);


    }
}