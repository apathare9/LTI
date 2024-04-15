import java.util.Arrays;

public class StringHalvesAlike {
    public static void main(String[] args) {

        String s = "textbook";
        String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2);

        System.out.println(first);
        System.out.println(second);

        int count1 = 0;
        int count2 = 0;

        first = first.toLowerCase();
        second = second.toLowerCase();

        for (int i=0; i<first.length(); i++) {
            if (first.charAt(i) == 'a' || first.charAt(i) == 'e' || first.charAt(i) == 'i'|| first.charAt(i) == 'i' || first.charAt(i) == 'u') {
                count1++;
            }
        }

        for (int i=0; i<second.length(); i++) {
            if (second.charAt(i) == 'a' || second.charAt(i) == 'e' || second.charAt(i) == 'i' || second.charAt(i) == 'o' || second.charAt(i) == 'u') {
                count2++;
            }
        }

        if (count1 == count2) {
            System.out.println("True");
        } 
        else {
            System.out.println("False");
        }
    }

}