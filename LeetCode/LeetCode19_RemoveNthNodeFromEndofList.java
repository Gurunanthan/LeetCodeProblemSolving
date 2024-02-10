package LeetCode;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LeetCode19_RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next; 
            slow = slow.next;
        }

        // Remove the nth node from the end
        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        int n1 = 2;

        ListNode result1 = removeNthFromEnd(head1, n1);
        printList(result1);  // Modified list: [1, 2, 3, 5]

        // Example 2
        ListNode head2 = new ListNode(1);
        int n2 = 1;

        ListNode result2 = removeNthFromEnd(head2, n2);
        printList(result2);  // Modified list: []

        // Example 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        int n3 = 1;

        ListNode result3 = removeNthFromEnd(head3, n3);
        printList(result3);  // Modified list: [1]
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}





// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:

// 1 ---> 2 ---> 3 ---> 4 ---> 5

//            |
//            V

// 1 ---> 2 ---> 3 ----------> 5

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

//            1

//            |
//            V

//           null

// Input: head = [1], n = 1
// Output: []
// Example 3:

// 1 ---> 2 

//    |
//    V

//    1 

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz