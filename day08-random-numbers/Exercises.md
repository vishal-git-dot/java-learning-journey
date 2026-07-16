# Day 08 — Exercises
## Chapter 8: Random Numbers

---

# Exercises

These exercises are designed to reinforce your understanding of Java's `Random` class and help you become comfortable generating random values of different data types.

Difficulty Levels:

- 🟢 Easy
- 🟡 Medium
- 🔴 Hard

---

# Concept Revision Questions

## 🟢 Easy

1. What package contains the `Random` class?
2. Why must the `Random` class be imported?
3. How do you create a `Random` object?
4. Which method generates random integers?
5. Which method generates random decimal numbers?
6. Which method generates random boolean values?
7. What data type does `nextInt()` return?
8. What data type does `nextDouble()` return?
9. What data type does `nextBoolean()` return?
10. What is a pseudo-random number?

---

# Fill in the Blanks

## 🟢 Easy

1.

```java
import java.util._________;
```

2.

```java
Random random = new _________();
```

3.

```java
int number = random._________();
```

4.

```java
double value = random._________();
```

5.

```java
boolean coin = random._________();
```

---

# True or False

## 🟢 Easy

1. The `Random` class belongs to `java.util`.
2. `nextDouble()` returns an integer.
3. `nextBoolean()` returns either `true` or `false`.
4. `nextInt(1,7)` can generate 6.
5. `nextInt(1,6)` can generate 6.
6. The upper bound of `nextInt(origin, bound)` is exclusive.
7. A `Random` object should be created before calling its methods.
8. Every execution may produce different results.

---

# Multiple Choice Questions

## 🟡 Medium

### 1.

Which statement imports the Random class?

A)

```java
import java.random.Random;
```

B)

```java
import java.util.Random;
```

C)

```java
import Random;
```

D)

```java
include Random;
```

---

### 2.

Which method generates decimal values?

A. nextInt()

B. nextBoolean()

C. nextDouble()

D. nextFloat()

---

### 3.

What is the maximum value produced by

```java
random.nextInt(1,7);
```

A. 5

B. 6

C. 7

D. 8

---

### 4.

Which statement creates a Random object?

A.

```java
Random();
```

B.

```java
new Random;
```

C.

```java
Random random = new Random();
```

D.

```java
Random = random;
```

---

# Output Prediction

## 🟡 Medium

### Question 1

```java
Random random = new Random();

System.out.println(random.nextInt(1,4));
```

Possible outputs?

---

### Question 2

```java
System.out.println(random.nextBoolean());
```

Possible outputs?

---

### Question 3

```java
System.out.println(random.nextDouble());
```

Possible range?

---

# Debugging Questions

## 🟡 Medium

### Fix the Errors

```java
Random random = Random();

int number = random.nextInt;
```

---

### Fix the Errors

```java
import java.Random;
```

---

### Fix the Errors

```java
int dice = random.nextInt(1,6);
```

Generate values from 1–6 correctly.

---

# Coding Exercises

## 🟢 Easy

### Exercise 1

Generate one random number between 1 and 10.

---

### Exercise 2

Generate one random number between 50 and 100.

---

### Exercise 3

Generate three random dice rolls.

---

### Exercise 4

Generate five random numbers between 1 and 20.

---

### Exercise 5

Generate one random decimal number.

---

### Exercise 6

Generate a random boolean value.

---

# Practice Problems

## 🟡 Medium

### Problem 1

Create a coin flip simulator.

Display either:

```
Heads
```

or

```
Tails
```

---

### Problem 2

Roll two dice.

Display:

```
Dice 1:
Dice 2:
Total:
```

---

### Problem 3

Generate ten lottery numbers.

Range:

1–50

---

### Problem 4

Generate a random score between 0 and 100.

Display:

```
Excellent

Good

Average

Poor
```

using `if` statements.

---

# Challenge Problems

## 🔴 Hard

### Challenge 1

Roll a die until a 6 appears.

Display how many attempts were required.

---

### Challenge 2

Generate random passwords using:

- uppercase letters
- lowercase letters
- digits

---

### Challenge 3

Simulate 100 coin flips.

Count:

- Heads
- Tails

Display the totals.

---

### Challenge 4

Roll two dice 1000 times.

Calculate the average total.

---

# Mini Assignment

Create a **Dice Rolling Simulator**.

Requirements:

- Generate three dice.
- Display each value.
- Display the total.
- Display the highest roll.
- Display the lowest roll.

Example

```
Dice 1 : 4
Dice 2 : 2
Dice 3 : 6

Total : 12

Highest : 6

Lowest : 2
```

---

# Interview Style Questions

1. What is the purpose of the Random class?
2. Why is the upper bound exclusive?
3. Explain pseudo-random numbers.
4. Difference between nextInt() and nextDouble().
5. Difference between nextBoolean() and an if statement.
6. How would you simulate a six-sided die?
7. Why should Random objects be reused?

---

# Self Reflection

- Can I create a Random object without looking at notes?
- Can I explain inclusive vs exclusive bounds?
- Can I generate numbers within any range?
- Can I simulate a dice roll?
- Can I simulate a coin flip?

---

# Hints

- Remember to import:

```java
import java.util.Random;
```

- Create only one Random object.

- The upper bound is always excluded.

- Use:

```java
nextInt(origin, bound)
```

for custom ranges.

---

# Expected Outputs

Dice

```
4
```

Coin

```
Heads
```

Random Double

```
0.734921
```

Random Boolean

```
true
```

---

# Solutions

## Fill in the Blanks

1. Random

2. Random

3. nextInt

4. nextDouble

5. nextBoolean

---

## True / False

1. True

2. False

3. True

4. True

5. False

6. True

7. True

8. True

---

## MCQs

1. B

2. C

3. B

4. C

---

## End of Day 08 Exercises
