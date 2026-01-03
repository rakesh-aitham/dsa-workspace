package queue.queueusinglinkedlist;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.push(2);
        queue.push(3);
        queue.push(5);
        queue.push(8);

        queue.printQueue();

        
        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed element: " + queue.pop());
        System.out.println("Removed element: " + queue.pop());

        queue.printQueue();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
