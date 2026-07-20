# Day 11 — Compound Interest Calculator 💰
> **Mini Project #3**

> **Course Chapter:** 11 — Compound Interest Calculator  
> **Project Type:** Console Application  
> **Difficulty:** Beginner to Intermediate  
> **Prerequisites:**
>
> - Variables
> - User Input (`Scanner`)
> - Mathematical Operators
> - `Math.pow()`
> - `printf()`
> - Data Types (`double`, `int`)
> - Basic Formula Evaluation

---

# Introduction

Welcome to your **third mini project** in this Java learning journey!

So far, you've learned the fundamental building blocks of Java programming:

- Variables
- Data Types
- User Input
- Math Class
- Formatted Output
- Random Numbers
- Arithmetic Operations

Now it's time to combine these concepts into a practical application.

In this project, you'll build a **Compound Interest Calculator** that calculates how much money an investment will grow over time based on:

- Initial investment (Principal)
- Interest rate
- Number of times interest is compounded each year
- Investment duration (Years)

This project closely resembles programs used by:

- Banks
- Investment companies
- Financial planners
- Retirement calculators
- Savings account simulators
- Loan estimation tools

Although this is a beginner project, it introduces an important real-world financial concept while strengthening your Java programming skills.

---

# Learning Objectives

By the end of this project, you will be able to:

- Build a complete Java console application.
- Accept multiple user inputs using `Scanner`.
- Work with both `int` and `double` variables.
- Convert percentages into decimal values.
- Apply mathematical formulas in Java.
- Use the `Math.pow()` method.
- Display formatted output using `printf()`.
- Organize code logically from input to output.
- Understand the concept of compound interest.
- Appreciate how programming solves real-world financial problems.

---

# Project Overview

### Project Name

**Compound Interest Calculator**

### Goal

Calculate the final value of an investment after earning compound interest.

The user enters:

- Principal amount
- Annual interest rate
- Number of compound periods per year
- Investment duration

The program then calculates the final amount using the compound interest formula.

---

# What is Compound Interest?

Compound interest is often called:

> **"Interest on Interest."**

Unlike simple interest, compound interest allows previously earned interest to earn additional interest.

This causes investments to grow faster over time.

---

## Example

Imagine you deposit:

```
₹10,000
```

at

```
5% interest
```

If interest is compounded yearly:

### Year 1

```
₹10,000

↓

+5%

↓

₹10,500
```

---

### Year 2

Interest is now calculated on

```
₹10,500
```

instead of

```
₹10,000
```

Result

```
₹11,025
```

Notice something important.

You earned interest on:

- Original investment
- Previous year's interest

This is the power of compound interest.

---

# Simple Interest vs Compound Interest

| Simple Interest | Compound Interest |
|-----------------|------------------|
| Calculated only on principal | Calculated on principal + previous interest |
| Growth is linear | Growth is exponential |
| Lower returns | Higher returns |
| Easier calculation | Uses exponential formula |
| Rare for investments | Common in banking and investing |

---

# Real-World Applications

Compound interest appears almost everywhere in finance.

Examples include:

- Savings accounts
- Fixed deposits
- Retirement funds
- Mutual funds
- Stock market investments
- Cryptocurrency staking
- Education savings plans
- Loan repayment calculations
- Credit card interest
- Mortgage calculations

Many financial websites provide compound interest calculators that work using the same mathematical formula you'll implement in this project.

---

# Mathematical Formula

The standard compound interest formula is:

```
A = P(1 + r / n)^(nt)
```

Where:

| Symbol | Meaning |
|---------|----------|
| **A** | Final amount |
| **P** | Principal amount |
| **r** | Annual interest rate (decimal) |
| **n** | Number of compound periods per year |
| **t** | Time in years |

---

# Formula Breakdown

Let's understand every part.

```
P
```

Original investment.

Example:

```
₹25,000
```

---

```
r
```

Annual interest rate.

Example

```
5%
```

must become

```
0.05
```

before calculation.

---

```
n
```

How many times interest is added each year.

Examples:

| Type | Times Per Year |
|------|----------------|
| Yearly | 1 |
| Semi-Annual | 2 |
| Quarterly | 4 |
| Monthly | 12 |
| Weekly | 52 |
| Daily | 365 |

---

```
t
```

Investment duration.

Example

```
10 years
```

---

```
A
```

Final amount after compound interest.

---

# Visual Formula Breakdown

```
             r
1 + ---------------
            n

↓

Raise to

n × t

↓

Multiply by Principal

↓

Final Amount
```

---

# Converting Percentage into Decimal

One important step in this project is converting the user's interest rate.

Suppose the user enters:

```
5
```

They mean:

```
5%
```

Computers, however, require:

```
0.05
```

Therefore:

```java
rate = rate / 100;
```

Example conversions:

| Percentage | Decimal |
|------------|---------|
| 2 | 0.02 |
| 3 | 0.03 |
| 5 | 0.05 |
| 7.5 | 0.075 |
| 10 | 0.10 |

Without this conversion, the calculation would be completely incorrect.

---

# Project Requirements

The calculator should ask the user to enter:

1. Principal Amount
2. Interest Rate
3. Compound Frequency
4. Number of Years

After receiving the input, the program should calculate:

```
Final Investment Amount
```

and display the result in a clear, formatted manner.

---

# Expected Program Flow

```
Start

↓

Create Scanner

↓

Ask for Principal

↓

Ask for Interest Rate

↓

Convert Percentage to Decimal

↓

Ask for Compound Frequency

↓

Ask for Number of Years

↓

Apply Formula

↓

Display Final Amount

↓

Close Scanner

↓

End
```

---

# Variables Used

| Variable | Data Type | Purpose |
|----------|-----------|---------|
| `principal` | `double` | Original investment amount |
| `rate` | `double` | Annual interest rate |
| `timesCompounded` | `int` | Number of compound periods per year |
| `years` | `int` | Investment duration |
| `amount` | `double` | Final calculated amount |

---

# Why Use `double`?

Financial calculations often involve decimal values.

Example:

```
₹1250.75
```

Using `int` would remove the decimal portion.

Therefore:

```java
double principal;
```

is the appropriate choice.

---

# Why Use `int` for Years?

Years are typically represented as whole numbers.

Examples:

```
5 years

10 years

25 years
```

Similarly, the number of compound periods per year (1, 4, 12, etc.) is also a whole number.

Thus:

```java
int years;
int timesCompounded;
```

are suitable data types.

---

# Notes

> **Tip:** Always validate financial input in real-world applications. For example, the principal amount should not be negative, and the interest rate should be within a reasonable range.

> **Important:** This project assumes valid user input and focuses on applying Java fundamentals and the compound interest formula rather than input validation.

---

# Step 1 — Importing the Scanner Class

To receive input from the keyboard, we need Java's `Scanner` class.

```java
import java.util.Scanner;
```

Without this import statement, Java will not recognize the `Scanner` class, resulting in a compilation error.

---

# Why Do We Need Scanner?

Our program asks the user to enter:

- Principal amount
- Interest rate
- Number of times interest is compounded
- Investment duration

These values are unknown until the program runs, so they must be entered by the user.

```
User

↓

Keyboard Input

↓

Scanner

↓

Java Variables
```

---

# Step 2 — Creating the Scanner Object

```java
Scanner scanner = new Scanner(System.in);
```

### Breakdown

| Part | Meaning |
|------|---------|
| `Scanner` | Class name |
| `scanner` | Object name |
| `new` | Creates an object |
| `System.in` | Reads keyboard input |

---

# Step 3 — Declaring Variables

Next, declare all variables before using them.

```java
double principal;
double rate;
int timesCompounded;
int years;
double amount;
```

---

## Variable Breakdown

### Principal

```java
double principal;
```

Stores the original investment.

Example

```
₹25,000
```

---

### Rate

```java
double rate;
```

Stores the annual interest rate.

Example

```
5
```

Later converted into

```
0.05
```

---

### Times Compounded

```java
int timesCompounded;
```

Stores how often interest is added.

Examples

```
1

4

12

365
```

---

### Years

```java
int years;
```

Stores investment duration.

Example

```
15
```

---

### Amount

```java
double amount;
```

Stores the final calculated investment value.

---

# Step 4 — Reading the Principal Amount

Display a prompt:

```java
System.out.print("Enter the principal amount: ");
```

Read input:

```java
principal = scanner.nextDouble();
```

Example

```
Enter the principal amount:

10000
```

Stored value:

```
principal = 10000.0
```

---

# Step 5 — Reading the Interest Rate

Prompt

```java
System.out.print("Enter the annual interest rate (%): ");
```

Read input

```java
rate = scanner.nextDouble();
```

Suppose the user enters

```
5
```

Current value

```
5.0
```

---

# Converting the Interest Rate

Financial formulas require the rate in decimal form.

Therefore:

```java
rate = rate / 100;
```

Now

```
5

↓

0.05
```

---

# Why Is This Necessary?

Incorrect calculation

```
5
```

means

```
500%
```

Correct calculation

```
0.05
```

means

```
5%
```

This single line of code is one of the most important parts of the project.

---

# Step 6 — Reading Compound Frequency

Prompt

```java
System.out.print(
    "Enter the number of times compounded per year: "
);
```

Input

```java
timesCompounded = scanner.nextInt();
```

Example

```
Monthly

↓

12
```

---

# Compound Frequency Examples

| Type | Value |
|------|------:|
| Yearly | 1 |
| Semi-Annual | 2 |
| Quarterly | 4 |
| Monthly | 12 |
| Weekly | 52 |
| Daily | 365 |

---

# Step 7 — Reading Number of Years

Prompt

```java
System.out.print("Enter the number of years: ");
```

Read

```java
years = scanner.nextInt();
```

Example

```
20
```

Stored as

```
years = 20
```

---

# Step 8 — Applying the Formula

Now comes the main calculation.

```java
amount =
    principal *
    Math.pow(
        1 + rate / timesCompounded,
        timesCompounded * years
    );
```

This directly implements the mathematical formula:

```
A = P(1 + r/n)^(nt)
```

---

# Understanding `Math.pow()`

The `Math.pow()` method raises a number to a specified power.

Syntax

```java
Math.pow(base, exponent);
```

Example

```java
Math.pow(2, 3);
```

Output

```
8
```

because

```
2 × 2 × 2 = 8
```

---

# Base of the Formula

The base is:

```java
1 + rate / timesCompounded
```

Suppose

```
rate = 0.05

timesCompounded = 4
```

Calculation

```
1 + 0.05 / 4

↓

1.0125
```

---

# Exponent of the Formula

Exponent

```java
timesCompounded * years
```

Example

```
4 × 10

↓

40
```

Meaning the base is multiplied by itself 40 times.

---

# Complete Calculation Flow

```
Principal

↓

Interest Rate

↓

Convert %

↓

Divide by Compound Frequency

↓

Add 1

↓

Raise to Power

↓

Multiply by Principal

↓

Final Amount
```

---

# Step-by-Step Example

Suppose

```
Principal = ₹10,000

Interest = 5%

Compounded = 4

Years = 2
```

Convert

```
5%

↓

0.05
```

Base

```
1 + (0.05 / 4)

↓

1.0125
```

Exponent

```
4 × 2

↓

8
```

Power

```
1.0125^8

↓

1.104486
```

Multiply

```
10000 × 1.104486

↓

₹11,044.86
```

---

# Displaying the Result

Instead of using:

```java
System.out.println(amount);
```

use formatted output:

```java
System.out.printf(
    "Amount after %d years: ₹%.2f%n",
    years,
    amount
);
```

Output

```
Amount after 2 years: ₹11044.86
```

The format specifier `%.2f` ensures that exactly two decimal places are displayed, making the output more suitable for financial values.

---

# Closing the Scanner

Once all input has been read, close the scanner.

```java
scanner.close();
```

Closing resources is considered good programming practice because it releases the input stream and helps prevent resource leaks.

---

# Notes

> **Tip:** Keep your calculation separate from your input logic. This makes programs easier to read, debug, and maintain.

> **Important:** The formula works correctly only if the interest rate has already been converted from a percentage to a decimal.

---

# Complete Code Walkthrough

Now that we've examined each individual part of the program, let's understand how the entire application works together.

The execution order is:

```
Program Starts
        │
        ▼
Import Scanner
        │
        ▼
Create Scanner Object
        │
        ▼
Declare Variables
        │
        ▼
Read Principal Amount
        │
        ▼
Read Interest Rate
        │
        ▼
Convert Percentage to Decimal
        │
        ▼
Read Compound Frequency
        │
        ▼
Read Number of Years
        │
        ▼
Calculate Final Amount
        │
        ▼
Display Result
        │
        ▼
Close Scanner
        │
        ▼
Program Ends
```

---

# Program Logic

The program follows a simple sequence:

### 1. Ask for investment amount

Example

```
₹10,000
```

↓

### 2. Ask for annual interest rate

Example

```
5%
```

↓

### 3. Convert percentage

```
5

↓

0.05
```

↓

### 4. Ask how often interest is compounded

```
Yearly = 1

Quarterly = 4

Monthly = 12
```

↓

### 5. Ask investment duration

```
10 years
```

↓

### 6. Apply compound interest formula

↓

### 7. Display final investment value

---

# Sample Run 1

```
Enter the principal amount: 10000

Enter the annual interest rate (%): 3

Enter the number of times compounded per year: 1

Enter the number of years: 1
```

Output

```
Amount after 1 year: ₹10300.00
```

---

# Sample Run 2

```
Enter the principal amount: 5000

Enter the annual interest rate (%): 6

Enter the number of times compounded per year: 12

Enter the number of years: 5
```

Output

```
Amount after 5 years: ₹6744.25
```

*(Approximate value)*

---

# Sample Run 3

```
Enter the principal amount: 25000

Enter the annual interest rate (%): 7.5

Enter the number of times compounded per year: 4

Enter the number of years: 20
```

Output

```
Amount after 20 years: ₹110316.64
```

*(Approximate value)*

---

# Example Calculations

| Principal | Rate | Compound Frequency | Years | Final Amount (Approx.) |
|------------|------|-------------------:|------:|------------------------:|
| ₹10,000 | 3% | 1 | 1 | ₹10,300.00 |
| ₹10,000 | 5% | 1 | 2 | ₹11,025.00 |
| ₹5,000 | 6% | 12 | 5 | ₹6,744.25 |
| ₹25,000 | 7.5% | 4 | 20 | ₹110,316.64 |

---

# Why Compound Frequency Matters

Let's compare the same investment using different compounding frequencies.

Principal

```
₹10,000
```

Interest Rate

```
5%
```

Time

```
10 years
```

| Compounding | Final Amount (Approx.) |
|--------------|-----------------------:|
| Yearly (1) | ₹16,288.95 |
| Quarterly (4) | ₹16,386.16 |
| Monthly (12) | ₹16,470.09 |
| Daily (365) | ₹16,486.65 |

Notice that more frequent compounding generally produces a slightly higher final amount because interest is added and reinvested more often.

---

# Time Complexity

The program performs a fixed number of operations regardless of the input values.

```
O(1)
```

Constant time complexity.

---

# Space Complexity

The program only stores a handful of variables.

```
O(1)
```

Constant space complexity.

---

# Common Mistakes

## 1. Forgetting to Divide the Interest Rate by 100

Incorrect

```java
rate = scanner.nextDouble();
```

Using the value directly treats:

```
5
```

as

```
500%
```

Correct

```java
rate = scanner.nextDouble();
rate /= 100;
```

---

## 2. Using `int` Instead of `double`

Incorrect

```java
int principal;
```

Decimals would be lost.

Correct

```java
double principal;
```

---

## 3. Forgetting to Close the Scanner

Incorrect

```java
Scanner scanner = new Scanner(System.in);
```

Program ends without closing the scanner.

Correct

```java
scanner.close();
```

---

## 4. Using the Wrong Formula

Incorrect

```java
principal * rate * years
```

This calculates simple interest, not compound interest.

Always use:

```java
principal * Math.pow(
    1 + rate / timesCompounded,
    timesCompounded * years
);
```

---

## 5. Poorly Formatted Output

Instead of:

```java
System.out.println(amount);
```

Prefer:

```java
System.out.printf(
    "Amount after %d years: ₹%.2f%n",
    years,
    amount
);
```

---

# Best Practices

- Use descriptive variable names such as `principal` and `timesCompounded`.
- Store monetary values using `double`.
- Convert percentages before calculations.
- Format currency using `printf()` with two decimal places.
- Close the `Scanner` after use.
- Keep calculations separate from input statements.
- Test your program with different values to verify correctness.

---

# Possible Improvements

Once you learn more Java concepts, you can enhance this project by adding:

- Input validation (prevent negative values)
- Menu-driven interface
- Multiple currency options
- Monthly contribution calculations
- Interest earned display
- Total profit calculation
- Savings goal estimator
- Inflation adjustment
- Graphical User Interface (GUI)
- File storage for investment history

These enhancements are common in real financial software.

---

# Real-World Applications

The concepts used in this project appear in many financial systems:

- Banking applications
- Investment calculators
- Retirement planners
- Mutual fund simulators
- Loan repayment calculators
- Mortgage estimators
- Fixed deposit calculators
- Personal finance applications
- Wealth management software
- Educational finance tools

---

# Interview Questions

## Beginner

1. What is compound interest?
2. Why is the interest rate divided by 100?
3. Why is `double` used for money values?
4. What does `Math.pow()` do?
5. Why is `Scanner` required in this project?

---

## Intermediate

1. Explain the compound interest formula.
2. What is the difference between simple and compound interest?
3. Why does increasing the compounding frequency increase the final amount?
4. What is the purpose of `printf()` in this project?
5. What data types are used and why?

---

## Advanced

1. How would you validate user input?
2. How would you support monthly deposits?
3. How would you convert this into a GUI application?
4. How could this program support multiple currencies?
5. How would you refactor this project using methods and classes?

---

# Key Takeaways

- Compound interest allows interest to earn additional interest.
- Java can solve practical financial problems using mathematical formulas.
- `Math.pow()` is essential for exponential calculations.
- Percentages entered by users must be converted into decimal form.
- `Scanner` enables interactive console applications.
- `printf()` produces clean, professional financial output.
- Choosing appropriate data types (`double` and `int`) improves accuracy and readability.
- Small Java programs can model real-world banking and investment calculations.

---

# Summary

In this mini project, you combined several Java concepts learned in earlier lessons to build a practical **Compound Interest Calculator**.

You learned how to:

- Accept user input with `Scanner`
- Work with `double` and `int` data types
- Convert percentages into decimal values
- Apply the compound interest formula using `Math.pow()`
- Format monetary values with `printf()`
- Produce accurate financial calculations in a console application

Although the project is relatively small, it demonstrates how programming can be used to solve meaningful real-world problems. As your Java knowledge grows, you'll revisit projects like this and enhance them with better structure, validation, object-oriented programming, and graphical interfaces.

---

# What's Next?

In the next lesson, you'll learn about **Nested `if` Statements**, where you'll discover how to place one `if` statement inside another to make more advanced decisions and build more intelligent Java programs.

---

> **Mini Project #3 Complete ✅**
>
> You have now built a working **Compound Interest Calculator**, strengthening your understanding of mathematical programming, user interaction, and formatted output in Java.
