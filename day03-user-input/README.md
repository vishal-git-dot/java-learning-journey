# ⌨️ Day 03 - User Input

> **Course Lesson:** 03  
> **Topic:** User Input using Scanner  
> **Status:** ✅ Completed

---

# 📖 Overview

In this lesson, I learned how to make Java programs interactive by accepting **user input**.

Until now, every value inside the program was hardcoded by the programmer. With user input, the program can receive data directly from the keyboard while it is running.

Java provides the **Scanner** class to read user input from the console. Using Scanner, a program can accept different types of data such as text, integers, decimal numbers, and boolean values.

This lesson also introduced an important issue known as the **input buffer problem**, which commonly occurs when mixing `nextInt()` or `nextDouble()` with `nextLine()`.

---

# 🎯 Learning Objectives

After completing this lesson, I can:

- Understand why user input is important
- Import the Scanner class
- Create Scanner objects
- Read text input
- Read integers
- Read decimal numbers
- Read boolean values
- Understand `next()` vs `nextLine()`
- Fix the Scanner input buffer issue
- Close a Scanner properly
- Build a simple interactive Java program

---

# 📚 Why User Input?

Programming generally follows three simple steps:

```text
Input
   ↓
Processing
   ↓
Output
```

Example:

```
Enter your age:
21

Program processes the value

You are 21 years old.
```

Without user input, every value must be written directly into the source code.

---

# 🧠 What is Scanner?

A **Scanner** is a Java class used to read input from the keyboard.

It allows a program to interact with users while it is running.

Scanner belongs to the **java.util** package.

Therefore, before using it, it must be imported.

---

# 📦 Importing Scanner

Always place this statement at the top of the Java file.

```java
import java.util.Scanner;
```

Without this import, Java cannot recognize the Scanner class.

---

# 🏗 Creating a Scanner Object

Creating a Scanner object follows this syntax:

```java
Scanner scanner = new Scanner(System.in);
```

Explanation:

- `Scanner` → Class name
- `scanner` → Object name
- `new` → Creates a new object
- `System.in` → Reads keyboard input

This object is used throughout the program to receive user input.

---

# 🔒 Closing the Scanner

After finishing input operations, the Scanner should be closed.

```java
scanner.close();
```

Closing the Scanner releases system resources and is considered good programming practice.

---

# 📝 Reading a String

To read an entire line of text:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");

String name = scanner.nextLine();

System.out.println("Hello " + name);

scanner.close();
```

Example Output:

```
Enter your name:
John Doe

Hello John Doe
```

---

# 📌 nextLine()

`nextLine()` reads an entire line of text.

It accepts:

- Spaces
- Numbers
- Symbols

Example:

```
John Doe
```

The complete text is stored.

---

# 📌 next()

Java also provides another method.

```java
scanner.next();
```

Unlike `nextLine()`, it stops reading when it reaches a space.

Input:

```
John Doe
```

Output:

```
John
```

Only the first word is stored.

---

# 🔍 next() vs nextLine()

| Method | Reads Spaces? | Example |
|---------|---------------|----------|
| `next()` | ❌ No | John |
| `nextLine()` | ✅ Yes | John Doe |

Most beginners prefer using `nextLine()` because it reads the complete line.

---

# 🔢 Reading an Integer

Use:

```java
nextInt()
```

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age: ");

int age = scanner.nextInt();

System.out.println("You are " + age + " years old.");

scanner.close();
```

Example Output:

```
Enter your age:
21

You are 21 years old.
```

---

# ⚠ Integer Input Rules

Valid:

```
20
45
100
```

Invalid:

```
20.5
```

A decimal cannot be stored inside an integer.

---

# 💯 Reading a Double

For decimal numbers, use:

```java
nextDouble()
```

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter GPA: ");

double gpa = scanner.nextDouble();

System.out.println("Your GPA is " + gpa);

scanner.close();
```

Output:

```
Enter GPA:
3.8

Your GPA is 3.8
```

---

# ✅ Reading a Boolean

Boolean input accepts only:

- true
- false

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Are you a student (true/false): ");

boolean isStudent = scanner.nextBoolean();

System.out.println(isStudent);

scanner.close();
```

Example Output:

```
Are you a student (true/false):
true

true
```

---

# 💻 Accepting Multiple Inputs

Example:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Name: ");
String name = scanner.nextLine();

System.out.print("Age: ");
int age = scanner.nextInt();

System.out.print("GPA: ");
double gpa = scanner.nextDouble();

System.out.println();

System.out.println("Student Information");
System.out.println("-------------------");
System.out.println("Name : " + name);
System.out.println("Age  : " + age);
System.out.println("GPA  : " + gpa);

scanner.close();
```

This demonstrates how Scanner can accept different data types within a single program.

---

# ⚠ Common Scanner Problem

A common issue occurs when using:

```java
nextInt()
```

or

```java
nextDouble()
```

followed immediately by

```java
nextLine()
```

Example:

```java
int age = scanner.nextInt();

String color = scanner.nextLine();
```

The program unexpectedly skips the color input.

This happens because pressing **Enter** after typing the number leaves a newline character (`\n`) in the input buffer.

# ✅ Solving the Input Buffer Problem

The easiest solution is to call an extra `nextLine()` immediately after reading an integer or double.

Example:

```java
int age = scanner.nextInt();
scanner.nextLine(); // Clears the input buffer

System.out.print("Enter your favorite color: ");
String color = scanner.nextLine();
```

Now the program correctly waits for the user to enter the color.

---

# 🧮 Mini Project – Rectangle Area Calculator

In this lesson, a simple project was built to calculate the area of a rectangle.

## Algorithm

```text
Start
   ↓
Read Width
   ↓
Read Height
   ↓
Area = Width × Height
   ↓
Display Area
   ↓
End
```

---

## Example Program

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width;
        double height;
        double area;

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println();
        System.out.println("Area = " + area + " cm²");

        scanner.close();

    }

}
```

---

## Example Output

```
Enter width: 5.3
Enter height: 6.4

Area = 33.92 cm²
```

---

# 📌 Scanner Methods Learned

| Method | Purpose |
|----------|-----------------------------|
| `next()` | Reads one word |
| `nextLine()` | Reads an entire line |
| `nextInt()` | Reads an integer |
| `nextDouble()` | Reads a decimal number |
| `nextBoolean()` | Reads true or false |
| `close()` | Closes the Scanner |

---

# 💻 Complete Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println();

        System.out.println("===== Student Information =====");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("GPA       : " + gpa);
        System.out.println("Student   : " + isStudent);

        scanner.close();

    }

}
```

---

# 🧠 Key Takeaways

- Scanner allows Java programs to receive keyboard input.
- Scanner belongs to the `java.util` package.
- Always import Scanner before using it.
- Create a Scanner using `new Scanner(System.in)`.
- Close the Scanner after use.
- `nextLine()` reads an entire line.
- `next()` reads only one word.
- `nextInt()` reads integers.
- `nextDouble()` reads decimal numbers.
- `nextBoolean()` reads true or false.
- The input buffer issue occurs after numeric input.
- Calling an extra `nextLine()` clears the buffer.

---

# ⚠️ Common Mistakes

### Forgetting to import Scanner

```java
import java.util.Scanner;
```

---

### Forgetting to close the Scanner

```java
scanner.close();
```

---

### Using `next()` instead of `nextLine()`

```
John Doe
```

Result:

```
John
```

Only the first word is stored.

---

### Reading an Integer into a String

Incorrect:

```java
String age = scanner.nextInt();
```

Always use matching data types.

---

### Forgetting to Clear the Input Buffer

Incorrect:

```java
int age = scanner.nextInt();

String city = scanner.nextLine();
```

Correct:

```java
int age = scanner.nextInt();
scanner.nextLine();

String city = scanner.nextLine();
```

---

# ✅ Best Practices

- Import Scanner only once.
- Use meaningful variable names.
- Close the Scanner when finished.
- Prefer `nextLine()` when reading full names or sentences.
- Match Scanner methods with variable data types.
- Handle the input buffer properly when mixing numeric and text input.
- Keep prompts clear and user-friendly.

---

# 📝 Revision Notes

Remember:

- Scanner reads user input.
- Import using:

```java
import java.util.Scanner;
```

- Create Scanner:

```java
Scanner scanner = new Scanner(System.in);
```

- Important methods:

```
next()
nextLine()
nextInt()
nextDouble()
nextBoolean()
close()
```

- Use an extra `nextLine()` after `nextInt()` or `nextDouble()` if another `nextLine()` follows.

---

# 🎯 Learning Outcome

After completing this lesson, I can confidently:

- Accept user input from the keyboard
- Import and use the Scanner class
- Read different data types
- Differentiate between `next()` and `nextLine()`
- Solve the Scanner input buffer problem
- Build interactive console applications

---

# 📖 Summary

Today's lesson introduced **user input**, making Java programs interactive.

I learned how to use the `Scanner` class to receive text, numbers, decimal values, and boolean values from users. I also understood the difference between `next()` and `nextLine()`, learned why the Scanner input buffer issue occurs, and how to fix it using an extra `nextLine()`.

Finally, I applied these concepts by building a **Rectangle Area Calculator**, reinforcing the process of accepting user input, performing calculations, and displaying results.

These skills are essential for building interactive Java applications and will be used extensively throughout future lessons.

---

# 🚀 Next Lesson

➡️ **Day 04 — Mad Libs Game**

In the next lesson, I'll build my first interactive Java mini project by creating a **Mad Libs Game** that combines user input with strings to generate fun stories.

---

## 📊 Progress

- **Lesson:** 3 / 71 ✅
- **Mini Projects:** 0 / 16
- **Status:** Completed ✔️

---

> **"Interactive programs begin with user input. The Scanner class is your gateway to building applications that communicate with users." ⌨️☕**
The following `nextLine()` reads that leftover newline instead of waiting for new user input.

This behavior surprises many beginners but is a well-known Scanner issue.
