# Day 10 — printf() in Java 🖨️

> **Course Chapter:** 10 — `printf()`
>
> **Topic:** Formatted Output in Java
>
> **Difficulty:** Beginner
>
> **Prerequisites:**
>
> - Variables
> - Data Types
> - Console Output (`print()` and `println()`)
> - Math Class
> - User Input (`Scanner`)

---

# Introduction

Until now, we've displayed output using:

```java
System.out.print();
```

and

```java
System.out.println();
```

These methods are simple, readable, and suitable for most beginner programs.

However, as programs become more advanced, there are situations where we need **greater control over how output is displayed**.

For example:

- Displaying currency
- Showing decimal places
- Aligning columns
- Printing tables
- Formatting reports
- Creating receipts
- Displaying percentages
- Showing IDs with leading zeros

This is where Java's **`printf()`** method becomes extremely useful.

The `printf()` method allows you to **format** output instead of simply printing it.

---

# Learning Objectives

After completing this lesson, you will be able to:

- Understand what `printf()` is.
- Explain why formatted output is useful.
- Use format specifiers.
- Print different data types using placeholders.
- Insert multiple variables into one statement.
- Control decimal precision.
- Format numbers using flags.
- Align text and numbers.
- Add leading zeros.
- Left and right justify output.
- Produce professional-looking console applications.

---

# What is printf()?

`printf()` stands for:

> **Print Formatted**

Instead of concatenating values using the `+` operator, `printf()` inserts values into predefined placeholders.

Example:

```java
String name = "Alice";

System.out.printf("Hello %s", name);
```

Output

```
Hello Alice
```

The `%s` acts as a placeholder that is replaced by the value of `name`.

---

# Why Use printf()?

Imagine displaying prices.

Using `println()`:

```java
double price = 19.99;

System.out.println("Price: $" + price);
```

Output

```
Price: $19.99
```

This works perfectly.

However, suppose you need every price to display **exactly two decimal places**.

`printf()` makes this easy:

```java
System.out.printf("Price: $%.2f", price);
```

Output

```
Price: $19.99
```

Even if the value is:

```java
19
```

The output becomes:

```
19.00
```

This consistency is essential in financial and business applications.

---

# print() vs println() vs printf()

| Method | Adds New Line | Formatting | Typical Use |
|---------|---------------|------------|-------------|
| `print()` | ❌ No | ❌ No | Simple output |
| `println()` | ✅ Yes | ❌ No | Standard console output |
| `printf()` | ❌ No (unless `\n` is used) | ✅ Yes | Formatted output |

---

# Basic Syntax

```java
System.out.printf("format", values);
```

General structure:

```java
System.out.printf(
    "Text %specifier",
    variable
);
```

Example

```java
String language = "Java";

System.out.printf("I am learning %s", language);
```

Output

```
I am learning Java
```

---

# Format Specifiers

A format specifier begins with a percent sign (`%`) followed by a character that represents the data type.

General format:

```
%
specifier
```

Example

```
%s
```

```
%d
```

```
%f
```

Each specifier tells Java what type of value should be inserted into the output.

---

# How printf() Works

Consider this example:

```java
String city = "Tokyo";

System.out.printf("City: %s", city);
```

Step-by-step process:

```
Original String

City: %s
```

↓

Java locates `%s`

↓

Replaces `%s`

↓

With:

```
Tokyo
```

↓

Final Output

```
City: Tokyo
```

---

# Placeholder Concept

Think of placeholders as empty spaces waiting to be filled.

```
Hello %

↓

Hello %s

↓

Hello Alice
```

The placeholder itself is never printed.

Instead, it is replaced with the supplied variable.

---

# Common Format Specifiers

| Specifier | Data Type | Example |
|-----------|-----------|---------|
| `%s` | String | `"Java"` |
| `%c` | Character | `'A'` |
| `%d` | Integer | `25` |
| `%f` | Floating-point (`float`/`double`) | `5.75` |
| `%b` | Boolean | `true` |

These are the most commonly used specifiers for beginners.

---

# Example Variables

Throughout this lesson, we'll use the following variables:

```java
String name = "SpongeBob";

char firstLetter = 'S';

int age = 30;

double height = 60.5;

boolean isEmployed = true;
```

These variables cover the most common Java data types.

---

# Printing a String

Strings use the `%s` specifier.

Example:

```java
System.out.printf("Hello %s", name);
```

Output

```
Hello SpongeBob
```

---

# Breakdown

```
Hello
```

Static text.

```
%s
```

Placeholder.

```
name
```

Value inserted into the placeholder.

---

# Equivalent println()

Using `println()`:

```java
System.out.println("Hello " + name);
```

Using `printf()`:

```java
System.out.printf("Hello %s", name);
```

Both produce:

```
Hello SpongeBob
```

The difference is that `printf()` offers much more control over formatting.

---

# Printing Characters

Characters use the `%c` specifier.

Example

```java
System.out.printf(
    "First Letter: %c",
    firstLetter
);
```

Output

```
First Letter: S
```

---

# Understanding `%c`

Suppose:

```java
char grade = 'A';
```

Printing:

```java
System.out.printf("Grade: %c", grade);
```

Output

```
Grade: A
```

`%c` should only be used with `char` values.

---

# Printing Integers

Whole numbers use `%d`.

The letter `d` stands for **decimal integer**.

Example

```java
System.out.printf(
    "Age: %d",
    age
);
```

Output

```
Age: 30
```

---

# Printing Floating-Point Numbers

Floating-point values (`float` and `double`) use `%f`.

Example

```java
System.out.printf(
    "Height: %f",
    height
);
```

Output

```
Height: 60.500000
```

Notice something interesting.

Although the value is:

```
60.5
```

Java displays:

```
60.500000
```

This is because `%f` displays **six digits after the decimal point by default**.

Later in this lesson, you'll learn how to control the number of decimal places using **precision**.

---

# Printing Boolean Values

Boolean variables use the `%b` specifier.

Example

```java
System.out.printf(
    "Employed: %b",
    isEmployed
);
```

Output

```
Employed: true
```

If the value changes to:

```java
false
```

Output becomes:

```
Employed: false
```

---

# Adding a New Line

Unlike `println()`, the `printf()` method **does not automatically move to the next line**.

If multiple `printf()` statements are written without a newline character:

```java
System.out.printf("Hello");
System.out.printf("World");
```

Output

```
HelloWorld
```

To move to the next line, include the newline escape sequence:

```java
System.out.printf("Hello\n");
System.out.printf("World\n");
```

Output

```
Hello
World
```

Alternatively, you can use `%n`, which is platform-independent and commonly recommended for formatted output.

```java
System.out.printf("Hello%n");
System.out.printf("World%n");
```

Both approaches produce the same result in most cases.

---

# Notes

> **Tip:** `printf()` is especially useful when creating receipts, invoices, reports, tables, scoreboards, and any program where neatly aligned output improves readability.

> **Important:** Always ensure the format specifier matches the variable's data type. Using the wrong specifier can result in an exception or incorrect output.

---

# Printing Multiple Variables

One of the biggest advantages of `printf()` is that it allows multiple variables to be inserted into a single formatted string.

Instead of writing:

```java
System.out.println(name + " is " + age + " years old.");
```

You can write:

```java
System.out.printf("%s is %d years old.%n", name, age);
```

Output

```
SpongeBob is 30 years old.
```

---

# How Multiple Placeholders Work

Each placeholder corresponds to one value supplied after the format string.

Example

```java
System.out.printf(
    "%s is %d years old.",
    name,
    age
);
```

Mapping:

```
%s  → name

%d  → age
```

Java replaces each placeholder **from left to right**.

---

# Placeholder Matching

Example:

```java
String language = "Java";
int version = 21;

System.out.printf(
    "%s Version %d",
    language,
    version
);
```

Process:

```
%s
↓

Java

%d
↓

21
```

Final Output

```
Java Version 21
```

---

# Placeholder Order

The order of placeholders is important.

Correct:

```java
System.out.printf("%s %d", name, age);
```

Incorrect:

```java
System.out.printf("%d %s", name, age);
```

The incorrect example attempts to print a `String` using `%d`, causing a runtime formatting exception.

Always ensure:

- `%s` → `String`
- `%c` → `char`
- `%d` → `int`
- `%f` → `float` or `double`
- `%b` → `boolean`

---

# Complete Example

```java
String name = "SpongeBob";
char firstLetter = 'S';
int age = 30;
double height = 60.5;
boolean employed = true;

System.out.printf(
    "%s (%c) is %d years old, %.1f inches tall, Employed: %b%n",
    name,
    firstLetter,
    age,
    height,
    employed
);
```

Output

```
SpongeBob (S) is 30 years old, 60.5 inches tall, Employed: true
```

---

# Precision

One of the most useful formatting features is **precision**.

Precision controls how many digits appear after the decimal point when printing floating-point numbers.

Without precision:

```java
double price = 19.99;

System.out.printf("%f", price);
```

Output

```
19.990000
```

Notice that Java automatically displays **six digits after the decimal point**.

---

# Setting Precision

Syntax

```
%.nf
```

Where:

- `%` begins the placeholder.
- `.` introduces precision.
- `n` is the number of decimal places.
- `f` indicates a floating-point value.

---

# Examples

### One Decimal Place

```java
double price = 9.99;

System.out.printf("%.1f", price);
```

Output

```
10.0
```

The value is rounded to one decimal place.

---

### Two Decimal Places

```java
System.out.printf("%.2f", price);
```

Output

```
9.99
```

---

### Three Decimal Places

```java
System.out.printf("%.3f", price);
```

Output

```
9.990
```

---

# Precision Examples

Suppose:

```java
double value = 12.3456789;
```

| Format | Output |
|---------|--------|
| `%f` | 12.345679 |
| `%.0f` | 12 |
| `%.1f` | 12.3 |
| `%.2f` | 12.35 |
| `%.3f` | 12.346 |
| `%.4f` | 12.3457 |

---

# Automatic Rounding

Precision automatically rounds numbers.

Example

```java
double value = 5.6789;

System.out.printf("%.2f", value);
```

Output

```
5.68
```

Java rounds the third decimal digit appropriately.

---

# Why Precision Matters

Precision is commonly used when displaying:

- Prices
- Currency
- Scientific measurements
- Engineering calculations
- Percentages
- Statistics
- Reports

Example:

```
$9.99
```

looks much better than

```
$9.990000
```

---

# Format Flags

Flags modify the appearance of formatted output.

General syntax

```
%[flags][width][.precision]specifier
```

Example

```
%,.2f
```

contains:

- Flag
- Precision
- Specifier

---

# Common Flags

| Flag | Purpose |
|------|---------|
| `+` | Show plus sign for positive numbers |
| `,` | Add thousands separator |
| `(` | Display negative numbers inside parentheses |
| Space (` `) | Reserve space for positive numbers |
| `0` | Pad numbers with leading zeros |
| `-` | Left justify within the field width |

---

# Plus Flag (`+`)

Normally:

```java
double balance = 120.50;

System.out.printf("%.2f", balance);
```

Output

```
120.50
```

Using the plus flag:

```java
System.out.printf("%+.2f", balance);
```

Output

```
+120.50
```

Negative values still display the minus sign automatically.

Example:

```java
double balance = -45.75;

System.out.printf("%+.2f", balance);
```

Output

```
-45.75
```

---

# Comma Flag (`,`)

Large numbers are easier to read with commas.

Without comma:

```java
1234567.89
```

With comma:

```java
System.out.printf("%,.2f", 1234567.89);
```

Output

```
1,234,567.89
```

This is especially useful for:

- Salaries
- Bank balances
- Product prices
- Financial reports

---

# Parentheses Flag (`(`)

Some financial reports display negative values inside parentheses instead of using a minus sign.

Example

```java
double loss = -4500.75;

System.out.printf("%(.2f", loss);
```

Output

```
(4500.75)
```

This formatting is commonly seen in accounting statements.

---

# Space Flag (` `)

The space flag reserves a leading space for positive numbers while leaving negative numbers unchanged.

Example

```java
System.out.printf("% .2f%n", 45.6);
System.out.printf("% .2f%n", -45.6);
```

Output

```
 45.60
-45.60
```

This helps align columns of positive and negative values neatly.

---

# Combining Flags

Multiple flags can be combined.

Example

```java
double amount = 1234567.89;

System.out.printf("%+,.2f%n", amount);
```

Output

```
+1,234,567.89
```

Here:

- `+` shows the positive sign.
- `,` inserts grouping separators.
- `.2` limits the value to two decimal places.
- `f` prints a floating-point number.

---

# Notes

> **Tip:** Precision is one of the most frequently used features of `printf()`. When displaying monetary values, always consider limiting output to two decimal places.

> **Important:** Format flags only affect how data is displayed—they do **not** change the underlying value stored in the variable.

---

# Width

Another powerful feature of `printf()` is **width**.

Width specifies the **minimum number of characters** that should be used to display a value.

This is especially useful when printing:

- Tables
- Reports
- Scoreboards
- Receipts
- Employee records
- Student lists

Without width, values of different lengths do not align properly.

---

# Example Without Width

```java
int id1 = 1;
int id2 = 23;
int id3 = 456;
int id4 = 7890;

System.out.printf("%d%n", id1);
System.out.printf("%d%n", id2);
System.out.printf("%d%n", id3);
System.out.printf("%d%n", id4);
```

Output

```
1
23
456
7890
```

Although correct, the values are not aligned.

---

# Setting Width

Syntax

```
%4d
```

The number **4** represents the minimum field width.

Example

```java
System.out.printf("%4d%n", id1);
System.out.printf("%4d%n", id2);
System.out.printf("%4d%n", id3);
System.out.printf("%4d%n", id4);
```

Output

```
   1
  23
 456
7890
```

Every value now occupies at least four character spaces.

This makes the output much easier to read.

---

# Width Visualization

Without width

```
1
23
456
7890
```

With width

```
___1
__23
_456
7890
```

(Underscores represent spaces.)

---

# Zero Padding

Sometimes IDs, invoice numbers, or product codes should always contain a fixed number of digits.

Example:

```
0001
0023
0456
7890
```

To accomplish this, use the `0` flag.

Syntax

```
%04d
```

Example

```java
System.out.printf("%04d%n", id1);
System.out.printf("%04d%n", id2);
System.out.printf("%04d%n", id3);
System.out.printf("%04d%n", id4);
```

Output

```
0001
0023
0456
7890
```

---

# Right Justification

By default, width right-justifies values.

Example

```java
System.out.printf("%6d%n", 125);
```

Output

```
   125
```

Spaces are added before the number.

---

# Left Justification

Use the minus (`-`) flag to align text or numbers to the left.

Syntax

```
%-6d
```

Example

```java
System.out.printf("%-6dDone%n", 125);
```

Output

```
125   Done
```

Spaces are added after the number instead of before it.

---

# Width with Strings

Width is not limited to numbers.

Example

```java
String language = "Java";

System.out.printf("%10s%n", language);
```

Output

```
      Java
```

Left justified

```java
System.out.printf("%-10sProgramming%n", language);
```

Output

```
Java      Programming
```

---

# Width with Floating-Point Numbers

Width can also be combined with precision.

Example

```java
double price = 19.99;

System.out.printf("%10.2f%n", price);
```

Output

```
     19.99
```

Breaking it down:

```
10
```

Minimum width

```
.2
```

Two decimal places

```
f
```

Floating-point value

---

# Combining Width, Precision, and Flags

One of the strengths of `printf()` is that these formatting options can be combined.

Example

```java
double balance = 12345.6789;

System.out.printf("%+,12.2f%n", balance);
```

Output

```
 +12,345.68
```

Explanation:

- `+` → Display plus sign for positive values.
- `,` → Add thousands separator.
- `12` → Minimum field width of 12 characters.
- `.2` → Display two decimal places.
- `f` → Floating-point number.

---

# Format Specifier Structure

A complete format specifier follows this structure:

```
%[flags][width][.precision]specifier
```

Example

```
%+08.2f
```

Breakdown

| Component | Meaning |
|-----------|---------|
| `%` | Start of format specifier |
| `+` | Always show sign |
| `0` | Pad with zeros |
| `8` | Minimum width |
| `.2` | Two decimal places |
| `f` | Floating-point number |

---

# Common Format Specifiers Summary

| Specifier | Data Type | Example |
|-----------|-----------|---------|
| `%s` | String | `"Java"` |
| `%c` | Character | `'A'` |
| `%d` | Integer | `25` |
| `%f` | Float / Double | `19.99` |
| `%b` | Boolean | `true` |

---

# Common Flags Summary

| Flag | Description |
|------|-------------|
| `+` | Show sign for positive values |
| `,` | Group digits with commas |
| `(` | Display negatives inside parentheses |
| Space | Reserve a leading space for positives |
| `0` | Pad with leading zeros |
| `-` | Left justify |

---

# Practical Applications

The `printf()` method is widely used in real-world software development.

Examples include:

- Financial reports
- Billing systems
- Bank statements
- Inventory management
- Payroll software
- Examination result sheets
- Student records
- Airline ticketing systems
- Restaurant billing
- Console-based games
- Scientific calculations
- Data analysis reports

Whenever neatly formatted output is required, `printf()` is usually the preferred choice.

---

# Common Mistakes

## 1. Forgetting the Newline

Incorrect

```java
System.out.printf("Hello");
System.out.printf("World");
```

Output

```
HelloWorld
```

Correct

```java
System.out.printf("Hello%n");
System.out.printf("World%n");
```

---

## 2. Using the Wrong Specifier

Incorrect

```java
String name = "Alice";

System.out.printf("%d", name);
```

This causes an exception because `%d` expects an integer, not a `String`.

Correct

```java
System.out.printf("%s", name);
```

---

## 3. Mismatched Placeholders

Incorrect

```java
System.out.printf("%s %d", name);
```

Two placeholders are provided, but only one value is supplied.

Always ensure that the number of placeholders matches the number of arguments.

---

## 4. Forgetting Precision

Without precision

```
9.990000
```

Preferred

```
9.99
```

---

## 5. Confusing Width with Precision

Remember:

- **Width** controls the total space used.
- **Precision** controls the number of digits after the decimal point.

They solve different formatting problems.

---

# Best Practices

- Use `printf()` whenever output requires alignment or formatting.
- Match every placeholder with the correct data type.
- Use `%n` for new lines in formatted output.
- Display currency values with two decimal places.
- Use commas for large numbers to improve readability.
- Apply width to create neatly aligned tables.
- Keep format strings simple and readable.
- Test formatted output with different values to ensure alignment.

---

# Interview Questions

## Beginner

1. What is the purpose of `printf()` in Java?
2. How does `printf()` differ from `print()` and `println()`?
3. What does `%s` represent?
4. Which specifier is used for integers?
5. Which specifier is used for floating-point numbers?
6. How do you print a boolean value using `printf()`?

---

## Intermediate

1. What is precision in `printf()`?
2. How do you display exactly two decimal places?
3. What is the purpose of the comma flag?
4. Explain the difference between width and precision.
5. How do you left justify output?

---

## Advanced

1. Explain the complete structure of a format specifier.
2. How can multiple formatting options be combined?
3. Why is `printf()` preferred in financial applications?
4. What happens if the placeholder type does not match the argument type?
5. How does width improve the readability of console output?

---

# Summary

In this lesson, you learned how to use Java's **`printf()`** method to create clean, professional, and well-formatted console output.

You explored:

- The difference between `print()`, `println()`, and `printf()`.
- Format specifiers such as `%s`, `%c`, `%d`, `%f`, and `%b`.
- Printing different data types using placeholders.
- Displaying multiple variables in a single statement.
- Controlling decimal places with **precision**.
- Using **flags** to display signs, commas, parentheses, and zero padding.
- Aligning output with **width** and left/right justification.
- Combining formatting options to produce readable tables and reports.

The `printf()` method is an essential tool for building professional console applications and will be used frequently in future Java programs.

---

# Key Points

- `printf()` stands for **Print Formatted**.
- Format specifiers begin with `%`.
- `%s`, `%c`, `%d`, `%f`, and `%b` represent common Java data types.
- `%f` displays six decimal places by default.
- Precision controls decimal places.
- Width controls the minimum display space.
- Flags modify the appearance of output.
- `%n` is recommended for new lines in formatted output.
- `printf()` is ideal for reports, receipts, invoices, and tabular data.
- Correct formatting improves readability and creates more professional programs.

---

> **End of README.md — Day 10**
