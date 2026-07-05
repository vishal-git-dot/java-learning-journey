# ☕ Day 02 - Variables

> **Course Lesson:** 02  
> **Topic:** Variables  
> **Status:** ✅ Completed

---

# 📖 Overview

In this lesson, I learned about **variables**, one of the most fundamental concepts in Java programming.

A variable is a named storage location in memory that holds a value. Instead of repeatedly writing the same value throughout a program, we can store it inside a variable and reuse it whenever needed.

Variables make programs more flexible, readable, and maintainable. They can store different types of data such as numbers, decimal values, characters, text, and boolean values.

This lesson also introduced the difference between **primitive** and **reference** data types, along with the most commonly used data types for beginners.

---

# 🎯 Learning Objectives

After completing this lesson, I can:

- Understand what a variable is
- Declare and initialize variables
- Assign values to variables
- Reassign variable values
- Differentiate between primitive and reference data types
- Use integers (`int`)
- Use decimal numbers (`double`)
- Use characters (`char`)
- Use boolean values (`boolean`)
- Use strings (`String`)
- Print variables to the console
- Combine variables with text using string concatenation
- Follow Java variable naming conventions

---

# 📚 What is a Variable?

A **variable** is a reusable container used to store data.

Think of it as a labeled box that holds a value.

Instead of writing a value multiple times, we store it inside a variable and refer to it by its name.

For example:

```java
int age = 21;
```

Here:

- `int` is the data type.
- `age` is the variable name.
- `21` is the stored value.

Whenever `age` is used, Java replaces it with the value `21`.

---

# 🧠 Variables Behave Like Their Values

Example:

```java
int age = 21;

System.out.println(age);
```

Output:

```
21
```

If the value changes:

```java
age = 30;
```

Now:

```java
System.out.println(age);
```

Output:

```
30
```

The variable now behaves exactly like the value it contains.

---

# 🏗 Creating Variables

Creating a variable happens in **two steps**.

## Step 1 – Declaration

Declaration creates the variable.

Syntax:

```java
dataType variableName;
```

Example:

```java
int age;
```

At this stage, the variable exists but has **no value**.

---

## Step 2 – Assignment

Assignment stores a value inside the variable.

```java
age = 21;
```

Now the variable can be used.

---

## Declaration + Assignment Together

Most Java programs combine both steps.

```java
int age = 21;
```

This is the most common approach.

---

# 📦 Primitive vs Reference Data Types

Java variables are divided into two major categories.

## Primitive Data Types

Primitive variables store their values directly in memory.

Examples include:

- `int`
- `double`
- `char`
- `boolean`

Characteristics:

- Fast
- Memory efficient
- Store actual values

---

## Reference Data Types

Reference variables store the **memory address** of an object instead of the object itself.

Examples include:

- `String`
- Arrays
- Objects

Characteristics:

- Store references
- Usually larger
- More flexible

---

# 💡 Easy Analogy

Imagine someone gives you **₹500**.

That is like a **primitive variable** because you directly possess the money.

Now imagine someone gives you a **bank account number** that contains ₹500.

That is like a **reference variable**.

You don't directly hold the money—you hold a reference to where it is stored.

---

# 🧮 Primitive Data Type – int

The `int` data type stores **whole numbers**.

Examples:

- Age
- Quantity
- Year
- Score

Example:

```java
int age = 21;
```

Printing the value:

```java
System.out.println(age);
```

Output:

```
21
```

---

## More Integer Examples

```java
int year = 2025;
int quantity = 5;
int score = 100;
```

Output:

```java
System.out.println(year);
System.out.println(quantity);
System.out.println(score);
```

```
2025
5
100
```

---

## Integer Rules

✔ Can store positive numbers

```java
int marks = 95;
```

✔ Can store zero

```java
int count = 0;
```

✔ Can store negative numbers

```java
int temperature = -5;
```

❌ Cannot store decimal values

```java
int age = 20.5;
```

This causes a compilation error because decimal values belong to the `double` data type.

---

# 🔢 Primitive Data Type – double

A `double` stores numbers that contain decimal values.

Examples:

- Price
- GPA
- Height
- Weight
- Temperature

Example:

```java
double price = 19.99;
```

Output:

```java
System.out.println(price);
```

```
19.99
```

---

## More Double Examples

```java
double gpa = 3.8;
double temperature = 28.5;
double height = 175.6;
```

---

## Important Note

A `double` can also store whole numbers.

```java
double number = 50;
```

Output:

```
50.0
```

Java automatically represents it as a decimal value.

---

# 📝 Primitive Data Type – char

A `char` stores **exactly one character**.

Characters are enclosed in **single quotes**.

Correct:

```java
char grade = 'A';
```

```java
char symbol = '!';
```

```java
char currency = '$';
```

Output:

```java
System.out.println(grade);
System.out.println(symbol);
System.out.println(currency);
```

```
A
!
$
```

A `char` can only contain **one character**.

This is valid:

```java
char letter = 'J';
```

This is **not** valid:

```java
char word = 'Java';
```

A sequence of characters should be stored in a `String`.

# ✅ Primitive Data Type – boolean

A `boolean` variable stores only one of two possible values:

- `true`
- `false`

Booleans are commonly used for decision-making in programs.

Examples include:

- Is the user logged in?
- Is a product in stock?
- Is a student?
- Is a payment successful?

Example:

```java
boolean isStudent = true;
```

Another example:

```java
boolean forSale = false;
```

Printing a boolean:

```java
System.out.println(isStudent);
System.out.println(forSale);
```

Output:

```
true
false
```

---

## Boolean Naming Convention

Boolean variables usually begin with words like:

- is
- has
- can
- should

Examples:

```java
boolean isOnline = true;
boolean hasPermission = false;
boolean canVote = true;
boolean isLoggedIn = false;
```

These names make code easier to read.

---

# 📚 Reference Data Type – String

A `String` stores a sequence of characters.

Unlike `char`, a String can contain multiple characters.

Strings are enclosed within **double quotes**.

Example:

```java
String name = "John Doe";
```

Output:

```java
System.out.println(name);
```

```
John Doe
```

---

## More String Examples

```java
String food = "Pizza";
String email = "john@example.com";
String car = "Mustang";
String color = "Red";
```

Printing:

```java
System.out.println(food);
System.out.println(email);
System.out.println(car);
System.out.println(color);
```

---

## String vs char

| char | String |
|------|--------|
| Stores one character | Stores multiple characters |
| Uses single quotes | Uses double quotes |
| Example: `'A'` | Example: `"Apple"` |

Correct:

```java
char grade = 'A';
String subject = "Java";
```

Incorrect:

```java
char grade = "A";
String subject = 'Java';
```

---

# 🔗 String Concatenation

Concatenation means joining strings together.

Java uses the `+` operator.

Example:

```java
String name = "John";

System.out.println("Hello " + name);
```

Output:

```
Hello John
```

---

## Concatenating Variables

Example:

```java
String color = "Red";
int year = 2025;
String car = "Mustang";

System.out.println("Your choice is a " + color + " " + year + " " + car);
```

Output:

```
Your choice is a Red 2025 Mustang
```

---

## Combining Numbers and Strings

Example:

```java
int age = 25;

System.out.println("Age: " + age);
```

Output:

```
Age: 25
```

Java automatically converts the integer into text when concatenating.

---

# 🐪 Java Naming Convention

Java commonly follows **camelCase** for variable names.

Rules:

- Start with a lowercase letter.
- Capitalize the first letter of every additional word.
- Do not use spaces.
- Use meaningful names.

Good examples:

```java
firstName
lastName
studentAge
isLoggedIn
totalMarks
```

Avoid:

```java
x
abc
data1
```

Descriptive names improve readability.

---

# 📌 Common Data Types Covered

| Data Type | Description | Example |
|-----------|-------------|---------|
| `int` | Whole numbers | 25 |
| `double` | Decimal numbers | 19.99 |
| `char` | Single character | 'A' |
| `boolean` | True or False | true |
| `String` | Text | "Java" |

---

# 💻 Example Program

```java
public class Main {

    public static void main(String[] args) {

        String name = "John Doe";
        int age = 21;
        double gpa = 3.8;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

    }

}
```

---

# 🧠 Key Takeaways

- Variables store reusable data.
- Variables behave like the values they contain.
- Every variable has a data type.
- Variables must be declared before use.
- Primitive variables store values directly.
- Reference variables store memory references.
- `int` stores whole numbers.
- `double` stores decimal numbers.
- `char` stores a single character.
- `boolean` stores `true` or `false`.
- `String` stores text.
- Strings use double quotes.
- Characters use single quotes.
- Use meaningful variable names.

---

# ⚠️ Common Mistakes

- Forgetting to initialize variables.
- Using `int` for decimal values.
- Using double quotes for `char`.
- Using single quotes for `String`.
- Misspelling variable names.
- Forgetting semicolons.
- Declaring duplicate variable names in the same scope.

---

# ✅ Best Practices

- Use descriptive variable names.
- Follow camelCase naming convention.
- Initialize variables whenever possible.
- Choose the correct data type.
- Keep naming consistent.
- Avoid unnecessary abbreviations.

---

# 📝 Revision Notes

Remember:

- Variables store values.
- Declaration creates the variable.
- Assignment gives the variable a value.
- Primitive data types store values directly.
- Reference data types store memory references.
- Strings use `"double quotes"`.
- Characters use `'single quotes'`.
- `boolean` values are always `true` or `false`.

---

# 🎯 Learning Outcome

After completing this lesson, I can confidently:

- Declare variables
- Assign values
- Choose appropriate data types
- Print variables
- Concatenate strings
- Follow Java naming conventions
- Differentiate between primitive and reference data types

---

# 📖 Summary

Today's lesson introduced one of the most important concepts in Java: **variables**.

I learned how to create variables, assign values, use different data types, and print them to the console. I also understood the distinction between primitive and reference data types, along with Java's naming conventions and string concatenation.

These concepts form the foundation for nearly every Java program and will be used throughout the rest of the course.

---

# 🚀 Next Lesson

➡️ **Day 03 — User Input**

Next, I'll learn how to accept input from users using Java's `Scanner` class and interact with the console.

---

## 📊 Progress

- **Lesson:** 2 / 71 ✅
- **Mini Projects:** 0 / 16
- **Status:** Completed ✔️

---

> **"Good programmers don't memorize code—they understand concepts. Variables are the building blocks of every program." ☕**
