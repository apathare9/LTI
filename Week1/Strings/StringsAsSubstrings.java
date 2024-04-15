import java.util.Arrays;
import java.util.HashSet;

public class StringsAsSubstrings {
    public static void main (String[] args) {
        String word = "abc";
        String[] patterns = {"a","abc","bc","d"};

        HashSet<String> sub = new HashSet<>();

        for (int i=0; i<word.length(); i++) {
            for (int j=i; j<word.length(); j++) {
                sub.add(word.substring(i,j+1));
            }
        }

        int ans = 0;

        for (int i=0; i<patterns.length; i++) {
            if(sub.contains(patterns[i])) {
                ans++;
            }
        }

        System.out.println(ans);

    }
}