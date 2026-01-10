# 🌳 Diameter of a Binary Tree

The **diameter of a binary tree** is the length of the **longest path between any two nodes** in the tree.   This path may or may not pass through the root.

The diameter is measured as the **number of edges** between two farthest nodes.

---

For every node in the tree, the longest path passing through that node is:

```text
leftHeight + rightHeight
```
The maximum value of this expression across all nodes is the **diameter** of the tree.

## 📘 Approach
This approach calculates the height of each node and updates the diameter at the same time.

An integer array of size 1 is used to store the diameter so that it can be updated across recursive calls.

## 🔹 Steps

1. Initialize an array diameter with value 0.
2. Call the recursive height() function on the root node.
3. For each node:
    - Recursively calculate the height of the left subtree.
    - Recursively calculate the height of the right subtree.
4. At the current node:
    - Compute: `leftHeight + rightHeight`
    - Update diameter: `diameter = max(diameter, leftHeight + rightHeight)`
5. Return the height of the current node:
    `1 + max(leftHeight, rightHeight)`
6. After recursion finishes, the stored value is the final diameter.


### 🧪 Example

        1
       / \
      2   3
     / \
    4   5


Longest path: 4 → 2 → 5 → 1 → 3
Diameter = 4