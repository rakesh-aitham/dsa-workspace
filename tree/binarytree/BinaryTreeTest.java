package tree.binarytree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);

        System.out.print("\nIs 30 found in tree? " + tree.search(30));

        tree.delete(20);
        System.out.println("\nTree after delete:");
        tree.inorder(tree.root);
    }
}
