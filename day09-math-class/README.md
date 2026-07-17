# Day 09 — Math Class in Java

> **Course Lesson:** 09 
> **Topic:** Math Class  
> **Status:** ✅ Completed

---

# Introduction

Mathematics is one of the most fundamental aspects of programming. Whether you are creating games, scientific software, financial applications, engineering tools, simulations, or even simple calculators, mathematical operations are used everywhere.

Java provides a powerful built-in utility class called the **`Math`** class that contains numerous mathematical constants and methods. Instead of writing complex mathematical calculations from scratch, developers can simply call these predefined methods to perform common operations.

The `Math` class allows you to:

- Access important mathematical constants
- Raise numbers to powers
- Find square roots
- Calculate absolute values
- Round decimal numbers
- Find maximum and minimum values
- Perform trigonometric calculations
- Generate random numbers (covered later through other methods)
- Simplify mathematical programming

Throughout this lesson, you will explore the most commonly used constants and methods of the `Math` class before applying them in practical exercises such as finding the hypotenuse of a right triangle and calculating measurements of a circle and sphere.

---

# Learning Objectives

After completing this lesson, you should be able to:

- Understand the purpose of Java's `Math` class.
- Access mathematical constants.
- Use the value of π (Pi).
- Use Euler's Number (e).
- Raise numbers to powers.
- Find absolute values.
- Calculate square roots.
- Round decimal numbers.
- Always round numbers upward.
- Always round numbers downward.
- Find maximum values.
- Find minimum values.
- Solve mathematical formulas using built-in methods.
- Apply mathematical methods in real-world programming problems.

---

# What is the Math Class?

The **Math** class is a utility class provided by Java that contains static methods and constants used for performing mathematical calculations.

Unlike classes such as `Scanner` or `Random`, you **do not create an object** of the Math class.

Instead, every method is accessed directly using the class name.

Example:

```java
Math.sqrt(25);
```

There is no need to write:

```java
Math math = new Math();
```

This is **not allowed** because the `Math` class is designed to provide only static members.

---

# Why Use the Math Class?

Without the Math class, programmers would have to manually implement many mathematical algorithms.

For example:

- Power calculations
- Square roots
- Trigonometric functions
- Logarithms
- Maximum comparisons
- Minimum comparisons
- Rounding operations

The Math class provides reliable, optimized implementations of these operations, making programs simpler, more readable, and less error-prone.

---

# Key Features of the Math Class

- Built into Java
- No import statement required
- Contains only static members
- Easy to use
- Highly optimized
- Platform independent

---

# Math Class Overview

```
Java Program
      │
      ▼
  Math Class
      │
      ├── Constants
      │      ├── PI
      │      └── E
      │
      ├── Power
      ├── Square Root
      ├── Absolute Value
      ├── Rounding
      ├── Maximum
      └── Minimum
```

---

# Static Members

One important concept introduced by the Math class is **static members**.

Static members belong to the class itself rather than individual objects.

That is why we write:

```java
Math.sqrt(9);
```

instead of

```java
math.sqrt(9);
```

The class itself provides access to these methods.

---

# Mathematical Constants

Java provides several built-in mathematical constants.

The two most common are:

| Constant | Description |
|----------|-------------|
| `Math.PI` | Value of π (Pi) |
| `Math.E` | Euler's Number |

These constants are available whenever needed.

---

# The PI Constant

One of the most frequently used mathematical constants is π (Pi).

Pi is approximately:

```
3.141592653589793
```

Instead of typing this value manually, Java already provides it.

Syntax:

```java
Math.PI
```

---

# Example

```java
System.out.println(Math.PI);
```

Output

```
3.141592653589793
```

---

# Why Use Math.PI?

Instead of writing:

```java
double pi = 3.141592653589793;
```

You can simply write:

```java
Math.PI
```

Advantages:

- More readable
- More accurate
- No typing mistakes
- Always available

---

# Common Uses of Pi

Pi appears in many mathematical formulas.

Examples include:

Circle circumference

```
2 × π × r
```

Circle area

```
π × r²
```

Sphere volume

```
4/3 × π × r³
```

Cylinder volume

```
π × r² × h
```

Cone volume

```
1/3 × π × r² × h
```

---

# The E Constant

Another mathematical constant available in Java is:

```java
Math.E
```

Euler's Number is approximately:

```
2.718281828459045
```

---

# Example

```java
System.out.println(Math.E);
```

Output

```
2.718281828459045
```

---

# What is Euler's Number?

Euler's Number is widely used in:

- Exponential growth
- Compound interest
- Statistics
- Machine learning
- Scientific computing
- Population growth
- Continuous decay

Although beginners may not use it often, it becomes increasingly important in higher-level mathematics and computer science.

---

# The Math.pow() Method

One of the most useful methods in the Math class is `pow()`.

It raises a number to a specified power.

General Syntax:

```java
Math.pow(base, exponent)
```

---

# Parameters

| Parameter | Description |
|-----------|-------------|
| Base | Number being multiplied |
| Exponent | Number of times the base is multiplied |

---

# Example

```java
double result;

result = Math.pow(2, 3);

System.out.println(result);
```

Output

```
8.0
```

---

# Understanding Powers

```
2³

=

2 × 2 × 2

=

8
```

---

# More Examples

```java
Math.pow(2,4)
```

Output

```
16
```

---

```java
Math.pow(5,2)
```

Output

```
25
```

---

```java
Math.pow(10,3)
```

Output

```
1000
```

---

# Variables Can Also Be Used

```java
double number = 7;

double result = Math.pow(number, 2);
```

Output

```
49
```

---

# When Should You Use Math.pow()?

Use it whenever your program needs exponentiation.

Examples:

- Area calculations
- Volume calculations
- Scientific formulas
- Financial calculations
- Engineering software
- Physics simulations

---

# Absolute Value

Sometimes numbers become negative during calculations.

The **absolute value** of a number is its distance from zero.

Negative signs are ignored.

---

# Math.abs()

Syntax

```java
Math.abs(number)
```

---

# Example

```java
System.out.println(Math.abs(-5));
```

Output

```
5
```

---

```java
System.out.println(Math.abs(10));
```

Output

```
10
```

---

```java
System.out.println(Math.abs(-98.75));
```

Output

```
98.75
```

---

# Visual Representation

```
<--------|-------->

-5   -4   -3   -2   -1   0   1   2   3   4   5

Absolute Value

|-5| = 5

|5| = 5
```

---

# Real-World Uses of Absolute Value

Absolute values are commonly used in:

- Measuring distance
- Financial loss calculations
- Temperature differences
- Physics simulations
- Navigation software
- GPS systems

---

# Square Root

The Math class provides an easy way to calculate square roots.

Method:

```java
Math.sqrt(number)
```

---

# Example

```java
double result = Math.sqrt(9);

System.out.println(result);
```

Output

```
3.0
```

---

# More Examples

```java
Math.sqrt(16)
```

Output

```
4
```

---

```java
Math.sqrt(25)
```

Output

```
5
```

---

```java
Math.sqrt(64)
```

Output

```
8
```

---

# Square Root Diagram

```
25

↓

√25

↓

5
```

---

# Practical Applications of Square Roots

Square roots appear in:

- Geometry
- Engineering
- Physics
- Distance calculations
- Game development
- Artificial Intelligence
- Machine Learning

---

# Code Walkthrough

```java
double result;

result = Math.sqrt(49);

System.out.println(result);
```

Step-by-step:

1. Call the `sqrt()` method.
2. Pass the number 49.
3. Java calculates the square root.
4. Store the result.
5. Print the answer.

Output

```
7.0
```

---

# Common Beginner Mistakes

## Mistake 1

Using a lowercase `m`

Incorrect

```java
math.sqrt(9);
```

Correct

```java
Math.sqrt(9);
```

Java class names are case-sensitive.

---

## Mistake 2

Creating a Math object

Incorrect

```java
Math math = new Math();
```

Correct

```java
Math.sqrt(9);
```

---

## Mistake 3

Typing Pi manually

Avoid:

```java
3.141592653589793
```

Prefer:

```java
Math.PI
```

---

# Best Practices

- Always use the built-in constants instead of hardcoding values.
- Use `Math.pow()` instead of repeated multiplication when clarity is more important.
- Use descriptive variable names such as `radius`, `hypotenuse`, or `area`.
- Remember that `Math` methods are static and accessed through the class name.
- Use comments to explain mathematical formulas in your code.

---

# Key Takeaways

- The `Math` class provides built-in mathematical constants and methods.
- No object creation is required because all members are static.
- `Math.PI` gives the value of π.
- `Math.E` gives Euler's Number.
- `Math.pow()` raises a number to a power.
- `Math.abs()` returns the absolute value of a number.
- `Math.sqrt()` calculates the square root of a number.
- Using the built-in `Math` class makes programs cleaner, more accurate, and easier to maintain.

---

# Rounding Numbers

In real-world applications, numbers often contain many decimal places.

For example:

```
3.141592653589793
```

Sometimes displaying every decimal digit is unnecessary.

The Java `Math` class provides several methods for rounding numbers in different ways.

The three most commonly used methods are:

| Method | Purpose |
|---------|----------|
| `Math.round()` | Round to the nearest whole number |
| `Math.ceil()` | Always round upward |
| `Math.floor()` | Always round downward |

Each method has a different purpose depending on the problem you are solving.

---

# The Math.round() Method

The `round()` method rounds a decimal number to the **nearest whole number**.

### Syntax

```java
Math.round(number)
```

---

## Example

```java
double value = 3.14;

System.out.println(Math.round(value));
```

Output

```
3
```

---

### Another Example

```java
double value = 3.75;

System.out.println(Math.round(value));
```

Output

```
4
```

---

## How It Works

```
3.49

↓

3
```

```
3.50

↓

4
```

```
3.99

↓

4
```

The decimal portion determines whether the value rounds down or up.

---

# Rounding Rule

| Decimal Portion | Result |
|-----------------|--------|
| Less than 0.5 | Round Down |
| Greater than or equal to 0.5 | Round Up |

Examples:

| Number | Rounded Value |
|---------|---------------|
| 1.2 | 1 |
| 4.49 | 4 |
| 4.50 | 5 |
| 8.99 | 9 |

---

# Real-World Uses of Math.round()

- Average scores
- Currency display
- Student grades
- Population estimates
- Temperature display
- Statistical summaries

---

# The Math.ceil() Method

Sometimes you always want the result to move upward.

For this purpose Java provides:

```java
Math.ceil()
```

The word **ceil** comes from **ceiling**.

Imagine the number moving upward until it touches the ceiling.

---

## Syntax

```java
Math.ceil(number)
```

---

## Example

```java
double value = 3.14;

System.out.println(Math.ceil(value));
```

Output

```
4.0
```

---

### More Examples

```java
Math.ceil(2.01)
```

Output

```
3.0
```

---

```java
Math.ceil(9.99)
```

Output

```
10.0
```

---

```java
Math.ceil(7.0)
```

Output

```
7.0
```

If the number is already an integer, nothing changes.

---

# Ceiling Visualization

```
      Ceiling

4 ───────────────────

      ↑

3.14

Always moves upward
```

---

# Practical Applications

The ceiling method is useful when:

- Calculating shipping boxes
- Hotel room bookings
- Ticket reservations
- Page numbers
- Resource allocation

Example:

If 21 students need buses that hold 10 students each:

```
21 / 10

=

2.1 buses
```

You cannot rent:

```
2.1 buses
```

Instead:

```
Math.ceil(2.1)

=

3
```

---

# The Math.floor() Method

The opposite of ceiling is floor.

Instead of moving upward, the value moves downward.

---

## Syntax

```java
Math.floor(number)
```

---

## Example

```java
double value = 3.99;

System.out.println(Math.floor(value));
```

Output

```
3.0
```

---

### More Examples

```java
Math.floor(9.87)
```

Output

```
9
```

---

```java
Math.floor(15.999)
```

Output

```
15
```

---

```java
Math.floor(7.0)
```

Output

```
7
```

---

# Floor Visualization

```
3.99

↓

3

────────────── Floor
```

---

# Real-World Uses

Floor is useful when:

- Counting completed tasks
- Full containers
- Whole units sold
- Inventory management
- Pagination
- Game scoring

---

# Comparison of Rounding Methods

| Value | round() | ceil() | floor() |
|--------|---------|---------|----------|
| 3.14 | 3 | 4 | 3 |
| 3.50 | 4 | 4 | 3 |
| 3.99 | 4 | 4 | 3 |
| 7.00 | 7 | 7 | 7 |

---

# Which Method Should You Choose?

| Situation | Recommended Method |
|------------|-------------------|
| Normal rounding | `round()` |
| Always round upward | `ceil()` |
| Always round downward | `floor()` |

---

# Finding the Maximum Value

Java also provides methods for comparing numbers.

The first is:

```java
Math.max()
```

It returns the larger of two values.

---

## Syntax

```java
Math.max(value1, value2)
```

---

## Example

```java
System.out.println(Math.max(10,20));
```

Output

```
20
```

---

### More Examples

```java
Math.max(50,18)
```

Output

```
50
```

---

```java
Math.max(-3,-9)
```

Output

```
-3
```

---

# Visual Representation

```
10        20

↓

Maximum

20
```

---

# Using Variables

```java
int a = 75;
int b = 96;

int largest = Math.max(a,b);

System.out.println(largest);
```

Output

```
96
```

---

# Practical Applications

Maximum values are useful for:

- Finding highest scores
- Largest salary
- Tallest building
- Maximum temperature
- Greatest distance
- Highest price

---

# Finding the Minimum Value

The opposite method is:

```java
Math.min()
```

It returns the smallest value.

---

## Syntax

```java
Math.min(value1,value2)
```

---

## Example

```java
System.out.println(Math.min(10,20));
```

Output

```
10
```

---

### More Examples

```java
Math.min(82,14)
```

Output

```
14
```

---

```java
Math.min(-5,-10)
```

Output

```
-10
```

---

# Using Variables

```java
int width = 80;
int height = 50;

int smallest = Math.min(width,height);

System.out.println(smallest);
```

Output

```
50
```

---

# Comparison Table

| Method | Purpose | Example |
|---------|----------|----------|
| `Math.max()` | Returns the larger value | `Math.max(5,8)` |
| `Math.min()` | Returns the smaller value | `Math.min(5,8)` |

---

# Complete Math Methods Covered

| Method | Description |
|----------|-------------|
| `Math.PI` | Pi constant |
| `Math.E` | Euler's Number |
| `Math.pow()` | Raise a number to a power |
| `Math.abs()` | Absolute value |
| `Math.sqrt()` | Square root |
| `Math.round()` | Nearest whole number |
| `Math.ceil()` | Round upward |
| `Math.floor()` | Round downward |
| `Math.max()` | Larger value |
| `Math.min()` | Smaller value |

---

# Sample Program

```java
public class Main {

    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.pow(2,3));

        System.out.println(Math.sqrt(16));

        System.out.println(Math.abs(-10));

        System.out.println(Math.round(4.6));

        System.out.println(Math.ceil(4.1));

        System.out.println(Math.floor(4.9));

        System.out.println(Math.max(10,20));

        System.out.println(Math.min(10,20));

    }

}
```

---

# Sample Output

```
3.141592653589793

8.0

4.0

10

5

5.0

4.0

20

10
```

---

# Common Beginner Mistakes

## Using a Lowercase `m`

Incorrect

```java
math.sqrt(25);
```

Correct

```java
Math.sqrt(25);
```

Java is case-sensitive.

---

## Forgetting Parentheses

Incorrect

```java
Math.sqrt;
```

Correct

```java
Math.sqrt(25);
```

---

## Hardcoding Mathematical Constants

Instead of:

```java
3.141592653589793
```

Use:

```java
Math.PI
```

---

## Confusing `ceil()` and `round()`

Remember:

```
ceil()

Always Up
```

```
round()

Nearest Integer
```

---

## Confusing `floor()` with `round()`

```
floor()

Always Down
```

Even:

```
3.99

↓

3
```

---

# Best Practices

- Use `Math.PI` instead of manually typing Pi.
- Prefer built-in methods over custom implementations.
- Keep mathematical expressions readable.
- Use descriptive variable names.
- Add comments for complex formulas.
- Test calculations using known values.

---

# Key Takeaways 

- `Math.round()` rounds to the nearest whole number.
- `Math.ceil()` always rounds upward.
- `Math.floor()` always rounds downward.
- `Math.max()` returns the larger of two values.
- `Math.min()` returns the smaller of two values.
- Java's `Math` class provides reliable, optimized mathematical operations that simplify code and improve readability.

---

# Practical Exercise 1 — Hypotenuse Calculator

After learning the most commonly used methods of the `Math` class, let's apply them in a practical program.

In this exercise, we will calculate the **hypotenuse** of a right triangle using the **Pythagorean Theorem**.

This example combines several concepts learned so far:

- User input (`Scanner`)
- Variables
- Mathematical operators
- `Math.pow()`
- `Math.sqrt()`
- Output formatting

---

# What is the Hypotenuse?

A right triangle has three sides.

```
          C
         /|
        / |
       /  |
      /   |
     /    |
    /     |
   /______|
  A        B
```

- **A** = First side
- **B** = Second side
- **C** = Hypotenuse (Longest side)

The hypotenuse is always opposite the 90° angle.

---

# Pythagorean Theorem

The formula is:

```
C² = A² + B²
```

To calculate the hypotenuse:

```
C = √(A² + B²)
```

---

# Mathematical Breakdown

Suppose:

```
A = 3

B = 4
```

Step 1

```
3² = 9
```

Step 2

```
4² = 16
```

Step 3

```
9 + 16 = 25
```

Step 4

```
√25 = 5
```

Therefore:

```
C = 5
```

---

# Algorithm

```text
Start
   │
Create Scanner
   │
Input Side A
   │
Input Side B
   │
Calculate A²
   │
Calculate B²
   │
Add Results
   │
Find Square Root
   │
Display Hypotenuse
   │
Close Scanner
   │
End
```

---

# Step-by-Step Implementation

## Step 1 — Import Scanner

```java
import java.util.Scanner;
```

---

## Step 2 — Create Scanner Object

```java
Scanner scanner = new Scanner(System.in);
```

---

## Step 3 — Declare Variables

```java
double a;
double b;
double c;
```

---

## Step 4 — Read User Input

```java
System.out.print("Enter side A: ");
a = scanner.nextDouble();

System.out.print("Enter side B: ");
b = scanner.nextDouble();
```

---

## Step 5 — Apply the Formula

```java
c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
```

Breaking this down:

```java
Math.pow(a, 2)
```

Calculates:

```
A²
```

---

```java
Math.pow(b, 2)
```

Calculates:

```
B²
```

---

```java
Math.sqrt(...)
```

Calculates the square root of the result.

---

# Complete Formula

```java
c = Math.sqrt(
        Math.pow(a, 2)
      + Math.pow(b, 2)
);
```

Although it can be written on one line, formatting it across multiple lines improves readability.

---

# Sample Run

```
Enter side A: 3
Enter side B: 4

Hypotenuse = 5.0
```

---

Another example

```
Enter side A: 5
Enter side B: 12

Hypotenuse = 13.0
```

---

# Real-World Applications

The Pythagorean theorem is used in:

- Navigation
- GPS systems
- Construction
- Architecture
- Engineering
- Computer graphics
- Robotics
- Physics
- Video games

---

# Practical Exercise 2 — Circle and Sphere Calculator

The second exercise demonstrates how mathematical constants and methods work together to solve multiple problems.

The program asks the user for the **radius** and calculates:

- Circumference of a circle
- Area of a circle
- Volume of a sphere

---

# Mathematical Formulas

## Circumference

```
2 × π × r
```

---

## Area

```
π × r²
```

---

## Volume of a Sphere

```
4/3 × π × r³
```

---

# Variables Required

```java
double radius;

double circumference;

double area;

double volume;
```

---

# Step 1 — Read Radius

```java
System.out.print("Enter the radius: ");

radius = scanner.nextDouble();
```

---

# Step 2 — Calculate Circumference

Formula

```
2πr
```

Java

```java
circumference = 2 * Math.PI * radius;
```

Notice that we use:

```java
Math.PI
```

instead of manually typing:

```
3.141592653589793
```

---

# Step 3 — Calculate Area

Formula

```
πr²
```

Java

```java
area = Math.PI * Math.pow(radius, 2);
```

---

# Step 4 — Calculate Volume

Formula

```
4/3 × π × r³
```

Java

```java
volume = (4.0 / 3.0)
        * Math.PI
        * Math.pow(radius, 3);
```

Notice the use of:

```
4.0 / 3.0
```

Using decimal values ensures floating-point division instead of integer division.

---

# Sample Run

```
Enter radius: 5

Circumference = 31.4159 cm

Area = 78.5398 cm²

Volume = 523.5988 cm³
```

---

# Why Use Math.PI?

Avoid writing:

```java
3.141592653589793
```

Instead:

```java
Math.PI
```

Benefits:

- More readable
- More accurate
- Less typing
- No rounding mistakes

---

# About printf()

Toward the end of the lesson, the instructor briefly introduces the `printf()` method.

Although `printf()` is covered in a later chapter, it is useful to understand why it appears here.

Without formatting:

```
523.5987755982989
```

With formatting:

```java
System.out.printf("%.1f", volume);
```

Output

```
523.6
```

---

# Understanding %.1f

```
%
```

Placeholder

```
.1
```

Display one digit after the decimal point.

```
f
```

Floating-point number (`float` or `double`).

---

## More Examples

| Format | Example Output |
|---------|----------------|
| `%.0f` | 25 |
| `%.1f` | 25.3 |
| `%.2f` | 25.34 |
| `%.3f` | 25.347 |

> **Note:** A detailed explanation of `printf()` will be covered in a future lesson.

---

# Common Mistakes

## Forgetting to Close the Scanner

```java
scanner.close();
```

Always close the `Scanner` when it is no longer needed.

---

## Using Integer Division

Incorrect

```java
4 / 3
```

Result

```
1
```

Correct

```java
4.0 / 3.0
```

Result

```
1.333333...
```

---

## Using Lowercase `math`

Incorrect

```java
math.pow(...)
```

Correct

```java
Math.pow(...)
```

Java class names are case-sensitive.

---

## Typing Pi Manually

Avoid:

```java
3.1415926535
```

Prefer:

```java
Math.PI
```

---

# Best Practices

- Prefer built-in mathematical methods over manual calculations.
- Use descriptive variable names such as `radius`, `circumference`, `area`, and `volume`.
- Test formulas with known values (e.g., a 3-4-5 triangle).
- Format long mathematical expressions across multiple lines for readability.
- Comment complex formulas when learning.
- Close resources like `Scanner` after use.

---

# Interview Questions

## Beginner

1. What is the purpose of the `Math` class?
2. Why is `Math.PI` preferred over typing the value manually?
3. What does `Math.pow()` do?
4. Which method calculates a square root?
5. Which method returns the larger of two values?

---

## Intermediate

1. Explain the difference between `round()`, `ceil()`, and `floor()`.
2. Why does `Math` not require object creation?
3. How would you calculate the hypotenuse of a right triangle in Java?
4. How do you calculate the area of a circle using the `Math` class?
5. Why should `Scanner` objects be closed?

---

## Advanced

1. Explain why `4.0 / 3.0` is used instead of `4 / 3` in the sphere volume formula.
2. Describe the advantages of using built-in mathematical methods.
3. How does `Math.pow()` improve code readability?
4. In what situations would `Math.abs()` be useful?
5. Why is testing mathematical programs with known values considered a best practice?

---

# Summary

In this lesson, you explored Java's powerful **`Math`** class and learned how it simplifies common mathematical operations.

You covered:

- Mathematical constants (`Math.PI` and `Math.E`)
- Power calculations with `Math.pow()`
- Absolute values using `Math.abs()`
- Square roots with `Math.sqrt()`
- Rounding methods (`round()`, `ceil()`, and `floor()`)
- Finding maximum and minimum values using `Math.max()` and `Math.min()`

You then applied these concepts in two practical programs:

1. A **Hypotenuse Calculator** using the Pythagorean Theorem.
2. A **Circle and Sphere Calculator** that computes circumference, area, and volume from a given radius.

These examples demonstrate how built-in mathematical utilities make Java programs more concise, readable, and accurate. The `Math` class is one of the most frequently used utility classes in Java and will continue to play an important role in future programming projects.

---

# Key Points

- The `Math` class is built into Java and does not require importing.
- All members of the `Math` class are **static** and are accessed using the class name.
- `Math.PI` and `Math.E` provide accurate mathematical constants.
- `Math.pow()` raises a number to a specified power.
- `Math.sqrt()` calculates square roots.
- `Math.abs()` returns the absolute value of a number.
- `Math.round()`, `Math.ceil()`, and `Math.floor()` provide different rounding behaviors.
- `Math.max()` and `Math.min()` compare two values.
- Mathematical methods become especially useful when solving real-world problems such as geometry, engineering calculations, and scientific applications.
- Combining the `Math` class with user input (`Scanner`) enables interactive mathematical programs.

---

> **End of README.md — Day 09**
