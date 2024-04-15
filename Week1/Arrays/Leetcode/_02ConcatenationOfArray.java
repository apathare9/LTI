// Example 1:
// 
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
// Example 2:
// 
// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class _02ConcatenationOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements : ");

        int size = sc.nextInt();
        // int[] nums = new int[size];

        // System.out.print("Enter elements : ");
        // for(int i=0; i<nums.length; i++) {
        //     nums[i] = sc.nextInt();
        // }

        // System.out.println("Original Array : " + Arrays.toString(nums));

        // int[] arr = new int[size * 2];

        // for (int i=0; i<size; i++) {
        //     arr[i] = nums[i];
        //     arr[i + size] = nums[i];
        // }

        // System.out.println("Concatenation Array : " + Arrays.toString(arr));

        System.out.println(" ********* Using ArrayList : - ********* ");

        ArrayList<Integer> numss = new ArrayList<Integer>(size);
        for(int i=0; i < size; i++){
            numss.add(sc.nextInt());
        }

        System.out.println("Original ArrayList : " +numss);

        ArrayList<Integer> arrr = new ArrayList<Integer>(numss);

        for(int i=0; i<numss.size(); i++) {
            arrr.add(numss.get(i));

        }

        System.out.println("Concatenated ArrayList : " +arrr);

        


    }
}