// Write a Java program to Find maximum element in ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class _21MaxElementInArray {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(17);
        num.add(4);
        num.add(9);
        num.add(45);


		// Object max = Collections.max(num);

        Integer max = Collections.max(num);
        System.out.println("Max Element From ArrayList is : " + max);

    }
}