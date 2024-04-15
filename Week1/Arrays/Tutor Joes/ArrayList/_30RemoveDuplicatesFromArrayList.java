//  Write a Java program to Remove Duplicates from ArrayList

import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Set;

public class _30RemoveDuplicatesFromArrayList {
    public static void main (String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(4);
        num.add(5);
        num.add(5);
        num.add(6);
        num.add(6);

        System.out.println("Before Removing Duplicates : " + num);

        Set<Integer> withoutDuplicates = new LinkedHashSet<Integer>(num);
        num.clear();
        num.addAll(withoutDuplicates);

        System.out.println("After Removing Duplicates : " + num);

    }

    
}