// Write a program to create a character array containing the contents of a string.

import java.util.Arrays;

public class _15CreateCharArray {
    public static void main(String[] args) {

        String str = "Ajinkya Pathare";
        char[] a = str.toCharArray();
        System.out.println(Arrays.toString(a));

    }
}