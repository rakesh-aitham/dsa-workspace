package tree.binarytree.zig_zag_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static List<List<Integer>> zigZagTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer[] level = new Integer[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                int index = leftToRight ? i : size - 1 - i;
                level[index] = node.data;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            leftToRight = !leftToRight;

            result.add(Arrays.asList(level));
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(8);

        List<List<Integer>> ans = zigZagTraversal(root);
        System.out.println("Zig Zag Tree: \n" + ans);
    }
}
