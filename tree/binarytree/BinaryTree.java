package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    void delete(int key) {
        if (root == null) {
            return;
        }

        // If tree has only one node
        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
            }
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        if (keyNode != null) {
            int x = temp.data;
            deleteDeepest(root, temp);
            keyNode.data = x;
        }
    }

    void deleteDeepest(Node root, Node delNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    queue.add(temp.left);
                }
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    }

    boolean search(int key) {
        if (root == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.data == key) {
                return true;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return false;
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

}
