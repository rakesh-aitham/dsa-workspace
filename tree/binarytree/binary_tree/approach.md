# 🌳 Binary Tree Implementation

A **Binary Tree** is a hierarchical data structure in which each node has **at most two children**, referred to as the **left child** and the **right child**.

```text
        1
       / \
      2   3
     / \
    4   5
```

This implementation supports:
- Insertion (level-order)
- Deletion
- Searching
- Tree traversals (Preorder, Inorder, Postorder)

---

## 📘 Node Structure

Each node of the binary tree contains:
- `data` → integer value
- `left` → reference to the left child
- `right` → reference to the right child

The node is initialized with data and both children set to `null`.

---

## 📘 Binary Tree Structure

The binary tree contains:
- `root` → reference to the root node of the tree

If `root` is `null`, the tree is empty.

---

## ➕ Insertion Operation (Level Order)

New nodes are inserted in **level-order** (left to right).

### Steps:
1. Create a new node.
2. If the tree is empty, set the new node as root.
3. Otherwise:
   - Use a queue for level-order traversal.
   - Traverse nodes from left to right.
   - Insert the new node at the first available position.

---

## ❌ Deletion Operation

Deletion is performed by:
- Replacing the node to be deleted with the **deepest rightmost node**
- Then removing that deepest node.

### Steps:
1. If the tree is empty, return.
2. If the tree has only one node:
   - Delete it if it matches the key.
3. Perform level-order traversal to:
   - Find the node with the given key.
   - Track the deepest node.
4. Replace the key node’s value with the deepest node’s value.
5. Delete the deepest node.

---

## 🔍 Search Operation

Search is done using **level-order traversal**.

### Steps:
1. If tree is empty, return `false`.
2. Traverse the tree using a queue.
3. If any node matches the key, return `true`.
4. If traversal ends, return `false`.

---

## 🔁 Tree Traversals

### 1. Preorder Traversal (Root → Left → Right)
- Visit root
- Traverse left subtree
- Traverse right subtree

---

### 2. Inorder Traversal (Left → Root → Right)
- Traverse left subtree
- Visit root
- Traverse right subtree

---

### 2. Postorder Traversal (Left → Right → Root)
- Traverse left subtree
- Traverse right subtree
- Visit root