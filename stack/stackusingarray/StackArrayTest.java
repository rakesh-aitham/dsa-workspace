package stack.stackusingarray;

public class StackArrayTest {
    public static void main(String[] args) {
        StackArray stack = new StackArray(10);

        stack.push(3);
        stack.push(5);
        stack.push(2);

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Current stack size: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
