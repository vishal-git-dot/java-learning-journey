# ☕ Day 01 - Introduction to Java

> **Course Lesson:** 01  
> **Topic:** Introduction to Java  
> **Status:** ✅ Completed

---

# 📖 Overview

Today marks the beginning of my Java learning journey.

In this lesson, I learned how to set up the Java development environment, understand the basic structure of a Java program, and write my very first Java application.

Although the concepts introduced are simple, they are the foundation of every Java program that will be built throughout this course.

---

# 🎯 Objectives

After completing this lesson, I can:

- Install the Java Development Kit (JDK)
- Install IntelliJ IDEA Community Edition
- Create a Java project
- Create Java classes
- Understand the structure of a Java program
- Write the `main()` method
- Print output to the console
- Use `print()` and `println()`
- Use escape sequences
- Write comments

---

# 🛠 Software Used

| Software | Purpose |
|----------|---------|
| Java JDK | Compile and run Java programs |
| IntelliJ IDEA Community | IDE for Java development |

---

# 📚 Topics Covered

## 1. What is Java?

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now Oracle).

One of Java's biggest advantages is:

> **Write Once, Run Anywhere (WORA)**

Java programs are compiled into **Bytecode**, allowing them to run on any system that has the Java Virtual Machine (JVM).

---

## 2. Java Development Kit (JDK)

The JDK contains everything needed to develop Java applications.

It includes:

- Java Compiler (`javac`)
- Java Runtime
- Standard Libraries
- Development Tools

Without the JDK, Java source code cannot be compiled.

---

## 3. Integrated Development Environment (IDE)

An IDE provides tools for writing, compiling, debugging, and running programs.

This course uses:

- IntelliJ IDEA Community Edition

Advantages include:

- Syntax highlighting
- Auto-completion
- Error detection
- Debugging tools
- Project management

---

## 4. Java Program Structure

Every Java program starts with a class.

Example:

```java
public class Main {

}
```

---

## 5. Main Method

Every Java application begins execution from the `main()` method.

```java
public static void main(String[] args) {

}
```

Think of it as the entry point of the program.

---

## 6. Printing Output

Java prints output using:

```java
System.out.print();
```

or

```java
System.out.println();
```

Example:

```java
System.out.println("Hello World!");
```

Output:

```
Hello World!
```

---

## 7. print() vs println()

### print()

Prints without moving to the next line.

```java
System.out.print("Hello ");
System.out.print("World");
```

Output:

```
Hello World
```

---

### println()

Prints and automatically moves to a new line.

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```
Hello
World
```

---

## 8. Escape Sequences

Escape sequences are special characters used for formatting.

Example:

```java
System.out.println("Hello\nWorld");
```

Output:

```
Hello
World
```

Common escape sequences:

| Escape | Description |
|---------|-------------|
| `\n` | New Line |
| `\t` | Tab |
| `\"` | Double Quotes |
| `\\` | Backslash |

---

## 9. Comments

Single-line comment

```java
// This is a comment
```

Multi-line comment

```java
/*
This is
a multi-line
comment
*/
```

Comments help explain code and improve readability.

---

# 💻 Example Program

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("I like pizza");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");

    }

}
```

Output

```
I like pizza
It's really good!
Buy me pizza!
```

---

# 📁 Project Structure

```
day01-introduction-to-java/
│
├── README.md
├── Exercises.md
├── images/
│
└── src/
    ├── Main.java
    └── Practice.java
```

---

# 🧠 Key Takeaways

- Java code is written inside classes.
- Every Java application starts from the `main()` method.
- Statements usually end with a semicolon (`;`).
- `System.out.print()` prints on the same line.
- `System.out.println()` prints and moves to the next line.
- Escape sequences improve output formatting.
- Comments make code easier to understand.

---

# ⚠️ Common Mistakes

- Forgetting semicolons.
- Using lowercase `system` instead of `System`.
- Forgetting quotation marks around strings.
- Misspelling `println`.
- Forgetting curly braces.
- Accidentally deleting the `main()` method.

---

# ✅ Best Practices

- Keep code properly indented.
- Use meaningful class names.
- Practice writing code manually.
- Read compiler errors carefully.
- Comment code only when necessary.

---

# 📝 Revision Notes

Remember:

- JDK = Java Development Kit
- IDE = Integrated Development Environment
- JVM = Java Virtual Machine
- `main()` is the program entry point.
- `print()` does not create a new line.
- `println()` creates a new line.
- `\n` inserts a line break.
- Comments are ignored during execution.

---

# 🎯 Learning Outcome

After completing this lesson, I can confidently:

- Set up Java
- Create a Java project
- Write my first Java program
- Print output
- Understand the structure of Java code
- Use comments effectively

---

# 📖 Summary

Today's lesson introduced the fundamentals of Java programming.

Although the programs were simple, they established the core concepts that every Java developer must understand before moving on to variables, user input, control flow, object-oriented programming, and advanced Java topics.

---

# 🚀 Next Lesson

➡️ **Day 02 — Variables**

Next, I will learn how to store and manipulate data using variables and Java's primitive data types.

---

## 📊 Progress

- **Lesson:** 1 / 71 ✅
- **Mini Projects:** 0 / 16
- **Status:** Completed ✔️

---

> **"Every expert was once a beginner. Keep learning, keep building." ☕**
