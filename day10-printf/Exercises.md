# Day 10 — printf() Exercises 🖨️

## Overview

These exercises reinforce the concepts learned in this lesson:

- Format specifiers
- Multiple placeholders
- Precision
- Width
- Flags
- Left/Right justification
- Zero padding

---

# Concept Revision Questions

### Easy

1. What does `printf` stand for?
2. Why is `printf()` used?
3. What is a format specifier?
4. Which symbol begins every format specifier?
5. Which specifier is used for Strings?
6. Which specifier is used for integers?
7. Which specifier is used for doubles?
8. Which specifier is used for characters?
9. Which specifier is used for booleans?
10. Does `printf()` automatically move to the next line?

---

# Fill in the Blanks

1.

```java
System.out._______("Hello %s", name);
```

2.

```java
%d is used for _________ values.
```

3.

```java
%f is used for _________ values.
```

4.

```java
%c is used for __________.
```

5.

```java
%b is used for __________.
```

---

# True or False

1. `%s` prints integers.
2. `%d` prints whole numbers.
3. `%.2f` displays two decimal places.
4. Width controls decimal places.
5. Precision controls decimal places.
6. `%04d` adds leading zeros.
7. `%-10s` left aligns text.
8. `%n` creates a new line.
9. `printf()` can print multiple variables.
10. Flags change how values are displayed.

---

# Multiple Choice Questions

### Q1

Which specifier prints a String?

- A. %d
- B. %f
- C. %s
- D. %b

Answer:

---

### Q2

Which specifier prints an integer?

- A. %d
- B. %s
- C. %c
- D. %b

Answer:

---

### Q3

How many decimal places are shown by `%.3f`?

- A. 1
- B. 2
- C. 3
- D. 6

Answer:

---

### Q4

Which flag inserts commas?

- A. +
- B. -
- C. ,
- D. 0

Answer:

---

### Q5

Which flag left justifies text?

- A. +
- B. -
- C. 0
- D. (

Answer:

---

# Output Prediction

### Question 1

```java
System.out.printf("%d", 50);
```

Output?

---

### Question 2

```java
System.out.printf("%.2f", 5.678);
```

Output?

---

### Question 3

```java
System.out.printf("%04d", 25);
```

Output?

---

### Question 4

```java
System.out.printf("%6d", 89);
```

Output?

---

### Question 5

```java
System.out.printf("%-6dEND", 89);
```

Output?

---

# Debugging Questions

## Problem 1

```java
String name = "Alex";

System.out.printf("%d", name);
```

Fix the error.

---

## Problem 2

```java
System.out.printf("%.2d", 10);
```

Correct the format.

---

## Problem 3

```java
System.out.printf("%s %d", "Bob");
```

Identify the issue.

---

# Coding Exercises

## Easy

### Exercise 1

Print your name using `%s`.

---

### Exercise 2

Print your age using `%d`.

---

### Exercise 3

Print your height using `%.2f`.

---

### Exercise 4

Print whether you are a student using `%b`.

---

## Medium

### Exercise 5

Display:

```
Alice is 22 years old.
```

using a single `printf()` statement.

---

### Exercise 6

Display three prices with two decimal places.

---

### Exercise 7

Display an ID padded with zeros.

Example:

```
0007
```

---

### Exercise 8

Display a large salary with comma separators.

---

## Hard

### Exercise 9

Create a receipt showing:

- Item
- Quantity
- Price

using aligned columns.

---

### Exercise 10

Create a formatted employee report using width and precision.

---

# Mini Assignment

Create a small student information system that displays:

- Name
- Roll Number
- Grade
- Percentage
- Pass Status

using only `printf()`.

---

# Challenge Problems

## Challenge 1

Create a restaurant bill using formatted output.

Include:

- Item
- Quantity
- Unit Price
- Total

---

## Challenge 2

Create a bank statement.

Display:

- Account Holder
- Balance
- Last Deposit
- Last Withdrawal

Use commas and two decimal places.

---

## Challenge 3

Create a console scoreboard for five players.

Align all columns perfectly.

---

# Interview Style Questions

1. Why is `printf()` preferred over `println()`?
2. Explain width.
3. Explain precision.
4. Explain format specifiers.
5. What is zero padding?
6. Difference between `%d` and `%f`.
7. Difference between width and precision.
8. What happens if placeholders don't match variables?
9. Explain `%n`.
10. Give three real-world uses of `printf()`.

---

# Self Reflection

- Can I use every common format specifier?
- Can I control decimal places?
- Can I align console output?
- Can I print professional reports?
- Can I combine width, precision, and flags?

---

# Hints

- `%s` → String
- `%c` → Character
- `%d` → Integer
- `%f` → Floating-point
- `%b` → Boolean
- `%n` → New line
- `%.2f` → Two decimal places
- `%04d` → Four digits with leading zeros
- `%-10s` → Left align text

---

# Solutions (Selected)

### Fill in the Blanks

1. printf
2. Integer
3. Floating-point
4. Character
5. Boolean

### True / False

1. False
2. True
3. True
4. False
5. True
6. True
7. True
8. True
9. True
10. True

### MCQs

1. C
2. A
3. C
4. C
5. B
