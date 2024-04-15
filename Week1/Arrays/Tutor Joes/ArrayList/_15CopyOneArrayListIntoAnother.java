// Write a Java program to copy one array list into another

import java.util.ArrayList;
import java.util.Collections;

public class _15CopyOneArrayListIntoAnother {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");

        System.out.println("List 1 : " + arr1);

        ArrayList<String> arr2 = new ArrayList<String>();

        arr2.add("1");
        arr2.add("2");
        arr2.add("3");

        System.out.println("List 1 : " + arr2);

        System.out.println("After Copying list2 into list1");

        Collections.copy(arr1, arr2);

        System.out.println("List 1 : " + arr1);
        System.out.println("List 2 : " + arr2);



    }
}