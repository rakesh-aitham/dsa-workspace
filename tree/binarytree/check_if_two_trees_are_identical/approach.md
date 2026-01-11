# 🌳 Check if Two Binary Trees are Identical

Two binary trees are said to be **identical** if:
- They have the **same structure**
- All corresponding nodes have the **same values**.

This algorithm uses a **recursive preorder traversal** to compare both trees simultaneously.

---

## 📚 Algorithm (Recursive Approach)

### 🔹 Base Cases

1. If **both nodes are `null`**  
   → return `true` (both subtrees are empty and identical)

2. If **only one node is `null`**  
   → return `false` (structure is different)

### 🔹 Recursive Case

1. Compare the values of both current nodes.
2. Recursively check:
   - Left subtree of first tree with left subtree of second tree
   - Right subtree of first tree with right subtree of second tree
3. Return `true` only if:
   - Current values are equal  
   - Left subtrees are identical  
   - Right subtrees are identical

### 🧪 Example 1

Tree 1:

      1
     / \
    2   3

Tree 2:

      1
     / \
    2   3


✔ Trees are identical.

### 🧪 Example 2

Tree 1

      1
     /
    2

Tree 2

      1
       \
        2


❌ Trees are not identical (structure differs).