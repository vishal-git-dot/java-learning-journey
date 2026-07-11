# 🛒 Day 06 - Shopping Cart Program ⭐

> **Mini Project:** 02 / 16 ⭐  
> **Course Lesson:** 06  
> **Topic:** Shopping Cart Program  
> **Status:** ✅ Completed

---

# 📖 Overview

In this mini project, I built a simple **Shopping Cart Program** using Java.

The program asks the user to enter the name of an item, its price, and the quantity they want to purchase. It then calculates the total cost and displays a purchase summary.

This project combines several concepts learned in previous lessons, including variables, user input, arithmetic operations, and formatted console output.

It is one of the first practical Java applications that simulates a real-world shopping experience.

---

# 🎯 Project Objectives

After completing this project, I can:

- Accept multiple user inputs
- Work with different data types
- Perform arithmetic calculations
- Calculate totals automatically
- Display formatted output
- Build an interactive console application
- Combine multiple Java concepts into one program

---

# 📚 Concepts Used

This project uses the following Java concepts:

- Scanner
- Variables
- String
- int
- double
- char
- User Input
- Arithmetic Operators
- Multiplication
- Console Output
- String Concatenation

---

# 🛍️ Project Scenario

Imagine a customer shopping in a small store.

The program asks:

- What item are you buying?
- What is the price of each item?
- How many items would you like?

Finally, it calculates the total amount the customer needs to pay.

---

# 💻 Sample Output

```
What item would you like to buy? Pizza
What is the price for each? 4.99
How many would you like? 8

You have bought 8 Pizza(s)
Your total is $39.92
```

---

# 🧠 Program Flow

```text
Start
   │
   ▼
Create Scanner
   │
   ▼
Ask Item Name
   │
   ▼
Read String
   │
   ▼
Ask Item Price
   │
   ▼
Read Double
   │
   ▼
Ask Quantity
   │
   ▼
Read Integer
   │
   ▼
Calculate Total
   │
   ▼
Display Receipt
   │
   ▼
Close Scanner
   │
   ▼
End
```

---

# 📦 Variables Used

| Variable | Data Type | Purpose |
|-----------|-----------|---------|
| `item` | String | Stores the product name |
| `price` | double | Stores the price of one item |
| `quantity` | int | Stores the number of items |
| `currency` | char | Stores the currency symbol |
| `total` | double | Stores the final total |

---

# 📥 User Input

The program accepts three pieces of information from the user.

```java
String item;
double price;
int quantity;
```

Example

```
Pizza

4.99

8
```

---

# 🧮 Calculating the Total

The total cost is calculated using multiplication.

```java
total = price * quantity;
```

Example

```
Price = 4.99

Quantity = 8

Total = 39.92
```

---

# 💵 Currency Symbol

A character variable stores the currency symbol.

```java
char currency = '$';
```

This makes the final output easier to read.

Example

```
$39.92
```

---

# 📤 Purchase Summary

The program displays a receipt-like summary.

Example

```text
You have bought 5 Burger(s)

Your total is $24.95
```

---

# 🧾 Complete Workflow

```text
User Starts Program
        │
        ▼
Enter Item Name
        │
        ▼
Enter Price
        │
        ▼
Enter Quantity
        │
        ▼
Multiply Price × Quantity
        │
        ▼
Display Receipt
```

---

# 🔍 Code Breakdown

### Step 1

Import Scanner.

```java
import java.util.Scanner;
```

---

### Step 2

Create a Scanner object.

```java
Scanner scanner = new Scanner(System.in);
```

---

### Step 3

Declare variables.

```java
String item;
double price;
int quantity;
char currency = '$';
double total;
```

---

### Step 4

Read user input.

```java
item = scanner.nextLine();

price = scanner.nextDouble();

quantity = scanner.nextInt();
```

---

### Step 5

Calculate the total.

```java
total = price * quantity;
```

---

### Step 6

Display the final receipt.

```java
System.out.println("You have bought " + quantity + " " + item + "(s)");

System.out.println("Your total is " + currency + total);
```

---

# 🌍 Real-World Applications

Shopping cart calculations are used in:

- Online shopping websites
- Grocery stores
- Billing software
- Restaurant ordering systems
- POS (Point of Sale) systems
- E-commerce platforms
- Mobile shopping applications

---

# 💡 Skills Practiced

During this project I practiced:

- Reading user input
- Using different primitive data types
- Working with Strings
- Performing calculations
- Combining variables
- Displaying dynamic output
- Writing interactive Java programs

# ✅ Best Practices Learned

During this project I learned several good programming practices:

- Import only the classes you need.
- Declare variables before using them.
- Use meaningful variable names.
- Test the program after adding each feature.
- Close the `Scanner` after finishing user input.
- Keep calculations separate from user input.
- Display clean and readable output.

---

# ⚠️ Common Mistakes

## Forgetting to Import Scanner

Incorrect

```java
Scanner scanner = new Scanner(System.in);
```

Error

```
Scanner cannot be resolved to a type
```

Correct

```java
import java.util.Scanner;
```

---

## Using the Wrong Scanner Method

Incorrect

```java
price = scanner.nextInt();
```

for a decimal value like

```
4.99
```

Correct

```java
price = scanner.nextDouble();
```

---

## Forgetting to Close the Scanner

Always close the scanner when finished.

```java
scanner.close();
```

---

## Wrong Total Calculation

Incorrect

```java
total = price + quantity;
```

Correct

```java
total = price * quantity;
```

---

## Using the Wrong Data Type

Incorrect

```java
int price = 4.99;
```

Correct

```java
double price = 4.99;
```

---

# 📚 Key Java Concepts Revised

### String

Stores text.

```java
String item = "Pizza";
```

---

### double

Stores decimal numbers.

```java
double price = 4.99;
```

---

### int

Stores whole numbers.

```java
int quantity = 5;
```

---

### char

Stores a single character.

```java
char currency = '$';
```

---

### Arithmetic Operator

```java
total = price * quantity;
```

---

### Scanner

```java
Scanner scanner = new Scanner(System.in);
```

---

# 💻 Complete Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println();
        System.out.println("You have bought " + quantity + " " + item + "(s)");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }

}
```

---

# 📝 Revision Notes

Remember the workflow:

```
Create Scanner
        ↓
Read Item Name
        ↓
Read Price
        ↓
Read Quantity
        ↓
Calculate Total
        ↓
Display Receipt
        ↓
Close Scanner
```

Formula

```
Total = Price × Quantity
```

Required Data Types

```
String
double
int
char
```

Scanner Methods

```
nextLine()
nextDouble()
nextInt()
```

---

# 🎯 Learning Outcome

After completing this mini project, I can confidently:

- Accept multiple types of user input.
- Use `Scanner` effectively.
- Work with `String`, `int`, `double`, and `char`.
- Perform arithmetic calculations.
- Calculate shopping totals.
- Build an interactive console application.
- Display clean and user-friendly output.
- Combine concepts from previous Java lessons into one practical project.

---

# 📖 Summary

Today's mini project combined several Java fundamentals into a practical application. I used the `Scanner` class to collect user input, stored values using appropriate data types, calculated the total purchase amount using arithmetic operators, and displayed a formatted receipt.

This project demonstrates how multiple programming concepts work together to solve a simple real-world problem, providing a strong foundation for building larger console applications.

---

# 🚀 Next Lesson

➡️ **Day 07 — If Statements**

In the next lesson, I'll learn how to make decisions in Java using **if**, **else if**, and **else** statements. This will allow programs to respond differently based on user input and conditions.

---

## 📊 Progress

- **Lesson:** 6 / 71 ✅
- **Mini Projects:** 2 / 16 ⭐
- **Status:** Completed ✔️

---

> **"Every real application starts with small building blocks—today's shopping cart is tomorrow's complete e-commerce system." 🛒☕**
