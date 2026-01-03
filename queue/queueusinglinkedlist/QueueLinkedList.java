package queue.queueusinglinkedlist;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        next = null;
    }
}

public class QueueLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    public void push(int x) {
        Node el = new Node(x);

        if (front == null) {
            front = rear = el;
        } else {
            rear.next = el;
            rear = el;
        }

        size++;
    }

    public int pop() {
        if (front == null) {
            return -1;
        }

        int value = front.data;
        Node temp = front;
        front = front.next;
        temp = null;
        size--;

        return value;
    }

    public int peek() {
        if (front == null) {
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
