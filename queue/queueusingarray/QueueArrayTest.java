package queue.queueusingarray;

public class QueueArrayTest {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        queue.printQueue();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed element: " + queue.pop());
        System.out.println("Removed element: " + queue.pop());

        queue.push(40);
        queue.push(50);
        queue.push(60);

        System.out.println("Front element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.pop());
        }

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
