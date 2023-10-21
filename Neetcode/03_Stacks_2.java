/**
 * Number: 20
 * Title: Valid Parenthesis.
 * Question: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 *
 * Test Case 1: "()[]{}"
 * Test Case 2: "()[]{}({)}{(){})[]{)([)])"
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (stack.isEmpty())
                return Boolean.FALSE;
            else {
                char popCh = stack.pop();
                if (ch == ')' && popCh != '(')
                    return Boolean.FALSE;
                if (ch == '}' && popCh != '{')
                    return Boolean.FALSE;
                if (ch == ']' && popCh != '[')
                    return Boolean.FALSE;
            }
        }
        return stack.isEmpty();
    }
}
