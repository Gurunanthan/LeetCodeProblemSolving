package LeetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeetCode94_BinaryTreeInorderTraversal {
    List<Integer> li = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return li;
        }
        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);
        return li;
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        LeetCode94_BinaryTreeInorderTraversal solution = new LeetCode94_BinaryTreeInorderTraversal();
        List<Integer> result1 = solution.inorderTraversal(root1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        TreeNode root2 = null;
        List<Integer> result2 = solution.inorderTraversal(root2);
        System.out.println("Example 2 Output: " + result2);

        // Example 3
        TreeNode root3 = new TreeNode(1);
        List<Integer> result3 = solution.inorderTraversal(root3);
        System.out.println("Example 3 Output: " + result3);
    }
}





// Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

// Example 1:

//              [1]
//                 \
//                  [2]
//                 /
//              [3]



// Input: root = [1,null,2,3]
// Output: [1,3,2]
// Example 2:

// Input: root = []
// Output: []
// Example 3:

// Input: root = [1]
// Output: [1]
 

// Constraints:

// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100

