# Day 16 — Ternary Operator (`?:`) ❓

> **Course:** Java for Beginners  
> **Chapter:** 16 — Ternary Operator (`?:`)  
> **Lesson Type:** Core Java Concept  
> **Difficulty:** 🟢 Beginner  
> **Status:** ✅ Completed

---

# 📚 Overview

The **ternary operator (`?:`)** is a shorthand alternative to an `if...else` statement.

Instead of writing multiple lines to choose between two values, the ternary operator allows you to evaluate a condition and return one of two possible results in a single expression.

It is commonly used for:

- Returning text
- Assigning values
- Choosing between two outcomes
- Making code shorter and easier to read

---

# 🎯 Learning Objectives

By the end of this lesson, you will be able to:

- Understand the syntax of the ternary operator
- Replace simple `if...else` statements
- Assign values based on conditions
- Improve code readability
- Use the operator with numbers, strings, and booleans

---

# 🤔 What is the Ternary Operator?

The ternary operator evaluates a condition.

If the condition is **true**, it returns the first value.

If the condition is **false**, it returns the second value.

General syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Think of it like asking a question.

```
Is condition true?

YES → first value

NO → second value
```

---

# 🧠 Basic Formula

```java
result = (condition) ? trueValue : falseValue;
```

Example:

```java
int age = 20;

String message = (age >= 18) ? "Adult" : "Minor";
```

Output

```
Adult
```

---

# 🔄 Traditional if...else

```java
if(score >= 60){
    System.out.println("Pass");
}
else{
    System.out.println("Fail");
}
```

---

# ✨ Same Logic Using Ternary

```java
String result = (score >= 60) ? "Pass" : "Fail";

System.out.println(result);
```

Much shorter.

---

# 📝 Example 1 — Pass or Fail

```java
int score = 70;

String result = (score >= 60)
        ? "Pass"
        : "Fail";

System.out.println(result);
```

Output

```
Pass
```

---

# 📝 Example 2 — Even or Odd

Use the modulus operator.

```java
int number = 7;

String type = (number % 2 == 0)
        ? "Even"
        : "Odd";

System.out.println(type);
```

Output

```
Odd
```

---

# 📝 Example 3 — AM or PM

Military time:

```java
int hours = 13;

String time =
        (hours < 12)
        ? "AM"
        : "PM";

System.out.println(time);
```

Output

```
PM
```

---

# 📝 Example 4 — Tax Rate

```java
double income = 60000;

double taxRate =
        (income >= 40000)
        ? 0.25
        : 0.15;

System.out.println(taxRate);
```

Output

```
0.25
```

---

# ⚙️ How It Works

Given:

```java
(score >= 60)
        ? "Pass"
        : "Fail";
```

Step 1

Evaluate

```
score >= 60
```

Suppose:

```
70 >= 60
```

Result:

```
true
```

Step 2

Since condition is true

Return

```
"Pass"
```

---

If score is

```
50
```

Condition becomes

```
50 >= 60
```

False

Return

```
"Fail"
```

---

# 📌 Ternary Operator Flow

```
          Condition
              |
       True -------- False
         |             |
   Value A         Value B
         \           /
          Returned Value
```

---

# 💡 When to Use It

Good for:

- Assigning text
- Labels
- Grades
- Status
- Simple decisions

Avoid using it when logic becomes complex.

---

# ❌ Bad Example

```java
if(score >= 60){
    if(attendance >= 75){
        ...
    }
}
```

Don't replace nested logic with ternary operators.

It quickly becomes unreadable.

---

# ✅ Good Example

```java
String status =
        (isLoggedIn)
        ? "Welcome!"
        : "Please Login";
```

---

# 📚 Comparison

Using if

```java
if(age >= 18){
    category = "Adult";
}
else{
    category = "Child";
}
```

Using ternary

```java
category =
        (age >= 18)
        ? "Adult"
        : "Child";
```

Both produce identical results.

---

# ⚡ Supported Return Types

Strings

```java
String result =
(condition)
? "Yes"
: "No";
```

Integers

```java
int max =
(a > b)
? a
: b;
```

Double

```java
double price =
(member)
? 19.99
: 29.99;
```

Boolean

```java
boolean passed =
(score >= 60)
? true
: false;
```

---

# 🧪 Practice Examples

### Example 1

```java
int age = 15;

String type =
(age >= 18)
? "Adult"
: "Minor";
```

Output

```
Minor
```

---

### Example 2

```java
int temperature = 32;

String weather =
(temperature > 30)
? "Hot"
: "Cool";
```

Output

```
Hot
```

---

### Example 3

```java
boolean raining = true;

String activity =
(raining)
? "Stay Inside"
: "Go Outside";
```

---

### Example 4

```java
int battery = 10;

String warning =
(battery < 20)
? "Low Battery"
: "Battery OK";
```

---

# 🧠 Key Takeaways

- `?:` replaces simple if-else statements.
- It always returns one of two values.
- Great for assignments.
- Improves readability for small decisions.
- Avoid using nested ternary expressions.

---

# 📖 Summary

The **ternary operator** is one of Java's shortest conditional expressions.

Instead of writing multiple lines with `if...else`, you can evaluate a condition and immediately return one of two values.

Mastering this operator helps you write cleaner and more professional Java code while keeping simple decision-making concise.

---

# ✅ Lesson Complete

You now know:

- ✔ Ternary operator syntax
- ✔ Returning values
- ✔ Assigning variables
- ✔ Practical examples
- ✔ Best practices
- ✔ When to avoid using it

**Next Lesson:** Day 17 — Temperature Converter 🌡️
