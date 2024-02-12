package LeetCode;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class LeetCode21_MergeTwoSortedLists {
    /**
     * Merges two sorted linked lists into one sorted list.
     *
     * @param list1 The head of the first sorted linked list.
     * @param list2 The head of the second sorted linked list.
     * @return The head of the merged sorted linked list.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the code
        ListNode li = new ListNode(0);
        ListNode helper = li;

        // Loop until either list1 or list2 becomes null
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                helper.next = list1;
                list1 = list1.next;
            } else {
                helper.next = list2;
                list2 = list2.next;
            }
            helper = helper.next;
        }

        // Append remaining nodes if any
        if (list1 != null) {
            helper.next = list1;
        } else {
            helper.next = list2;
        }

        return li.next; // Skip the dummy node
    }

    public static void main(String[] args) {
        // Example 1:
        ListNode list1 = null;
        ListNode list2 = null;

        // Create list1: [1, 2, 4]
        for (int val : new int[]{1, 2, 4}) {
            if (list1 == null) {
                list1 = new ListNode(val);
            } else {
                ListNode current = list1;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(val);
            }
        }

        // Create list2: [1, 3, 4]
        for (int val : new int[]{1, 3, 4}) {
            if (list2 == null) {
                list2 = new ListNode(val);
            } else {
                ListNode current = list2;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(val);
            }
        }

        // Call the mergeTwoLists method to get the merged list
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}






// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

 

// Example 1:


// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both list1 and list2 are sorted in non-decreasing order.