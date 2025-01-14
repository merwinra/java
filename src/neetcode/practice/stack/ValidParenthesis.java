package neetcode.practice.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Valid Parenthesis
 * <a href="https://neetcode.io/problems/validate-parentheses">neetcode question link</a>
 */
public class ValidParenthesis {
    public static boolean isValidParenthesis(String string) {
        Deque<Character> stack = new ArrayDeque<Character>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c: string.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                }
                else return false;
            }
            else stack.push(c);
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string = "({[]})";
        System.out.println(isValidParenthesis(string));
    }
}
