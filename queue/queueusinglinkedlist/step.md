# 📚 Queue Implementation Using Linked List

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.  
In this implementation, the queue is built using a **Singly Linked List**, allowing dynamic memory allocation without a fixed size.

---

## 📘 Steps Involved in Implementing Queue Using Linked List

### 1. Node Structure
- Define a node that holds:
  - A data value.
  - A pointer/reference to the next node.
- This node acts as the basic building block of the linked list used in the queue.

---

### 2. Queue Structure
- Initialize the queue with:
  - A pointer/reference to the **front** of the queue.
  - A pointer/reference to the **rear** of the queue.
- Set both `front` and `rear` pointers to `null` initially, indicating an empty queue.
- Maintain a counter to track the number of elements in the queue.

---

### 3. Enqueue Operation (Adding an Element)
Used to insert an element into the queue.

**Steps:**
1. Create a new node with the given data.
2. Check if the queue is empty:
   - If empty, set both `front` and `rear` to the new node.
3. If the queue is not empty:
   - Link the current `rear` node to the new node.
   - Update the `rear` pointer to point to the new node.
4. Increment the element counter.

---

### 4. Dequeue Operation (Removing an Element)
Used to remove an element from the front of the queue.

**Steps:**
1. Check if the queue is empty:
   - If empty, return an appropriate message or handle the empty condition.
2. If the queue is not empty:
   - Store the current front node.
   - Move the `front` pointer to the next node.
   - Delete the old front node.
3. If the queue becomes empty after removal:
   - Set the `rear` pointer to `null`.
4. Decrement the element counter.

---

### 5. Peek Operation (Accessing the Front Element)
Used to view the front element without removing it.

**Steps:**
1. Check if the queue is empty:
   - If empty, return an appropriate message or handle the empty condition.
2. If the queue is not empty:
   - Return the data stored in the front node.

---

### 6. Size Operation
Used to get the current number of elements in the queue.

**Logic:**
- Return the value of the counter tracking the number of elements.

---

### 7. IsEmpty Operation
Used to check whether the queue is empty.

**Logic:**
- If the `front` pointer is `null`, the queue is empty.
- Otherwise, the queue is not empty.

---

## 🧠 Key Characteristics
- Dynamic size (no fixed capacity)
- Efficient enqueue and dequeue operations (**O(1)**)