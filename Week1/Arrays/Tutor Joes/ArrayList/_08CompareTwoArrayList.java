// Write a Java program to compare two array lists

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class _08CompareTwoArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("C");
        arr2.add("D");
        arr2.add("E");

        System.out.println("String 1 :" + arr1);
        System.out.println("String 2 :" + arr2);

        ArrayList<String> arr3 = new ArrayList<>();
        for (int i=0; i<arr1.size(); i++){
            String element = arr1.get(i);
            arr3.add(arr2.contains(element)? "True" : "False");
        }     

        System.out.println("Compare String 1 & 2 :" + arr3);




    }
}