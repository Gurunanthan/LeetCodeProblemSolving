package LeetCode;

public class LeetCode74_Searcha2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Example usage:
        int[][] matrix = {
                {1,   4,  7, 11},
                {2,   5,  8, 12},
                {3,   6,  9, 16},
                {10, 13, 14, 17}
        };

        int target1 = 5;
        int target2 = 20;

        boolean result1 = searchMatrix(matrix, target1);
        boolean result2 = searchMatrix(matrix, target2);

        System.out.println("Result for target1: " + result1); // Output: true
        System.out.println("Result for target2: " + result2); // Output: false

    }
}




// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 100
// -104 <= matrix[i][j], target <= 104
