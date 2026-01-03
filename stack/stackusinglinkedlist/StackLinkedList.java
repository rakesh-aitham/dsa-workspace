package stack.stackusinglinkedlist;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        next = null;
    }
}

public class StackLinkedList {
    private Node top;
    private int size;

    public StackLinkedList() {
        top = null;
        size = 0;
    }

    public void push(int x) {
        Node el = new Node(x);

        el.next = top;
        top = el;

        size++;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        Node temp = top;
        top = top.next;
        temp = null;

        size--;

        return value;
    }

    public int top() {
        if (top == null) {
            return -1;
        }

        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void printStack() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}
