// Build Array From Permutation     

// Example 1:

// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// Explanation: The array ans is built as follows: 
// ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//     = [0,1,2,4,5,3]
// Example 2:

// Input: nums = [5,0,1,2,3,4]
// Output: [4,5,0,1,2,3]
// Explanation: The array ans is built as follows:
// ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//     = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//     = [4,5,0,1,2,3]

import java.util.Arrays;
import java.util.Scanner;

public class _01BuildArrayFromPermutation {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements you want to enter : ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i=0; i<size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array without Permutation : " + Arrays.toString(nums));
        
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++) {
            arr[i] = nums[nums[i]];
        }

        System.out.println("Permutation Array : " + Arrays.toString(arr));

    }


}