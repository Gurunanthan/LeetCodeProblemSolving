package LeetCode;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LeetCode83_RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Duplicate found, remove the next node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Test Case 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);

        System.out.println("Test Case 1:");
        System.out.println("Original Linked List:");
        printList(head1);
        ListNode result1 = new LeetCode83_RemoveDuplicatesfromSortedList().deleteDuplicates(head1);
        System.out.println("Linked List after Removing Duplicates:");
        printList(result1);

        // Test Case 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(3);

        System.out.println("\nTest Case 2:");
        System.out.println("Original Linked List:");
        printList(head2);
        ListNode result2 = new LeetCode83_RemoveDuplicatesfromSortedList().deleteDuplicates(head2);
        System.out.println("Linked List after Removing Duplicates:");
        printList(result2);

        // Test Case 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(1);

        System.out.println("\nTest Case 3:");
        System.out.println("Original Linked List:");
        printList(head3);
        ListNode result3 = new LeetCode83_RemoveDuplicatesfromSortedList().deleteDuplicates(head3);
        System.out.println("Linked List after Removing Duplicates:");
        printList(result3);

        // Test Case 4
        ListNode head4 = new ListNode(1);

        System.out.println("\nTest Case 4:");
        System.out.println("Original Linked List:");
        printList(head4);
        ListNode result4 = new LeetCode83_RemoveDuplicatesfromSortedList().deleteDuplicates(head4);
        System.out.println("Linked List after Removing Duplicates:");
        printList(result4);

        // Test Case 5
        ListNode head5 = null;

        System.out.println("\nTest Case 5:");
        System.out.println("Original Linked List:");
        printList(head5);
        ListNode result5 = new LeetCode83_RemoveDuplicatesfromSortedList().deleteDuplicates(head5);
        System.out.println("Linked List after Removing Duplicates:");
        printList(result5);
    }
}

// Given the head of a sorted linked list, delete all duplicates such that each
// element appears only once. Return the linked list sorted as well.

// Example 1:

// [1] ----> [1] ----> [2]
// |
// V
// [1] ----> [2]

// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:
// [1] ----> [1] ----> [2] ----> [3] ----> [3]
// |
// V
// [1] ----> [2]

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.
