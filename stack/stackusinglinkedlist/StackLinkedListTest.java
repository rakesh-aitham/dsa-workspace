package stack.stackusinglinkedlist;

public class StackLinkedListTest {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(8);

        stack.printStack();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element: " + stack.top());

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Current stack size: " + stack.size());
    }
}
