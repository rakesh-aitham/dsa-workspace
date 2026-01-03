package linkedlist.singlelinkedlist;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList {

    public Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            cnt++;
        }

        return cnt;
    }

    public boolean checkIfPresent(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public Node removesHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    public Node removesTail(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public Node removeK(Node head, int k) {
        if (head == null)
            return head;

        if (k == 1) {
            return head = head.next;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public Node removeElement(Node head, int el) {
        if (head == null)
            return head;

        if (head.data == el) {
            return head.next;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public Node insertHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    public Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }

    public Node insertPosition(Node head, int el, int k) {

        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }

        if (k == 1) {
            Node temp = new Node(el);
            temp.next = head;
            return temp;
        }

        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            // if cnt behind k
            if (cnt == k - 1) {
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    public Node insertBeforeValue(Node head, int el, int val) {

        if (head == null) {
            return null;
        }

        if (head.data == val) {
            Node newNode = new Node(el);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }

            temp = temp.next;
        }

        return head;
    }
}
