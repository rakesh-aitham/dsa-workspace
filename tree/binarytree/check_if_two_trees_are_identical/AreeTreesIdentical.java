package tree.binarytree.check_if_two_trees_are_identical;

public class AreeTreesIdentical {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.data == node2.data) && isIdentical(node1.left, node2.left)
                && isIdentical(node1.right, node2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);

        if (isIdentical(root1, root2)) {
            System.out.println("The binary trees are identical");
        } else {
            System.out.println("The binary trees are not identical");
        }
    }
}
