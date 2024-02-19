package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode203_RemoveLinkedListElements {

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2,
                new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        int valToRemove = 6;

        System.out.println("Original List:");
        printLinkedList(head);


        ListNode result = removeElements(head, valToRemove);

        System.out.println("\nList after removing elements with value " + valToRemove + ":");
        printLinkedList(result);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
