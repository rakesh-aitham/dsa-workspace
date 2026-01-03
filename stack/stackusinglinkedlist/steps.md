# 📚 Stack Implementation Using Linked List

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
In this implementation, the stack is built using a **Singly Linked List**, allowing dynamic memory allocation.

---

## 📘 Steps Involved in Implementing Stack Using Linked List

### 1. Node Structure
- Define a node with:
  - An integer variable to store data.
  - A pointer/reference to the next node.
- Provide a constructor to initialize:
  - The data value.
  - The next pointer.

---

### 2. Stack Structure
- Define a stack with:
  - A pointer/reference to the **top** node.
  - An integer variable to keep track of the stack size.
- Provide a constructor to initialize:
  - The `top` pointer as `null`.
  - The `size` as `0`.

---

### 3. Push Operation
Used to insert an element into the stack.

**Steps:**
1. Create a new node with the given data.
2. Set the new node’s `next` pointer to the current top node.
3. Update the `top` pointer to the new node.
4. Increment the stack size.

---

### 4. Pop Operation
Used to remove and return the top element from the stack.

**Steps:**
1. Check if the stack is empty.
   - If empty, return an error value (e.g., `-1`).
2. Store the data from the top node.
3. Update the `top` pointer to the next node.
4. Delete the old top node.
5. Decrement the stack size.
6. Return the stored data.

---

### 5. Peek Operation
Used to view the top element without removing it.

**Steps:**
1. Check if the stack is empty.
   - If empty, return an error value (e.g., `-1`).
2. Otherwise, return the data of the top node.

---

### 6. Is Empty Operation
Used to check whether the stack is empty.

**Logic:**
- If the `top` pointer is `null`, return `true`.
- Otherwise, return `false`.

---

### 7. Size Operation
Used to get the current number of elements in the stack.

**Logic:**
- Return the value of the `size` variable.

---

### 8. Print Stack
Used to display all elements of the stack.

**Steps:**
1. Start from the `top` node.
2. Traverse the linked list.
3. Print the data of each node.
4. Stop when the `top` is reached `null`

---

## 🧠 Key Characteristics
- Dynamic size (no fixed capacity)
- Efficient push and pop operations (**O(1)**)