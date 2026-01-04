# 📚 Min Stack Implementation

A **Min Stack** is a special type of stack that supports retrieving the **minimum element** in constant time **O(1)**, along with standard stack operations.

This implementation uses a **stack of pairs**, where each pair stores:
- The actual element
- The minimum element in the stack at the time of insertion

---

## 📘 Approach:

### 1. Stack Structure
- A stack is used where each entry is a **pair**:
  - **First value** → the actual element pushed
  - **Second value** → the minimum element up to that point
- The stack is initialized as empty.

---

### 2. Push Operation
Used to insert an element into the stack.

**Steps:**
1. Compare the new element with the current minimum.
2. Determine the new minimum:
   - If the stack is empty, the new element becomes the minimum.
   - Otherwise, the new minimum is the smaller of:
     - The new element
     - The current minimum (from the top pair)
3. Push a pair containing:
   - The new element
   - The updated minimum

---

### 3. Pop Operation
Used to remove the top element from the stack.

**Steps:**
1. Remove the top pair from the stack.
2. No additional handling is needed, as the previous minimum is already stored in the next pair.

---

### 4. Top Operation
Used to retrieve the top element without removing it.

**Steps:**
1. Access the top pair from the stack.
2. Return the **first value** of the pair, which represents the actual element.

---

### 5. GetMin Operation
Used to retrieve the minimum element in the stack.

**Steps:**
1. Access the top pair from the stack.
2. Return the **second value** of the pair, which represents the minimum element at that state.