# Dart DSA 🚀

> A structured, interview-focused **Data Structures & Algorithms roadmap in Dart**, progressing from programming fundamentals to advanced problem solving.

![Dart](https://img.shields.io/badge/Dart-3.x-0175C2?logo=dart\&logoColor=white)
![DSA](https://img.shields.io/badge/Focus-DSA-orange)
![Level](https://img.shields.io/badge/Level-Beginner%20%E2%86%92%20Advanced-success)
![Practice](https://img.shields.io/badge/Practice-100%2B%20Problems-blueviolet)

---

## 📌 About

This repository is a **Dart-first DSA practice roadmap** designed to build strong programming fundamentals and progressively prepare for coding interviews.

```text
Dart Fundamentals
       ↓
Problem Solving
       ↓
Patterns
       ↓
Strings
       ↓
Lists / Arrays
       ↓
Set / Map / Hashing
       ↓
Recursion
       ↓
Searching & Sorting
       ↓
Stack / Queue
       ↓
Linked List
       ↓
Trees / BST
       ↓
Heap
       ↓
Graphs
       ↓
Greedy
       ↓
Dynamic Programming
```

---

# 🎯 Goals

* Learn DSA using **Dart**
* Build strong programming fundamentals
* Solve coding problems independently
* Understand time and space complexity
* Learn common DSA patterns
* Prepare for technical coding interviews
* Write clean and optimized Dart code

---

# 🗂️ Repository Structure

```text
dart-dsa/
│
├── 01_dart_fundamentals/
├── 02_input_output/
├── 03_conditions/
├── 04_loops/
├── 05_functions/
├── 06_strings/
├── 07_patterns/
├── 08_lists_arrays/
├── 09_sets_maps_hashing/
├── 10_recursion/
├── 11_backtracking/
├── 12_searching/
├── 13_sorting/
├── 14_two_pointers/
├── 15_sliding_window/
├── 16_prefix_sum/
├── 17_stack/
├── 18_queue/
├── 19_linked_list/
├── 20_trees/
├── 21_bst/
├── 22_heap/
├── 23_graphs/
├── 24_greedy/
├── 25_dynamic_programming/
│
└── README.md
```

---

# 🟢 01. Dart Fundamentals

### Core Topics

* `main()`
* Comments
* Variables
* Data Types
* `var`
* `dynamic`
* `final`
* `const`
* `late`
* Operators
* Type Conversion
* Null Safety

### Problems

* [ ] Hello World
* [ ] Add Two Numbers
* [ ] Swap Two Numbers
* [ ] Arithmetic Operations
* [ ] Temperature Conversion
* [ ] Area of Circle
* [ ] Area of Square
* [ ] Area of Rectangle
* [ ] Simple Interest
* [ ] Compound Interest
* [ ] ASCII / Character Value

---

# 🟢 02. Input & Output

```dart
import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);

  print(n);
}
```

### Important APIs

| API                    | Purpose               |
| ---------------------- | --------------------- |
| `stdin.readLineSync()` | Read input            |
| `int.parse()`          | String → int          |
| `double.parse()`       | String → double       |
| `int.tryParse()`       | Safe parsing          |
| `print()`              | Print with newline    |
| `stdout.write()`       | Print without newline |
| `stdout.writeln()`     | Print with newline    |

### Problems

* [ ] Read Integer
* [ ] Read String
* [ ] Read Multiple Values
* [ ] Parse Integer
* [ ] Parse Double
* [ ] Console Calculator
* [ ] Formatted Output

---

# 🟢 03. Conditions

### Topics

* `if`
* `else`
* `else if`
* Nested `if`
* Ternary Operator
* `switch`
* Logical Operators

### Problems

* [ ] Even or Odd
* [ ] Positive / Negative / Zero
* [ ] Largest of Two
* [ ] Largest of Three
* [ ] Leap Year
* [ ] Vowel or Consonant
* [ ] Alphabet / Digit / Special Character
* [ ] Uppercase / Lowercase
* [ ] Voting Eligibility
* [ ] Days in Month
* [ ] Calculator Using Switch

---

# 🟢 04. Loops

### Topics

* `for`
* `while`
* `do-while`
* Nested Loops
* `break`
* `continue`

### Problems

* [ ] Print `1` to `N`
* [ ] Print `N` to `1`
* [ ] Multiplication Table
* [ ] Sum of Natural Numbers
* [ ] Sum of Even Numbers
* [ ] Sum of Odd Numbers
* [ ] Sum of Digits
* [ ] Product of Digits
* [ ] Reverse Number
* [ ] First and Last Digit
* [ ] Factorial
* [ ] Power of Number
* [ ] Prime Number
* [ ] Armstrong Number
* [ ] Palindrome Number
* [ ] Fibonacci Series
* [ ] GCD / HCF
* [ ] LCM

---

# 🟢 05. Functions

### Topics

* Functions
* Parameters
* Return Values
* Optional Parameters
* Named Parameters
* `required`
* Arrow Functions
* Anonymous Functions
* Higher-Order Functions

### Problems

* [ ] Prime Checker Function
* [ ] Factorial Function
* [ ] Fibonacci Function
* [ ] GCD Function
* [ ] LCM Function
* [ ] Armstrong Checker
* [ ] Palindrome Checker
* [ ] Number Conversion

---

# 🟡 06. Strings

### Core Operations

```dart
String text = "Dart";

text.length;
text.toUpperCase();
text.toLowerCase();
text.contains("ar");
text.substring(0, 2);
text.split("");
```

### Problems

* [ ] Reverse String
* [ ] String Palindrome
* [ ] Count Vowels
* [ ] Count Consonants
* [ ] Count Digits
* [ ] Count Special Characters
* [ ] Character Frequency
* [ ] Remove Duplicate Characters
* [ ] First Non-Repeating Character
* [ ] First Repeating Character
* [ ] Anagram
* [ ] Count Words
* [ ] Reverse Words
* [ ] Longest Word

---

# 🟡 07. Pattern Programming

### Problems

* [ ] Square Pattern
* [ ] Rectangle Pattern
* [ ] Right Triangle
* [ ] Inverted Triangle
* [ ] Number Triangle
* [ ] Character Triangle
* [ ] Pyramid
* [ ] Inverted Pyramid
* [ ] Diamond
* [ ] Hollow Square
* [ ] Hollow Triangle
* [ ] Floyd's Triangle
* [ ] Pascal's Triangle
* [ ] Butterfly Pattern
* [ ] Numeric Palindrome Pattern
* [ ] Alphabet Pattern

### Example

```text
*
* *
* * *
* * * *
* * * * *
```

---

# 🟡 08. Lists / Arrays

Dart uses `List` as the primary array-like data structure.

```dart
List<int> numbers = [10, 20, 30, 40];
```

### Problems

* [ ] Print Array
* [ ] Sum Elements
* [ ] Maximum Element
* [ ] Minimum Element
* [ ] Count Even Elements
* [ ] Count Odd Elements
* [ ] Count Negative Elements
* [ ] Reverse Array
* [ ] Find Duplicates
* [ ] Remove Duplicates
* [ ] Frequency of Elements
* [ ] Second Largest
* [ ] Second Smallest
* [ ] Left Rotation
* [ ] Right Rotation
* [ ] Merge Sorted Arrays
* [ ] Move Zeros
* [ ] Missing Number
* [ ] Duplicate Number
* [ ] Intersection
* [ ] Union

---

# 🟡 09. Set / Map / Hashing

### Set

```dart
Set<int> values = {1, 2, 3};
```

### Map

```dart
Map<int, int> frequency = {};

for (int value in numbers) {
  frequency[value] = (frequency[value] ?? 0) + 1;
}
```

### Problems

* [ ] Remove Duplicates
* [ ] Frequency Counting
* [ ] Two Sum
* [ ] First Unique Element
* [ ] First Repeating Element
* [ ] Intersection
* [ ] Union
* [ ] Group Anagrams
* [ ] Character Frequency
* [ ] Duplicate Detection

---

# 🟡 10. Recursion

### Learn

* [ ] Base Case
* [ ] Recursive Case
* [ ] Call Stack
* [ ] Recursion Tree
* [ ] Complexity Analysis

### Problems

* [ ] Factorial
* [ ] Fibonacci
* [ ] Sum of Numbers
* [ ] Power
* [ ] Reverse String
* [ ] Reverse Number
* [ ] Palindrome
* [ ] Array Traversal
* [ ] Maximum / Minimum
* [ ] GCD
* [ ] Binary Search

---

# 🟠 11. Backtracking

* [ ] Generate Subsets
* [ ] Generate Permutations
* [ ] Combination Sum
* [ ] N-Queens
* [ ] Rat in a Maze
* [ ] Sudoku Solver
* [ ] Generate Parentheses

---

# 🟠 12. Searching

### Algorithms

* [ ] Linear Search
* [ ] Binary Search

### Problems

* [ ] First Occurrence
* [ ] Last Occurrence
* [ ] Lower Bound
* [ ] Upper Bound
* [ ] Search Insert Position
* [ ] Search Rotated Sorted Array
* [ ] Find Peak Element
* [ ] Square Root Using Binary Search

---

# 🟠 13. Sorting

| Algorithm      |    Average |      Worst |
| -------------- | ---------: | ---------: |
| Bubble Sort    |      O(n²) |      O(n²) |
| Selection Sort |      O(n²) |      O(n²) |
| Insertion Sort |      O(n²) |      O(n²) |
| Merge Sort     | O(n log n) | O(n log n) |
| Quick Sort     | O(n log n) |      O(n²) |
| Heap Sort      | O(n log n) | O(n log n) |

### Problems

* [ ] Bubble Sort
* [ ] Selection Sort
* [ ] Insertion Sort
* [ ] Merge Sort
* [ ] Quick Sort
* [ ] Heap Sort
* [ ] Sort 0s and 1s
* [ ] Sort 0s, 1s and 2s
* [ ] Kth Smallest
* [ ] Kth Largest

---

# 🔴 14. Two Pointers

* [ ] Pair With Target Sum
* [ ] Two Sum on Sorted Array
* [ ] Remove Duplicates
* [ ] Move Zeros
* [ ] Reverse Array
* [ ] Container With Most Water
* [ ] 3Sum
* [ ] 4Sum

---

# 🔴 15. Sliding Window

* [ ] Maximum Sum Subarray of Size K
* [ ] First Negative Number in Every Window
* [ ] Longest Substring Without Repeating Characters
* [ ] Longest Substring With K Distinct Characters
* [ ] Minimum Window Substring
* [ ] Maximum Consecutive Ones

---

# 🔴 16. Prefix Sum

* [ ] Running Sum
* [ ] Range Sum
* [ ] Subarray Sum
* [ ] Subarray Sum Equals K
* [ ] Equilibrium Index
* [ ] Maximum Subarray

---

# 🔴 17. Stack

Dart can use `List` as a stack:

```dart
List<int> stack = [];

stack.add(10);
stack.add(20);

int value = stack.removeLast();
```

### Problems

* [ ] Implement Stack
* [ ] Valid Parentheses
* [ ] Reverse String
* [ ] Min Stack
* [ ] Next Greater Element
* [ ] Next Smaller Element
* [ ] Previous Greater Element
* [ ] Previous Smaller Element
* [ ] Largest Rectangle in Histogram
* [ ] Evaluate Postfix Expression

---

# 🔴 18. Queue

```dart
import 'dart:collection';

Queue<int> queue = Queue();

queue.add(10);
queue.add(20);

int value = queue.removeFirst();
```

### Problems

* [ ] Implement Queue
* [ ] Circular Queue
* [ ] Stack Using Queues
* [ ] Queue Using Stacks
* [ ] First Non-Repeating Character
* [ ] Sliding Window Maximum

---

# 🔴 19. Linked List

### Learn

* [ ] Node
* [ ] Head
* [ ] Tail
* [ ] Traversal
* [ ] Insert
* [ ] Delete
* [ ] Search
* [ ] Reverse

### Problems

* [ ] Create Linked List
* [ ] Insert at Beginning
* [ ] Insert at End
* [ ] Insert at Position
* [ ] Delete Node
* [ ] Search Node
* [ ] Reverse Linked List
* [ ] Find Middle Node
* [ ] Detect Cycle
* [ ] Remove Cycle
* [ ] Merge Sorted Lists
* [ ] Remove Duplicates
* [ ] Intersection of Linked Lists

---

# 🔴 20. Trees

### Learn

* [ ] Binary Tree
* [ ] Root
* [ ] Parent
* [ ] Child
* [ ] Leaf
* [ ] Height
* [ ] Depth
* [ ] Level

### Traversals

* [ ] Preorder
* [ ] Inorder
* [ ] Postorder
* [ ] Level Order

### Problems

* [ ] Tree Traversal
* [ ] Maximum Depth
* [ ] Minimum Depth
* [ ] Count Nodes
* [ ] Count Leaves
* [ ] Diameter
* [ ] Mirror Tree
* [ ] Symmetric Tree
* [ ] Lowest Common Ancestor

---

# 🔴 21. Binary Search Tree

* [ ] Insert
* [ ] Search
* [ ] Delete
* [ ] Minimum
* [ ] Maximum
* [ ] Validate BST
* [ ] Kth Smallest
* [ ] Lowest Common Ancestor
* [ ] Sorted Array to BST

---

# 🔴 22. Heap / Priority Queue

### Learn

* [ ] Min Heap
* [ ] Max Heap
* [ ] Heapify
* [ ] Insert
* [ ] Delete
* [ ] Priority Queue

### Problems

* [ ] Kth Largest
* [ ] Kth Smallest
* [ ] Top K Frequent Elements
* [ ] Merge K Sorted Arrays
* [ ] Merge K Sorted Linked Lists
* [ ] Running Median

---

# 🔴 23. Graphs

### Representations

* [ ] Adjacency Matrix
* [ ] Adjacency List

### Algorithms

* [ ] BFS
* [ ] DFS
* [ ] Connected Components
* [ ] Cycle Detection
* [ ] Topological Sort
* [ ] Dijkstra
* [ ] Bellman-Ford
* [ ] Kruskal
* [ ] Prim

### Problems

* [ ] Number of Islands
* [ ] Clone Graph
* [ ] Course Schedule
* [ ] Flood Fill
* [ ] Detect Cycle
* [ ] Shortest Path
* [ ] Connected Components

---

# 🔴 24. Greedy Algorithms

* [ ] Activity Selection
* [ ] Fractional Knapsack
* [ ] Job Sequencing
* [ ] Minimum Coins
* [ ] Jump Game
* [ ] Gas Station
* [ ] Interval Scheduling
* [ ] Merge Intervals

---

# 🔴 25. Dynamic Programming

### Learn

* [ ] Memoization
* [ ] Tabulation
* [ ] DP State
* [ ] State Transition
* [ ] Base Cases

### Problems

* [ ] Fibonacci
* [ ] Climbing Stairs
* [ ] House Robber
* [ ] 0/1 Knapsack
* [ ] Unbounded Knapsack
* [ ] Coin Change
* [ ] Longest Common Subsequence
* [ ] Longest Increasing Subsequence
* [ ] Edit Distance
* [ ] Partition Problems
* [ ] Grid DP

---

# 🧠 Complexity Cheat Sheet

| Complexity   | Name         |
| ------------ | ------------ |
| `O(1)`       | Constant     |
| `O(log n)`   | Logarithmic  |
| `O(n)`       | Linear       |
| `O(n log n)` | Linearithmic |
| `O(n²)`      | Quadratic    |
| `O(2ⁿ)`      | Exponential  |
| `O(n!)`      | Factorial    |

> Always explain both **time complexity** and **space complexity** during an interview.

---

# 🎤 Coding Interview Workflow

For every problem:

```text
Understand
    ↓
Identify Input / Output
    ↓
Check Edge Cases
    ↓
Brute Force
    ↓
Optimize
    ↓
Implement
    ↓
Test
    ↓
Time Complexity
    ↓
Space Complexity
    ↓
Explain
```

---

# 📈 Difficulty

### 🟢 Easy

* Fundamentals
* Conditions
* Loops
* Basic Strings
* Basic Lists
* Basic Math

### 🟡 Medium

* Hashing
* Recursion
* Sorting
* Binary Search
* Two Pointers
* Sliding Window
* Stack
* Queue

### 🔴 Hard

* Backtracking
* Trees
* Graphs
* Heap
* Greedy
* Dynamic Programming

---

# ✅ Progress Tracker

## Dart Fundamentals

* [ ] Syntax
* [ ] Variables
* [ ] Data Types
* [ ] `var`
* [ ] `dynamic`
* [ ] `final`
* [ ] `const`
* [ ] `late`
* [ ] Null Safety
* [ ] Operators
* [ ] Input / Output
* [ ] Conditions
* [ ] Loops
* [ ] Functions

## Core DSA

* [ ] Strings
* [ ] Patterns
* [ ] Lists
* [ ] Sets
* [ ] Maps / Hashing
* [ ] Recursion
* [ ] Backtracking
* [ ] Searching
* [ ] Sorting
* [ ] Two Pointers
* [ ] Sliding Window
* [ ] Prefix Sum

## Data Structures

* [ ] Stack
* [ ] Queue
* [ ] Linked List
* [ ] Tree
* [ ] BST
* [ ] Heap
* [ ] Graph

## Algorithms

* [ ] BFS
* [ ] DFS
* [ ] Binary Search
* [ ] Greedy
* [ ] Dynamic Programming

## Interview Skills

* [ ] Complexity Analysis
* [ ] Edge Cases
* [ ] Brute Force → Optimized
* [ ] Dry Run
* [ ] Code Explanation
* [ ] Clean Dart Implementation

---

# 💻 Dart DSA Template

```dart
import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);

  // Solution
}
```

### Queue Template

```dart
import 'dart:collection';

void main() {
  Queue<int> queue = Queue();

  // Solution
}
```

### Mathematical Problems

```dart
import 'dart:math';

void main() {
  // Solution
}
```

---

# ⭐ Practice Standard

Don't measure your progress only by the number of problems solved.

For every problem, ask yourself:

```text
Can I solve it?
      ↓
Can I explain it?
      ↓
Can I implement it in Dart?
      ↓
Can I analyze complexity?
      ↓
Can I optimize it?
      ↓
Can I solve a variation?
```

---

# 🚀 Final Goal

```text
Learn Dart
    ↓
Build Fundamentals
    ↓
Master DSA Patterns
    ↓
Solve Problems
    ↓
Analyze Complexity
    ↓
Optimize Solutions
    ↓
Practice Interviews
    ↓
Crack Coding Rounds 🚀
```

---

## ⭐ Support

If this repository helps you with Dart, DSA, or interview preparation, consider giving it a ⭐.

**Dart + DSA + Consistent Practice = Strong Coding Skills 🚀**
