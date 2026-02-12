# Processor Design and Implementation

**Course**: Computer Organization  
Technical University of Crete - School of Electrical and Computer Engineering  
**Student**: Chrysi Manoudaki (2019030201)

## Overview

Implementation of three different processor architectures in VHDL using Xilinx ISE 14.7. The project progresses from a simple single-cycle processor to more advanced multi-cycle and pipelined architectures.

## Assignment 1: Single-Cycle Processor

Design and implementation of a single-cycle processor using non-pipelined components.

**Core Components**

**Arithmetic Logic Unit (ALU)**
- 32-bit inputs in two's complement
- 4-bit operation code
- Outputs: result, overflow flag, carry out, zero flag
- Supports arithmetic and logic operations

**Register File (RF)**
- 32 registers of 32 bits each
- 5-bit address decoder
- Dual read ports, single write port
- Synchronous write operation with enable signal

**Pipeline Stages**
- Instruction Fetch (IF): PC management and instruction retrieval
- Instruction Decode (DEC): Register file access and immediate extension
- Execution (EX): ALU operations
- Memory Access (MEM): RAM read/write operations

**Control Unit**
- Decodes instruction opcode
- Generates control signals for all components
- Manages data path flow

## Assignment 2: Multi-Cycle Processor

Conversion of single-cycle processor to multi-cycle architecture.

**Key Features**
- Finite State Machine (FSM) based control using Moore model
- Inter-stage registers for data storage between cycles
- Different instruction types require different cycle counts (4-5 cycles)
- Improved CPI (Cycles Per Instruction) compared to single-cycle

**Additional Components**
- 6 intermediate registers (REG_A, REG_B, REG_I, REG_S, REG_IR, REG_M)
- State-based control signals (IRWr, M_Wr)
- Modified branch address calculation

## Assignment 3: Pipelined Processor

Implementation of a 5-stage pipeline architecture with hazard detection and resolution.

**Pipeline Stages**
- IF: Instruction Fetch
- ID: Instruction Decode
- EX: Execution
- MEM: Memory Access
- WB: Write Back

**Hazard Detection and Resolution**

**Forwarding Unit**
- Detects data hazards between stages
- Forwards results from EX/MEM and MEM/WB stages
- Prevents unnecessary stalls when possible

**Stalling Unit**
- Handles load-use hazards
- Inserts pipeline bubbles when necessary
- Controls PC and instruction register enables

**Performance Optimization**
- Up to 5x faster execution compared to single-cycle
- One instruction completion per cycle (after pipeline fill)
- Efficient hazard management

## Instruction Set Architecture (ISA)

Supported instructions include:
- Arithmetic: add, addi, sub, nandi
- Logic: and, or, ori, nand, nor, not
- Shift/Rotate: sll, srl, sra, rol, ror
- Memory: lw, sw, lb, sb
- Control: beq, bne, b
- Immediate: li, lui

## Technologies

- **Hardware Description Language**: VHDL
- **Development Environment**: Xilinx ISE 14.7
- **Simulation**: ISim waveform viewer
- **Architecture**: Harvard architecture with separate instruction and data memory

## Design Methodology

- Component-based design with port mapping
- Testbenches with comprehensive test programs
- Waveform analysis for verification
- Progressive complexity from single-cycle to pipelined design

---

*These projects were developed as part of the Computer Organization coursework at the Technical University of Crete.*
