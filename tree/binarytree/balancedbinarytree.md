# 🌳 Balanced Binary Tree

A **Balanced Binary Tree** is a binary tree in which, for **every node**, the height difference between the left and right subtrees is **at most 1**.

```text
abs (height(left subtree) - height(right subtree) ) ≤ 1
```

This condition must be true for all nodes in the tree.

### 🔹 Steps

1. If the current node is null, return true.
2. Find the height of the left subtree.
3. Find the height of the right subtree.
4. Check:
    - The absolute difference between left and right heights is ≤ 1
    - The left subtree is balanced
    - The right subtree is balanced
5. If all conditions are true → the tree is balanced.
6. Otherwise → the tree is not balanced.

### 🧪 Example

Balanced Tree:

        1
       / \
      2   3
     /
    4


Height difference at every node ≤ 1 → Balanced

Unbalanced Tree:

        1
       /
      2
     /
    3


Height difference > 1 → Not Balanced