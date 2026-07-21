# Exercises — Day 12
# Nested if Statements 🎟️

> **Lesson:** Nested if Statements
> **Difficulty:** Beginner

---

# Concept Revision Questions

## Easy

1. What is a nested `if` statement?
2. When should nested `if` statements be used?
3. Can an `if` statement exist inside another `if` statement?
4. Can an `if` statement exist inside an `else` block?
5. What data type is commonly used with `if` statements?
6. What values can a boolean variable store?
7. Why are boolean variables useful?
8. What happens if the outer `if` condition is false?
9. What is the purpose of an `else` block?
10. What operator shortens `price = price * 0.9`?

---

# Fill in the Blanks

1. A nested `if` statement is an `__________` statement inside another conditional statement.
2. Boolean variables store only __________ or __________.
3. The statement `price *= 0.8` gives a __________ discount.
4. The `printf()` specifier for two decimal places is `__________`.
5. `price *= 0.9` means the customer pays __________% of the original price.
6. `price *= 0.7` represents a __________% discount.
7. Nested `if` statements help build a __________ tree.
8. `System.out.printf()` is used for __________ output.
9. The keyword used when a condition is false is `__________`.
10. Movie ticket price is stored in a __________ variable.

---

# True / False

1. Nested `if` statements are illegal in Java.
2. A nested `if` executes only if its parent block executes.
3. Boolean variables can store integers.
4. `price *= 0.9` reduces the price by 10%.
5. `printf("%.2f")` displays two decimal places.
6. An `else` block is optional.
7. Multiple levels of nesting are possible.
8. Boolean variables only contain `true` or `false`.
9. Nested `if` statements are useful in real-world programs.
10. `price *= 1` changes the value of `price`.

---

# Multiple Choice Questions

### 1.

Which keyword starts a conditional statement?

A. while

B. if

C. class

D. new

---

### 2.

Which data type is best for storing `isStudent`?

A. int

B. String

C. boolean

D. double

---

### 3.

Which statement gives a 20% discount?

A. `price *= 0.2;`

B. `price *= 0.8;`

C. `price += 0.8;`

D. `price /= 0.8;`

---

### 4.

Which statement gives no discount?

A. `price *= 0.5;`

B. `price *= 0.7;`

C. `price *= 1;`

D. `price *= 2;`

---

### 5.

Which format specifier prints a double with two decimal places?

A. `%d`

B. `%s`

C. `%.2f`

D. `%b`

---

# Debugging Questions

## Question 1

Find the error.

```java
if(isStudent = true)
{
    System.out.println("Student");
}
```

---

## Question 2

```java
if(isStudent)
System.out.println("Student")
```

---

## Question 3

```java
price *= .90
```

---

## Question 4

```java
System.out.printf("%2.f", price);
```

---

## Question 5

```java
boolean student = "true";
```

---

# Output Prediction

## Question 1

```java
boolean isStudent = true;

if(isStudent)
{
    System.out.println("Discount");
}
```

Output?

---

## Question 2

```java
boolean isStudent = false;

if(isStudent)
{
    System.out.println("Hello");
}
else
{
    System.out.println("World");
}
```

Output?

---

## Question 3

```java
double price = 10;

price *= 0.8;

System.out.println(price);
```

Output?

---

## Question 4

```java
double price = 9.99;

System.out.printf("%.2f", price);
```

Output?

---

## Question 5

```java
boolean a = true;
boolean b = true;

if(a)
{
    if(b)
    {
        System.out.println("Java");
    }
}
```

Output?

---

# Coding Exercises

## Easy

### Exercise 1

Create a boolean variable named `isStudent`.

Print a message only if it is true.

---

### Exercise 2

Create a boolean variable named `isSenior`.

Print a senior discount message.

---

### Exercise 3

Store a ticket price.

Reduce it by 10%.

Display the result.

---

### Exercise 4

Reduce a ticket price by 20%.

Display the formatted result.

---

### Exercise 5

Display the ticket price using `printf()`.

---

# Medium Exercises

### Exercise 6

Create a movie ticket discount system using nested `if` statements.

---

### Exercise 7

Allow discounts for:

- Student
- Senior
- Student + Senior

---

### Exercise 8

Display which discount was applied.

---

### Exercise 9

Calculate the amount saved after the discount.

---

### Exercise 10

Allow the user to enter whether they are a student or senior using `Scanner`.

---

# Hard Challenges

### Challenge 1

Add a military discount.

---

### Challenge 2

Add a VIP member discount.

---

### Challenge 3

Create five different discount categories.

---

### Challenge 4

Allow users to buy multiple tickets.

---

### Challenge 5

Generate a receipt showing:

- Original Price
- Discount Applied
- Amount Saved
- Final Price

---

# Mini Assignments

## Assignment 1

Research where nested `if` statements are commonly used in software development.

---

## Assignment 2

Draw a flowchart for the movie ticket program.

---

## Assignment 3

Rewrite the program using logical operators (`&&`) instead of nested `if` statements.

Compare both solutions.

---

# Interview Questions

1. What is a nested `if` statement?
2. Why are nested `if` statements useful?
3. When should nested conditions be avoided?
4. What is the difference between nested `if` statements and logical operators?
5. Why are booleans commonly used with `if` statements?
6. Explain the execution flow of nested conditions.
7. What are the advantages of `printf()`?
8. How would you simplify deeply nested code?

---

# Self Reflection

- Can I explain nested `if` statements without looking at notes?
- Can I draw the decision tree?
- Can I write nested conditions correctly?
- Can I identify when nesting is appropriate?
- Can I solve the ticket discount problem independently?

---

# Solutions (Brief)

## Fill in the Blanks

1. if
2. true, false
3. 20%
4. %.2f
5. 90
6. 30
7. decision
8. formatted
9. else
10. double

---

## True / False

1. False
2. True
3. False
4. True
5. True
6. True
7. True
8. True
9. True
10. False

---

## MCQs

1. B
2. C
3. B
4. C
5. C
