# ⭐ Day 04 - Mad Libs Game

> **Course Lesson:** 04  
> **Topic:** Mad Libs Game (Mini Project)  
> **Status:** ✅ Completed

---

# 📖 Overview

Today I built my **first Java mini project** by creating a **Mad Libs Game**.

Mad Libs is a fun word game where a user provides different types of words, such as adjectives, nouns, and verbs. These words are then inserted into a predefined story to create a humorous and often nonsensical result.

Although the project is simple, it reinforces several fundamental Java concepts learned so far, including:

- Variables
- Strings
- User Input
- Scanner Class
- String Concatenation
- Program Flow
- Console Output

This project demonstrates how interactive programs can combine user input with predefined text to generate dynamic output.

---

# 🎯 Learning Objectives

After completing this mini project, I can:

- Build a complete console application
- Accept multiple user inputs
- Store values using String variables
- Use the Scanner class efficiently
- Combine variables with text
- Generate dynamic output
- Practice user interaction
- Improve console formatting
- Understand basic program structure

---

# 🎮 What is Mad Libs?

Mad Libs is a popular word game.

Players are asked to enter different categories of words without knowing the full story.

For example:

- Adjective
- Noun
- Verb
- Place
- Animal

The program inserts these words into a story template.

The final story is usually funny because the chosen words rarely fit together perfectly.

Example:

```
Today I visited a gigantic zoo.

Inside the zoo I saw a penguin.

The penguin was dancing while everyone laughed.

I felt excited.
```

Every execution of the program creates a different story depending on the user's input.

---

# 🧠 Concepts Practiced

This project combines everything learned so far.

### Variables

Store different pieces of information.

```java
String adjective;
String noun;
String verb;
```

---

### Scanner

Accept user input.

```java
Scanner scanner = new Scanner(System.in);
```

---

### User Input

Receive information from the keyboard.

```java
adjective = scanner.nextLine();
```

---

### String Concatenation

Join text with variables.

```java
System.out.println("Today I visited a " + adjective + " zoo.");
```

---

### Console Output

Display the completed story.

---

# 📦 Required Import

The Scanner class belongs to the `java.util` package.

Always import it before using Scanner.

```java
import java.util.Scanner;
```

---

# 🏗 Creating the Scanner

```java
Scanner scanner = new Scanner(System.in);
```

This Scanner object reads keyboard input entered by the user.

---

# 🔒 Closing the Scanner

Always close the Scanner after using it.

```java
scanner.close();
```

Closing the Scanner prevents unnecessary resource usage and follows good programming practices.

---

# 📝 Variables Used

This project uses only String variables.

```java
String adjective1;
String noun1;
String adjective2;
String verb1;
String adjective3;
```

Each variable stores one word entered by the user.

---

# 📥 Collecting User Input

The program asks the user for five different words.

Example:

```java
System.out.print("Enter an adjective: ");
adjective1 = scanner.nextLine();
```

The same approach is repeated for all remaining words.

---

# 📚 Word Types

## Adjective

An adjective describes a noun.

Examples:

- Beautiful
- Fast
- Huge
- Tiny
- Colorful
- Suspicious

---

## Noun

A noun represents a person, place, animal, or object.

Examples:

- Dog
- Tiger
- Robot
- Elephant
- Teacher
- Castle

---

## Verb

A verb describes an action.

Examples:

- Running
- Sleeping
- Dancing
- Eating
- Singing
- Flying

For this project, verbs ending in **-ing** produce better stories.

---

# 🧩 Story Template

After receiving all inputs, the program builds a story.

Template:

```text
Today I went to a ______ zoo.

In an exhibit I saw a ______.

The ______ was ______ and ______.

I was ______.
```

Each blank is replaced with one of the user's words.

---

# 🔄 Program Flow

```text
Start
   │
   ▼
Import Scanner
   │
   ▼
Create Scanner
   │
   ▼
Declare Variables
   │
   ▼
Ask for Adjective
   │
   ▼
Ask for Noun
   │
   ▼
Ask for Adjective
   │
   ▼
Ask for Verb
   │
   ▼
Ask for Adjective
   │
   ▼
Generate Story
   │
   ▼
Display Story
   │
   ▼
Close Scanner
   │
   ▼
End
```

---

# 💻 Basic Program Structure

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables

        // User Input

        // Display Story

        scanner.close();

    }

}
```

---

# 🖥 Sample Interaction

```
Enter an adjective:
Suspicious

Enter a noun:
Penguin

Enter another adjective:
Tiny

Enter a verb:
Dancing

Enter another adjective:
Excited
```

The program now has everything needed to generate a story.

---

# 🎭 Example Story

```
Today I went to a suspicious zoo.

In an exhibit I saw a penguin.

The penguin was tiny and dancing.

I was excited.
```

The story changes every time different words are entered.

---

# 🎯 Why This Project Matters

Although simple, this project introduces an important programming idea:

> Programs become much more interesting when users provide the data.

Instead of printing fixed text, the application now creates different outputs based on user input.

This is one of the first examples of a truly interactive Java application.

# 💡 String Concatenation

The story is created using **String concatenation**.

Concatenation means joining multiple strings and variables using the `+` operator.

Example:

```java
System.out.println("Today I went to a " + adjective1 + " zoo.");
```

Output:

```
Today I went to a beautiful zoo.
```

Every variable becomes part of the final sentence.

---

# 🧪 Complete Story Example

### User Input

```
Adjective : mysterious
Noun      : dragon
Adjective : enormous
Verb      : flying
Adjective : amazed
```

### Output

```
Today I went to a mysterious zoo.

In an exhibit I saw a dragon.

The dragon was enormous and flying.

I was amazed.
```

Every run of the program can generate a completely different story.

---

# 📌 Key Takeaways

- A Scanner can accept multiple user inputs.
- Strings store words and sentences.
- Variables make programs dynamic.
- String concatenation combines text with variables.
- Interactive programs are more engaging than static ones.
- Mini projects reinforce multiple concepts together.

---

# ⚠️ Common Mistakes

## Forgetting to Import Scanner

Incorrect:

```java
Scanner scanner = new Scanner(System.in);
```

Correct:

```java
import java.util.Scanner;
```

---

## Forgetting to Create a Scanner

Incorrect:

```java
name = scanner.nextLine();
```

Correct:

```java
Scanner scanner = new Scanner(System.in);
```

---

## Forgetting to Close the Scanner

Always close the Scanner after use.

```java
scanner.close();
```

---

## Using the Wrong Scanner Method

Since all inputs are text, use:

```java
nextLine()
```

instead of:

```java
nextInt()
nextDouble()
```

---

## Forgetting Spaces While Concatenating

Incorrect:

```java
System.out.println("Hello"+name);
```

Output:

```
HelloJohn
```

Correct:

```java
System.out.println("Hello " + name);
```

Output:

```
Hello John
```

---

## Forgetting Variable Initialization

Every variable must receive user input before it is used.

Incorrect:

```java
System.out.println(adjective1);
```

Correct:

```java
adjective1 = scanner.nextLine();
```

---

# ✅ Best Practices

- Use meaningful variable names.
- Keep prompts clear and easy to understand.
- Close the Scanner after use.
- Organize variable declarations at the beginning.
- Add blank lines to improve console readability.
- Write clean and descriptive output.
- Test the program with different inputs.

---

# 📝 Revision Notes

Remember:

- Import Scanner:

```java
import java.util.Scanner;
```

- Create Scanner:

```java
Scanner scanner = new Scanner(System.in);
```

- Read Strings:

```java
scanner.nextLine();
```

- Join Strings:

```java
"text " + variable
```

- Close Scanner:

```java
scanner.close();
```

---

# 🎯 Learning Outcome

After completing this project, I can confidently:

- Build my first complete Java console application
- Accept multiple user inputs
- Use several String variables
- Generate dynamic output
- Apply String concatenation
- Design interactive console experiences
- Structure a complete Java project from start to finish

---

# 🚀 Real-World Applications

The concepts learned in this project are used in many real-world applications, including:

- Chatbots
- Console games
- Quiz applications
- Surveys
- Registration forms
- Login systems
- Interactive educational software
- Command-line tools

This project serves as a foundation for building larger interactive Java applications.

---

# 📖 Summary

In this lesson, I built my **first Java mini project** by creating a **Mad Libs Game**.

The application collects multiple words from the user using the `Scanner` class and stores them in String variables. These words are then inserted into a predefined story using String concatenation, creating a unique and entertaining result every time the program runs.

This project reinforced the concepts of variables, user input, String manipulation, and console output while demonstrating how multiple programming concepts can be combined into a complete application.

Completing this mini project marks an important milestone in my Java learning journey, as it is my first interactive program that generates dynamic content based on user input.

---

# 🚀 Next Lesson

➡️ **Day 05 — Arithmetic**

In the next lesson, I'll learn how Java performs mathematical calculations using arithmetic operators such as addition, subtraction, multiplication, division, and modulus. These concepts will form the foundation for building calculators, games, and many other real-world applications.

---

## 📊 Progress

- **Lesson:** 4 / 71 ✅
- **Mini Projects:** 1 / 16 ⭐
- **Status:** Completed ✔️

---

> **"Programming becomes exciting when users interact with your code. Every input creates a new possibility." ☕🚀**
Instead of printing fixed text, the application now creates different outputs based on user input.

This is one of the first examples of a truly interactive Java application.
