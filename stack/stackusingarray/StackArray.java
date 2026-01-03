package stack.stackusingarray;

public class StackArray {

    private int[] stack;
    private int capacity;
    private int top;

    public StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public int top() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}