# Day 15 — Weight Converter 🏋️

<div align="center">

# 🏋️ Day 15 – Weight Converter

<img src="https://img.shields.io/badge/Java-Day%2015-orange?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/Topic-Weight%20Converter-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Mini%20Project-4-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge" />

**📚 Chapter 15 – Weight Converter**

*A beginner-friendly Java project that converts weights between Pounds (lbs) and Kilograms (kg) using conditional statements, user input, and mathematical calculations.*

</div>

---

# 📖 Overview

Welcome to **Day 15** of the Java Learning Journey!

Today's lesson introduces your **fourth mini project** of the course. Instead of learning only theory, you'll build a practical console application that performs real-world unit conversions.

The Weight Converter allows users to:

- Convert **Pounds (lbs)** to **Kilograms (kg)**
- Convert **Kilograms (kg)** to **Pounds (lbs)**
- Choose conversion direction using a menu
- Display formatted results using `printf`
- Handle invalid menu selections gracefully

This project reinforces everything learned about:

- Variables
- Scanner
- User input
- If-Else statements
- Arithmetic operations
- Formatted output
- Program structure

---

# 🎯 Objectives

After completing this lesson you will be able to:

- Build a menu-driven Java program
- Read user input using Scanner
- Perform mathematical conversions
- Use `if`, `else if`, and `else`
- Display formatted decimal values
- Handle invalid choices
- Organize code using pseudocode
- Close Scanner resources properly

---

# 🧠 Concepts Covered

## Scanner

Used for reading user input.

```java
Scanner scanner = new Scanner(System.in);
```

---

## Variables

```java
double weight;
double newWeight;
int choice;
```

Different variables store:

- Original weight
- Converted weight
- User menu selection

---

## Conditional Statements

```java
if(choice == 1){

}
else if(choice == 2){

}
else{

}
```

Program execution depends on the user's selection.

---

## Mathematical Conversion

### Pounds → Kilograms

Formula:

```text
kg = lbs × 0.453592
```

Example:

```text
150 lbs

↓

68.04 kg
```

---

### Kilograms → Pounds

Formula:

```text
lbs = kg × 2.20462
```

Example:

```text
68 kg

↓

149.91 lbs
```

---

## Formatted Output

Instead of:

```java
System.out.println(newWeight);
```

Use:

```java
System.out.printf("%.2f", newWeight);
```

Output:

```text
68.04
```

Only two decimal places are shown.

---

# 🧾 Program Flow

```text
Start
   │
   ▼
Display Menu
   │
   ▼
Read User Choice
   │
   ├──────────────┐
   ▼              ▼
Choice = 1     Choice = 2
   │              │
Convert lbs    Convert kg
to kg          to lbs
   │              │
   ▼              ▼
Display Result
        │
        ▼
 Invalid Choice?
        │
        ▼
Print Error Message
        │
        ▼
Close Scanner
        │
        ▼
End
```

---

# 💻 Sample Menu

```text
Weight Conversion Program

1: Convert lbs to kgs
2: Convert kgs to lbs

Choose an option:
```

---

# ▶ Example Output 1

```text
Weight Conversion Program

1: Convert lbs to kgs
2: Convert kgs to lbs

Choose an option: 1

Enter the weight in lbs:
150

The new weight in kgs is: 68.04
```

---

# ▶ Example Output 2

```text
Weight Conversion Program

1: Convert lbs to kgs
2: Convert kgs to lbs

Choose an option: 2

Enter the weight in kgs:
68

The new weight in lbs is: 149.91
```

---

# ▶ Example Output 3

```text
Weight Conversion Program

1: Convert lbs to kgs
2: Convert kgs to lbs

Choose an option:
5

That was not a valid choice.
```

---

# 🧩 Step-by-Step Breakdown

## Step 1

Import Scanner.

```java
import java.util.Scanner;
```

---

## Step 2

Create Scanner.

```java
Scanner scanner = new Scanner(System.in);
```

---

## Step 3

Declare variables.

```java
double weight;
double newWeight;
int choice;
```

---

## Step 4

Display menu.

```java
System.out.println("Weight Conversion Program");
System.out.println("1: Convert lbs to kgs");
System.out.println("2: Convert kgs to lbs");
```

---

## Step 5

Read user choice.

```java
choice = scanner.nextInt();
```

---

## Step 6

Use if-else.

```java
if(choice == 1)
```

Convert Pounds → Kilograms.

---

## Step 7

Use else-if.

```java
else if(choice == 2)
```

Convert Kilograms → Pounds.

---

## Step 8

Handle invalid input.

```java
else
```

Display an error.

---

## Step 9

Print formatted result.

```java
System.out.printf("%.2f", newWeight);
```

---

## Step 10

Close Scanner.

```java
scanner.close();
```

---

# 🔄 Conversion Constants

| Conversion | Formula |
|------------|---------|
| Pounds → Kilograms | `lbs × 0.453592` |
| Kilograms → Pounds | `kg × 2.20462` |

---

# 💡 Why Use printf?

Without formatting:

```text
68.038799999
```

With formatting:

```text
68.04
```

Much cleaner for users.

---

# ⚠ Common Beginner Mistakes

### Forgetting `==`

Incorrect:

```java
if(choice = 1)
```

Correct:

```java
if(choice == 1)
```

---

### Forgetting Scanner Import

```java
import java.util.Scanner;
```

---

### Using Wrong Formula

Remember:

```text
lbs → kg

Multiply by 0.453592
```

```text
kg → lbs

Multiply by 2.20462
```

---

### Forgetting Scanner Close

Always finish with:

```java
scanner.close();
```

---

### Not Handling Invalid Choices

Always include:

```java
else
```

to make your program more user-friendly.

---

# 🚀 Challenge Yourself

Try adding:

- Support for decimal inputs
- Repeat conversion using a loop
- Exit option
- Input validation
- Multiple unit conversions
- Grams
- Ounces
- Stones
- Metric tons

---

# 📚 What You Learned

By the end of Day 15 you learned:

- ✅ Scanner
- ✅ User input
- ✅ Variables
- ✅ Menu-driven programs
- ✅ If-Else statements
- ✅ Arithmetic calculations
- ✅ Weight conversion formulas
- ✅ printf formatting
- ✅ Error handling
- ✅ Closing resources

---

# 🏆 Mini Project #4 Complete

Congratulations!

You successfully built another real-world Java console application.

Projects like this strengthen your understanding far more than simple syntax examples because they combine multiple concepts into one practical program.

---

# 📅 Progress

- ✅ Day 15 Complete
- ✅ Chapter 15 Complete
- ✅ Mini Project #4 Finished

**Keep coding—every project brings you one step closer to becoming a confident Java developer! 🚀**
