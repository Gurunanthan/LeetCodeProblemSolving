package LeetCode;

import java.util.Arrays;

public class LeetCode88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[pos--] = nums1[--m];
            } else {
                nums1[pos--] = nums2[--n];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (n > 0) {
            nums1[pos--] = nums2[--n];
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 0, 0, 0}; // Initialize with extra space
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 3, 4, 5, 6]
    }
}



// Explanation

// Initialization:

// pos: Initialize a variable pos to the last index of the merged array (nums1). pos is used to keep track of the current position where elements are being added.
// Merge Operation:

// Use a while loop with the condition (m > 0 && n > 0). This loop compares the elements from the end of both arrays (nums1 and nums2) and fills the nums1 array from the end.
// If the element at nums1[m - 1] is greater than the element at nums2[n - 1], assign nums1[--pos] = nums1[--m]. Decrease both pos and m.
// If the element at nums1[m - 1] is less than or equal to the element at nums2[n - 1], assign nums1[--pos] = nums2[--n]. Decrease both pos and n.
// Remaining Elements:

// After the first loop, there might be remaining elements in nums2. Use another while loop to copy the remaining elements from nums2 to nums1.




// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

// Constraints:

// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[j] <= 109
