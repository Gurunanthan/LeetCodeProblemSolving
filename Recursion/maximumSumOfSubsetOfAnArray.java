package Recursion;

import java.util.ArrayList;

public class maximumSumOfSubsetOfAnArray {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = { 1, 2, 3 };

        int result = generateCombinations(arr, 0, list, 0);
        System.out.println("Maximum Sum: " + result);
    }

    private static int generateCombinations(int[] arr, int start, ArrayList<Integer> list, int max) {
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            max = generateCombinations(arr, ++start, list, maxSum(list, max));
            list.remove(list.size() - 1);
        }
        return max;
    }

    public static int maxSum(ArrayList<Integer> list, int max) {
        int sum = 0;
        for (int val : list)
            sum += val;
        return Math.max(max, sum);
    }
}
