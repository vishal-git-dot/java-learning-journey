# Day 17 — Temperature Converter 🌡️

## Introduction

In this lesson, we will build a **Temperature Converter** in Java.

This mini project is designed to provide additional practice with the **ternary operator** while combining several Java concepts learned so far.

The program allows the user to:

1. Enter a temperature.
2. Choose whether to convert the temperature to Celsius or Fahrenheit.
3. Perform the appropriate conversion.
4. Display the converted temperature.

Example:

```text
Enter the temperature: 100
Convert to Celsius or Fahrenheit? (C/F): C
The temperature is: 37.8°C
```

This project combines:

- `Scanner`
- User input
- `double`
- `String`
- `nextDouble()`
- `next()`
- Method chaining
- `toUpperCase()`
- `equals()`
- Ternary operator
- Mathematical expressions
- `printf()`
- Format specifiers
- Unicode characters
- Resource management

Although the project is small, it demonstrates how several Java concepts can work together to solve a practical problem.

---

# Learning Objectives

By completing this lesson, you should be able to:

- Create a `Scanner` object.
- Accept numerical input from the user.
- Accept String input from the user.
- Store decimal values using `double`.
- Store units using `String`.
- Convert user input to uppercase.
- Understand method chaining.
- Compare Strings using `equals()`.
- Understand the ternary operator.
- Use the ternary operator to choose between two expressions.
- Convert Fahrenheit to Celsius.
- Convert Celsius to Fahrenheit.
- Format floating-point output.
- Use `printf()`.
- Display one decimal place.
- Display the degree symbol.
- Close a `Scanner`.
- Build a complete interactive Java program.

---

# Project Overview

The Temperature Converter accepts:

```text
Temperature
Target Unit
```

The target unit can be:

```text
C
```

or:

```text
F
```

For example:

```text
Temperature: 100
Target Unit: C
```

means:

```text
100°F → Celsius
```

The result is approximately:

```text
37.8°C
```

Another example:

```text
Temperature: 30
Target Unit: F
```

means:

```text
30°C → Fahrenheit
```

The result is:

```text
86.0°F
```

---

# Program Flow

```text
START
  |
  v
Create Scanner
  |
  v
Ask for temperature
  |
  v
Read temperature
  |
  v
Ask for target unit
  |
  v
Read unit
  |
  v
Convert unit to uppercase
  |
  v
Is unit "C"?
 / \
YES  NO
 |    |
 v    v
F→C  C→F
 |    |
 \    /
  \  /
   vv
Store result
   |
   v
Format result
   |
   v
Display result
   |
   v
Close Scanner
   |
   v
END
```

---

# Concept Overview

| Concept | Purpose |
| ---------------- | ------------------------------ |
| `Scanner` | Accept user input |
| `double` | Store decimal temperatures |
| `String` | Store the target unit |
| `nextDouble()` | Read decimal input |
| `next()` | Read the next token |
| `toUpperCase()` | Normalize user input |
| Method chaining | Call methods sequentially |
| `equals()` | Compare String contents |
| Ternary operator | Choose between two expressions |
| `printf()` | Format output |
| `%.1f` | Display one decimal place |
| `%s` | Display a String |
| `\u00B0` | Degree symbol |
| `close()` | Close the Scanner |

---

# Theory

## Temperature Scales

This project works with two temperature scales:

- Celsius
- Fahrenheit

---

## Celsius

Celsius is widely used around the world.

Important reference points:

```text
0°C   = Water freezes
100°C = Water boils
```

---

## Fahrenheit

Fahrenheit is primarily used in the United States.

Important reference points:

```text
32°F  = Water freezes
212°F = Water boils
```

---

# Temperature Conversion Formulas

## Fahrenheit → Celsius

The formula is:

```text
°C = (°F - 32) × 5 / 9
```

Java:

```java
(temp - 32) * 5 / 9
```

Example:

```text
100°F
```

Calculation:

```text
(100 - 32) × 5 / 9
```

```text
68 × 5 / 9
```

```text
340 / 9
```

```text
37.777...
```

Rounded:

```text
37.8°C
```

---

## Celsius → Fahrenheit

The correct formula is:

```text
°F = °C × 9 / 5 + 32
```

Java:

```java
temp * 9 / 5 + 32
```

Example:

```text
30°C
```

Calculation:

```text
30 × 9 / 5 + 32
```

```text
270 / 5 + 32
```

```text
54 + 32
```

```text
86°F
```

---

# Important Formula Note

The transcript contains:

```java
temp * 5 / 9 + 32
```

for Celsius-to-Fahrenheit conversion.

That formula is incorrect.

The correct formula is:

```java
temp * 9 / 5 + 32
```

Therefore, the implementation in this project uses the correct mathematical formula.

> **Important:** Always verify mathematical formulas when implementing them in code.

---

# Scanner

The `Scanner` class allows a Java program to receive input.

Import:

```java
import java.util.Scanner;
```

Create:

```java
Scanner scanner = new Scanner(System.in);
```

---

# Understanding the Scanner Statement

```java
Scanner scanner = new Scanner(System.in);
```

| Component | Meaning |
| ----------- | ------------------- |
| `Scanner` | Class type |
| `scanner` | Variable name |
| `=` | Assignment operator |
| `new` | Creates an object |
| `Scanner()` | Constructor |
| `System.in` | Standard input |

---

# Reading Temperature

The temperature can contain decimals.

Therefore:

```java
double temp = scanner.nextDouble();
```

is appropriate.

Example:

```text
75.5
```

The value is stored in:

```java
temp
```

---

# Why Use `double`?

A temperature may be:

```text
25
```

but it may also be:

```text
25.5
```

or:

```text
37.777777
```

Therefore, `double` is more appropriate than `int`.

| Type | Example | Suitable |
| -------- | -------: | -------------------------- |
| `int` | `25` | Limited |
| `double` | `25.5` | Yes |
| `String` | `"25.5"` | Not ideal for calculations |

---

# Reading the Unit

The target unit is stored in a `String`:

```java
String unit = scanner.next();
```

The user can enter:

```text
C
```

or:

```text
F
```

---

# Why Use String?

A unit could technically be represented using a `char`.

For example:

```java
char unit = scanner.next().charAt(0);
```

However, this project uses:

```java
String
```

because it allows us to directly use:

```java
toUpperCase()
```

and demonstrates String method chaining.

---

# The `next()` Method

The `next()` method reads the next token from the input.

Example:

```java
String unit = scanner.next();
```

If the user enters:

```text
c
```

then:

```text
unit = "c"
```

---

# Method Chaining

Instead of writing:

```java
String unit = scanner.next();

unit = unit.toUpperCase();
```

we can write:

```java
String unit = scanner.next().toUpperCase();
```

This is called **method chaining**.

---

# Understanding Method Chaining

Consider:

```java
scanner.next().toUpperCase()
```

The operations happen conceptually like this:

```text
scanner
   |
   v
next()
   |
   v
String
   |
   v
toUpperCase()
   |
   v
uppercase String
```

If the user enters:

```text
c
```

the result becomes:

```text
C
```

---

# `toUpperCase()`

The `toUpperCase()` method converts letters to uppercase.

Example:

```java
String unit = "c";

unit = unit.toUpperCase();
```

Result:

```text
C
```

Another example:

```java
String unit = "f";

unit = unit.toUpperCase();
```

Result:

```text
F
```

---

# Why Normalize Input?

Users may enter:

```text
c
C
f
F
```

Without normalization, the program would have to handle every variation.

Using:

```java
toUpperCase()
```

means we only need to handle:

```text
C
F
```

This simplifies the logic.

---

# Comparing Strings

To determine whether the user selected Celsius:

```java
unit.equals("C")
```

This checks whether the contents of `unit` are equal to `"C"`.

Example:

```java
String unit = "C";

System.out.println(unit.equals("C"));
```

Output:

```text
true
```

---

# Why Use `equals()`?

For String content comparison, use:

```java
equals()
```

Correct:

```java
unit.equals("C")
```

Avoid:

```java
unit == "C"
```

The `equals()` method compares the actual contents of the Strings.

---

# Ternary Operator

The main focus of this project is the **ternary operator**.

The ternary operator is a compact alternative to a simple `if-else`.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

---

# Ternary Structure

```text
condition
    |
    v
  true?
 /     \
YES     NO
 |       |
 v       v
true    false
value   value
```

The three components are:

| Component | Purpose |
| --------- | ---------------------------------------- |
| Condition | Question being evaluated |
| `?` | Separates condition from true expression |
| `:` | Separates true and false expressions |

---

# Simple Example

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";
```

If:

```text
age >= 18
```

is true:

```text
Adult
```

Otherwise:

```text
Minor
```

---

# Ternary Operator in This Project

Our condition is:

```java
unit.equals("C")
```

We are asking:

```text
Is the target unit Celsius?
```

The expression becomes:

```java
unit.equals("C")
        ? FahrenheitToCelsius
        : CelsiusToFahrenheit
```

In Java:

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

---

# Understanding the Conversion Decision

Suppose:

```text
temp = 100
unit = "C"
```

The condition:

```java
unit.equals("C")
```

is:

```text
true
```

Therefore:

```java
(temp - 32) * 5 / 9
```

is executed.

Result:

```text
37.777...
```

---

Now suppose:

```text
temp = 30
unit = "F"
```

The condition is:

```text
false
```

Therefore:

```java
temp * 9 / 5 + 32
```

is executed.

Result:

```text
86
```

---

# Why Does `"C"` Mean Fahrenheit → Celsius?

The variable `unit` represents the **target unit**.

For example:

```text
100 C
```

means:

```text
Convert 100°F to Celsius.
```

Therefore:

```java
unit.equals("C")
```

selects:

```text
Fahrenheit → Celsius
```

If the target is Fahrenheit:

```java
unit.equals("F")
```

then the original value is treated as Celsius.

---

# Variables

The main variables are:

```java
double temp;
double newTemp;
String unit;
```

| Variable | Purpose |
| --------- | ----------------------- |
| `temp` | Original temperature |
| `newTemp` | Converted temperature |
| `unit` | Target temperature unit |

---

# `temp`

```java
double temp;
```

Stores the original temperature.

Example:

```text
100
```

---

# `newTemp`

```java
double newTemp;
```

Stores the converted result.

Example:

```text
37.777...
```

---

# `unit`

```java
String unit;
```

Stores:

```text
C
```

or:

```text
F
```

---

# Assigning the Ternary Result

The ternary expression produces a value.

Therefore, we can assign it to `newTemp`:

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

---

# `printf()`

Using:

```java
System.out.println(newTemp);
```

may produce:

```text
37.77777777777778
```

This is not ideal for a user-friendly temperature converter.

Instead, use:

```java
System.out.printf("%.1f", newTemp);
```

Output:

```text
37.8
```

---

# Understanding `%.1f`

The format specifier:

```text
%.1f
```

means:

- `%` = format placeholder
- `.1` = one digit after the decimal point
- `f` = floating-point value

Examples:

```java
System.out.printf("%.1f", 37.7777);
```

Output:

```text
37.8
```

---

# Formatting Examples

| Format | Output |
| ------ | ----------: |
| `%f` | `37.777778` |
| `%.1f` | `37.8` |
| `%.2f` | `37.78` |
| `%.3f` | `37.778` |

---

# String Formatting

The format specifier:

```text
%s
```

is used for Strings.

Example:

```java
String unit = "C";

System.out.printf("%s", unit);
```

Output:

```text
C
```

---

# Combining Format Specifiers

We can combine:

```text
%.1f
```

and:

```text
%s
```

Example:

```java
System.out.printf("%.1f%s", newTemp, unit);
```

Output:

```text
37.8C
```

We can add the degree symbol:

```java
System.out.printf("%.1f\u00B0%s", newTemp, unit);
```

Output:

```text
37.8°C
```

---

# Degree Symbol

The degree symbol is:

```text
°
```

Its Unicode escape sequence is:

```text
\u00B0
```

Therefore:

```java
System.out.printf("%.1f\u00B0%s", newTemp, unit);
```

produces:

```text
37.8°C
```

---

# `print()` vs `println()` vs `printf()`

| Method | Purpose |
| ----------- | -------------------------- |
| `print()` | Prints without a new line |
| `println()` | Prints and adds a new line |
| `printf()` | Prints formatted output |

Example:

```java
System.out.print("Enter temperature: ");
```

The cursor stays on the same line.

Example:

```java
System.out.println("Done!");
```

Moves to the next line.

Example:

```java
System.out.printf("%.1f", temperature);
```

Formats the decimal value.

---

# Complete Program

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        String unit = scanner.next().toUpperCase();

        double newTemp = unit.equals("C")
                ? (temp - 32) * 5 / 9
                : temp * 9 / 5 + 32;

        System.out.printf(
                "The temperature is: %.1f\u00B0%s%n",
                newTemp,
                unit
        );

        scanner.close();
    }
}
```

---

# Code Walkthrough

## Import

```java
import java.util.Scanner;
```

Imports the `Scanner` class.

---

## Main Method

```java
public static void main(String[] args)
```

This is the entry point of the Java program.

---

## Scanner Creation

```java
Scanner scanner = new Scanner(System.in);
```

Creates a Scanner connected to standard console input.

---

## Temperature Input

```java
System.out.print("Enter the temperature: ");
double temp = scanner.nextDouble();
```

The user enters a decimal number.

The value is stored in:

```java
temp
```

---

## Unit Input

```java
System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
String unit = scanner.next().toUpperCase();
```

The program reads the next token and converts it to uppercase.

For example:

```text
c
```

becomes:

```text
C
```

---

## Conversion

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

The condition checks:

```java
unit.equals("C")
```

If true:

```java
(temp - 32) * 5 / 9
```

is used.

If false:

```java
temp * 9 / 5 + 32
```

is used.

---

## Output

```java
System.out.printf(
        "The temperature is: %.1f\u00B0%s%n",
        newTemp,
        unit
);
```

This:

- Displays the converted temperature.
- Displays one decimal place.
- Displays the degree symbol.
- Displays the unit.
- Adds a new line.

---

## Closing Scanner

```java
scanner.close();
```

Closes the Scanner after it is no longer needed.

---

# Example Runs

## Example 1 — Fahrenheit to Celsius

```text
Enter the temperature: 100
Convert to Celsius or Fahrenheit? (C/F): C
The temperature is: 37.8°C
```

---

## Example 2 — Celsius to Fahrenheit

```text
Enter the temperature: 30
Convert to Celsius or Fahrenheit? (C/F): F
The temperature is: 86.0°F
```

---

## Example 3 — Lowercase Input

```text
Enter the temperature: 75
Convert to Celsius or Fahrenheit? (C/F): c
The temperature is: 23.9°C
```

The lowercase `c` works because:

```java
.toUpperCase()
```

converts it to:

```text
C
```

---

## Example 4 — Freezing Point

```text
Enter the temperature: 32
Convert to Celsius or Fahrenheit? (C/F): C
The temperature is: 0.0°C
```

---

## Example 5 — Celsius Freezing Point

```text
Enter the temperature: 0
Convert to Celsius or Fahrenheit? (C/F): F
The temperature is: 32.0°F
```

---

# Temperature Reference Table

| Celsius | Fahrenheit |
| ------: | ---------: |
| `-40°C` | `-40°F` |
| `0°C` | `32°F` |
| `10°C` | `50°F` |
| `20°C` | `68°F` |
| `30°C` | `86°F` |
| `37°C` | `98.6°F` |
| `40°C` | `104°F` |
| `100°C` | `212°F` |

Interesting fact:

```text
-40°C = -40°F
```

This is the only temperature where the numerical values are identical.

---

# Common Mistakes

## Mistake 1 — Incorrect Celsius-to-Fahrenheit Formula

Incorrect:

```java
temp * 5 / 9 + 32
```

Correct:

```java
temp * 9 / 5 + 32
```

---

## Mistake 2 — Comparing Strings With `==`

Incorrect:

```java
unit == "C"
```

Correct:

```java
unit.equals("C")
```

---

## Mistake 3 — Forgetting `toUpperCase()`

If the user enters:

```text
c
```

but the program checks only:

```text
C
```

the comparison may fail.

Use:

```java
scanner.next().toUpperCase();
```

---

## Mistake 4 — Using the Wrong Scanner Method

Incorrect:

```java
double temp = scanner.next();
```

Correct:

```java
double temp = scanner.nextDouble();
```

---

## Mistake 5 — Misspelling `toUpperCase()`

Incorrect:

```java
toUppercase()
```

Correct:

```java
toUpperCase()
```

Java method names are case-sensitive.

---

## Mistake 6 — Incorrect Formatting

Incorrect:

```java
System.out.printf("%.1d", temp);
```

Correct:

```java
System.out.printf("%.1f", temp);
```

`f` is used for floating-point values.

---

## Mistake 7 — Forgetting Parentheses

Incorrect:

```java
temp - 32 * 5 / 9
```

Correct:

```java
(temp - 32) * 5 / 9
```

Parentheses ensure the subtraction occurs before multiplication.

---

# Best Practices

## 1. Normalize User Input

Use:

```java
String unit = scanner.next().toUpperCase();
```

This allows both:

```text
c
C
```

and:

```text
f
F
```

to be handled consistently.

---

## 2. Use Meaningful Variable Names

For a larger project, names such as:

```java
temperature
convertedTemperature
targetUnit
```

can be clearer than:

```java
temp
newTemp
unit
```

The shorter names are acceptable for this small learning project.

---

## 3. Use `double`

Temperature conversions commonly produce fractional values.

Therefore:

```java
double
```

is appropriate.

---

## 4. Use `equals()`

For String content comparison:

```java
unit.equals("C")
```

is preferred.

---

## 5. Use Ternary for Simple Decisions

This project is a good use case because there are only two possible calculations.

---

# Ternary vs If-Else

The ternary version:

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

Equivalent `if-else`:

```java
double newTemp;

if (unit.equals("C")) {
    newTemp = (temp - 32) * 5 / 9;
} else {
    newTemp = temp * 9 / 5 + 32;
}
```

Both are valid.

---

# Comparison

| Feature | Ternary | If-Else |
| ------------------- | ----------------------- | ---------------------- |
| Short | Yes | No |
| Returns a value | Yes | Indirectly |
| Simple conditions | Excellent | Excellent |
| Complex conditions | Can become difficult | Better |
| Multiple statements | Poor fit | Excellent |
| Readability | Good for simple choices | Good for complex logic |

---

# When Not to Use Ternary

Avoid complicated nested ternaries.

For example:

```java
String result = condition1
        ? value1
        : condition2
        ? value2
        : condition3
        ? value3
        : value4;
```

Although valid, this can become difficult to read.

In such situations, use:

```java
if
else if
else
```

---

# Input Validation

The basic project assumes valid input.

For example:

```text
100
C
```

A more robust program should also handle:

```text
100
X
```

and display an error.

Example:

```java
if (!unit.equals("C") && !unit.equals("F")) {
    System.out.println("Invalid unit.");
}
```

This is a useful extension exercise.

---

# Detailed Program Data Flow

```text
User Input
    |
    v
Temperature
    |
    v
temp
    |
    +----------------+
                     |
User Input           |
    |                |
    v                |
Target Unit          |
    |                |
    v                |
toUpperCase()        |
    |                |
    v                |
"C" or "F"           |
    |                |
    v                |
Ternary Condition <--+
    |
    +----------------------+
    |                      |
    v                      v
unit == "C"            unit != "C"
    |                      |
    v                      v
Fahrenheit → Celsius   Celsius → Fahrenheit
    |                      |
    +----------+-----------+
               |
               v
          newTemp
               |
               v
            printf()
               |
               v
            Output
```

---

# Notes

> **Note:** The `unit` variable represents the target unit.

Therefore:

```text
100 C
```

means:

```text
100°F → Celsius
```

and:

```text
30 F
```

means:

```text
30°C → Fahrenheit
```

---

> **Important:** The correct Celsius-to-Fahrenheit formula is:

```java
temp * 9 / 5 + 32
```

---

> **Tip:** Normalize user input before performing comparisons.

```java
String unit = scanner.next().toUpperCase();
```

---

# Code Quality Checklist

- [x] Import `Scanner`.
- [x] Create a Scanner.
- [x] Read temperature with `nextDouble()`.
- [x] Store temperature as `double`.
- [x] Read unit using `next()`.
- [x] Convert unit to uppercase.
- [x] Compare String using `equals()`.
- [x] Use ternary operator.
- [x] Use correct Fahrenheit-to-Celsius formula.
- [x] Use correct Celsius-to-Fahrenheit formula.
- [x] Store result in `newTemp`.
- [x] Format result with `printf()`.
- [x] Display one decimal place.
- [x] Display degree symbol.
- [x] Display the target unit.
- [x] Close Scanner.

---

# Interview Questions

## 1. What is the ternary operator?

The ternary operator is a conditional operator that evaluates a condition and returns one of two expressions.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

---

## 2. Why is it called the ternary operator?

Because it contains three operands:

```text
condition
true expression
false expression
```

---

## 3. How do you compare Strings in Java?

Use:

```java
equals()
```

Example:

```java
unit.equals("C")
```

---

## 4. What does `toUpperCase()` do?

It converts lowercase letters to uppercase.

Example:

```java
"c".toUpperCase()
```

produces:

```text
"C"
```

---

## 5. What does `nextDouble()` do?

It reads the next input token as a `double`.

---

## 6. Why use `double` for temperature?

Because temperature values can contain decimals.

---

## 7. What does `%.1f` mean?

It formats a floating-point number to one decimal place.

---

## 8. What is the Fahrenheit-to-Celsius formula?

```text
(°F - 32) × 5 / 9
```

---

## 9. What is the Celsius-to-Fahrenheit formula?

```text
°C × 9 / 5 + 32
```

---

## 10. Why use `printf()`?

It provides formatted output.

---

## 11. What does `System.in` represent?

It represents Java's standard input stream.

---

## 12. Why close the Scanner?

To release the resource after it is no longer required.

---

# Key Points

- `Scanner` is used for user input.
- `double` is appropriate for temperature values.
- `String` is used for the unit.
- `nextDouble()` reads decimal input.
- `next()` reads the next token.
- `toUpperCase()` normalizes user input.
- Method chaining allows multiple method calls in one expression.
- `equals()` compares String contents.
- The ternary operator provides a compact conditional expression.
- Fahrenheit-to-Celsius:

```java
(temp - 32) * 5 / 9
```

- Celsius-to-Fahrenheit:

```java
temp * 9 / 5 + 32
```

- `printf()` provides formatted output.
- `%.1f` displays one decimal place.
- `%s` displays a String.
- `\u00B0` represents the degree symbol.
- `scanner.close()` closes the Scanner.

---

# Summary

The Temperature Converter is a practical Java mini project that combines several fundamental concepts.

The central expression is:

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

The condition asks:

```text
Is the target unit Celsius?
```

If the answer is yes:

```text
Fahrenheit → Celsius
```

Otherwise:

```text
Celsius → Fahrenheit
```

The project demonstrates how simple Java concepts can be combined into a useful application.

The most important concepts to remember are:

```text
Scanner
   ↓
User Input
   ↓
String Normalization
   ↓
String Comparison
   ↓
Ternary Operator
   ↓
Temperature Formula
   ↓
Formatted Output
```

This mini project provides practical experience with the ternary operator and prepares us for more complex Java control-flow concepts in upcoming lessons.
