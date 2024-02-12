package LeetCode;
// # easy
public class LeetCode58_LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
    
        // Start from the end of the string
        int index = s.length() - 1;
    
        // Skip trailing spaces
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
    
        // Count the characters of the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
    
        return length;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "Hello World";
        System.out.println("Example 1 Output: " + lengthOfLastWord(s1));

        // Example 2
        String s2 = "   Hello World   ";
        System.out.println("Example 2 Output: " + lengthOfLastWord(s2));

        // Example 3
        String s3 = "   ";
        System.out.println("Example 3 Output: " + lengthOfLastWord(s3));
    }

}




// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.