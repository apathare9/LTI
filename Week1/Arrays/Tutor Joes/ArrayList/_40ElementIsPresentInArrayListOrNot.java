// Write a Java program to check whether the given element is present in an ArrayList or not

import java.util.ArrayList;

public class _40ElementIsPresentInArrayListOrNot {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10); 
		num.add(20); 
		num.add(30); 
		num.add(40); 
		num.add(50); 
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		num.add(100);  
		System.out.println("30 is Present in ArrayList ? "+num.contains(30));
		System.out.println("73 is Present in ArrayList ? "+num.contains(73));



    }
}