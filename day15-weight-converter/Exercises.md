# 📘 Day 15 – Exercises
## 🏋️ Chapter 15: Weight Converter

<div align="center">

<img src="https://img.shields.io/badge/Java-Day%2015-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/Exercises-Weight%20Converter-blue?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Mini%20Project-4-success?style=for-the-badge"/>

**Practice your understanding of user input, conditional statements, mathematical calculations, and formatted output by completing the following exercises.**

</div>

---

# 🎯 Learning Objectives

After completing these exercises, you should be able to:

- ✅ Use `Scanner` to accept user input
- ✅ Build menu-driven console programs
- ✅ Apply `if`, `else if`, and `else`
- ✅ Perform unit conversions
- ✅ Use conversion formulas correctly
- ✅ Display formatted decimal values using `printf`
- ✅ Handle invalid user choices
- ✅ Write clean, organized Java programs

---

# 📝 Exercise 1 — Display a Menu

Create a program that displays the following menu.

### Expected Output

```text
Weight Conversion Program

1. Pounds to Kilograms
2. Kilograms to Pounds
```

### Goal

Practice using multiple `System.out.println()` statements.

---

# 📝 Exercise 2 — Read User Choice

Ask the user to choose an option.

Example:

```text
Choose an option:
```

Store the value in an integer variable.

### Example

```text
Choose an option:
1
```

---

# 📝 Exercise 3 — Read a Weight

Ask the user to enter a weight.

Example:

```text
Enter weight:
```

Store it inside a `double`.

Example

```text
Enter weight:
150
```

---

# 📝 Exercise 4 — Convert Pounds to Kilograms

Formula:

```text
kg = lbs × 0.453592
```

Example

```text
Input

150 lbs

Output

68.04 kg
```

---

# 📝 Exercise 5 — Convert Kilograms to Pounds

Formula

```text
lbs = kg × 2.20462
```

Example

```text
Input

68 kg

Output

149.91 lbs
```

---

# 📝 Exercise 6 — Build the Complete Converter

Combine Exercises 1–5 into one complete program.

Menu:

```text
1. Pounds → Kilograms

2. Kilograms → Pounds
```

The program should perform the correct conversion based on the user's choice.

---

# 📝 Exercise 7 — Handle Invalid Choices

If the user enters anything other than **1** or **2**, display:

```text
That was not a valid choice.
```

---

# 📝 Exercise 8 — Format Output

Instead of printing many decimal places:

```text
68.038799999
```

Display:

```text
68.04
```

using

```java
System.out.printf("%.2f", value);
```

---

# 📝 Exercise 9 — Convert Multiple Values

Find the converted values for:

| Pounds | Kilograms |
|---------|----------:|
| 50 | ? |
| 75 | ? |
| 100 | ? |
| 150 | ? |
| 200 | ? |

---

# 📝 Exercise 10 — Reverse Conversion

Convert:

| Kilograms | Pounds |
|-----------|--------:|
| 10 | ? |
| 25 | ? |
| 50 | ? |
| 68 | ? |
| 100 | ? |

---

# 📝 Exercise 11 — Identify the Output

```java
double weight = 200;

double newWeight = weight * 0.453592;

System.out.printf("%.2f", newWeight);
```

What will be printed?

---

# 📝 Exercise 12 — Predict the Output

```java
int choice = 3;

if(choice == 1)
{
    System.out.println("Pounds");
}
else if(choice == 2)
{
    System.out.println("Kilograms");
}
else
{
    System.out.println("Invalid");
}
```

What is the output?

---

# 📝 Exercise 13 — Fill in the Missing Code

```java
double weight = scanner.________();
```

Choose the correct Scanner method.

---

# 📝 Exercise 14 — Fill in the Formula

Complete the conversion.

```java
newWeight = weight * ________;
```

for Pounds → Kilograms.

---

# 📝 Exercise 15 — Correct the Error

```java
if(choice = 1)
```

What is wrong?

Rewrite it correctly.

---

# 📝 Exercise 16 — True or False

### 1

Scanner is used for user input.

⬜ True

⬜ False

---

### 2

`printf` can format decimal places.

⬜ True

⬜ False

---

### 3

`==` compares two values.

⬜ True

⬜ False

---

### 4

`=` compares two values.

⬜ True

⬜ False

---

### 5

A Scanner should be closed after use.

⬜ True

⬜ False

---

# 📝 Exercise 17 — Short Answer

What does this statement do?

```java
System.out.printf("%.2f", weight);
```

---

# 📝 Exercise 18 — Explain the Formula

Why do we multiply pounds by **0.453592**?

Explain in one or two sentences.

---

# 📝 Exercise 19 — Pseudocode

Write pseudocode for the Weight Converter.

Example format:

```text
Start

Display menu

Read user choice

If choice is 1

Convert pounds

Else if choice is 2

Convert kilograms

Else

Display invalid choice

End
```

---

# 📝 Exercise 20 — Mini Challenge

Modify the program to include a third option.

```text
1. Pounds → Kilograms

2. Kilograms → Pounds

3. Exit
```

If the user enters **3**, display:

```text
Goodbye!
```

---

# 🚀 Bonus Challenge 1

Allow the user to perform **multiple conversions** without restarting the program.

Hint:

Use a loop.

---

# 🚀 Bonus Challenge 2

Add another conversion.

```text
Pounds ↔ Ounces
```

---

# 🚀 Bonus Challenge 3

Create a menu with **five** conversions.

Example:

```text
1 Pounds → Kilograms

2 Kilograms → Pounds

3 Pounds → Ounces

4 Ounces → Pounds

5 Exit
```

---

# 🚀 Bonus Challenge 4

Validate the user's weight.

Negative values should display:

```text
Weight cannot be negative.
```

---

# 🚀 Bonus Challenge 5

Research another unit conversion and add it yourself.

Ideas:

- Miles ↔ Kilometers
- Celsius ↔ Fahrenheit
- Inches ↔ Centimeters
- Feet ↔ Meters
- Gallons ↔ Liters

---

# 🏆 Challenge Project

Create an **Advanced Unit Converter** that includes:

- Weight conversions
- Distance conversions
- Temperature conversions
- Length conversions
- Exit option
- Input validation
- Formatted output
- Loop until user exits

---

# 📚 Summary

In this exercise set you practiced:

- ✅ Scanner
- ✅ Variables
- ✅ User input
- ✅ If-Else statements
- ✅ Mathematical formulas
- ✅ Unit conversions
- ✅ `printf`
- ✅ Error handling
- ✅ Program planning
- ✅ Building a complete Java console application

---

# 🎉 Excellent Work!

You have completed the exercises for **Day 15 – Weight Converter**.

This is your **fourth mini project**, and it combines several core Java concepts into one practical application. Continue experimenting by adding more units, improving the menu, and making the program more user-friendly. Every enhancement strengthens your programming skills.
