package LeetCode;

public class LeetCode110_BalancedBinaryTree {
    private static boolean isTrue = true;

    public static void main(String[] args) {
        // Create a sample binary tree
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Test the isBalanced method
        boolean isTreeBalanced = isBalanced(root);

        // Print the result
        System.out.println("Is the tree balanced? " + isTreeBalanced);
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }
        height(root);
        return isTrue;
    }

    // Helper method to calculate the height of the subtree and check balance
    private static int height(TreeNode root) {
        if (root == null) {
            return 0; // Height of an empty subtree is 0
        }

        // Recursively calculate the height of the left and right subtrees
        int left = height(root.left);
        int right = height(root.right);

        // Check the balance condition at the current node
        if (Math.abs(left - right) > 1) {
            isTrue = false; // If the balance condition is violated, set isTrue to false
        }

        // Return the height of the current subtree (maximum of left and right heights) + 1
        return Math.max(left, right) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}




// Given a binary tree, determine if it is 
// height-balanced
// .

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true
 

// Constraints:

// The number of nodes in the tree is in the range [0, 5000].
// -104 <= Node.val <= 104