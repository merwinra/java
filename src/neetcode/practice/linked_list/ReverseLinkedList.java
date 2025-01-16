package neetcode.practice.linked_list;

public class ReverseLinkedList {
    public static ListNode reverseLinkedListRecursively(ListNode head) {
        if (head == null) { return null; }

        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseLinkedListRecursively(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }

    public static ListNode reverseLinkedListIteratively(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
