# Check for Symmetrical Binary Tree

A binary tree is symmetric if its left and right sides are mirror images of each other. If a vertical line is drawn through the center, both sides should align perfectly.

          |
          |
          1
       /  |  \
      2   |   2
     / \  |  / \
    3   4 | 4   3
          |
          |

####  Symmetry conditions:

- The tree must visually mirror itself from left to right.
- This mirror pattern must be consistent at every level of the tree.

## 📚 Approach

1. We compare left and right parts in a mirrored way - left child of the left side is compared with the right child of the right side, and vice versa.
2. Base check: If both parts are empty, it is symmetric. If only one is empty, it's not.
3. Mirror checks:
   - Both nodes should have the same value.
   - Left of left side matches right of right side.
   - Right of left side matches left of right side.
4. The tree is symmetric if all mirrored comparisons pass successfully from top to bottom.