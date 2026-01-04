# 📚 Prefix to Infix Conversion Using Stack

Prefix expressions place operators **before** their operands.  
To convert a prefix expression to infix, we use a **stack** to rebuild the expression step by step while preserving the correct order of operands.

## Step-by-Step Approach

1. **Initialize an empty stack** of strings.
2. **Traverse the postfix expression from right to left**, one character at a time.
3. For each character:
   - **If it is an operand** (letter or digit):
     - Push it onto the stack as a string.
   - **If it is an operator**:
     - Pop the top element from the stack → this becomes the **left operand**.
     - Pop the next top element → this becomes the **right operand**.
     - Combine them into a valid infix expression using parentheses:
       ```
       (leftOperand operator rightOperand)
       ```
     - Push the newly formed expression back onto the stack.
4. **After processing all characters**, the stack will contain exactly one element.
5. **That remaining element is the final infix expression**.