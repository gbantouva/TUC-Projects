# TinyOS v.3

**Course**: Operating Systems  
Technical University of Crete - School of Electrical and Computer Engineering  
**Student**: Georgia Bantouva (2019030006)

## Overview

TinyOS is a minimal educational operating system built on top of a simple virtual machine. This implementation is based on the TinyOS framework used in the Operating Systems course at TUC, designed to demonstrate fundamental OS concepts including process scheduling, synchronization, and resource management.

## Features

- Multicore preemptive scheduler
- Serial terminal devices
- Unix-like process model
- Thread management and synchronization
- Implementation of classic concurrency problems (e.g., Dining Philosophers)

## Technologies

- **Language**: C (C11 standard)
- **Platform**: Linux
- **Build System**: Make
- **Debugging**: GDB, Valgrind
- **Documentation**: Doxygen

## Quick Start

Build the project:
```bash
$ make
```

Run a sample simulation (Dining Philosophers):
```bash
$ ./mtask 1 0 5 5
```

Generate documentation:
```bash
$ make doc
```

View documentation by opening `doc/html/index.html` in a browser.

## Build Dependencies

- GCC compiler with C11 support
- Doxygen (for documentation)
- Valgrind (for debugging)
- Graphviz (for documentation diagrams)
- GDB debugger

## System Requirements

- Linux operating system (uses Linux-specific system calls)
- Recent kernel version (last few years)

---

*This project is part of the Operating Systems coursework at the Technical University of Crete, based on the TinyOS educational framework.*
