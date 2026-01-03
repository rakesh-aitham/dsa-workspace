package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8 };
        LinkedList linkedList = new LinkedList();
        Node head = linkedList.convertArr2LL(arr);
        // System.out.println("\nLength of LL: " + lengthOfLL(head));
        // System.out.println("Check If present? " + checkIfPresent(head, 5));
        // head = linkedList.removesHead(head);
        // head = linkedList.removesTail(head);
        // head = linkedList.removeK(head, 3);
        // head = linkedList.removeElement(head, 5);
        // head = linkedList.insertHead(head, 10);
        // head = linkedList.insertTail(head, 1);
        // head = linkedList.insertPosition(head, 100, 5);
        head = linkedList.insertBeforeValue(head, 100, 8);
        linkedList.printLL(head);

    }
}
