# 📚 Infix to Postfix Conversion Using Stack

Infix expressions are the most common form of arithmetic expressions (e.g., `a + b`).  
Postfix expressions (Reverse Polish Notation) place operators **after operands** (e.g., `ab+`) and do not require parentheses.

This implementation converts an **infix expression** to a **postfix expression** using a **stack**.

#### Example Expression
#### Infix:
```
(p + q) * (m - n)

```
#### Postfix:
```
pq+mn-*
```

---

## 📘 Approach: Infix to Postfix Conversion

### 1. Operator Precedence
- Define a method to assign precedence to operators:
  - `^` → highest precedence
  - `*` and `/` → medium precedence
  - `+` and `-` → lowest precedence
- Higher precedence operators must be evaluated first.

---

### 2. Use of Stack
- A stack is used to temporarily store operators and parentheses.
- Operands are directly added to the result.

---

### 3. Traverse the Infix Expression
- Read the infix expression **character by character**.

---

### 4. Rules for Conversion

#### a. Operand
- If the character is a **letter or digit**, append it directly to the postfix result.

#### b. Opening Parenthesis `(`
- Push it onto the stack.

#### c. Closing Parenthesis `)`
- Pop elements from the stack and append them to the result **until an opening parenthesis `(` is encountered**.
- Pop and discard the opening parenthesis.

#### d. Operator (`+`, `-`, `*`, `/`, `^`)
- While the stack is not empty and the precedence of the current operator is **less than or equal to** the precedence of the operator on top of the stack:
  - Pop the operator from the stack and append it to the result.
- Push the current operator onto the stack.

---

### 5. Empty the Stack
- After processing the entire infix expression:
  - Pop all remaining operators from the stack.
  - Append them to the postfix result.

---

### 📊 Step-by-Step Stack Table
| i (scanned character) | stack | result  |
| --------------------- | ----- | ------- |
| (                     | (     |         |
| p                     | (     | p       |
| +                     | ( +   | p       |
| q                     | ( +   | pq      |
| )                     |       | pq+     |
| *                     | *     | pq+     |
| (                     | * (   | pq+     |
| m                     | * (   | pq+m    |
| -                     | * ( - | pq+m    |
| n                     | * ( - | pq+mn   |
| )                     | *     | pq+mn-  |
| end                   |       | pq+mn-* |