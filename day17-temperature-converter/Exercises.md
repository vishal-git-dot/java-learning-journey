# Exercises

# Day 17 — Temperature Converter 🌡️

This exercise set reinforces the concepts covered in the Temperature Converter mini project.

Topics covered:

- `Scanner`
- User input
- `double`
- `String`
- `nextDouble()`
- `next()`
- `toUpperCase()`
- Method chaining
- `equals()`
- Ternary operator
- Mathematical expressions
- Temperature conversion
- `printf()`
- Format specifiers
- Unicode
- Debugging
- Input validation

---

# Difficulty Levels

| Difficulty | Meaning |
|---|---|
| Easy | Basic concept recall and simple coding |
| Medium | Combines multiple concepts |
| Hard | Requires deeper reasoning or program modification |

---

# 1. Concept Revision Questions

## Exercise 1 — Scanner

**Difficulty: Easy**

Which Java class is used to receive input from the console?

---

## Exercise 2 — Scanner Creation

**Difficulty: Easy**

Complete:

```java
Scanner scanner = new __________(System.in);
```

---

## Exercise 3 — Import

**Difficulty: Easy**

Write the import statement required for Scanner.

---

## Exercise 4 — Decimal Input

**Difficulty: Easy**

Which Scanner method reads a `double`?

```text
A. next()
B. nextInt()
C. nextDouble()
D. nextLine()
```

---

## Exercise 5 — String Input

**Difficulty: Easy**

Which Scanner method is used in this project to read the unit?

---

## Exercise 6 — Uppercase Conversion

**Difficulty: Easy**

What does this do?

```java
"c".toUpperCase()
```

---

## Exercise 7 — String Comparison

**Difficulty: Easy**

Which method should normally be used to compare String contents?

---

## Exercise 8 — Ternary Syntax

**Difficulty: Easy**

Complete:

```java
condition ? __________ : __________;
```

---

## Exercise 9 — Floating-Point Formatting

**Difficulty: Easy**

What does:

```text
%.1f
```

mean?

---

## Exercise 10 — Degree Symbol

**Difficulty: Easy**

What Unicode escape represents the degree symbol?

---

# 2. Fill in the Blanks

## Exercise 11

**Difficulty: Easy**

The class used to receive console input is:

```text
__________
```

---

## Exercise 12

**Difficulty: Easy**

The Scanner method used to read a decimal value is:

```text
__________
```

---

## Exercise 13

**Difficulty: Easy**

The method used to convert a String to uppercase is:

```text
__________
```

---

## Exercise 14

**Difficulty: Easy**

Strings should be compared using:

```text
__________
```

---

## Exercise 15

**Difficulty: Easy**

The ternary operator uses:

```text
__________
```

to separate the condition from the true expression.

---

## Exercise 16

**Difficulty: Easy**

The ternary operator uses:

```text
__________
```

to separate the true expression from the false expression.

---

## Exercise 17

**Difficulty: Easy**

The `printf()` format character used for floating-point values is:

```text
__________
```

---

## Exercise 18

**Difficulty: Easy**

Fahrenheit-to-Celsius:

```text
(temperature - ______) × ______ / ______
```

---

## Exercise 19

**Difficulty: Easy**

Celsius-to-Fahrenheit:

```text
temperature × ______ / ______ + ______
```

---

## Exercise 20

**Difficulty: Easy**

Complete:

```java
scanner.__________();
```

---

# 3. True / False

## Exercise 21

**Difficulty: Easy**

`double` can store decimal values.

```text
True / False
```

---

## Exercise 22

**Difficulty: Easy**

`nextDouble()` reads a `double`.

```text
True / False
```

---

## Exercise 23

**Difficulty: Easy**

`toUpperCase()` converts lowercase letters to uppercase.

```text
True / False
```

---

## Exercise 24

**Difficulty: Easy**

`==` is the preferred way to compare String contents.

```text
True / False
```

---

## Exercise 25

**Difficulty: Easy**

`equals()` compares String contents.

```text
True / False
```

---

## Exercise 26

**Difficulty: Easy**

The ternary operator can choose between two expressions.

```text
True / False
```

---

## Exercise 27

**Difficulty: Easy**

The correct Celsius-to-Fahrenheit formula is:

```java
temp * 9 / 5 + 32
```

```text
True / False
```

---

## Exercise 28

**Difficulty: Easy**

`printf()` can format floating-point values.

```text
True / False
```

---

## Exercise 29

**Difficulty: Easy**

`%.1f` displays one digit after the decimal point.

```text
True / False
```

---

## Exercise 30

**Difficulty: Easy**

`\u00B0` represents the degree symbol.

```text
True / False
```

---

# 4. Multiple Choice Questions

## Exercise 31

**Difficulty: Easy**

Which class is used for console input?

```text
A. Input
B. Scanner
C. ConsoleReader
D. SystemReader
```

---

## Exercise 32

**Difficulty: Easy**

Which method reads a `double`?

```text
A. nextDecimal()
B. nextFloat()
C. nextDouble()
D. readDouble()
```

---

## Exercise 33

**Difficulty: Easy**

What does this produce?

```java
"c".toUpperCase()
```

```text
A. "c"
B. "C"
C. "CC"
D. Error
```

---

## Exercise 34

**Difficulty: Easy**

Which is correct?

```text
A. unit == "C"
B. unit.equals("C")
C. unit.compare("C")
D. unit.same("C")
```

---

## Exercise 35

**Difficulty: Easy**

What does `?` represent in the ternary operator?

```text
A. Loop
B. Beginning of the true expression
C. Class declaration
D. Method call
```

---

## Exercise 36

**Difficulty: Easy**

What does `:` separate?

```text
A. Two methods
B. True and false expressions
C. Two variables
D. Two classes
```

---

## Exercise 37

**Difficulty: Easy**

Which is the correct Fahrenheit-to-Celsius expression?

```text
A. temp * 9 / 5 + 32
B. (temp - 32) * 5 / 9
C. temp + 32 * 5 / 9
D. temp - 32 * 9 / 5
```

---

## Exercise 38

**Difficulty: Easy**

Which is the correct Celsius-to-Fahrenheit expression?

```text
A. temp * 9 / 5 + 32
B. (temp - 32) * 5 / 9
C. temp * 5 / 9 + 32
D. temp / 9 * 5 + 32
```

---

## Exercise 39

**Difficulty: Easy**

What does `%.1f` do?

```text
A. Displays one integer
B. Displays one decimal place
C. Displays one String
D. Displays one character
```

---

## Exercise 40

**Difficulty: Easy**

Which method closes a Scanner?

```text
A. stop()
B. end()
C. close()
D. terminate()
```

---

# 5. Debugging Questions

## Exercise 41

**Difficulty: Medium**

Find the problem:

```java
String unit = scanner.next();

if (unit == "C") {
    System.out.println("Celsius");
}
```

What should be changed?

---

## Exercise 42

**Difficulty: Medium**

Find the mathematical error:

```java
double fahrenheit = celsius * 5 / 9 + 32;
```

Write the correct expression.

---

## Exercise 43

**Difficulty: Medium**

Find the problem:

```java
System.out.printf("%.1d", temperature);
```

Why is `d` incorrect here?

---

## Exercise 44

**Difficulty: Medium**

Find the problem:

```java
double temperature = scanner.next();
```

Why does this not compile?

---

## Exercise 45

**Difficulty: Medium**

Find the problem:

```java
String unit = scanner.next().toUppercase();
```

---

## Exercise 46

**Difficulty: Medium**

What is missing?

```java
Scanner scanner = new Scanner(System.in);

double temperature = scanner.nextDouble();
```

---

## Exercise 47

**Difficulty: Medium**

Correct this expression:

```java
double newTemp = unit.equals("C")
        ? temp - 32 * 5 / 9
        : temp * 9 / 5 + 32;
```

Explain why parentheses are needed.

---

# 6. Output Prediction Questions

## Exercise 48

**Difficulty: Easy**

Predict the output:

```java
String unit = "c";

System.out.println(unit.toUpperCase());
```

---

## Exercise 49

**Difficulty: Easy**

Predict the output:

```java
String unit = "C";

System.out.println(unit.equals("C"));
```

---

## Exercise 50

**Difficulty: Easy**

Predict the output:

```java
String unit = "F";

System.out.println(unit.equals("C"));
```

---

## Exercise 51

**Difficulty: Medium**

Predict the output:

```java
double temp = 100;

double result = (temp - 32) * 5 / 9;

System.out.printf("%.1f", result);
```

---

## Exercise 52

**Difficulty: Medium**

Predict the output:

```java
double temp = 0;

double result = temp * 9 / 5 + 32;

System.out.printf("%.1f", result);
```

---

## Exercise 53

**Difficulty: Medium**

Predict:

```java
double temp = 30;

double result = temp * 9 / 5 + 32;

System.out.printf("%.1f\u00B0F", result);
```

---

## Exercise 54

**Difficulty: Medium**

What conversion occurs?

```java
String unit = "c";

double temp = 75;

double result = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

---

# 7. Ternary Operator Practice

## Exercise 55

**Difficulty: Easy**

Convert this into a ternary expression:

```java
if (temperature >= 0) {
    result = "Above freezing";
} else {
    result = "Below freezing";
}
```

---

## Exercise 56

**Difficulty: Easy**

Write a ternary expression that returns:

```text
Adult
```

when:

```text
age >= 18
```

and:

```text
Minor
```

otherwise.

---

## Exercise 57

**Difficulty: Medium**

Write a ternary expression:

```text
temperature >= 30 → Hot
temperature < 30  → Not hot
```

---

## Exercise 58

**Difficulty: Medium**

Write the temperature conversion using the ternary operator.

Requirements:

```text
Target C → Fahrenheit to Celsius
Target F → Celsius to Fahrenheit
```

---

# 8. Coding Exercises

## Exercise 59 — Basic Converter

**Difficulty: Easy**

Create a temperature converter that:

1. Reads a temperature.
2. Reads `C` or `F`.
3. Converts the temperature.
4. Displays the result.

---

## Exercise 60 — Lowercase Support

**Difficulty: Easy**

Modify the converter so:

```text
c
C
f
F
```

are all accepted.

---

## Exercise 61 — One Decimal Place

**Difficulty: Easy**

Display exactly one decimal place.

Example:

```text
86.0°F
```

---

## Exercise 62 — Degree Symbol

**Difficulty: Easy**

Add the degree symbol.

Example:

```text
37.8°C
```

---

## Exercise 63 — Better Output

**Difficulty: Medium**

Change the output to:

```text
Converted temperature: 37.8°C
```

---

## Exercise 64 — Unit Validation

**Difficulty: Medium**

If the user enters:

```text
X
```

display:

```text
Invalid unit.
```

---

## Exercise 65 — Freezing Point

**Difficulty: Medium**

Make sure these conversions work:

```text
0°C → 32°F
32°F → 0°C
```

---

# 9. Practice Problems

## Exercise 66 — Freezing Check

**Difficulty: Medium**

Ask for a Celsius temperature.

Use a ternary operator:

```text
<= 0 → Freezing
> 0  → Above freezing
```

---

## Exercise 67 — Hot or Cold

**Difficulty: Medium**

Use:

```text
>= 30 → Hot
< 30  → Not hot
```

---

## Exercise 68 — Positive or Negative

**Difficulty: Easy**

Ask for a number.

Use a ternary operator:

```text
Positive
Negative
```

---

## Exercise 69 — Even or Odd

**Difficulty: Medium**

Ask for an integer.

Use the ternary operator to determine:

```text
Even
Odd
```

---

## Exercise 70 — Maximum Number

**Difficulty: Medium**

Ask the user for two numbers.

Use a ternary operator to determine which is larger.

---

## Exercise 71 — Minimum Number

**Difficulty: Medium**

Ask the user for two numbers.

Use a ternary operator to determine which is smaller.

---

# 10. Challenge Problems

## Exercise 72 — Kelvin Support

**Difficulty: Hard**

Expand the converter to support:

```text
Celsius
Fahrenheit
Kelvin
```

Use:

```text
C → K
K = C + 273.15
```

```text
K → C
C = K - 273.15
```

Also implement:

```text
C → F
F → C
F → K
K → F
```

---

## Exercise 73 — Multiple Conversions

**Difficulty: Hard**

Allow the user to perform multiple conversions.

Example:

```text
Enter temperature: 100
Convert to: C

Result: 37.8°C

Convert another temperature? Y/N:
```

Continue until:

```text
N
```

is entered.

---

## Exercise 74 — Input Validation

**Difficulty: Hard**

Handle invalid unit input.

Example:

```text
Enter unit: X

Invalid unit.
Please enter C or F.
```

---

## Exercise 75 — Number Validation

**Difficulty: Hard**

Prevent the program from crashing when the user enters:

```text
hello
```

instead of a number.

Research and use:

```java
scanner.hasNextDouble()
```

to validate the input.

---

# 11. Mini Assignments

## Assignment 1 — Improved Temperature Converter

**Difficulty: Medium**

Build an improved version.

Requirements:

- Use `Scanner`.
- Accept decimal temperature.
- Accept `C` or `F`.
- Accept lowercase input.
- Use `equals()`.
- Use a ternary operator.
- Use correct formulas.
- Display one decimal place.
- Display the degree symbol.
- Close Scanner.

---

## Assignment 2 — Temperature Classification

**Difficulty: Hard**

After converting to Celsius, classify the temperature:

```text
<= 0       → Freezing
1–15       → Cold
16–29      → Moderate
30–39      → Hot
>= 40      → Extremely Hot
```

Example:

```text
Temperature: 35.0°C
Classification: Hot
```

---

## Assignment 3 — Conversion Table

**Difficulty: Hard**

Ask for a starting Celsius temperature and display its Fahrenheit conversion.

Then create a table:

```text
Celsius    Fahrenheit
0.0°C      32.0°F
10.0°C     50.0°F
20.0°C     68.0°F
30.0°C     86.0°F
40.0°C     104.0°F
50.0°C     122.0°F
```

---

# 12. Interview Style Questions

## Exercise 76

**Difficulty: Easy**

What is the difference between:

```java
print()
println()
printf()
```

---

## Exercise 77

**Difficulty: Easy**

Why is `double` preferred for temperature conversion?

---

## Exercise 78

**Difficulty: Easy**

What is method chaining?

Give an example from this project.

---

## Exercise 79

**Difficulty: Medium**

Why is:

```java
unit.equals("C")
```

preferred over:

```java
unit == "C"
```

?

---

## Exercise 80

**Difficulty: Medium**

Explain this statement:

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

---

## Exercise 81

**Difficulty: Medium**

What would happen if the user entered:

```text
c
```

instead of:

```text
C
```

if `toUpperCase()` was removed?

---

## Exercise 82

**Difficulty: Medium**

Why are parentheses required in:

```java
(temp - 32) * 5 / 9
```

?

---

## Exercise 83

**Difficulty: Medium**

What is the difference between:

```java
next()
```

and:

```java
nextDouble()
```

?

---

## Exercise 84

**Difficulty: Hard**

Explain why the following formula is incorrect for Celsius-to-Fahrenheit:

```java
temp * 5 / 9 + 32
```

and provide the correct formula.

---

# 13. Self Reflection

## Exercise 85

What part of the project was easiest for you?

Write your answer below:

```text
Answer:
```

---

## Exercise 86

What part of the project was most difficult?

```text
Answer:
```

---

## Exercise 87

Can you explain the ternary operator without looking at your notes?

```text
Answer:
```

---

## Exercise 88

Can you explain why `equals()` is used for Strings?

```text
Answer:
```

---

## Exercise 89

Can you write the Fahrenheit-to-Celsius formula from memory?

```text
Answer:
```

---

## Exercise 90

Can you write the Celsius-to-Fahrenheit formula from memory?

```text
Answer:
```

---

# 14. Expected Outputs

## Test Case 1

Input:

```text
100
C
```

Expected:

```text
The temperature is: 37.8°C
```

---

## Test Case 2

Input:

```text
30
F
```

Expected:

```text
The temperature is: 86.0°F
```

---

## Test Case 3

Input:

```text
32
C
```

Expected:

```text
The temperature is: 0.0°C
```

---

## Test Case 4

Input:

```text
0
F
```

Expected:

```text
The temperature is: 32.0°F
```

---

## Test Case 5

Input:

```text
75
c
```

Expected:

```text
The temperature is: 23.9°C
```

---

## Test Case 6

Input:

```text
-40
F
```

Expected:

```text
The temperature is: -40.0°F
```

---

# 15. Hints

## Hint 1

Remember:

```java
Scanner scanner = new Scanner(System.in);
```

---

## Hint 2

Use:

```java
scanner.nextDouble()
```

for temperature.

---

## Hint 3

Use:

```java
scanner.next().toUpperCase()
```

for the unit.

---

## Hint 4

Compare Strings using:

```java
unit.equals("C")
```

---

## Hint 5

The ternary structure is:

```java
condition ? trueValue : falseValue
```

---

## Hint 6

Fahrenheit to Celsius:

```java
(temp - 32) * 5 / 9
```

---

## Hint 7

Celsius to Fahrenheit:

```java
temp * 9 / 5 + 32
```

---

## Hint 8

Use:

```java
%.1f
```

to display one decimal place.

---

# 16. Solutions

## Solution 1

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

---

## Solution 2

```java
double temp = scanner.nextDouble();
```

---

## Solution 3

```java
String unit = scanner.next().toUpperCase();
```

---

## Solution 4

```java
unit.equals("C")
```

---

## Solution 5

```java
double newTemp = unit.equals("C")
        ? (temp - 32) * 5 / 9
        : temp * 9 / 5 + 32;
```

---

## Solution 6

```java
System.out.printf("%.1f\u00B0%s%n", newTemp, unit);
```

---

## Solution 7

String comparison:

```java
unit.equals("C")
```

not:

```java
unit == "C"
```

---

## Solution 8

Fahrenheit to Celsius:

```java
(temp - 32) * 5 / 9
```

---

## Solution 9

Celsius to Fahrenheit:

```java
temp * 9 / 5 + 32
```

---

# 17. Complete Solution

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        String unit = scanner.next().toUpperCase();

        double newTemp = unit.equals("C")
                ? (temp - 32) * 5 / 9
                : temp * 9 / 5 + 32;

        System.out.printf(
                "The temperature is: %.1f\u00B0%s%n",
                newTemp,
                unit
        );

        scanner.close();
    }
}
```

---

# 18. Final Challenge

## Temperature Converter 2.0

**Difficulty: Hard**

Create a complete temperature conversion application.

Requirements:

- Celsius
- Fahrenheit
- Kelvin
- User input
- Input validation
- Lowercase support
- Multiple conversions
- Ternary operator where appropriate
- `printf()`
- One decimal place
- Degree symbols
- Clear error messages
- Proper Scanner management

Example:

```text
=============================
    TEMPERATURE CONVERTER
=============================

Enter temperature: 100

Convert from:
C - Celsius
F - Fahrenheit
K - Kelvin

Enter source unit: C

Convert to:
C - Celsius
F - Fahrenheit
K - Kelvin

Enter target unit: F

Result: 212.0°F

Convert another temperature? Y/N:
```

---

# Final Self-Check

Before moving to the next lesson, make sure you can answer:

- [ ] What is `Scanner`?
- [ ] What does `nextDouble()` do?
- [ ] What does `next()` do?
- [ ] What does `toUpperCase()` do?
- [ ] What is method chaining?
- [ ] Why use `equals()` for Strings?
- [ ] What is the ternary operator?
- [ ] What does `?` mean?
- [ ] What does `:` mean?
- [ ] What is the Fahrenheit-to-Celsius formula?
- [ ] What is the Celsius-to-Fahrenheit formula?
- [ ] What does `%.1f` mean?
- [ ] What does `%s` mean?
- [ ] How do you display the degree symbol?
- [ ] Why should the Scanner be closed?
- [ ] Can you build the converter without looking at the solution?

If you can answer these questions and build the project independently, you have successfully practiced the major concepts from Day 17.
