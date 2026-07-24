# Exercises — Day 14: Substrings ✂️

## Overview

These exercises will help reinforce your understanding of Java's `substring()` method and related String methods.

Topics covered:

- substring()
- indexOf()
- contains()
- Scanner
- Email parsing
- String extraction
- Input validation

---

# Concept Revision Questions

### Easy

1. What is a substring?
2. Does `substring()` modify the original string?
3. What does `substring(5)` return?
4. What does `substring(2,5)` return?
5. Which index is inclusive?
6. Which index is exclusive?
7. What data type does `substring()` return?
8. Which method finds the first occurrence of a character?
9. Which method checks if a string contains another string?
10. Are Strings mutable?

---

# Fill in the Blanks

1.

```java
String name = "Programming";

name.________(0,7);
```

Answer

```text
substring
```

---

2.

```java
email.________('@');
```

Answer

```text
indexOf
```

---

3.

```java
email.________("@");
```

Answer

```text
contains
```

---

4.

The second index in `substring()` is __________.

Answer

```text
exclusive
```

---

5.

Strings in Java are __________.

Answer

```text
immutable
```

---

# True / False

1. `substring()` changes the original string.
2. `substring()` returns a new String.
3. `indexOf()` returns an integer.
4. `contains()` returns a boolean.
5. The second parameter of `substring()` is inclusive.
6. `substring(3)` extracts everything from index 3 onward.
7. Hardcoded indexes are always recommended.

### Answers

1. False
2. True
3. True
4. True
5. False
6. True
7. False

---

# Multiple Choice Questions

### Q1

Which method extracts part of a string?

A. trim()

B. replace()

C. substring()

D. length()

Answer:

✅ C

---

### Q2

Which method returns the index of a character?

A. charAt()

B. substring()

C. indexOf()

D. replace()

Answer:

✅ C

---

### Q3

Which method checks whether a string contains another string?

A. equals()

B. contains()

C. replace()

D. compare()

Answer:

✅ B

---

### Q4

What does this return?

```java
"Java".substring(1)
```

A. J

B. ava

C. Jav

D. va

Answer

✅ B

---

# Output Prediction

### Question 1

```java
String word = "Programming";

System.out.println(word.substring(0,7));
```

Output

```text
Program
```

---

### Question 2

```java
String word = "Programming";

System.out.println(word.substring(3));
```

Output

```text
gramming
```

---

### Question 3

```java
System.out.println("Hello".substring(1,4));
```

Output

```text
ell
```

---

### Question 4

```java
System.out.println("Java".indexOf('v'));
```

Output

```text
2
```

---

# Debugging Questions

## Question 1

```java
String email = "abc@gmail.com";

String username = email.substring(0,email.indexOf('@'));

System.out.println(username);
```

Expected Output

```text
abc
```

---

## Question 2

Find the mistake.

```java
email.substring(20);
```

Answer

Index is outside the string length.

---

# Coding Exercises

## Easy

### Exercise 1

Extract the first name.

Input

```text
John Smith
```

Output

```text
John
```

---

### Exercise 2

Extract the file extension.

Input

```text
photo.png
```

Output

```text
png
```

---

### Exercise 3

Extract the domain from:

```text
student@yahoo.com
```

Output

```text
yahoo.com
```

---

## Medium

### Exercise 4

Ask the user for an email.

Display:

- Username
- Domain

---

### Exercise 5

Ask the user for a filename.

Display only its extension.

Example

```text
report.pdf

Extension: pdf
```

---

### Exercise 6

Extract everything before the first space.

---

## Hard

### Exercise 7

Validate an email.

Requirements

- Contains '@'
- Contains '.'
- Username not empty
- Domain not empty

---

### Exercise 8

Create a Username Generator.

Input

```text
John Doe
```

Output

```text
john.doe
```

---

### Exercise 9

Extract the protocol from a URL.

Input

```text
https://openai.com
```

Output

```text
https
```

---

# Mini Assignment

Build an Email Parser.

Requirements

- Ask for email
- Validate '@'
- Display username
- Display domain
- Handle invalid input

---

# Interview Questions

1. What is a substring?
2. Why are Strings immutable?
3. Explain inclusive vs exclusive indexes.
4. What happens if indexes are invalid?
5. Why combine `indexOf()` with `substring()`?
6. Difference between `charAt()` and `substring()`?
7. What does `contains()` return?
8. Why should user input be validated?

---

# Self Reflection

After completing this lesson, can you:

- Explain what a substring is?
- Extract text using both overloads?
- Use `indexOf()` dynamically?
- Parse an email?
- Validate input?
- Avoid hardcoded indexes?

If you answered **Yes** to all, you've successfully completed Day 14.
