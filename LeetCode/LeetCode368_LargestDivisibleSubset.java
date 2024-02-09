package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode368_LargestDivisibleSubset {
    private static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // Sort the array in ascending order
        Arrays.sort(nums);

        // dp[i] represents the size of the largest divisible subset ending at nums[i]
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxSize = 1;
        int maxIndex = 0;

        // Dynamic Programming
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;

                    // Update the maximum size and index
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        // Reconstruct the largest divisible subset
        List<Integer> result = new ArrayList<>();
        int currentSize = maxSize;
        int currentElement = nums[maxIndex];

        for (int i = maxIndex; i >= 0; i--) {
            if (currentSize > 0 && currentElement % nums[i] == 0 && dp[i] == currentSize) {
                result.add(nums[i]);
                currentElement = nums[i];
                currentSize--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8, 12};
        List<Integer> result = largestDivisibleSubset(nums);

        System.out.println("Largest Divisible Subset: " + result);
    }
}
