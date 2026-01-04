package stack.minstack;

public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(2);

        System.out.println("Minimum value: " + minStack.getMin());
        minStack.pop();
        System.out.println("Top element: " + minStack.top());
        minStack.pop();
        System.out.println("Minimum value: " + minStack.getMin());
    }
}
