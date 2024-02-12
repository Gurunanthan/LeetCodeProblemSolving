package LeetCode;
//#Easy
public class LeetCode1550_ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 1 && (arr[i + 2] & 1) == 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {2, 6, 1, 8, 4, 5};
        System.out.println("Example 1 Output: " + threeConsecutiveOdds(arr1));

        // Example 2
        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println("Example 2 Output: " + threeConsecutiveOdds(arr2));

        // Example 3
        int[] arr3 = {1, 2, 4, 6, 8, 10};
        System.out.println("Example 3 Output: " + threeConsecutiveOdds(arr3));
    }

}


// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 

// Example 1:

// Input: arr = [2,6,4,1]
// Output: false
// Explanation: There are no three consecutive odds.
// Example 2:

// Input: arr = [1,2,34,3,4,5,7,23,12]
// Output: true
// Explanation: [5,7,23] are three consecutive odds.
 

// Constraints:

// 1 <= arr.length <= 1000
// 1 <= arr[i] <= 1000
