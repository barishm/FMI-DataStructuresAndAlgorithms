package easy;

import java.util.Stack;

public class p20_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(([]){})"));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }
        return stack.isEmpty();
    }
}
