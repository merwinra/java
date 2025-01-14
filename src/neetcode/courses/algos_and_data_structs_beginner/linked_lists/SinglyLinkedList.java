package neetcode.courses.algos_and_data_structs_beginner.linked_lists;

public class SinglyLinkedList {
    public ListNode head;
    public ListNode tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }

    public void insertIntoAnEmptyList(ListNode node) {
        head = tail = node;
    }

    public void insertAtStart(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            insertIntoAnEmptyList(node);
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            insertIntoAnEmptyList(node);
        }
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public ListNode getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public int getSize() {
        return size;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            ListNode prev = getNodeAtIndex(index - 1);
            ListNode toRemove = prev.next;

            prev.next = toRemove.next;

            if (toRemove == tail) {
                tail = prev;
            }
        }
        size--;
    }

    public void printList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
