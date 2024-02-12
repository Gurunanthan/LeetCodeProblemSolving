package LeetCode;

import java.util.Arrays;

public class LeetCode66_PlusOne {

    public static void main(String[] args) {
        // Example 1
        int[] digits1 = { 1, 2, 3 };
        int[] result1 = plusOne(digits1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1));

        // Example 2
        int[] digits2 = { 4, 3, 2, 1 };
        int[] result2 = plusOne(digits2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2));

        // Example 3
        int[] digits3 = { 9 };
        int[] result3 = plusOne(digits3);
        System.out.println("Example 3 Output: " + Arrays.toString(result3));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] < 9) { // if the digit is less than 9 add 1 to it let say 123 the 3 is less than 9
                digits[i]++; // so add 1 and return now we get 124
                return digits;
            }
            digits[i] = 0;
        }

        // If we are here, it means there was a carry and a new digit is needed
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

// You are given a large integer represented as an integer array digits, where
// each digits[i] is the ith digit of the integer. The digits are ordered from
// most significant to least significant in left-to-right order. The large
// integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].
