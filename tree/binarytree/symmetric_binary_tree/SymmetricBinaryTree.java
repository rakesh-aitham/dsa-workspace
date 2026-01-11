package tree.binarytree.symmetric_binary_tree;

public class SymmetricBinaryTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return symmetricUtil(root.left, root.right);
    }

    public static boolean symmetricUtil(TreeNode node1, TreeNode node2) {

        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        return (node1.data == node2.data) && symmetricUtil(node1.left, node2.right)
                && symmetricUtil(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        if (isSymmetric(root)) {
            System.out.println("The tree is symmetrical");
        } else {
            System.out.println("The tree is NOT symmetrical");
        }
    }
}
