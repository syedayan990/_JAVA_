# ☕ Java Learning Repository

A chapter-wise collection of **Java** notes, examples and practice problems, written while learning the language from scratch.
Every example is small, runnable and focused on a single concept.

![Language](https://img.shields.io/badge/language-Java-orange)
![Status](https://img.shields.io/badge/status-learning-blue)
![Focus](https://img.shields.io/badge/focus-Java%20Basics%20to%20Advanced-green)

---

## 📚 Table of Contents

1. [About](#-about)
2. [Repository Structure](#-repository-structure)
3. [Topics Covered](#-topics-covered)
4. [Prerequisites](#-prerequisites)
5. [How to Run](#-how-to-run)
6. [Learning Path](#-learning-path)
7. [Conventions](#-conventions)
8. [Contributing / Feedback](#-contributing--feedback)
9. [Author](#-author)

---

## 📖 About

This repository documents my journey through Java, from the very first `Hello World` to multithreading and functional programming.
It is organised in chapters. Each chapter is made of small independent projects, so you can open any folder and run it on its own.

**Goals**

- Build a strong foundation in Java syntax and OOP
- Practise with hands-on examples instead of only reading theory
- Keep a reference I can come back to before interviews

---

## 🗂 Repository Structure

```
_JAVA_/
├── chapter-1/      Java fundamentals
├── Chapter-2/      Classes, strings, math, recursion
├── OOPsCore/       The four pillars of OOP
├── Chapter-3/      Collections, exceptions, threads, functional Java
├── Challenges/     Practice problems (Question_15 ... Question_57)
├── .gitignore
└── README.md
```

| Folder | What is inside |
|---|---|
| `chapter-1` | Java basics, data types and variables, operators (relational, logical), if-else, loops, break and continue, functions, return statement, arguments vs parameters, 1D and 2D arrays |
| `Chapter-2` | Classes and objects, switch case, ternary operator, `toString()`, String class and formatting, `StringBuilder`, Math and Random classes, recursion |
| `OOPsCore` | Encapsulation, inheritance, polymorphism, abstraction |
| `Chapter-3` | Collections and generics, variable arguments, exception handling, file handling, multithreading and `ExecutorService`, functional programming |
| `Challenges` | Problem-solving practice covering loops, strings, recursion and more |

---

## ✅ Topics Covered

### 1. Java Fundamentals
- [x] Program structure, `main` method, `System.out`
- [x] Variables and data types (primitive and reference)
- [x] Type casting (implicit and explicit)
- [x] Taking input with `Scanner`
- [x] Operators: arithmetic, relational, logical, assignment, increment/decrement
- [x] Number system basics

### 2. Control Flow
- [x] `if`, `else if`, `else`
- [x] `switch` case
- [x] Ternary operator
- [x] `for`, `while`, `do-while` loops
- [x] `break` and `continue`

### 3. Methods and Arrays
- [x] Functions and the `return` statement
- [x] Arguments vs parameters
- [x] Recursion
- [x] 1D arrays
- [x] 2D arrays

### 4. Strings and Utility Classes
- [x] `String` class and formatting (`String.format`)
- [x] `StringBuilder`
- [x] `Math` class
- [x] `Random` numbers
- [x] Wrapper classes and autoboxing

### 5. Object-Oriented Programming
- [x] Classes and objects
- [x] Constructors
- [x] Access modifiers and packages
- [x] **Encapsulation** (private fields, getters and setters)
- [x] **Inheritance** (`extends`)
- [x] **Polymorphism** (method overloading and overriding, `@Override`)
- [x] **Abstraction** (abstract classes and interfaces)
- [x] Nested and inner classes
- [x] `equals()`, `hashCode()`, `toString()`
- [x] Pass by value and pass by reference
- [x] `static` and `final`
- [x] Enums

### 6. Collections and Generics
- [x] `ArrayList`, `LinkedList`
- [x] `HashSet`
- [x] `HashMap`
- [x] `Queue`
- [x] Generics
- [x] Variable arguments (varargs)

### 7. Exception Handling and File I/O
- [x] `try`, `catch`, `finally`
- [x] `throw` and `throws`
- [x] File reading and writing

### 8. Multithreading and Concurrency
- [x] Extending `Thread`
- [x] Implementing `Runnable`
- [x] `join()`
- [x] `synchronized` blocks and methods
- [x] `ExecutorService`
- [x] `Future` and `Callable`

### 9. Functional Programming (Java 8+)
- [x] Lambda expressions
- [x] Functional interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`)
- [x] Streams: `filter`, `reduce`
- [x] Method references (`::`)
- [x] `Optional`

---

## 🛠 Prerequisites

- **JDK 21 or newer** (JDK 25 recommended). Some files use newer syntax such as instance `main` methods.
- Any IDE such as **IntelliJ IDEA**, Eclipse or VS Code, or just a terminal.
- **Git**, if you want to clone the repository.

Check your installation:

```bash
java -version
javac -version
```

---

## ▶ How to Run

### Clone the repository

```bash
git clone https://github.com/syedayan990/_JAVA_.git
cd _JAVA_
```

### Option 1: IntelliJ IDEA

1. Open IntelliJ and choose **File → Open**.
2. Select the folder you want, for example `Chapter-2/Recursion`.
3. Open a `.java` file and click the green ▶ icon next to `main`.

### Option 2: Terminal

```bash
cd Chapter-2/Recursion/src
javac *.java
java Main
```

For files inside a package (for example `in.collections`), compile and run from the `src` folder:

```bash
cd Chapter-3/CollectionAndGenerics/Collections/src
javac in/collections/*.java
java in.collections.Main
```

> Class and package names may differ per folder. Check the `main` method inside each file.

---

## 🧭 Learning Path

If you are also learning Java, this is the order the repository follows:

```
Basics → Operators → Control Flow → Loops → Functions → Arrays
     → Strings → Recursion → Classes and Objects
     → OOP (Encapsulation → Inheritance → Polymorphism → Abstraction)
     → Collections and Generics → Exceptions and Files
     → Multithreading → Functional Programming
```

Practise each chapter with the problems in `Challenges/` before moving on.

---

## 📏 Conventions

- One concept per file, with small and readable examples
- Each project folder has its own `src/` directory
- Compiled output (`out/`, `*.class`) and IDE files (`.idea/`) are **not** tracked, see `.gitignore`

---

## 🤝 Contributing / Feedback

This is a personal learning repository, but suggestions are welcome.
If you spot a mistake or a better way to write something, open an **Issue** or send a **Pull Request**.

---

## 👤 Author

**Syed Ayan**
B.Tech student, learning Java and software development.

GitHub: [@syedayan990](https://github.com/syedayan990)

---

⭐ If this repository helps you, consider giving it a star.
