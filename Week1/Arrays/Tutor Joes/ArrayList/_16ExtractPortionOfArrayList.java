// Write a Java program to extract a portion of a array list    

import java.util.ArrayList;
import java.util.Collections;

public class _16ExtractPortionOfArrayList {
    public static void main (String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");

        System.out.println("Given List : " + arr);

        System.out.println("First 3 Elements : " + arr.subList(0,3));
        








    }
}