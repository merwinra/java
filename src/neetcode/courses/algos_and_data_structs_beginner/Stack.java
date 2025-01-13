package neetcode.courses.algos_and_data_structs_beginner;

import java.util.ArrayList;

public class Stack {
    private final ArrayList<Integer> stack = new ArrayList<Integer>();

    public Stack() {}

    private int size() {
        return stack.size();
    }

    public void push(int num) {
        stack.add(num);
    }

    public Integer pop() {
        if (size() > 0) {
            return stack.removeLast(); // or stack.remove(stack.size() - 1)
        }
        return null;
    }

    public Integer peek() {
        if (this.size() > 0) {
            return stack.get(this.size());
        }
        return null;
    }
}
