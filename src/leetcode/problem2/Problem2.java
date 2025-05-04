package leetcode.problem2;

import java.util.Stack;

/**
 * Add Two Numbers
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">leetcode question link</a>
 */
public final class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final int num1 = getReversedIntegerFromLinkedListHead(l1);
        final int num2 = getReversedIntegerFromLinkedListHead(l2);
        final int sum = num1 + num2;
        return getReversedLinkedListHeadFromInteger(sum);
    }

    public ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {
        final ListNode headNode = new ListNode(-1);
        ListNode currentNode = headNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }

        return headNode.next;
    }

    private int getReversedIntegerFromLinkedListHead(final ListNode listNode) {
        final Stack<Integer> buffer = new Stack<>();
        int num = 0;
        ListNode currentNode = listNode;

        while(currentNode != null) {
            buffer.push(currentNode.val);
            currentNode = currentNode.next;
        }

        while(!buffer.isEmpty()) {
            num = num * 10 + buffer.pop();
        }

        return num;
    }

    private ListNode getReversedLinkedListHeadFromInteger(int sum) {
        if (sum == 0) return new ListNode(0);

        final ListNode headerNode = new ListNode(-1);
        ListNode currentNode = headerNode;

        while (sum > 0) {
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            sum = sum / 10;
        }

        return headerNode.next;
    }
}
