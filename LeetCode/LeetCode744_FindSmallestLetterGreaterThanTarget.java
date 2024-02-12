package LeetCode;

public class LeetCode744_FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        if (left >= n)
            return letters[0];
        return letters[left];
    }

    public static void main(String[] args) {

        // Test case 1
        char[] letters1 = { 'c', 'f', 'j' };
        char target1 = 'a';
        char result1 = nextGreatestLetter(letters1, target1);
        System.out.println("Test Case 1: " + result1); // Output should be 'c'

        // Test case 2
        char[] letters2 = { 'c', 'f', 'j' };
        char target2 = 'c';
        char result2 = nextGreatestLetter(letters2, target2);
        System.out.println("Test Case 2: " + result2); // Output should be 'f'

        // Test case 3
        char[] letters3 = { 'c', 'f', 'j' };
        char target3 = 'k';
        char result3 = nextGreatestLetter(letters3, target3);
        System.out.println("Test Case 3: " + result3); // Output should be 'c'

        // Add more test cases as needed
    }
}

// You are given an array of characters letters that is sorted in non-decreasing
// order, and a character target. There are at least two different characters in
// letters.

// Return the smallest character in letters that is lexicographically greater
// than target. If such a character does not exist, return the first character
// in letters.

// Example 1:

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than
// 'a' in letters is 'c'.
// Example 2:

// Input: letters = ["c","f","j"], target = "c"
// Output: "f"
// Explanation: The smallest character that is lexicographically greater than
// 'c' in letters is 'f'.
// Example 3:

// Input: letters = ["x","x","y","y"], target = "z"
// Output: "x"
// Explanation: There are no characters in letters that is lexicographically
// greater than 'z' so we return letters[0].

// Constraints:

// 2 <= letters.length <= 104
// letters[i] is a lowercase English letter.
// letters is sorted in non-decreasing order.
// letters contains at least two different characters.
// target is a lowercase English letter.