package stack.postfixtoinfix;

import java.util.Stack;

public class PostfixToInfix {
    public static void postfixToInfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push("(" + top2 + c + top1 + ")");
            }
        }
        System.out.println("Infix expression: " + stack.peek());
    }
}

class PostfixToInfixTest {
    public static void main(String[] args) {
        String exp = "pq+mn-*";
        System.out.println("Postfix expression: " + exp);
        PostfixToInfix.postfixToInfix(exp);
    }
}
