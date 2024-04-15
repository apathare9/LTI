import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main (String[] args) {
        String[] str = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(Arrays.toString(str));

        int size = str.length;
        if (size == 0) {
            System.out.println("");
        }
        if (size == 1) {
            System.out.println(str[0]);
        }

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int end = Math.min(str[0].length(), str[size - 1].length());
        int start = 0;
        
        int i = 0;
        while (end > start && str[0].charAt(i) == str[str.length - 1].charAt(i)) {
            i++;
        }

        System.out.println(str[0].substring(0,i));




    }
}