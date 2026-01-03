package queue.queueusingarray;

public class QueueArray {
    private int[] queue;

    private int front;
    private int rear;
    private int currSize;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        currSize = 0;
    }

    public void push(int x) {
        if (currSize == capacity) {
            throw new RuntimeException("Queue Overflow");
        }

        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        queue[rear] = x;
        currSize++;
    }

    public int pop() {
        if (front == -1) {
            throw new RuntimeException("Queue Underflow");
        }

        int popped = queue[front];

        if (currSize == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        currSize--;
        return popped;
    }

    public int peek() {
        if (front == -1) {
            throw new RuntimeException("Queue is Empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return currSize == 0;
    }

    public void printQueue() {
        if (currSize == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int index = front;
        for (int i = 0; i < currSize; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }

        System.out.println();
    }
}
