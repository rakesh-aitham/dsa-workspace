# 📚 Infix to Prefix Conversion Using Stack

Infix expressions place operators **between operands** (e.g., `a + b`).  
Prefix expressions (Polish Notation) place operators **before operands** (e.g., `+ab`) and eliminate the need for parentheses.

This approach converts an **infix expression** into a **prefix expression** using **stack-based logic**.


#### Example Expression
#### Infix:
```
(p + q) * (m - n)

```
#### Postfix:
```
*+pq-mn

```

---

## 📘 Approach: Infix to Prefix Conversion

### 1. Operator Precedence
- Define precedence for operators to maintain correct order of evaluation:
  - `^` → highest precedence
  - `*` and `/` → medium precedence
  - `+` and `-` → lowest precedence
- Operators with higher precedence are processed before lower precedence operators.

---

### 2. Reverse the Infix Expression
- Reverse the given infix expression.
- This step helps transform the infix-to-prefix conversion into a simpler infix-to-postfix problem.

---

### 3. Swap Parentheses
- After reversing the expression:
  - Replace every opening parenthesis `'('` with `')'`
  - Replace every closing parenthesis `')'` with `'('`
- This ensures the grouping of expressions remains correct after reversal.

---

### 4. Convert the Modified Expression to Postfix
- Apply the **infix-to-postfix conversion algorithm** on the modified expression.
- Use a stack to:
  - Push operators and parentheses
  - Append operands directly to the result
  - Pop operators based on precedence rules
- The result of this step is a **postfix expression**.

---

### 5. Reverse the Postfix Expression
- Reverse the postfix expression obtained in the previous step.
- The reversed result is the final **prefix expression**.

---

### 📊 Step-by-Step Stack Table
| i (scanned character) | stack | result  |
| --------------------- | ----- | ------- |
| (                     | (     |         |
| n                     | (     | n       |
| -                     | ( -   | n       |
| m                     | ( -   | nm      |
| )                     |       | nm-     |
| *                     | *     | nm-     |
| (                     | * (   | nm-     |
| q                     | * (   | nm-q    |
| +                     | * ( + | nm-q    |
| p                     | * ( + | nm-qp   |
| )                     | *     | nm-qp+  |
| end                   |       | nm-qp+* |

#### 🔁 Final Step: 
- Reverse Postfix to Get Prefix:
  - ``` *+pq-mn ```