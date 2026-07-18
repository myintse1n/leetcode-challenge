package algorithms;

import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

/*
*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*An input string is valid if:
*
*    Open brackets must be closed by the same type of brackets.
*    Open brackets must be closed in the correct order.
*    Every close bracket has a corresponding open bracket of the same type.
*/
public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!pairs.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != pairs.get(c))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
