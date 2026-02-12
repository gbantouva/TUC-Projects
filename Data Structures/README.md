# Data Structures and Files

**Course**: Data Structures and Files  
Technical University of Crete - School of Electrical and Computer Engineering  
Academic Year: 2021-2022  
**Student**: Georgia Bantouva (2019030006)

## 📌 Overview

Two laboratory assignments implementing fundamental data structures and file organization techniques in Java, focusing on search efficiency and performance analysis.

## 🗂️ Lab Assignment 1: File Organization & Search Methods

Implementation of different file organization strategies and their search performance comparison.

### File Manager
Custom file management system with operations:
- File creation, opening, reading, writing, and deletion
- Block-based file operations (read/write/append/delete blocks)
- Page management and metadata handling

### Organization Methods

**Method A - Sequential File**
- 4 records per page (32 bytes each: 4-byte key + 28-byte data)
- Sequential search through all pages

**Method B - Index File**
- Auxiliary index file with 16 keys per page
- Two-level search: index file → main file

**Method C - Sorted Sequential File**
- In-memory sorting using `Arrays.sort()`
- Binary search on file and within pages

**Method D - Sorted Index File** *(Planned extension of Method B with sorting)*

### Performance Results
- **Method A**: ~1288 disk accesses (average per search)
- **Method B**: ~324 disk accesses (average per search)
- **Method C**: ~13 disk accesses (average per search)

## 🌲 Lab Assignment 2: Binary Search Trees

Implementation and comparison of different search tree structures.

### Data Structures

**Binary Search Tree (BST)**
- Static memory allocation using 2D array (N × 3)
- Recursive insertion and search

**Threaded Binary Search Tree (TBST)**
- Static memory allocation using 2D array (N × 5)
- Iterative insertion with thread pointers
- Inorder predecessor/successor navigation

**Sorted Array with Binary Search**
- Used as baseline for comparison

### Operations Implemented
- `insert(int key)` - Insert key into structure
- `search(int root, int key)` - Search for specific key
- `findInRange(int kMin, int kMax)` - Range query
- `randomSearches(int numOfSearches)` - Performance testing
- `rangeRandomSearching(int range, int numOfSearches)` - Range search testing

### Performance Metrics (per operation)

| Structure | Insert | Random Search | Range Search (100) | Range Search (1000) |
|-----------|--------|---------------|--------------------|--------------------|
| BST | 115 | 103 | 284 | 1386 |
| TBST | 134 | 107 | 253 | 1348 |
| Sorted Array | - | 117 | 97 | 71 |

*Metrics show average number of comparisons per operation*

## 🛠️ Technologies

- **Language**: Java
- **Key Classes**: `RandomAccessFile`, `ByteBuffer`, `Arrays`
- **Concepts**: File I/O, Binary Search, Tree Traversal, Performance Analysis

## 📊 Key Takeaways

**File Organization**: Sorted files with binary search dramatically reduce disk accesses (Method C: 98% reduction vs Method A)

**Tree Structures**: TBST provides efficient inorder traversal, while sorted arrays excel at range queries

---

*These assignments demonstrate the practical impact of data structure and algorithm choices on system performance.*
