//  Write a Java program to Searching for elements in an ArrayList

import java.util.ArrayList;
import java.util.List;

public class _24SearchingForElementsInArrayList {

    public static void main (String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

        System.out.println("Does Array Contain \"A\"? : " + arr.contains("A"));
        System.out.println("Does Array Contain \"D\"? : " + arr.contains("D"));
        System.out.println("Does Array Contain \"F\"? : " + arr.contains("F"));


    

    }

}