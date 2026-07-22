# Exercises — Day 13
# String Methods 🔤

> **Lesson:** String Methods
> **Difficulty:** Beginner

---

# Concept Revision Questions

## Easy

1. What is a String in Java?
2. Which class provides String methods?
3. Are String objects mutable or immutable?
4. What does the `length()` method return?
5. What does `charAt()` return?
6. What is the first index of a String?
7. What does `indexOf()` return?
8. What does `lastIndexOf()` return?
9. What does `trim()` remove?
10. What does `replace()` do?
11. What does `isEmpty()` return?
12. What does `contains()` return?
13. What does `equals()` compare?
14. What does `equalsIgnoreCase()` ignore?
15. Why are String methods useful?

---

# Fill in the Blanks

1. Java Strings are __________.
2. The first character has index __________.
3. `length()` returns the number of __________.
4. `charAt()` returns a single __________.
5. `indexOf()` finds the __________ occurrence.
6. `lastIndexOf()` finds the __________ occurrence.
7. `trim()` removes leading and trailing __________.
8. `replace()` returns a __________ String.
9. `contains()` returns a __________ value.
10. `equalsIgnoreCase()` ignores letter __________.

---

# True / False

1. Strings are mutable.
2. Indexing starts at 0.
3. `charAt()` returns a String.
4. `contains()` returns a boolean.
5. `trim()` removes spaces inside a sentence.
6. `replace()` modifies the original String.
7. `equals()` is case-sensitive.
8. `equalsIgnoreCase()` ignores capitalization.
9. `length()` counts spaces.
10. `indexOf()` returns -1 if not found.

---

# Multiple Choice Questions

### 1.

Which method counts characters?

A. count()

B. size()

C. length()

D. total()

---

### 2.

Which method returns one character?

A. get()

B. charAt()

C. letter()

D. substring()

---

### 3.

Which method finds the first occurrence?

A. search()

B. first()

C. indexOf()

D. contains()

---

### 4.

Which method converts all letters to uppercase?

A. upper()

B. capitalize()

C. toUpperCase()

D. makeUpper()

---

### 5.

Which method compares two Strings while ignoring capitalization?

A. compare()

B. equals()

C. equalsIgnoreCase()

D. contains()

---

# Debugging Questions

### Question 1

```java
String name = "Java";

System.out.println(name.charAt(10));
```

What is wrong?

---

### Question 2

```java
if(name == "Java")
```

How should Strings be compared?

---

### Question 3

```java
name.toUpperCase();

System.out.println(name);
```

Why doesn't this print uppercase text?

---

### Question 4

```java
String name = "";

if(name.length() == 0)
```

Rewrite using a String method.

---

### Question 5

```java
System.out.println(name.indexof("a"));
```

Find the mistake.

---

# Output Prediction

### Question 1

```java
String name = "Java";

System.out.println(name.length());
```

Output?

---

### Question 2

```java
String name = "Java";

System.out.println(name.charAt(2));
```

Output?

---

### Question 3

```java
String name = "Java";

System.out.println(name.indexOf('a'));
```

Output?

---

### Question 4

```java
String text = " Java ";

System.out.println(text.trim());
```

Output?

---

### Question 5

```java
System.out.println("Java".equalsIgnoreCase("JAVA"));
```

Output?

---

# Coding Exercises

## Easy

1. Print the length of your name.
2. Print the first character.
3. Print the last character.
4. Convert your name to uppercase.
5. Convert your name to lowercase.

---

## Medium

6. Count the number of characters in a password.
7. Check if a username contains spaces.
8. Replace every vowel with '*'.
9. Trim user input.
10. Compare two usernames.

---

## Hard

11. Count how many times a character appears.
12. Validate a password length.
13. Build a simple username validator.
14. Create a case-insensitive login check.
15. Replace multiple words in a sentence.

---

# Mini Assignments

### Assignment 1

Create a profile validator.

Requirements:

- Name cannot be empty.
- Name cannot contain numbers.
- Name length must be between 3 and 20 characters.

---

### Assignment 2

Create a username checker.

Rules:

- No spaces
- Minimum 6 characters
- Maximum 15 characters

---

### Assignment 3

Create a text formatter that:

- Removes spaces
- Converts to uppercase
- Replaces vowels with '*'

---

# Interview Questions

1. What are Strings?
2. Why are Strings immutable?
3. Difference between `equals()` and `==`?
4. Difference between `equals()` and `equalsIgnoreCase()`?
5. What does `trim()` do?
6. When would you use `contains()`?
7. Explain `indexOf()`.
8. Explain `lastIndexOf()`.
9. Why does `charAt()` use indexes?
10. Name five commonly used String methods.

---

# Self Reflection

- Can I explain String immutability?
- Can I use every method without notes?
- Can I compare Strings correctly?
- Can I validate user input?
- Can I solve beginner String problems independently?

---

# Solutions

## Fill in the Blanks

1. immutable
2. 0
3. characters
4. character
5. first
6. last
7. whitespace
8. new
9. boolean
10. case

---

## True / False

1. False
2. True
3. False
4. True
5. False
6. False
7. True
8. True
9. True
10. True

---

## MCQs

1. C
2. B
3. C
4. C
5. C
