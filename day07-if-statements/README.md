# 🌿 Day 07 - If Statements

> **Course:** Java Masterclass (71 Lessons)  
> **Lesson:** 07 / 71  
> **Topic:** If Statements  
> **Status:** ✅ Completed

---

# 📖 Overview

Today I learned one of the most important concepts in programming—**decision making** using **if statements**.

An `if` statement allows a program to execute different blocks of code depending on whether a condition is **true** or **false**.

This lesson introduced:

- `if`
- `else if`
- `else`
- Comparison operators
- Boolean expressions
- User input with Scanner
- String validation
- Working with multiple conditions

These concepts form the foundation of nearly every Java application.

---

# 🎯 Learning Objectives

After completing this lesson, I can:

- Write simple if statements
- Use else statements
- Chain multiple conditions using else if
- Compare numbers using comparison operators
- Compare boolean values
- Check empty Strings
- Accept user input and make decisions
- Build interactive console programs

---

# 📚 Topics Covered

- if Statement
- else Statement
- else if Statement
- Boolean Conditions
- Comparison Operators
- Scanner Input
- Integer Comparisons
- String Validation
- Boolean Variables
- Multiple Decision Groups

---

# 💡 What is an If Statement?

An **if statement** executes a block of code **only if its condition is true**.

Example

```java
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

If the condition is false, Java skips that block.

---

# 🔀 The else Statement

The `else` block runs when the `if` condition is false.

Example

```java
if (age >= 18) {
    System.out.println("Adult");
}
else {
    System.out.println("Child");
}
```

---

# 🔄 else if

Use `else if` when checking multiple conditions.

Example

```java
if (age >= 65) {
    System.out.println("Senior");
}
else if (age >= 18) {
    System.out.println("Adult");
}
else {
    System.out.println("Child");
}
```

---

# ⚖️ Comparison Operators

| Operator | Meaning |
|-----------|---------|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

---

# 💻 Example Program

```java
int age = 21;

if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Child");
}
```

Output

```
Adult
```

---

# 👶 Age Classification

Example logic:

```
Age >= 65
↓

Senior

Age >= 18
↓

Adult

Age == 0
↓

Baby

Age < 0
↓

Not Born Yet

Otherwise
↓

Child
```

---

# 🧠 Program Flow

```text
Start
   │
   ▼
Read User Input
   │
   ▼
Check Condition
   │
   ├── True
   │      │
   │      ▼
   │ Execute Code
   │
   └── False
          │
          ▼
   Check Next Condition
          │
          ▼
       Else Block
          │
          ▼
          End
```

---

# 📝 Using Scanner with if Statements

Example

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age: ");

int age = scanner.nextInt();
```

Now we can use that value inside an if statement.

```java
if(age >= 18){
    System.out.println("Adult");
}
```

---

# 🔤 Checking Empty Strings

Java provides the `isEmpty()` method.

```java
String name = scanner.nextLine();

if(name.isEmpty()){
    System.out.println("You didn't enter your name.");
}
```

Otherwise

```java
else{
    System.out.println("Hello " + name);
}
```

---

# ✅ Boolean Conditions

Booleans already contain `true` or `false`.

Instead of writing

```java
if(isStudent == true)
```

Write

```java
if(isStudent)
```

Likewise,

```java
if(!isStudent)
```

means

```
If the user is NOT a student.
```

---

# 📥 Sample Input

```
Enter your name:
Alex

Enter your age:
22

Are you a student?
true
```

---

# 📤 Sample Output

```
Hello Alex 😀

You are an adult 👨

You are a student 🎓
```

---

# 🚀 Decision Tree

```text
Enter Name
      │
      ▼
Name Empty?
 ├── Yes
 │      ▼
 │  Show Warning
 │
 └── No
        ▼
    Say Hello
        │
        ▼
Enter Age
        │
        ▼
Senior?
Adult?
Baby?
Child?
        │
        ▼
Enter Student Status
        │
        ▼
Student?
        │
        ▼
Display Final Messages
```

---

# 🌍 Real-World Applications

If statements are used in:

- Login Systems
- ATM Machines
- Banking Software
- Shopping Websites
- Games
- Mobile Apps
- Password Validation
- Online Exams
- User Authentication
- Access Control Systems
