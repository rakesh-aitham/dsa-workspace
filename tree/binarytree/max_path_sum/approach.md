# 🌳 Maximum Path Sum in a Binary Tree

The **maximum path sum** in a binary tree is the largest possible sum of node values along **any path** in the tree.  
A path can start and end at **any node**, but it must move **downwards** through parent-child connections.

---

## 📘 Approach

We can solve the maximum path sum problem using recursively traversing the tree and treating each node as a possible turning point. At every node, we calculate two things:
- The maximum path sum that passes through the current node (left + right + node value). This is used to update our global maximum. 
- The maximum path sum from the current node down one side (either left or right), which we return to the parent call.

## 🔹 Steps

1. Initialize a global variable maxSum with the smallest possible integer value(to track the maximum path sum found so far.).
2. Use a recursive function to traverse the tree.
3. If the current node is null, return 0.
4. Recursively calculate the maximum path sum from:
    - the left subtree
    - the right subtree
5. Ignore negative path sums by taking:
    - max(0, leftSum) and max(0, rightSum)
6. Compute the maximum path sum passing through the current node:
    - left + right + node value
7. Update the global maximum if this value is greater than the current maximum.
8. Return the maximum one-sided path sum to the parent:
    - max(left, right) + node value

### 🧪 Example
        -10
        /  \
       9   20
          /  \
         15   7

- Maximum Path: 20 → 15 → 7
- Maximum Path Sum: 42