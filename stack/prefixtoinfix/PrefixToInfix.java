package stack.prefixtoinfix;

import java.util.Stack;

public class PrefixToInfix {
    public static void prefixToInfix(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push("(" + top1 + c + top2 + ")");
            }
        }

        System.out.println("Infix expression: " + stack.peek());
    }
}

class PrefixToInfixTest {
    public static void main(String[] args) {
        String exp = "*+pq-mn";
        System.out.println("Prefix expression: " + exp);
        PrefixToInfix.prefixToInfix(exp);
    }
}