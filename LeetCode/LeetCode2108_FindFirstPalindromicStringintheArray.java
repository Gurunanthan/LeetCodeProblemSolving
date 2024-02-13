package LeetCode;

public class LeetCode2108_FindFirstPalindromicStringintheArray {

    public static void main(String[] args) {
        String[] words1 = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindromicString(words1)); // Output: "ada"

        String[] words2 = {"notapalindrome", "racecar"};
        System.out.println(firstPalindromicString(words2)); // Output: "racecar"

        String[] words3 = {"def", "ghi"};
        System.out.println(firstPalindromicString(words3)); // Output: ""
    }

    public static String firstPalindromicString(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.

 

// Example 1:

// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// Example 2:

// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".
// Example 3:

// Input: words = ["def","ghi"]
// Output: ""
// Explanation: There are no palindromic strings, so the empty string is returned.
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists only of lowercase English letters.