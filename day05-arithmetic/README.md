# ➕ Day 05 - Arithmetic Operators

> **Course Lesson:** 05  
> **Topic:** Arithmetic Operators in Java  
> **Status:** ✅ Completed

---

# 📖 Overview

In this lesson, I learned how Java performs **mathematical calculations** using arithmetic operators.

Arithmetic operators allow programs to perform calculations such as addition, subtraction, multiplication, division, and finding the remainder of a division. These operators are used in almost every Java application, from simple calculators to complex financial software and games.

I also learned about:

- Arithmetic operators
- Assignment operators
- Augmented assignment operators
- Increment and decrement operators
- Integer division
- Modulus operator
- Order of operations (PEMDAS)

These concepts form the mathematical foundation for future Java programs.

---

# 🎯 Learning Objectives

After completing this lesson, I can:

- Perform basic arithmetic calculations
- Use all arithmetic operators
- Understand integer division
- Use the modulus operator
- Apply augmented assignment operators
- Increment and decrement variables
- Understand operator precedence
- Apply PEMDAS in Java expressions

---

# 📚 What are Arithmetic Operators?

Arithmetic operators perform mathematical calculations on numbers.

Java provides several built-in arithmetic operators that work similarly to basic mathematics.

| Operator | Description |
|-----------|-------------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

---

# ➕ Addition Operator

The addition operator adds two numbers together.

Syntax:

```java
int result = a + b;
```

Example:

```java
int x = 10;
int y = 2;

int z = x + y;

System.out.println(z);
```

Output

```
12
```

---

# ➖ Subtraction Operator

Subtracts one number from another.

Example:

```java
int x = 10;
int y = 2;

int z = x - y;

System.out.println(z);
```

Output

```
8
```

---

# ✖️ Multiplication Operator

The multiplication operator uses the asterisk (`*`).

Example

```java
int x = 10;
int y = 2;

int z = x * y;

System.out.println(z);
```

Output

```
20
```

---

# ➗ Division Operator

Division uses the forward slash.

Example

```java
int x = 10;
int y = 2;

int z = x / y;

System.out.println(z);
```

Output

```
5
```

---

# ⚠️ Integer Division

One important concept is **integer division**.

When both operands are integers, Java removes the decimal part.

Example

```java
int x = 10;
int y = 3;

System.out.println(x / y);
```

Output

```
3
```

Even though the mathematical answer is:

```
3.333333...
```

Java stores only:

```
3
```

because integers cannot contain decimal values.

---

# ✅ Decimal Division

If at least one value is a double, Java keeps the decimal portion.

Example

```java
double result = 10 / 3.0;

System.out.println(result);
```

Output

```
3.3333333333333335
```

---

# 📌 Modulus Operator (%)

The modulus operator returns the **remainder** after division.

Syntax

```java
a % b
```

Example

```java
int x = 10;
int y = 3;

System.out.println(x % y);
```

Output

```
1
```

Because

```
10 ÷ 3 = 3 remainder 1
```

---

# 💡 Why is Modulus Useful?

The modulus operator is commonly used for:

- Checking even or odd numbers
- Time calculations
- Cycling values
- Loop control
- Calendar applications
- Games

Example

```java
8 % 2
```

Output

```
0
```

Meaning 8 is evenly divisible by 2.

---

# 🧠 Even or Odd Example

```java
int number = 17;

if(number % 2 == 0)
{
    System.out.println("Even");
}
else
{
    System.out.println("Odd");
}
```

Output

```
Odd
```

---

# 📝 Assignment Operators

Normally we assign values like this.

```java
int x = 10;
```

Later we can change the value.

```java
x = x + 5;
```

Result

```
15
```

---

# 🚀 Augmented Assignment Operators

Java provides shortcuts for updating variables.

| Standard | Shortcut |
|-----------|-----------|
| `x = x + y` | `x += y` |
| `x = x - y` | `x -= y` |
| `x = x * y` | `x *= y` |
| `x = x / y` | `x /= y` |
| `x = x % y` | `x %= y` |

These operators make code shorter and easier to read.

---

# ➕ Addition Assignment

Instead of writing

```java
x = x + y;
```

write

```java
x += y;
```

Example

```java
int x = 10;

x += 5;

System.out.println(x);
```

Output

```
15
```

---

# ➖ Subtraction Assignment

```java
x -= 3;
```

Equivalent to

```java
x = x - 3;
```

---

# ✖️ Multiplication Assignment

```java
x *= 4;
```

Equivalent to

```java
x = x * 4;
```

---

# ➗ Division Assignment

```java
x /= 2;
```

Equivalent to

```java
x = x / 2;
```

---

# 📌 Modulus Assignment

```java
x %= 3;
```

Equivalent to

```java
x = x % 3;
```

---

# ⬆️ Increment Operator

The increment operator increases a value by **1**.

Instead of writing

```java
x = x + 1;
```

or

```java
x += 1;
```

Java provides

```java
x++;
```

Example

```java
int x = 1;

x++;

System.out.println(x);
```

Output

```
2
```

Increment operators are frequently used inside loops.

---

# ⬇️ Decrement Operator

The decrement operator decreases a value by **1**.

Instead of

```java
x = x - 1;
```

or

```java
x -= 1;
```

write

```java
x--;
```

Example

```java
int x = 5;

x--;

System.out.println(x);
```

Output

```
4
```

Decrement operators are also commonly used in loops and countdown programs.

---

# 🔄 Program Flow

```text
Declare Variables
       │
       ▼
Perform Arithmetic
       │
       ▼
Store Result
       │
       ▼
Display Output
```
# 🧮 Order of Operations (PEMDAS)

When evaluating complex mathematical expressions, Java follows the standard **order of operations**, often remembered by the acronym **PEMDAS**.

| Order | Operation |
|--------|-----------|
| 1 | Parentheses `()` |
| 2 | Exponents *(covered later)* |
| 3 | Multiplication `*` |
| 4 | Division `/` |
| 5 | Addition `+` |
| 6 | Subtraction `-` |

A common phrase to remember PEMDAS is:

> **Please Excuse My Dear Aunt Sally**

---

# 💻 Example

```java
double result = 3 + 4 * (7 - 5) / 2.0;

System.out.println(result);
```

Output

```
7.0
```

Evaluation:

```
(7 - 5)
↓

2

4 × 2
↓

8

8 ÷ 2.0
↓

4.0

3 + 4.0
↓

7.0
```

---

# 📌 Arithmetic Operators Summary

| Operator | Example | Result |
|-----------|---------|--------|
| `+` | `10 + 2` | 12 |
| `-` | `10 - 2` | 8 |
| `*` | `10 * 2` | 20 |
| `/` | `10 / 2` | 5 |
| `%` | `10 % 3` | 1 |
| `+=` | `x += 5` | Add and assign |
| `-=` | `x -= 5` | Subtract and assign |
| `*=` | `x *= 5` | Multiply and assign |
| `/=` | `x /= 5` | Divide and assign |
| `%=` | `x %= 5` | Modulus and assign |
| `++` | `x++` | Increase by 1 |
| `--` | `x--` | Decrease by 1 |

---

# 💻 Complete Example

```java
public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.println("Addition       : " + (x + y));
        System.out.println("Subtraction    : " + (x - y));
        System.out.println("Multiplication : " + (x * y));
        System.out.println("Division       : " + (x / y));
        System.out.println("Modulus        : " + (x % y));

        x += 5;
        System.out.println("After +=       : " + x);

        x *= 2;
        System.out.println("After *=       : " + x);

        x++;
        System.out.println("After ++       : " + x);

        x--;
        System.out.println("After --       : " + x);

    }

}
```

---

# 🧠 Key Takeaways

- Java provides five basic arithmetic operators.
- Integer division removes the decimal part.
- Use `double` values when decimal precision is required.
- The modulus operator returns the remainder after division.
- Augmented assignment operators make code shorter and cleaner.
- Increment (`++`) and decrement (`--`) change a value by one.
- Java follows PEMDAS when evaluating expressions.

---

# ⚠️ Common Mistakes

## Integer Division

Incorrect expectation:

```java
int result = 10 / 3;
```

Output

```
3
```

Correct if decimal precision is needed:

```java
double result = 10 / 3.0;
```

---

## Forgetting Parentheses

Incorrect

```java
System.out.println(3 + 4 * 2);
```

Output

```
11
```

Correct

```java
System.out.println((3 + 4) * 2);
```

Output

```
14
```

---

## Confusing `%` with Percentage

Remember:

```java
10 % 3
```

returns

```
1
```

It returns the **remainder**, **not** a percentage.

---

## Using `=` Instead of `+=`

Instead of

```java
x = x + 5;
```

you can write

```java
x += 5;
```

---

# ✅ Best Practices

- Use descriptive variable names.
- Prefer augmented assignment operators when appropriate.
- Use `double` when calculations require decimal values.
- Use parentheses to improve readability.
- Keep mathematical expressions simple whenever possible.

---

# 📝 Revision Notes

Remember:

Arithmetic Operators

```
+
-
*
/
%
```

Augmented Assignment

```
+=
-=
*=
/=
%=
```

Increment & Decrement

```
++
--
```

PEMDAS

```
Parentheses
Exponents
Multiplication
Division
Addition
Subtraction
```

---

# 🎯 Learning Outcome

After completing this lesson, I can confidently:

- Perform mathematical operations in Java
- Use arithmetic operators correctly
- Understand integer division
- Apply the modulus operator
- Use augmented assignment operators
- Increment and decrement variables
- Evaluate expressions using PEMDAS
- Write cleaner mathematical code

---

# 📖 Summary

Today's lesson introduced **arithmetic operators**, one of the core building blocks of programming.

I learned how Java performs addition, subtraction, multiplication, division, and modulus operations. I also explored augmented assignment operators, increment and decrement operators, integer division, and the order of operations (PEMDAS).

These concepts are fundamental for developing calculators, games, financial applications, simulations, and many other real-world programs.

---

# 🚀 Next Lesson

➡️ **Day 06 — Shopping Cart Program ⭐**

In the next lesson, I'll build another mini project by creating a **Shopping Cart Program**, where I'll combine arithmetic operations with user input to calculate totals and simulate a simple purchasing system.

---

## 📊 Progress

- **Lesson:** 5 / 71 ✅
- **Mini Projects:** 1 / 16 ⭐
- **Status:** Completed ✔️

---

> **"Programming is applied mathematics—every calculation brings your code one step closer to solving real-world problems." ☕➕
