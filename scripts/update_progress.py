#!/usr/bin/env python3

from pathlib import Path
import re

# ==========================================
# Configuration
# ==========================================

ROOT = Path(__file__).resolve().parent.parent
README = ROOT / "README.md"

TOTAL_LESSONS = 71

PROJECT_DAYS = {
    4, 6, 11, 15, 17, 19, 22,
    29, 30, 36, 37, 38,
    60, 61, 65, 71
}

DAY_PATTERN = re.compile(r"day(\d{2})-(.+)", re.IGNORECASE)

ROADMAP_PATTERN = re.compile(
    r"^\|\s*(\d{2})\s*\|(.+?)\|\s*(⬜|✅)\s*\|$",
    re.MULTILINE,
)

# ==========================================
# Lesson Model
# ==========================================

class Lesson:

    def __init__(self, number, slug, path):
        self.number = number
        self.slug = slug
        self.path = path

    @property
    def title(self):
        return self.slug.replace("-", " ").title()

    @property
    def full_title(self):
        return f"Day {self.number:02d} — {self.title}"

    @property
    def is_project(self):
        return self.number in PROJECT_DAYS

    def __repr__(self):
        return f"<Lesson {self.number:02d}: {self.title}>"

# ==========================================
# Folder Scanner
# ==========================================

def scan_lessons():

    lessons = []

    for item in ROOT.iterdir():

        if not item.is_dir():
            continue

        match = DAY_PATTERN.fullmatch(item.name)

        if not match:
            continue

        number = int(match.group(1))
        slug = match.group(2)

        lessons.append(
            Lesson(
                number,
                slug,
                item,
            )
        )

    lessons.sort(key=lambda lesson: lesson.number)

    return lessons

# ==========================================
# README Helpers
# ==========================================

def read_readme():

    return README.read_text(
        encoding="utf-8"
    )


def write_readme(content):

    README.write_text(
        content,
        encoding="utf-8",
        newline="\n",
    )


def replace_block(content, block, new_text):

    pattern = (
        rf"(<!-- {block}_START -->)(.*?)(<!-- {block}_END -->)"
    )

    return re.sub(
        pattern,
        rf"\1\n{new_text}\n\3",
        content,
        flags=re.DOTALL,
    )

# ==========================================
# Progress Helpers
# ==========================================

def progress_percent(completed):

    return round(
        completed / TOTAL_LESSONS * 100
    )


def progress_bar(percent, width=30):

    filled = round(
        width * percent / 100
    )

    return (
        "█" * filled
        + "░" * (width - filled)
    )

# ==========================================
# Lesson Statistics
# ==========================================

def get_statistics(lessons):

    completed = len(lessons)

    remaining = TOTAL_LESSONS - completed

    percent = progress_percent(completed)

    projects = sum(
        1
        for lesson in lessons
        if lesson.is_project
    )

    return {
        "completed": completed,
        "remaining": remaining,
        "percent": percent,
        "projects": projects,
    }


# ==========================================
# Current Lesson
# ==========================================

def get_current_lesson(lessons):

    if not lessons:
        return None

    return lessons[-1]


# ==========================================
# Next Lesson
# ==========================================

def get_next_lesson(lessons):

    if not lessons:

        return {
            "number": 1,
            "title": "Introduction to Java",
        }

    current = lessons[-1].number

    if current >= TOTAL_LESSONS:
        return None

    next_number = current + 1

    roadmap = {
        1: "Introduction to Java",
        2: "Variables",
        3: "User Input",
        4: "Mad Libs Game",
        5: "Arithmetic",
        6: "Shopping Cart Program",
        7: "If Statements",
        8: "Random Numbers",
        9: "Math Class",
        10: "printf()",
        11: "Compound Interest Calculator",
        12: "Nested If Statements",
        13: "String Methods",
        14: "Substrings",
        15: "Weight Converter",
        16: "Ternary Operator",
        17: "Temperature Converter",
        18: "Enhanced Switch",
        19: "Calculator Program",
        20: "Logical Operators",
        21: "While Loops",
        22: "Number Guessing Game",
        23: "For Loops",
        24: "Break & Continue",
        25: "Nested Loops",
        26: "Methods",
        27: "Overloaded Methods",
        28: "Variable Scope",
        29: "Banking Program",
        30: "Dice Roller Program",
        31: "Arrays",
        32: "User Input into Arrays",
        33: "Search Arrays",
        34: "Varargs",
        35: "2D Arrays",
        36: "Quiz Game",
        37: "Rock Paper Scissors",
        38: "Slot Machine",
        39: "Object-Oriented Programming",
        40: "Constructors",
        41: "Overloaded Constructors",
        42: "Arrays of Objects",
        43: "Static Keyword",
        44: "Inheritance",
        45: "super Keyword",
        46: "Method Overriding",
        47: "toString() Method",
        48: "Abstraction",
        49: "Interfaces",
        50: "Polymorphism",
        51: "Runtime Polymorphism",
        52: "Getters & Setters",
        53: "Aggregation",
        54: "Composition",
        55: "Wrapper Classes",
        56: "ArrayLists",
        57: "Exception Handling",
        58: "Write Files",
        59: "Read Files",
        60: "Music Player",
        61: "Hangman Game",
        62: "Date & Time API",
        63: "Anonymous Classes",
        64: "TimerTask",
        65: "Countdown Timer",
        66: "Generics",
        67: "HashMaps",
        68: "Enums",
        69: "Threading",
        70: "Multithreading",
        71: "Alarm Clock",
    }

    return {
        "number": next_number,
        "title": roadmap[next_number],
    }


# ==========================================
# Recent Lessons
# ==========================================

def get_recent_lessons(lessons, limit=5):

    return list(
        reversed(
            lessons[-limit:]
        )
    )

# ==========================================
# Update AUTO_PROGRESS
# ==========================================

def update_progress(content, stats):

    block = f"""```text
Overall Progress

{progress_bar(stats["percent"])}

Completion : {stats["percent"]}%

Completed Lessons : {stats["completed"]} / {TOTAL_LESSONS}

Remaining Lessons : {stats["remaining"]}

Mini Projects : {stats["projects"]} / {len(PROJECT_DAYS)}
```"""

    return replace_block(
        content,
        "AUTO_PROGRESS",
        block,
    )


# ==========================================
# Update AUTO_CURRENT
# ==========================================

def update_current(content, lesson):

    if lesson is None:

        block = """```text
Not Started
```"""

    else:

        block = f"""```text
Day {lesson.number:02d}

{lesson.title}
```"""

    return replace_block(
        content,
        "AUTO_CURRENT",
        block,
    )


# ==========================================
# Update AUTO_NEXT
# ==========================================

def update_next(content, lesson):

    if lesson is None:

        block = """```text
Course Completed 🎉
```"""

    else:

        block = f"""```text
Day {lesson["number"]:02d}

{lesson["title"]}
```"""

    return replace_block(
        content,
        "AUTO_NEXT",
        block,
    )


# ==========================================
# Update AUTO_RECENT
# ==========================================

def update_recent(content, lessons):

    if not lessons:

        block = """```text
No lessons completed yet.
```"""

    else:

        lines = []

        for lesson in lessons:

            lines.append(
                f"✓ Day {lesson.number:02d} - {lesson.title}"
            )

        block = "```text\n"
        block += "\n".join(lines)
        block += "\n```"

    return replace_block(
        content,
        "AUTO_RECENT",
        block,
    )


# ==========================================
# Update All Main Sections
# ==========================================

def update_main_sections(content, lessons):

    stats = get_statistics(lessons)

    current = get_current_lesson(lessons)

    next_lesson = get_next_lesson(lessons)

    recent = get_recent_lessons(lessons)

    content = update_progress(
        content,
        stats,
    )

    content = update_current(
        content,
        current,
    )

    content = update_next(
        content,
        next_lesson,
    )

    content = update_recent(
        content,
        recent,
    )

    return content

# ==========================================
# Update AUTO_ROADMAP
# ==========================================

def update_roadmap(content, lessons):
    """
    Marks completed lessons in the roadmap table.

    Example:

    | 01 | Introduction to Java | ⬜ |

    becomes

    | 01 | Introduction to Java | ✅ |
    """

    completed = {lesson.number for lesson in lessons}

    lines = []

    inside_block = False

    for line in content.splitlines():

        if "<!-- AUTO_ROADMAP_START -->" in line:
            inside_block = True
            lines.append(line)
            continue

        if "<!-- AUTO_ROADMAP_END -->" in line:
            inside_block = False
            lines.append(line)
            continue

        if inside_block:

            match = ROADMAP_PATTERN.match(line)

            if match:

                day = int(match.group(1))
                topic = match.group(2).strip()

                status = "✅" if day in completed else "⬜"

                line = f"| {day:02d} | {topic} | {status} |"

        lines.append(line)

    return "\n".join(lines)


# ==========================================
# Main
# ==========================================

def main():

    print("Scanning lesson folders...")

    lessons = scan_lessons()

    print(f"Found {len(lessons)} completed lesson(s).")

    content = read_readme()

    # Update the main automation blocks
    content = update_main_sections(
        content,
        lessons,
    )

    # Update the roadmap table
    content = update_roadmap(
        content,
        lessons,
    )

    # Save README
    write_readme(content)

    print("README.md updated successfully!")

    stats = get_statistics(lessons)

    print("----------------------------------")
    print(f"Completed Lessons : {stats['completed']}/{TOTAL_LESSONS}")
    print(f"Completion        : {stats['percent']}%")
    print(f"Mini Projects     : {stats['projects']}/{len(PROJECT_DAYS)}")

    current = get_current_lesson(lessons)

    if current:
        print(f"Current Lesson    : {current.full_title}")
    else:
        print("Current Lesson    : Not Started")

    next_lesson = get_next_lesson(lessons)

    if next_lesson:
        print(
            f"Next Lesson       : Day {next_lesson['number']:02d} - {next_lesson['title']}"
        )
    else:
        print("Next Lesson       : Course Completed 🎉")

    print("----------------------------------")


if __name__ == "__main__":
    main()
