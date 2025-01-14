package neetcode.practice.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Min Stack
 * <a href="https://neetcode.io/problems/minimum-stack">neetcode question link</a>
 */
public class MinStack {
    private final Deque<Integer> stack;
    private final Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int poppedValue = stack.pop();
        if (!minStack.isEmpty() && poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }

    public Integer top() {
        if (stack.isEmpty()) return null;
        return stack.peek();
    }

    public Integer getMin() {
        if (minStack.isEmpty()) return null;
        return minStack.peek();
    }
}
