package competitive;

import java.util.Arrays;
import java.util.Stack;

public class Scratch {

    public static boolean isValid(String s) {
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


    public static void main(String[] args) {

        String s = "(){}[{]";
        System.out.println("Result = " + isValid(s));
    }

}
