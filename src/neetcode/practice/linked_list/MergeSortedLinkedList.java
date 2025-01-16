package neetcode.practice.linked_list;

public class MergeSortedLinkedList {
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                node.next = head1;
                head1 = head1.next;
            } else {
                node.next = head2;
                head2 = head2.next;
            }
            node = node.next;
        }

        if (head1 != null) {
            node.next = head1;
        } else {
            node.next = head2;
        }

        return dummy.next;
    }
}
