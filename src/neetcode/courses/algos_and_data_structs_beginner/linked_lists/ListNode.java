package neetcode.courses.algos_and_data_structs_beginner.linked_lists;

/**
 * implementation of ListNode for a singly linked list
 */
public class ListNode {
    public Integer val;
    public ListNode next;

    public ListNode(Integer val) {
        this.val = val;
        this.next = null;
    }

    public Integer getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }
}
