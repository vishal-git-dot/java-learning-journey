# Day 14 — Java Substrings ✂️

> **Course Progress:** Day 14 / 71 Lessons  
> **Topic:** Substrings (`substring()`)  
> **Category:** String Manipulation  
> **Mini Project:** Email Username & Domain Extractor

---

# Introduction

Strings are one of the most commonly used data types in Java. Whether you're working with usernames, email addresses, URLs, passwords, file names, or sentences, you'll often need only a **portion** of the original text instead of the entire string.

Java provides the powerful **`substring()`** method to solve this problem.

The `substring()` method allows you to extract a specific section of a string and create a completely new string from it.

In this lesson you'll learn:

- What a substring is
- How `substring()` works
- Start and end indexes
- Inclusive vs Exclusive indexes
- Dynamic substring extraction
- Combining `substring()` with `indexOf()`
- Building a practical Email Parser program
- Validating email input before extraction

This lesson introduces one of the most frequently used String methods in Java programming.

---

# Learning Objectives

By the end of this lesson you should be able to:

- Understand what a substring is
- Extract part of a string
- Use `substring(beginIndex)`
- Use `substring(beginIndex, endIndex)`
- Understand inclusive and exclusive indexes
- Combine `substring()` with `indexOf()`
- Avoid hardcoded indexes
- Create dynamic string extraction programs
- Build an Email Username & Domain Extractor
- Validate basic email format before processing

---

# Prerequisites

Before studying this lesson, you should already understand:

- Variables
- Strings
- String methods
- `indexOf()`
- `contains()`
- Scanner
- If statements

---

# What is a Substring?

A **substring** is simply a **portion of another string**.

Suppose we have:

```text
Hello World
```

Possible substrings include:

```text
Hello

World

Hello W

lo Wo

World

orl
```

A substring is created from an existing string.

The original string never changes.

---

# Real-World Examples

Substrings are used almost everywhere.

| Application | Example |
|------------|---------|
| Email systems | Username & domain |
| Banking | Mask account numbers |
| Login systems | Username validation |
| URLs | Domain extraction |
| File systems | File extensions |
| Data processing | Parsing CSV values |
| Search engines | Keyword extraction |
| Mobile apps | Display previews |

---

# Java `substring()` Method

The String class contains two overloaded versions of the method.

## Version 1

```java
string.substring(beginIndex)
```

Returns every character from the starting index until the end.

---

## Version 2

```java
string.substring(beginIndex, endIndex)
```

Returns characters between two indexes.

The ending index is **exclusive**.

---

# Method Syntax

## One Parameter

```java
String result = text.substring(startIndex);
```

---

## Two Parameters

```java
String result = text.substring(startIndex, endIndex);
```

---

# Return Type

```text
Returns:
String
```

A brand-new String object is created.

The original string remains unchanged.

---

# Important Rule

The first index is:

✅ Inclusive

The second index is:

❌ Exclusive

---

# Visual Explanation

Consider:

```text
Programming
```

Indexes:

```text
Character

P r o g r a m m i n g
0 1 2 3 4 5 6 7 8 9 10
```

Example:

```java
text.substring(0,4);
```

Returns:

```text
Prog
```

Because:

```text
0 included

1 included

2 included

3 included

4 NOT included
```

---

# Inclusive vs Exclusive

Example:

```java
String word = "Java";
```

Indexes

```text
J a v a
0 1 2 3
```

```java
word.substring(0,2)
```

Returns

```text
Ja
```

NOT

```text
Jav
```

because index 2 is excluded.

---

# Extracting the Beginning

```java
String language = "Java Programming";

String result = language.substring(0,4);

System.out.println(result);
```

Output

```text
Java
```

---

# Extracting the End

```java
String language = "Java Programming";

String result = language.substring(5);

System.out.println(result);
```

Output

```text
Programming
```

Notice that only one parameter is used.

Everything after index 5 is returned.

---

# Extracting the Middle

```java
String text = "Programming";
```

```java
text.substring(3,7)
```

Returns

```text
gram
```

---

# Flow Diagram

```text
Original String
        │
        ▼
substring()
        │
        ▼
Select Characters
        │
        ▼
Create New String
        │
        ▼
Return Result
```

---

# Why Does `substring()` Return a New String?

Strings in Java are **immutable**.

That means once a string is created, it cannot be modified.

Instead of changing the original string, Java creates a completely new one.

Example

```java
String word = "Java";

String sub = word.substring(2);

System.out.println(word);
System.out.println(sub);
```

Output

```text
Java
va
```

The original string is still:

```text
Java
```

---

# Mini Project — Email Username & Domain Extractor

The instructor demonstrates a simple but practical project that extracts:

- Username
- Domain

from an email address.

Example email:

```text
bro123@gmail.com
```

Desired Output

```text
Username : bro123

Domain : gmail.com
```

This is a perfect beginner project because it combines multiple String methods into one useful program.

---

# Step 1 — Store an Email Address

```java
String email = "bro123@gmail.com";
```

Memory Representation

```text
email
│
▼
bro123@gmail.com
```

---

# Character Index Visualization

```text
Email

b r o 1 2 3 @ g m a i l . c o m
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
```

Understanding these indexes is essential when working with `substring()`.

---

# Step 2 — Extract the Username

Initially, the username can be extracted using fixed indexes.

```java
String username = email.substring(0, 6);
```

Explanation

- Start at index **0**
- Stop before index **6**
- Index **6** is excluded

Result

```text
bro123
```

While this works for one specific email, it becomes a problem when usernames have different lengths.

# Step 3 — Extracting the Domain

The domain is everything **after the `@` symbol**.

For the email:

```text
bro123@gmail.com
```

We want:

```text
gmail.com
```

A basic approach is to use the starting index manually.

```java
String domain = email.substring(7);
```

Output

```text
gmail.com
```

Since only the starting index is provided, Java returns every remaining character until the end of the string.

---

# Why Hardcoded Indexes Are a Bad Idea

Consider another email:

```text
alexander123@yahoo.com
```

If we still use:

```java
email.substring(7);
```

The result becomes incorrect because the username is longer than before.

Likewise,

```text
a@gmail.com
```

would also fail because the username is much shorter.

Hardcoded index values only work for one specific input.

Professional programs should adapt automatically to different input lengths.

---

# Dynamic String Extraction

Instead of manually counting characters, Java can locate the position of the `@` symbol for us.

The `indexOf()` method returns the first occurrence of a character.

```java
int atIndex = email.indexOf('@');
```

For

```text
bro123@gmail.com
```

the value stored is:

```text
6
```

Visual representation

```text
b r o 1 2 3 @ g m a i l . c o m
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
            ↑
         indexOf('@')
```

---

# Extract Username Dynamically

Now we no longer need to count characters ourselves.

```java
String username = email.substring(0, email.indexOf('@'));
```

How it works

1. Find the index of `@`
2. Use that index as the ending position
3. Create a substring from index `0`
4. Exclude the `@` character

Output

```text
bro123
```

---

# Extract Domain Dynamically

The domain starts immediately after the `@` symbol.

```java
String domain = email.substring(email.indexOf('@') + 1);
```

Why `+1`?

Because `indexOf('@')` returns the position of the `@` itself.

Adding one skips over it.

Example

```text
b r o 1 2 3 @ g m a i l . c o m
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
              ↑
          Start Here
```

Output

```text
gmail.com
```

---

# Using Scanner for User Input

Hardcoding values is useful while learning, but real applications accept input from users.

Import Scanner

```java
import java.util.Scanner;
```

Create the Scanner object

```java
Scanner scanner = new Scanner(System.in);
```

Prompt the user

```java
System.out.print("Enter your email: ");
```

Read the email

```java
String email = scanner.nextLine();
```

Always remember to close the scanner.

```java
scanner.close();
```

---

# Email Validation

Before extracting the username and domain, we should verify that the email actually contains an `@` symbol.

Java provides the `contains()` method.

```java
if (email.contains("@")) {
    // Extract username and domain
}
else {
    System.out.println("Invalid email.");
}
```

This prevents invalid processing.

---

# Complete Program Flow

```text
User enters email
        │
        ▼
Does email contain '@' ?
        │
   ┌────┴────┐
   │         │
  Yes        No
   │         │
   ▼         ▼
Find '@'   Display Error
   │
   ▼
Extract Username
   │
   ▼
Extract Domain
   │
   ▼
Display Results
```

---

# Example Run 1

Input

```text
Enter your email:
bro123@gmail.com
```

Output

```text
Username : bro123
Domain   : gmail.com
```

---

# Example Run 2

Input

```text
Enter your email:
student@yahoo.com
```

Output

```text
Username : student
Domain   : yahoo.com
```

---

# Example Run 3

Input

```text
Enter your email:
john.doe@outlook.com
```

Output

```text
Username : john.doe
Domain   : outlook.com
```

---

# Example Run 4

Input

```text
Enter your email:
invalidEmail
```

Output

```text
Invalid email.
Emails must contain '@'
```

---

# Common Mistakes

## Forgetting that the ending index is exclusive

Incorrect

```java
String text = "Java";

System.out.println(text.substring(0,3));
```

Many beginners expect:

```text
Java
```

Actual Output

```text
Jav
```

---

## Using an Invalid Index

```java
String word = "Java";

word.substring(10);
```

Result

```text
StringIndexOutOfBoundsException
```

Always ensure indexes are within the valid range.

---

## Forgetting to Skip the '@'

Incorrect

```java
String domain = email.substring(email.indexOf('@'));
```

Output

```text
@gmail.com
```

Correct

```java
String domain = email.substring(email.indexOf('@') + 1);
```

---

## Assuming Every Email Is Valid

Never assume user input is correct.

Always validate first.

```java
if(email.contains("@"))
```

before calling `substring()`.

---

# Best Practices

- Validate user input before extracting substrings.
- Avoid hardcoded index values.
- Use descriptive variable names such as `username`, `domain`, and `atIndex`.
- Combine `substring()` with other String methods for flexible programs.
- Close `Scanner` objects after use.
- Keep extraction logic simple and readable.
- Test with different email formats.

---

# Notes

> **Note**
>
> `substring()` never modifies the original string. It always creates a new String object.

---

> **Tip**
>
> `indexOf()` and `substring()` are frequently used together in real-world Java applications.

---

> **Important**
>
> The second parameter of `substring(beginIndex, endIndex)` is **exclusive**.

---

# Key Points

- A substring is a portion of another string.
- Java provides two versions of the `substring()` method.
- `substring(beginIndex)` extracts to the end of the string.
- `substring(beginIndex, endIndex)` extracts between two indexes.
- The beginning index is inclusive.
- The ending index is exclusive.
- `substring()` returns a new String.
- Strings are immutable.
- `indexOf()` makes substring operations dynamic.
- `contains()` can be used to validate input before processing.
- Combining multiple String methods creates flexible and reusable programs.

---

# Interview Questions

## 1. What is a substring?

A substring is a portion of an existing string.

---

## 2. Does `substring()` modify the original string?

No.

It returns a new String object.

---

## 3. What is the difference between the two versions of `substring()`?

- `substring(beginIndex)` returns everything from the starting index to the end.
- `substring(beginIndex, endIndex)` returns characters between two indexes.

---

## 4. Is the ending index included?

No.

It is exclusive.

---

## 5. Which String method is commonly combined with `substring()`?

`indexOf()`.

---

## 6. Why should we avoid hardcoded indexes?

Because input lengths vary, making hardcoded values unreliable.

---

# Summary

In this lesson, you learned how to extract portions of strings using Java's `substring()` method. You explored both method overloads, understood the difference between inclusive and exclusive indexes, and learned why `substring()` returns a new string instead of modifying the original.

You also built a practical Email Username & Domain Extractor by combining `substring()`, `indexOf()`, `contains()`, and `Scanner`. This demonstrated how multiple String methods can work together to solve real-world problems while producing flexible, user-friendly programs.

The `substring()` method is one of the most frequently used tools in Java development and forms the foundation for text parsing, validation, file processing, web development, and many other programming tasks.
