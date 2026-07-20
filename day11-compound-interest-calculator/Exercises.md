# Exercises — Day 11
# Compound Interest Calculator 💰

> Mini Project #3

---

# Concept Revision Questions

## Easy

1. What is compound interest?
2. What is the principal amount?
3. What does the interest rate represent?
4. Why do we divide the interest rate by 100?
5. Why is `double` used instead of `int` for money?
6. What does `Math.pow()` do?
7. Which class is used for user input?
8. Which method reads a decimal number?
9. Which method reads an integer?
10. Why should a `Scanner` be closed?

---

# Fill in the Blanks

1. Compound interest is calculated using __________.
2. The original investment is called the __________.
3. `Math.________()` raises a number to a power.
4. `Scanner` belongs to the __________ package.
5. `nextDouble()` returns a __________.
6. The interest rate entered as a percentage should be divided by __________.
7. `printf("%.2f")` displays __________ decimal places.
8. `System.in` is used for __________.
9. The final investment amount is commonly stored in a __________ variable.
10. Quarterly compounding occurs __________ times each year.

---

# True or False

1. Compound interest is the same as simple interest.
2. `Math.pow()` is useful in financial calculations.
3. `double` supports decimal values.
4. Interest should be converted to decimal form before calculation.
5. `Scanner` automatically closes itself.
6. Monthly compounding uses 12 periods per year.
7. `printf()` can format currency values.
8. `Math.pow(2,3)` returns 8.
9. The compound interest formula contains an exponent.
10. Closing resources is considered good programming practice.

---

# Multiple Choice Questions

### 1.

Which class is used for keyboard input?

A. Random

B. Scanner

C. Math

D. String

---

### 2.

Which method reads decimal input?

A. next()

B. nextInt()

C. nextDouble()

D. nextLine()

---

### 3.

Which method raises a number to a power?

A. Math.square()

B. Math.raise()

C. Math.pow()

D. Math.power()

---

### 4.

Which format specifier prints two decimal places?

A. `%d`

B. `%s`

C. `%.2f`

D. `%b`

---

### 5.

What is yearly compounding?

A. 2

B. 4

C. 12

D. 1

---

# Debugging Questions

## Easy

Find and fix the errors.

```java
double rate = 5;
amount = principal * Math.pow(1 + rate, years);
```

---

```java
Scanner scanner = new Scanner(System.in)

double principal;
```

---

```java
rate = scanner.nextInt();
```

---

```java
Math.power(2,3);
```

---

```java
scanner.nextDouble();
principal = amount;
```

---

# Output Prediction

## Question 1

```java
System.out.printf("%.2f", 15.6789);
```

Output?

---

## Question 2

```java
System.out.printf("%.1f", 5.55);
```

Output?

---

## Question 3

```java
System.out.printf("%d", 25);
```

Output?

---

## Question 4

```java
System.out.printf("%s", "Java");
```

Output?

---

## Question 5

```java
System.out.printf("%.3f", Math.PI);
```

Output?

---

# Coding Exercises

## Easy

### Exercise 1

Write a program that asks for the principal amount and prints it.

---

### Exercise 2

Read an annual interest rate and convert it into decimal form.

---

### Exercise 3

Read the number of years and display it using `printf()`.

---

### Exercise 4

Calculate the value of:

```
2^10
```

using `Math.pow()`.

---

### Exercise 5

Display the value of π using `Math.PI`.

---

# Medium Exercises

### Exercise 6

Build a compound interest calculator using yearly compounding only.

---

### Exercise 7

Allow the user to choose monthly or yearly compounding.

---

### Exercise 8

Display the interest earned separately from the final amount.

---

### Exercise 9

Calculate the total profit.

```
Profit = Amount - Principal
```

---

### Exercise 10

Format all currency values with two decimal places.

---

# Hard Challenges

### Challenge 1

Allow repeated calculations until the user chooses to exit.

---

### Challenge 2

Reject negative principal values.

---

### Challenge 3

Reject interest rates below 0%.

---

### Challenge 4

Allow users to choose different currencies.

---

### Challenge 5

Create a menu-driven banking calculator.

---

# Mini Assignments

## Assignment 1

Research the difference between:

- Simple Interest
- Compound Interest

Write a one-page comparison.

---

## Assignment 2

Find the current interest rate offered by three different banks and compare the final amount after 10 years.

---

## Assignment 3

Modify the calculator so that it accepts monthly deposits.

---

# Interview Style Questions

1. What is compound interest?
2. Why is `Math.pow()` required?
3. Why should percentages be converted into decimals?
4. Why is `double` preferred over `float` in this project?
5. Explain the compound interest formula.
6. What is the purpose of `printf()`?
7. Why should a Scanner be closed?
8. What improvements would you add to this calculator?

---

# Self Reflection

- Can I explain every variable used?
- Can I derive the formula myself?
- Can I use `Math.pow()` confidently?
- Can I write this project without notes?
- Do I understand why percentages are converted into decimals?

---

# Solutions (Brief)

**Fill in the Blanks**

1. exponential growth
2. principal
3. pow
4. java.util
5. double
6. 100
7. two
8. keyboard input
9. double
10. four

---

**True / False**

1. False
2. True
3. True
4. True
5. False
6. True
7. True
8. True
9. True
10. True

---

**MCQs**

1. B
2. C
3. C
4. C
5. D
