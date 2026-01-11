# 🌳 Zigzag (Spiral) Level Order Traversal of a Binary Tree

Zigzag traversal (also called **spiral traversal**) is a modification of level-order traversal where the direction of traversal **alternates at each level**:

At odd levels, we proceed from left to right but for even levels the order is reversed, from right to left. This is achieved by introducing a `leftToRight` flag which controls the order in which nodes are processed at each level.

- First level → left to right  
- Second level → right to left  
- Third level → left to right  
- and so on…


## 🔁 Algorithm (Level Order + Direction Control)

## 🔹 Steps

1. Create an empty list `result` to store the final zigzag order.
2. If the root is `null`, return the empty result.
3. Initialize a queue and insert the root node.
4. Set a boolean flag `leftToRight = true`.
5. While the queue is not empty:
   - Get the number of nodes at the current level (`size`).
   - Create an array `level[size]` to store values of this level.
6. For each node in the current level:
   - Remove a node from the queue.
   - Decide the index:
     - If `leftToRight` → insert at `i`
     - Else → insert at `size - 1 - i`
   - Store the node’s value in the array.
   - Add its left and right children to the queue if they exist.
7. After finishing the level:
   - Change the direction flag (`leftToRight = !leftToRight`).
   - Convert the array into a list and add it to `result`.
8. Continue until the queue becomes empty.
9. Return `result`.

## 🧪 Example

For the binary tree:

        1
       / \
      2   3
     / \   \
    4   5   6


Zigzag traversal output:

```text
[
 [1],
 [3, 2],
 [4, 5, 6]
]