# Day 08 — Random Numbers in Java

> **Course:** Java Masterclass (71 Lessons)  
> **Lesson:** 08 / 71  
> **Topic:** Random Numbers  
> **Status:** ✅ Completed

---

# Introduction

Many real-world applications require unpredictability. Games need dice rolls, applications need random passwords, simulations require random events, and software testing often relies on randomly generated data.

Java provides a powerful utility class named **`Random`** that allows developers to generate random values of different data types.

During this lesson, you will learn how to:

- Import the `Random` class
- Create a `Random` object
- Generate random integers
- Generate numbers within a specific range
- Generate random decimal numbers
- Generate random boolean values
- Simulate common real-world scenarios such as rolling dice and flipping coins

Although generating a random number may seem simple, understanding how Java handles ranges and boundaries is extremely important for avoiding common programming mistakes.

---

# Learning Objectives

After completing this lesson, you should be able to:

- Understand what randomness means in programming.
- Import Java's `Random` class.
- Create a `Random` object correctly.
- Generate random integers.
- Generate integers within a specified range.
- Understand inclusive and exclusive bounds.
- Generate multiple random values.
- Generate random decimal numbers.
- Generate random boolean values.
- Simulate dice rolls.
- Simulate coin flips.
- Use random values inside conditional statements.
- Avoid common mistakes when working with random numbers.

---

# What Are Random Numbers?

A **random number** is a value selected unpredictably from a set of possible values.

Humans often think of randomness as complete unpredictability.

Computers, however, are deterministic machines.

This means computers cannot generate truly random numbers by themselves.

Instead, Java generates what are called:

> **Pseudo-random numbers**

These numbers appear random but are actually produced by mathematical algorithms.

For most software applications, pseudo-random numbers are perfectly acceptable.

---

# Real-World Uses of Random Numbers

Random numbers appear everywhere in software development.

| Application | Example |
|------------|---------|
| Games | Dice rolls |
| Card Games | Shuffling cards |
| Casinos | Slot machines |
| Password Generators | Random passwords |
| OTP Systems | Verification codes |
| Simulations | Weather simulation |
| AI | Randomized behaviors |
| Testing | Random test data |
| Security | Nonces (with secure generators) |
| Educational Apps | Random quiz questions |

---

# Concept Overview

The Java `Random` class belongs to the **java.util** package.

It provides methods that generate different types of random values.

Supported data types include:

- int
- double
- boolean
- long
- float
- Gaussian values

In this lesson we focus on:

- `nextInt()`
- `nextDouble()`
- `nextBoolean()`

---

# The Random Class

Before using the Random class, it must be imported.

```java
import java.util.Random;
```

Without importing it, Java will not recognize the class.

---

# Package Hierarchy

```
java
 └── util
      └── Random
```

The `util` package contains many useful utility classes including:

- Scanner
- Arrays
- Collections
- Random
- Date
- Timer

---

# Importing the Random Class

Syntax:

```java
import java.util.Random;
```

This line should appear at the top of your Java file.

Example:

```java
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }

}
```

---

# Creating a Random Object

Just like the `Scanner` class, `Random` is an object.

You first create an instance before generating values.

Syntax:

```java
Random random = new Random();
```

Breakdown:

| Part | Meaning |
|------|----------|
| Random | Class name |
| random | Object name |
| new | Creates a new object |
| Random() | Constructor |

---

# Object Creation Flow

```
Random Class
      │
      ▼
new Random()
      │
      ▼
Random Object
      │
      ▼
Generate Values
```

---

# Why Create an Object?

The Random class contains methods.

Methods belong to an object.

Without an object:

❌ Cannot call:

```java
nextInt()
```

Correct:

```java
Random random = new Random();

random.nextInt();
```

---

# Generating a Random Integer

The simplest method is:

```java
random.nextInt();
```

Example:

```java
Random random = new Random();

int number = random.nextInt();

System.out.println(number);
```

Possible output:

```
-183948112

15487322

998327

-209384920
```

Every execution produces a different value.

---

# Why Are the Numbers So Large?

When no range is specified:

```java
random.nextInt();
```

Java generates **any valid integer**.

An integer occupies **32 bits**.

Possible range:

```
-2,147,483,648

to

2,147,483,647
```

That is over **4 billion possible values**.

---

# Integer Range Diagram

```
Minimum Integer
       │
       ▼

-2,147,483,648
        .
        .
        .
        .
        0
        .
        .
        .
        .
 2,147,483,647

       ▲
Maximum Integer
```

---

# Limiting the Range

Large numbers are rarely useful.

Instead, we specify a range.

Java allows this using:

```java
nextInt(origin, bound)
```

Example:

```java
int number = random.nextInt(1, 7);
```

---

# Understanding the Parameters

```
nextInt(start, end)
```

Parameter meanings:

| Parameter | Meaning |
|-----------|----------|
| start | Inclusive |
| end | Exclusive |

---

# Inclusive vs Exclusive

This is one of the most important concepts of this lesson.

Consider:

```java
random.nextInt(1, 6);
```

Many beginners assume:

```
1
2
3
4
5
6
```

Actually:

```
1
2
3
4
5
```

Because:

- 1 is included.
- 6 is excluded.

---

# Visual Representation

```
Range

1 ----------- 6

↑             ↑
Included   Excluded
```

Possible values:

```
1
2
3
4
5
```

Never:

```
6
```

---

# Getting Numbers Between 1 and 6

To include 6:

```java
random.nextInt(1, 7);
```

Possible outputs:

```
1

2

3

4

5

6
```

Now every dice value becomes possible.

---

# Dice Roll Example

```java
Random random = new Random();

int dice = random.nextInt(1, 7);

System.out.println(dice);
```

Possible output:

```
4
```

Run again:

```
2
```

Run again:

```
6
```

---

# Flow Diagram — Dice Simulation

```
Start

   │

Create Random Object

   │

Generate Number
1–6

   │

Display Result

   │

End
```

---

# Why Does Java Exclude the Upper Bound?

This design makes many programming tasks easier.

For example:

If an array has:

```
10 elements
```

Indexes are:

```
0
1
2
3
4
5
6
7
8
9
```

Generating:

```java
random.nextInt(0,10)
```

Perfectly matches array indexes.

This avoids:

- Index out of bounds errors
- Extra subtraction
- Complex calculations

---

# Common Beginner Mistake

Incorrect:

```java
random.nextInt(1,6);
```

Expectation:

```
1–6
```

Reality:

```
1–5
```

Correct:

```java
random.nextInt(1,7);
```

---

# Rolling Multiple Dice

Games often require multiple random values.

Example:

```java
int number1 = random.nextInt(1,7);
int number2 = random.nextInt(1,7);
int number3 = random.nextInt(1,7);
```

Each call generates a completely new random number.

Example output:

```
2
5
6
```

---

# Example Program

```java
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(1, 7);
        int number2 = random.nextInt(1, 7);
        int number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }

}
```

Possible output:

```
3
1
5
```

Every execution produces different values.

---

# Generating Numbers Between 1 and 100

Simply change the upper bound.

```java
int number = random.nextInt(1,101);
```

Possible values:

```
1

2

3

...

99

100
```

Notice:

```
101
```

is excluded.

---

# Range Formula

To remember Java's range:

```
Minimum = Origin

Maximum = Bound - 1
```

Example:

```
nextInt(10,21)
```

Produces:

```
10

11

12

...

20
```

Never:

```
21
```

---

# Memory Tip

Think of the upper bound as a **wall**.

```
Allowed

1
2
3
4
5
6

Wall

7
```

The random number may approach the wall...

…but it never crosses it.

---

# Key Takeaways

- Java provides the `Random` class for generating pseudo-random values.
- Always import `java.util.Random` before using it.
- Create a `Random` object with `new Random()`.
- `nextInt()` without arguments generates any valid 32-bit integer.
- `nextInt(origin, bound)` generates values within a specific range.
- The **origin is inclusive**, while the **bound is exclusive**.
- To simulate a six-sided die, use `random.nextInt(1, 7)`, not `random.nextInt(1, 6)`.
- Each call to a `Random` method produces a new pseudo-random value.

---

# Generating Random Decimal Numbers

So far, we have generated **integers** (whole numbers).

However, Java can also generate **decimal (floating-point)** values.

The `Random` class provides the `nextDouble()` method for this purpose.

---

## Syntax

```java
double number = random.nextDouble();
```

---

## What Does `nextDouble()` Return?

The `nextDouble()` method returns a random `double` value in the range:

```
0.0 (inclusive)

to

1.0 (exclusive)
```

This means:

- ✅ `0.0` is possible.
- ✅ Values like `0.2537`, `0.9845`, and `0.5001` are possible.
- ❌ `1.0` is **never** generated.

---

## Example

```java
Random random = new Random();

double number = random.nextDouble();

System.out.println(number);
```

### Possible Output

```
0.384219842
```

Run again:

```
0.91038172
```

Run again:

```
0.05283911
```

Every execution produces a different decimal value.

---

# Visual Representation

```
0.0 -------------------------------------- 1.0

↑                                         ↑
Included                              Excluded
```

Possible values:

```
0.000001

0.25

0.50

0.75

0.999999
```

Never:

```
1.0
```

---

# Why Generate Random Doubles?

Random decimal numbers are useful in many applications.

| Application | Example |
|------------|----------|
| Games | Damage multipliers |
| Physics | Simulations |
| AI | Probability calculations |
| Animation | Random movement |
| Statistics | Sampling |
| Machine Learning | Random initialization |

---

# Converting Random Doubles to Different Ranges

Although `nextDouble()` returns values between `0.0` and `1.0`, we can scale them.

Example:

```java
double number = random.nextDouble() * 10;
```

Possible output:

```
7.39482
```

Range:

```
0.0

to

10.0
```

(10.0 is still excluded.)

---

## Example: Between 50 and 100

```java
double number = 50 + random.nextDouble() * 50;
```

Possible values:

```
50.12

63.45

99.87
```

This technique is widely used in games and simulations.

---

# Generating Random Boolean Values

Another useful method is `nextBoolean()`.

A boolean has only two possible values:

- `true`
- `false`

The `Random` class randomly chooses one of them.

---

## Syntax

```java
boolean value = random.nextBoolean();
```

---

## Example

```java
Random random = new Random();

boolean result = random.nextBoolean();

System.out.println(result);
```

Possible output:

```
true
```

Run again:

```
false
```

Run again:

```
true
```

---

# Coin Flip Simulation

One of the most common beginner examples is simulating a coin toss.

A coin has only two possible outcomes:

```
Heads

Tails
```

This maps perfectly to a boolean value.

| Boolean | Coin |
|----------|------|
| true | Heads |
| false | Tails |

---

## Example

```java
Random random = new Random();

boolean isHeads = random.nextBoolean();

System.out.println(isHeads);
```

Possible output:

```
true
```

---

# Using an `if` Statement

Instead of displaying `true` or `false`, we can print meaningful text.

```java
Random random = new Random();

boolean isHeads = random.nextBoolean();

if (isHeads) {
    System.out.println("Heads");
} else {
    System.out.println("Tails");
}
```

### Possible Output

```
Heads
```

Run again:

```
Tails
```

---

# Flow Diagram — Coin Flip

```text
            Start
              │
              ▼
     Create Random Object
              │
              ▼
 Generate Random Boolean
              │
              ▼
     Is Value == true?
        ┌──────────────┐
        │              │
      Yes             No
        │              │
        ▼              ▼
 Print "Heads"   Print "Tails"
        │              │
        └──────┬───────┘
               ▼
              End
```

---

# Comparing Random Methods

| Method | Return Type | Typical Range |
|--------|-------------|---------------|
| `nextInt()` | `int` | Entire integer range |
| `nextInt(origin, bound)` | `int` | Custom range |
| `nextDouble()` | `double` | `0.0` ≤ value < `1.0` |
| `nextBoolean()` | `boolean` | `true` or `false` |

---

# Code Walkthrough

```java
Random random = new Random();
```

Creates a `Random` object that can generate pseudo-random values.

---

```java
int dice = random.nextInt(1, 7);
```

Generates a random integer from **1** to **6**.

---

```java
double value = random.nextDouble();
```

Generates a decimal between **0.0** (inclusive) and **1.0** (exclusive).

---

```java
boolean isHeads = random.nextBoolean();
```

Generates either:

```
true
```

or

```
false
```

---

```java
if (isHeads) {
    System.out.println("Heads");
} else {
    System.out.println("Tails");
}
```

Displays a user-friendly message based on the random boolean value.

---

# Common Mistakes

## 1. Forgetting to Import the Class

❌ Incorrect

```java
Random random = new Random();
```

Without:

```java
import java.util.Random;
```

The program will not compile.

---

## 2. Expecting the Upper Bound to Be Included

Incorrect:

```java
random.nextInt(1, 6);
```

Expectation:

```
1–6
```

Actual:

```
1–5
```

Correct:

```java
random.nextInt(1, 7);
```

---

## 3. Creating Multiple `Random` Objects Unnecessarily

❌ Poor Practice

```java
Random r1 = new Random();
Random r2 = new Random();
Random r3 = new Random();
```

✅ Better

```java
Random random = new Random();

int a = random.nextInt(1, 7);
int b = random.nextInt(1, 7);
int c = random.nextInt(1, 7);
```

Reuse the same object unless there is a specific reason not to.

---

## 4. Confusing `nextInt()` with `nextDouble()`

`nextInt()` returns whole numbers.

`nextDouble()` returns decimal numbers.

---

## 5. Assuming Results Repeat

Every call generates a new pseudo-random value.

```java
random.nextInt(1, 7);
random.nextInt(1, 7);
random.nextInt(1, 7);
```

These values are independent of each other.

---

# Best Practices

- Import `java.util.Random` only once.
- Reuse a single `Random` object where possible.
- Use meaningful variable names such as `diceRoll`, `coinFlip`, or `randomScore`.
- Always remember that the upper bound of `nextInt(origin, bound)` is exclusive.
- Comment your code when learning to improve readability.
- Test your program multiple times to observe different outputs.

---

# Notes

> **Note:** Java's `Random` class generates **pseudo-random** numbers, not truly random ones.

> **Tip:** For games, educational programs, and simulations, `Random` is usually sufficient.

> **Warning:** Do not use `Random` for cryptographic or security-sensitive applications. Java provides other classes (such as `SecureRandom`) for those purposes.

---

# Real-World Applications

The `Random` class is widely used in software development.

Examples include:

- Dice games
- Coin flip simulators
- Lottery number generators
- Random password generation
- Randomized quizzes
- Game enemy spawning
- Random map generation
- AI decision-making
- Simulation software
- Educational tools

---

# Interview Questions

## Beginner

1. What package contains the `Random` class?
2. How do you import the `Random` class?
3. How do you create a `Random` object?
4. What does `nextInt()` return?
5. What is the difference between `nextInt()` and `nextDouble()`?

---

## Intermediate

1. Explain the difference between inclusive and exclusive bounds.
2. Why is `random.nextInt(1, 7)` used for a six-sided die?
3. What values can `nextBoolean()` return?
4. Why should you reuse a `Random` object instead of creating many?
5. Give three real-world applications of random numbers.

---

## Advanced

1. What is a pseudo-random number?
2. Why are computers unable to generate truly random numbers without external sources?
3. When would `Random` be inappropriate for a project?
4. How would you generate a random decimal between two custom values?
5. Why does Java make the upper bound exclusive?

---

# Summary

In this lesson, you learned how to use Java's **`Random`** class to generate pseudo-random values.

You explored how to:

- Import the `Random` class.
- Create a `Random` object.
- Generate random integers.
- Restrict integers to a specific range.
- Understand inclusive and exclusive bounds.
- Simulate dice rolls.
- Generate random decimal values using `nextDouble()`.
- Generate random boolean values using `nextBoolean()`.
- Simulate a coin flip with an `if` statement.
- Apply best practices and avoid common mistakes.

Understanding randomness is an essential programming skill. It forms the foundation for many applications, from games and simulations to testing and probability-based systems.

As you continue your Java journey, the concepts introduced in this lesson will frequently appear in practical projects and future mini applications.

---

# Key Points

- The `Random` class belongs to the `java.util` package.
- Import it using `import java.util.Random;`.
- Create an object with `new Random()`.
- `nextInt()` generates random integers.
- `nextInt(origin, bound)` uses an inclusive lower bound and an exclusive upper bound.
- `nextDouble()` generates decimal values in the range `0.0` (inclusive) to `1.0` (exclusive).
- `nextBoolean()` returns either `true` or `false`.
- Random booleans are useful for simulating events such as coin flips.
- Reuse a single `Random` object whenever possible.
- Always test random programs multiple times to observe different outputs.

---

> **End of README.md — Day 08**
