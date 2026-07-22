# Day 13 — String Methods 🔤

> **Course Progress:** Day 13 / 71 Lessons
>
> **Chapter:** 13 — String Methods
>
> **Topic:** Working with Built-in String Methods in Java

---

# Introduction

Strings are one of the most frequently used data types in Java. Almost every Java application processes text in some form—whether it is usernames, passwords, email addresses, search queries, file names, or user input.

Because strings are used so often, Java provides a large collection of built-in methods that make working with text simple and efficient.

Instead of manually counting characters, searching for letters, converting uppercase text, or comparing words, Java's `String` class already provides methods for these operations.

In this lesson, you'll learn several of the most useful beginner-friendly string methods, including:

- Finding the length of a string
- Accessing individual characters
- Searching inside strings
- Converting text to uppercase or lowercase
- Removing unnecessary spaces
- Replacing characters
- Checking whether a string is empty
- Determining whether text contains specific characters
- Comparing strings correctly

These methods form the foundation for nearly every Java application that handles text.

---

# Learning Objectives

After completing this lesson, you should be able to:

- Understand what the `String` class is.
- Use common built-in String methods.
- Count characters inside a string.
- Access characters using indexes.
- Search for characters within text.
- Convert strings to uppercase and lowercase.
- Remove leading and trailing whitespace.
- Replace characters inside strings.
- Check if a string is empty.
- Determine whether a string contains another character or substring.
- Compare strings safely using `equals()` and `equalsIgnoreCase()`.
- Apply these methods in real-world programming situations.

---

# What is a String?

A **String** is an object that stores a sequence of characters.

Examples:

```text
"Hello"
"Java"
"OpenAI"
"Programming"
```

Strings are enclosed inside double quotation marks.

```java
String name = "Bro Code";
```

Internally, Java stores each character separately.

```
B r o   C o d e
```

Each character has an index.

```
Index

0 1 2 3 4 5 6 7

B r o _ C o d e
```

Notice that indexing begins at **0**, not 1.

---

# Why String Methods Exist

Without built-in methods, many common tasks would require dozens of lines of code.

For example:

Without String methods:

- Count letters manually
- Search character by character
- Convert every letter individually
- Compare every character manually

With String methods:

```java
name.length();
```

```java
name.toUpperCase();
```

```java
name.contains(" ");
```

```java
name.equals("Java");
```

One method call performs the entire task.

---

# String Methods Covered

This lesson introduces:

| Method | Purpose |
|---------|----------|
| length() | Counts characters |
| charAt() | Returns a character |
| indexOf() | Finds first occurrence |
| lastIndexOf() | Finds last occurrence |
| toUpperCase() | Converts text to uppercase |
| toLowerCase() | Converts text to lowercase |
| trim() | Removes surrounding spaces |
| replace() | Replaces characters |
| isEmpty() | Checks whether string is empty |
| contains() | Searches for text |
| equals() | Compares strings |
| equalsIgnoreCase() | Compares while ignoring capitalization |

---

# The `length()` Method

One of the most commonly used methods is `length()`.

It returns the total number of characters in a string.

## Syntax

```java
stringName.length();
```

Example:

```java
String name = "Bro Code";

int length = name.length();

System.out.println(length);
```

Output

```text
8
```

Character breakdown

```
B  r  o     C  o  d  e

1  2  3  4  5  6  7  8
```

Notice that spaces also count as characters.

---

## Practical Uses

The `length()` method is useful for:

- Password validation
- Username limits
- Text box validation
- Character counters
- File name validation
- Input restrictions

Example

```java
if(password.length() < 8)
{
    System.out.println("Password too short.");
}
```

---

# The `charAt()` Method

Sometimes you don't need the entire string.

Instead, you only want one specific character.

Java provides:

```java
charAt()
```

## Syntax

```java
stringName.charAt(index);
```

Example

```java
String name = "Bro Code";

char firstLetter = name.charAt(0);

System.out.println(firstLetter);
```

Output

```text
B
```

---

## Index Table

```
String

Bro Code

Indexes

0 1 2 3 4 5 6 7

Characters

B r o _ C o d e
```

Examples

```java
name.charAt(0);
```

Returns

```text
B
```

---

```java
name.charAt(1);
```

Returns

```text
r
```

---

```java
name.charAt(5);
```

Returns

```text
o
```

---

## Warning

Attempting to access an index outside the string causes an exception.

Incorrect:

```java
name.charAt(100);
```

Produces

```text
StringIndexOutOfBoundsException
```

Always verify the string length before accessing indexes.

---

# The `indexOf()` Method

Suppose you want to locate a character.

Java provides:

```java
indexOf()
```

This returns the **first occurrence** of a character or substring.

## Syntax

```java
stringName.indexOf(character);
```

Example

```java
String name = "Bro Code";

int index = name.indexOf('o');

System.out.println(index);
```

Output

```text
2
```

Because:

```
B r o _ C o d e

0 1 2 3 4 5 6 7
```

The first `'o'` appears at index **2**.

---

## Searching for Spaces

You can also search for whitespace.

```java
name.indexOf(' ');
```

Output

```text
3
```

This is useful when separating first and last names.

---

## If Nothing Is Found

If Java cannot find the character:

```java
int index = name.indexOf('z');
```

Output

```text
-1
```

A return value of **-1** always means **"not found."**

---

# Real-World Uses of `indexOf()`

Developers frequently use `indexOf()` for:

- Searching usernames
- Finding symbols
- Validating email addresses
- Parsing files
- Searching text
- Finding separators
- Splitting data
- Processing CSV files

Example

```java
if(email.indexOf('@') == -1)
{
    System.out.println("Invalid email.");
}
```
# The `lastIndexOf()` Method

While `indexOf()` returns the **first occurrence** of a character or substring, Java also provides the `lastIndexOf()` method, which returns the **last occurrence**.

This is especially useful when the same character appears multiple times in a string.

---

## Syntax

```java
stringName.lastIndexOf(character);
```

---

## Example

```java
String name = "Bro Code";

int lastIndex = name.lastIndexOf('o');

System.out.println(lastIndex);
```

### Output

```text
5
```

---

### Character Index Visualization

```text
String

B r o   C o d e

Indexes

0 1 2 3 4 5 6 7
```

The character `'o'` appears twice:

- First occurrence → Index **2**
- Last occurrence → Index **5**

---

## Practical Uses

`lastIndexOf()` is useful for:

- Finding the last file extension separator (`.`)
- Finding the last slash in a file path
- Parsing URLs
- Extracting filenames
- Working with repeated delimiters

Example:

```java
String fileName = "report.final.pdf";

int extensionIndex = fileName.lastIndexOf('.');
```

---

# The `toUpperCase()` Method

Sometimes you need to convert every character in a string to uppercase.

Java provides:

```java
toUpperCase()
```

---

## Syntax

```java
stringName.toUpperCase();
```

---

## Example

```java
String name = "Bro Code";

name = name.toUpperCase();

System.out.println(name);
```

### Output

```text
BRO CODE
```

---

## Important Note

Strings in Java are **immutable**.

That means methods like `toUpperCase()` do **not** modify the original string.

Instead, they return a **new String**.

Incorrect:

```java
name.toUpperCase();
```

Correct:

```java
name = name.toUpperCase();
```

---

## Common Uses

- Converting usernames
- Standardizing text
- Case-insensitive searching
- Formatting reports
- Displaying headings

---

# The `toLowerCase()` Method

The opposite of `toUpperCase()` is:

```java
toLowerCase()
```

It converts every character to lowercase.

---

## Syntax

```java
stringName.toLowerCase();
```

---

## Example

```java
String language = "JAVA";

language = language.toLowerCase();

System.out.println(language);
```

### Output

```text
java
```

---

## Why Use It?

Many applications ignore capitalization.

For example:

Instead of checking:

```text
Java
JAVA
java
JaVa
```

Convert everything first:

```java
input = input.toLowerCase();
```

Then compare.

---

# `toUpperCase()` vs `toLowerCase()`

| Method | Result |
|---------|--------|
| `toUpperCase()` | Converts all letters to uppercase |
| `toLowerCase()` | Converts all letters to lowercase |

---

# The `trim()` Method

Users frequently enter unnecessary spaces before or after text.

Example:

```text
"     John     "
```

These spaces can cause problems when comparing strings.

Java provides:

```java
trim()
```

to remove leading and trailing whitespace.

---

## Syntax

```java
stringName.trim();
```

---

## Example

```java
String username = "   Alice   ";

username = username.trim();

System.out.println(username);
```

### Output

```text
Alice
```

---

## Before and After

Before:

```text
"     Java     "
```

After:

```text
"Java"
```

---

## Important

`trim()` only removes spaces:

- Before the first character
- After the last character

It **does not** remove spaces in the middle.

Example:

```text
"John Smith"
```

remains:

```text
"John Smith"
```

---

## Real-World Uses

- Login forms
- Registration forms
- Usernames
- Email addresses
- Search bars
- Importing CSV data

---

# The `replace()` Method

The `replace()` method replaces characters or text with something else.

---

## Syntax

```java
stringName.replace(oldCharacter, newCharacter);
```

---

## Example

```java
String name = "Bro Code";

name = name.replace('o', 'a');

System.out.println(name);
```

### Output

```text
Bra Cade
```

---

## Replace Words

You can also replace complete strings.

```java
String sentence = "I like Java";

sentence = sentence.replace("Java", "Python");
```

Output:

```text
I like Python
```

---

## Common Applications

- Correcting user input
- Replacing banned words
- Formatting text
- Cleaning imported data
- Renaming values

---

# The `isEmpty()` Method

Sometimes a variable exists but contains no characters.

Example:

```java
String name = "";
```

The string exists.

But it is empty.

Java provides:

```java
isEmpty()
```

---

## Syntax

```java
stringName.isEmpty();
```

Returns:

- `true`
- `false`

---

## Example

```java
String name = "";

System.out.println(name.isEmpty());
```

Output

```text
true
```

---

## Example with `if`

```java
if(name.isEmpty())
{
    System.out.println("Your name is empty.");
}
else
{
    System.out.println("Hello " + name);
}
```

---

## Why It Matters

Many applications require input.

Example:

- Username
- Password
- Email
- Address

Instead of accepting empty input:

```java
if(name.isEmpty())
{
    System.out.println("Please enter your name.");
}
```

---

# The `contains()` Method

Sometimes you only need to know whether a string contains certain text.

Java provides:

```java
contains()
```

This method returns a boolean value.

---

## Syntax

```java
stringName.contains(text);
```

---

## Example

```java
String name = "Bro Code";

System.out.println(name.contains(" "));
```

### Output

```text
true
```

Because the string contains a space.

---

## Example

```java
String username = "JavaDeveloper";

System.out.println(username.contains(" "));
```

Output

```text
false
```

---

## Common Uses

- Checking usernames
- Searching keywords
- Finding spaces
- Input validation
- Searching documents
- Detecting forbidden characters

Example:

```java
if(username.contains(" "))
{
    System.out.println("Username cannot contain spaces.");
}
```
