package LeetCode;

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

public class LeetCode100_SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Example 1 Output: " + isSameTree(p1, q1));
        System.out.print("Tree Values (Example 1): ");
        printTreeValues(p1);
        System.out.println();

        // Example 2
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Example 2 Output: " + isSameTree(p2, q2));
        System.out.print("Tree Values (Example 2): ");
        printTreeValues(p2);
        System.out.println();

        // Example 3
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println("Example 3 Output: " + isSameTree(p3, q3));
        System.out.print("Tree Values (Example 3): ");
        printTreeValues(p3);
        System.out.println();
    }

    public static void printTreeValues(TreeNode root) {
        if (root == null) {
            return;
        }
        printTreeValues(root.left);
        System.out.print(root.val + " ");
        printTreeValues(root.right);
    }
}




// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

// Example 1:

//                 [2]          [2]
//                /   \        /   \
//               /     \      /     \
//             [1]     [3]  [1]     [3]

// Input: p = [1,2,3], q = [1,2,3]
// Output: true
// Example 2:


// Input: p = [1,2], q = [1,null,2]
// Output: false
// Example 3:


// Input: p = [1,2,1], q = [1,1,2]
// Output: false
 

// Constraints:

// The number of nodes in both trees is in the range [0, 100].
// -104 <= Node.val <= 104