// Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.Collections;

public class _17CloneArrayListToAnoterArrayList {
    public static void main (String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println("Given Array List : " + arr);

        ArrayList<String> arrclone = (ArrayList<String>) arr.clone();
        System.out.println("Cloned Array List : " + arrclone);       

    }
}