#!/usr/bin/env python3
"""
LearnFlow - Create Learning Day

Usage:
    python scripts/create_day.py 1 "Introduction to Java"
"""

from __future__ import annotations

import re
import sys
from pathlib import Path
from string import Template

# ==========================================================
# Configuration
# ==========================================================

TOTAL_DAYS = 71

TEMPLATES = {
    "README.md.template": "README.md",
    "Exercises.md.template": "Exercises.md",
    "Main.java.template": "src/Main.java",
    "Practice.java.template": "src/Practice.java",
}


# ==========================================================
# Console Helpers
# ==========================================================

def info(message: str) -> None:
    print(f"ℹ️  {message}")


def success(message: str) -> None:
    print(f"✅ {message}")


def error(message: str) -> None:
    print(f"❌ {message}")
    sys.exit(1)


# ==========================================================
# Repository Detection
# ==========================================================

def repository_root() -> Path:
    """
    Locate the repository root by searching
    for a .git directory.
    """

    current = Path.cwd().resolve()

    for directory in [current] + list(current.parents):
        if (directory / ".git").exists():
            return directory

    return current


ROOT = repository_root()
TEMPLATE_DIR = ROOT / "templates"


# ==========================================================
# Validation
# ==========================================================

def validate(day: int, topic: str) -> None:

    if not (1 <= day <= TOTAL_DAYS):
        error(f"Day must be between 1 and {TOTAL_DAYS}.")

    if not topic.strip():
        error("Topic cannot be empty.")


# ==========================================================
# Slug
# ==========================================================

def slugify(text: str) -> str:
    """
    Example

    Introduction to Java

    becomes

    introduction-to-java
    """

    text = text.lower().strip()

    text = re.sub(r"[^a-z0-9]+", "-", text)

    text = re.sub(r"-+", "-", text)

    return text.strip("-")


# ==========================================================
# Lesson Folder
# ==========================================================

def lesson_directory(day: int, topic: str) -> Path:

    slug = slugify(topic)

    return ROOT / f"day{day:02d}-{slug}"


# ==========================================================
# Templates
# ==========================================================

def load_template(name: str) -> Template:

    template = TEMPLATE_DIR / name

    if not template.exists():
        error(f"Missing template: {name}")

    return Template(
        template.read_text(encoding="utf-8")
    )


def render_template(
    template: Template,
    day: int,
    topic: str,
) -> str:

    return template.safe_substitute(
        DAY=f"{day:02d}",
        TOPIC=topic,
        TOTAL_DAYS=str(TOTAL_DAYS),
    )


# ==========================================================
# File Helpers
# ==========================================================

def ensure_directory(path: Path) -> None:
    path.mkdir(parents=True, exist_ok=True)


def write(path: Path, content: str) -> None:

    ensure_directory(path.parent)

    path.write_text(
        content,
        encoding="utf-8",
    )


# ==========================================================
# Lesson Creation
# ==========================================================

def create_structure(lesson_dir: Path) -> None:
    """
    Creates the lesson directory structure.

    dayXX-topic/
    ├── README.md
    ├── Exercises.md
    ├── images/
    └── src/
        ├── Main.java
        └── Practice.java
    """

    info(f"Creating folder: {lesson_dir.name}")

    if lesson_dir.exists():
        error(f"{lesson_dir.name} already exists.")

    ensure_directory(lesson_dir)
    ensure_directory(lesson_dir / "src")
    ensure_directory(lesson_dir / "images")


# ==========================================================
# Template Generation
# ==========================================================

def generate_templates(
    lesson_dir: Path,
    day: int,
    topic: str,
) -> None:
    """
    Generates every file from the templates directory.
    """

    info("Generating template files...")

    for template_name, output_name in TEMPLATES.items():

        template = load_template(template_name)

        rendered = render_template(
            template,
            day,
            topic,
        )

        destination = lesson_dir / output_name

        write(
            destination,
            rendered,
        )

        success(
            f"Created {destination.relative_to(ROOT)}"
        )


# ==========================================================
# Summary
# ==========================================================

def print_summary(
    lesson_dir: Path,
    day: int,
    topic: str,
) -> None:

    print()
    print("=" * 60)
    print("🎉 Learning Day Created Successfully")
    print("=" * 60)
    print()

    print(f"Day      : {day:02d}")
    print(f"Topic    : {topic}")
    print(f"Folder   : {lesson_dir.name}")

    print()

    print("Generated Structure")
    print("-------------------")

    print("README.md")
    print("Exercises.md")
    print("images/")
    print("src/")
    print("├── Main.java")
    print("└── Practice.java")

    print()

    print("Next Steps")
    print("----------")
    print("1. git pull")
    print("2. Watch the lesson")
    print("3. Write your notes")
    print("4. Complete the exercises")
    print("5. Commit & Push")

    print()
    print("=" * 60)
    print()


# ==========================================================
# Main Generator
# ==========================================================

def create_learning_day(
    day: int,
    topic: str,
) -> None:
    """
    Main generation workflow.
    """

    validate(
        day,
        topic,
    )

    lesson_dir = lesson_directory(
        day,
        topic,
    )

    create_structure(
        lesson_dir,
    )

    generate_templates(
        lesson_dir,
        day,
        topic,
    )

    print_summary(
        lesson_dir,
        day,
        topic,
    )


# ==========================================================
# Command Line Parsing
# ==========================================================

def parse_arguments() -> tuple[int, str]:
    """
    Parse command-line arguments.

    Expected:
        python scripts/create_day.py 1 "Introduction to Java"
    """

    if len(sys.argv) != 3:
        error(
            'Usage:\n'
            'python scripts/create_day.py <day_number> "Lesson Topic"'
        )

    try:
        day = int(sys.argv[1])
    except ValueError:
        error("Day number must be an integer.")

    topic = sys.argv[2].strip()

    return day, topic


# ==========================================================
# Banner
# ==========================================================

def print_banner() -> None:

    print()
    print("=" * 70)
    print("📚 LearnFlow - Learning Day Generator")
    print("=" * 70)
    print()


def print_footer() -> None:

    print("=" * 70)
    print("✅ Done")
    print("=" * 70)
    print()


# ==========================================================
# Entry Point
# ==========================================================

def main() -> None:

    print_banner()

    day, topic = parse_arguments()

    create_learning_day(
        day,
        topic,
    )

    print_footer()


# ==========================================================
# Script Entry
# ==========================================================

if __name__ == "__main__":

    try:

        main()

    except KeyboardInterrupt:

        print()
        error("Operation cancelled by user.")

    except FileNotFoundError as exc:

        print()
        error(f"Required file not found:\n{exc}")

    except PermissionError as exc:

        print()
        error(f"Permission denied:\n{exc}")

    except Exception as exc:

        print()
        error(
            "Unexpected error occurred.\n"
            f"{type(exc).__name__}: {exc}"
        )
