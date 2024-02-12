package LeetCode;

// # easy

import java.util.HashMap;
import java.util.Map;

class LeetCode164_MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            int currentCount = map.getOrDefault(num, 0);
            map.put(num, currentCount + 1);

            // Update max if the current element has a count greater than the majority
            if (map.get(num) > majority) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LeetCode164_MajorityElement solution = new LeetCode164_MajorityElement();

        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Example 1 Output: " + solution.majorityElement(nums1));

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Example 2 Output: " + solution.majorityElement(nums2));
    }
}




// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109