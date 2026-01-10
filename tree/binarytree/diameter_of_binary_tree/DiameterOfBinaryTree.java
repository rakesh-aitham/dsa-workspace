package tree.binarytree.diameter_of_binary_tree;

public class DiameterOfBinaryTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        diameter[0] = 0;
        height(root, diameter);
        return diameter[0];
    }

    public static int height(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left, diameter);
        int rightHeight = height(node.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);

        int diameter = diameterOfBinaryTree(root);
        System.out.println("The diameter of a binary tree is: " + diameter);
    }
}
