# 🌳 Height of a Binary Tree

The **height (or maximum depth)** of a binary tree is the number of nodes on the **longest path from the root to any leaf node**.

This program demonstrates **two ways** to find the height of a binary tree:

- Recursive method (Depth-First Search)
- Iterative method (Level-Order / Breadth-First Search)

---

## 📘 Definition

The height of a binary tree is defined as:

```text
Height = 1 + max(height of left subtree, height of right subtree)
```
If the tree is empty (root == null), the height is 0.

## Method 1: Recursive Approach (DFS)

This method calculates the height by recursively finding the height of the left and right subtrees and returning the greater one.

### 🔹 Steps
1. If the current node is null, return 0.
2. Recursively find the height of the left subtree.
3. Recursively find the height of the right subtree.

Return:
```text
1 + max(leftHeight, rightHeight)
```

> Each recursive call computes the height of a subtree. The longest path from the root to a leaf node determines the final height.

## Method 2: Iterative Approach (Level Order Traversal)

This method uses a queue to traverse the tree level by level and counts how many levels exist.

### 🔹 Steps
1. If the tree is empty, return 0.
2. Add the root node to a queue.
3. Initialize a variable level = 0.
4. While the queue is not empty:
    - Store the number of nodes at the current level.
    - Process all those nodes:
        - Remove each node from the queue.
        - Add its left and right children if they exist.
    - After processing one full level, increment level.
5. When the loop ends, level represents the height of the tree.

> Each iteration of the loop corresponds to one level in the tree.

### 🧪 Example

For the following tree:

        1
       / \
      2   3
     / \
    4   5

The height of the tree is: 3