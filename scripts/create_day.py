#!/usr/bin/env python3

import os
import re
import sys
from pathlib import Path

TOTAL_DAYS = 71


def slugify(text: str) -> str:
    """
    Convert:
    Introduction to Java
    ->
    introduction-to-java
    """
    text = text.strip().lower()
    text = re.sub(r'[^a-z0-9]+', '-', text)
    text = re.sub(r'-+', '-', text)
    return text.strip('-')


def validate_day(day: int):
    if day < 1 or day > TOTAL_DAYS:
        print(f"❌ Day must be between 1 and {TOTAL_DAYS}.")
        sys.exit(1)


def create_folder(path: Path):
    path.mkdir(parents=True, exist_ok=False)


def write_file(path: Path, content: str):
    path.write_text(content, encoding="utf-8")


def main():

    if len(sys.argv) != 3:
        print("Usage:")
        print("python create_day.py <day_number> <topic>")
        sys.exit(1)

    try:
        day = int(sys.argv[1])
    except ValueError:
        print("❌ Invalid day number.")
        sys.exit(1)

    validate_day(day)

    topic = sys.argv[2].strip()

    if not topic:
        print("❌ Topic cannot be empty.")
        sys.exit(1)

    slug = slugify(topic)

    folder_name = f"day{day:02d}-{slug}"

    root = Path.cwd()

    lesson = root / folder_name

    if lesson.exists():
        print(f"❌ {folder_name} already exists.")
        sys.exit(1)

    print("📁 Creating lesson folder...")

    create_folder(lesson)

    src = lesson / "src"
    src.mkdir()

    images = lesson / "images"
    images.mkdir()

    # ---------------- README ----------------

    readme = f"""# Day {day:02d} – {topic}

> Learning notes for **{topic}**

---

## 📖 Overview

Write today's overview here.

---

## 🎯 Learning Objectives

- 

---

## 💻 Code

See the src folder.

---

## 📝 Notes

-

---

## 🧠 Key Takeaways

-

---

## ✅ Progress

Day {day:02d} completed.
"""

    write_file(
        lesson / "README.md",
        readme
    )

    # ---------------- Main.java ----------------

    main_java = """public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Java!");

    }

}
"""

    write_file(
        src / "Main.java",
        main_java
    )

    # ---------------- Practice.java ----------------

    practice_java = """public class Practice {

    public static void main(String[] args) {

        // Practice here

    }

}
"""

    write_file(
        src / "Practice.java",
        practice_java
    )

    # ---------------- Exercises ----------------

    exercises = f"""# Exercises

## Day {day:02d} - {topic}

- [ ] Exercise 1
- [ ] Exercise 2
- [ ] Exercise 3
"""

    write_file(
        lesson / "Exercises.md",
        exercises
    )

    print()
    print("✅ Lesson created successfully!")
    print()
    print(f"Folder : {folder_name}")
    print()
    print("Files created:")
    print("README.md")
    print("src/Main.java")
    print("src/Practice.java")
    print("Exercises.md")
    print("images/")


if __name__ == "__main__":
    main()
