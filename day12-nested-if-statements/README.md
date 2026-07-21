# Day 12 — Nested if Statements 🎟️

> **Course Chapter:** 12 — Nested if Statements  
> **Lesson Type:** Core Java Concept  
> **Difficulty:** Beginner  
> **Prerequisites:**
>
> - Variables
> - Boolean Data Type
> - Comparison Operators
> - Logical Thinking
> - `if`, `else if`, and `else` Statements
> - Formatted Output (`printf()`)

---

# Introduction

As programs become more advanced, a single condition is often not enough to make a decision.

Consider a real-world scenario such as purchasing a movie ticket.

A theater might have different pricing rules:

- Students receive a **10% discount**.
- Senior citizens receive a **20% discount**.
- Customers who are **both students and seniors** receive a **combined 30% discount**.
- Everyone else pays the full ticket price.

A single `if` statement cannot easily express multiple dependent conditions like these.

This is where **nested `if` statements** become useful.

A nested `if` statement is simply an `if` statement placed inside another `if`, `else if`, or `else` block. It allows Java to perform additional checks only after a previous condition has already been satisfied.

Nested conditions are extremely common in real-world software because decisions are often made in multiple stages rather than all at once.

---

# Learning Objectives

By the end of this lesson, you will be able to:

- Understand what nested `if` statements are.
- Learn why nested conditions are useful.
- Write `if` statements inside other `if` blocks.
- Combine multiple Boolean conditions logically.
- Build decision trees using nested conditions.
- Apply discounts based on different customer types.
- Understand the execution flow of nested decisions.
- Improve program readability when handling dependent conditions.
- Recognize situations where nested `if` statements are appropriate.
- Avoid common mistakes when nesting conditional statements.

---

# What are Nested if Statements?

A **nested `if` statement** is an `if` statement placed inside another conditional block.

General idea:

```
if (condition1)
{
    if (condition2)
    {
        // Code executes only if BOTH
        // condition1 and condition2 are true
    }
}
```

The second condition is evaluated **only if** the first condition is true.

This creates a hierarchy of decisions.

---

# Why Use Nested if Statements?

Imagine checking whether someone qualifies for a discount.

Instead of checking everything at once, you can perform the checks step by step.

Example:

```
Is the customer a student?

        │
       Yes
        │
        ▼
Is the customer also a senior?

        │
   Yes      No
    │        │
30% Off   10% Off
```

If the customer is **not** a student, the program can immediately move on to another branch.

This makes decision-making more organized.

---

# Real-World Examples

Nested `if` statements appear in countless applications.

Examples include:

- Movie ticket discounts
- Banking systems
- ATM machines
- Login authentication
- Online shopping discounts
- School grading systems
- Employee bonus calculations
- Airline ticket pricing
- Hospital patient priority systems
- Hotel booking discounts
- Membership validation
- Tax calculations

Whenever one decision depends on another, nested conditions are often used.

---

# Basic Syntax

```java
if (condition1)
{
    if (condition2)
    {
        // Code
    }
}
```

---

A nested `if` can also include an `else`.

```java
if (condition1)
{
    if (condition2)
    {
        // Code
    }
    else
    {
        // Code
    }
}
```

---

Nested conditions may also appear inside an `else`.

```java
if (condition1)
{
    // Code
}
else
{
    if (condition2)
    {
        // Code
    }
}
```

This structure is exactly what we'll use in this lesson.

---

# Project Example

Throughout this lesson we'll build a simple **Movie Ticket Pricing System**.

The ticket price starts at:

```text
$9.99
```

Discount rules:

| Customer Type | Discount |
|--------------|----------|
| Student | 10% |
| Senior | 20% |
| Student + Senior | 30% |
| Neither | No Discount |

---

# Variables Used

Our program uses three variables.

```java
boolean isStudent;
boolean isSenior;
double price;
```

---

## `isStudent`

```java
boolean isStudent = true;
```

Represents whether the customer is a student.

Possible values:

```
true

false
```

---

## `isSenior`

```java
boolean isSenior = false;
```

Represents whether the customer qualifies for the senior discount.

Possible values:

```
true

false
```

---

## `price`

```java
double price = 9.99;
```

Stores the original ticket price.

A `double` is used because ticket prices contain decimal values.

Example:

```
9.99

12.50

15.75
```

---

# Decision Flow

The program follows this logical sequence:

```
Start

↓

Set Ticket Price

↓

Check Student Status

↓

If Student

↓

Check Senior Status

↓

Apply Appropriate Discount

↓

Display Final Price

↓

End
```

---

# Understanding Boolean Variables

The lesson uses two Boolean variables.

```
isStudent

isSenior
```

A Boolean variable can hold only two values.

```
true

false
```

This makes Booleans ideal for representing yes/no questions.

Examples:

```
Is Logged In?

Is Admin?

Has Paid?

Is Premium Member?

Is Student?

Is Senior?
```

All of these naturally fit the Boolean data type.

---

# Why Not Use Numbers?

You could technically use numbers like:

```
1

0
```

to represent true and false.

However, Java provides the `boolean` type specifically for logical conditions.

This makes programs easier to read and understand.

Compare these examples:

```java
if (isStudent)
```

versus

```java
if (student == 1)
```

The first version is much clearer and more expressive.

---

# Understanding the Ticket Price

Initially:

```java
double price = 9.99;
```

Every customer begins with the same ticket price.

The program then decides whether the price should be reduced based on the customer's eligibility for discounts.

Instead of creating separate prices for different customer types, we modify the original price by applying the appropriate discount multiplier.

---

# Notes

> **Tip:** Nested `if` statements are most useful when one decision depends on the result of another decision.

> **Important:** Avoid excessive nesting. Deeply nested code can become difficult to read and maintain. As you learn more Java, you'll discover alternative approaches that simplify complex decision logic.

---

# Understanding the Program Logic

Our movie ticket program begins with a fixed ticket price.

```java
double price = 9.99;
```

Then it asks two logical questions.

```
Is the customer a student?

Is the customer a senior?
```

Depending on the answers, Java determines the final ticket price.

---

# Complete Decision Tree

```
                    Start
                      │
                      ▼
              Is Student?
                /      \
             Yes        No
             │           │
             ▼           ▼
      Is Senior?     Is Senior?
        /    \         /     \
      Yes    No      Yes      No
      │       │       │        │
      ▼       ▼       ▼        ▼
    30%     10%     20%     No Discount
 Discount Discount Discount
```

This is a perfect example of hierarchical decision making.

---

# Step 1 — Checking if the Customer is a Student

The first condition is:

```java
if (isStudent)
{
    // Student logic
}
```

Since `isStudent` is already a boolean, writing:

```java
if (isStudent == true)
```

is unnecessary.

Java automatically interprets:

```java
if (isStudent)
```

as:

```java
if (isStudent == true)
```

The shorter version is preferred because it is cleaner and easier to read.

---

# Applying the Student Discount

If the customer is a student, the program displays a message.

```java
System.out.println(
    "You get a student discount of 10%."
);
```

Then it reduces the ticket price.

```java
price *= 0.9;
```

---

# Why Multiply by 0.9?

A 10% discount means the customer pays only **90%** of the original price.

Original price

```
$9.99
```

Calculation

```
9.99 × 0.90

=

8.991
```

Displayed using `printf()`:

```
$8.99
```

---

# Using the Augmented Assignment Operator

Instead of writing:

```java
price = price * 0.9;
```

Java allows the shorter form:

```java
price *= 0.9;
```

Both statements perform exactly the same operation.

---

# Step 2 — Checking if the Student is Also a Senior

Inside the student block, another condition is checked.

```java
if (isSenior)
{
    // Student and Senior
}
```

Notice that this second condition only runs if the first one is true.

Execution flow:

```
Student?

↓

Yes

↓

Senior?

↓

Yes

↓

30% Discount
```

---

# Combined Discount

If the customer is both a student and a senior:

```java
price *= 0.7;
```

Why 0.7?

Because:

```
100%

↓

−30%

↓

70%
```

The customer pays only 70% of the original ticket price.

Example

```
9.99 × 0.70

=

6.993

↓

$6.99
```

---

# Displaying Both Discount Messages

The program informs the user about both discounts.

```java
System.out.println(
    "You get a student discount of 10%."
);

System.out.println(
    "You get a senior discount of 20%."
);
```

Providing clear messages helps users understand why the final price changed.

---

# Student but Not Senior

Suppose:

```
isStudent = true

isSenior = false
```

Flow

```
Student?

↓

Yes

↓

Senior?

↓

No

↓

Student Discount Only
```

Price calculation:

```
9.99 × 0.90

=

8.99
```

---

# Step 3 — What if the Customer is NOT a Student?

If the first condition fails, Java executes the `else` block.

```java
else
{
    // Not a student
}
```

However, the program still needs to determine whether the customer is a senior.

Therefore, another `if` statement is placed inside the `else`.

```java
else
{
    if (isSenior)
    {
        // Senior discount
    }
}
```

This is another example of a nested `if`.

---

# Senior Discount Only

If:

```
isStudent = false

isSenior = true
```

The calculation becomes:

```java
price *= 0.8;
```

Why?

```
100%

↓

−20%

↓

80%
```

Calculation:

```
9.99 × 0.80

=

7.992

↓

$7.99
```

---

# Neither Student Nor Senior

Suppose both values are false.

```
isStudent = false

isSenior = false
```

Decision flow:

```
Student?

↓

No

↓

Senior?

↓

No

↓

Full Price
```

No discount is applied.

Final price remains:

```
$9.99
```

---

# Displaying the Final Price

Instead of:

```java
System.out.println(price);
```

use formatted output.

```java
System.out.printf(
    "The ticket price is $%.2f%n",
    price
);
```

The format specifier:

```
%.2f
```

ensures exactly two decimal places are displayed.

Example output:

```
The ticket price is $8.99
```

---

# Execution Trace

Consider:

```
isStudent = true

isSenior = true
```

Execution order:

```
Start

↓

Student?

↓

Yes

↓

Senior?

↓

Yes

↓

Apply 30% Discount

↓

Display Final Price
```

---

Another example:

```
isStudent = false

isSenior = true
```

Execution:

```
Start

↓

Student?

↓

No

↓

Go to Else

↓

Senior?

↓

Yes

↓

Apply 20% Discount

↓

Display Final Price
```

---

# Why Use Nested if Statements?

Nested conditions make programs more organized when later decisions depend on earlier ones.

Without nesting, the program would require more complex conditional expressions and repeated logic.

By grouping related decisions together, the code becomes easier to understand and maintain.

---

# Notes

> **Tip:** Before writing nested conditions, sketch a simple decision tree on paper. This helps visualize every possible execution path.

> **Important:** Every nested branch should have a clear purpose. If too many levels of nesting appear, consider simplifying the logic using logical operators (`&&`, `||`) or restructuring the conditions in future lessons.

---

**End of README.md — Part 2**
