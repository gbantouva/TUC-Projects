# Security Systems Course Projects

**Course**: Security Systems  
Technical University of Crete - School of Electrical and Computer Engineering  
Academic Year: 2023-2024  
**Team Members**: Maria Stefanaki (2019030179), Georgia Bantouva (2019030006)

## Overview

A collection of cybersecurity projects covering cryptography, network security, web vulnerabilities, access control, and system exploitation.

## Assignment 1: Cryptographic Algorithms

Implementation of fundamental cryptographic protocols in C using the GMP library.

**Diffie-Hellman Key Exchange**
- Command-line tool for secure key exchange
- Generates public/private keys and calculates shared secrets
- Supports custom prime numbers and primitive roots

**RSA Encryption/Decryption**
- RSA key pair generation with configurable key lengths (1024, 2048, 4096 bits)
- File encryption and decryption
- Performance analysis comparing different key lengths

## Assignment 2: Access Control Logging System

File system monitoring and access control implementation in C.

**Logging Tool (logger.so)**
- Intercepts file operations using LD_PRELOAD
- Overrides `fopen()` and `fwrite()` functions
- Logs UID, file path, timestamp, access type, and MD5 fingerprint
- Tracks file creation, opening, and modification events

**Monitoring Tool (acmonitor)**
- Detects malicious users with 7+ unauthorized access attempts
- Tracks file modifications per user
- Generates security reports from access logs

## Assignment 3: Web Vulnerabilities

Identification and exploitation of web application security vulnerabilities.

**SQL Injection Attacks**
- Login bypass using `' OR '1'='1' --` payload
- UNION-based SQL injection to extract user credentials
- Retrieved administrator password from database

**Cross-Site Scripting (XSS)**
- DOM-based XSS through URL manipulation
- Reflected XSS via search field exploitation
- Demonstrated arbitrary JavaScript execution

## Assignment 4: Network Traffic Analyzer

Packet capture and analysis tool using libpcap library in C.

**Features**
- Online mode: Live traffic monitoring from network interfaces
- Offline mode: PCAP file analysis
- Protocol decoding for TCP and UDP packets
- Extraction of IP addresses, ports, and payload information
- TCP retransmission detection via sequence number analysis
- Network flow statistics and filtering support

## Assignment 5: Simple Adblocker

Firewall configuration using Linux iptables.

**Features**
- Block traffic based on domain names or IP addresses
- Save and load firewall rules
- List current configurations
- Reset firewall to default state
- Command-line interface for rule management

## Assignment 6: Intrusion Detection with Snort

Network Intrusion Detection System configuration and rule creation.

**Detection Capabilities**
- ICMP connection attempt alerts
- Content filtering for specific packet strings
- Non-root port monitoring (ports > 1024)
- SSH brute force attack detection
- Custom Snort rules implementation

## Assignment 7: Buffer Overflow Exploitation

Stack smashing and shellcode injection targeting vulnerable C programs.

**Exploit Components**
- Vulnerability identification in programs using unsafe `gets()` function
- Python script for payload generation with NOP slides
- Shellcode injection to spawn root shell
- Return address (EIP) overwrite techniques
- Discussion of bypassing ASLR and DEP using Return-to-libc attacks

## Technologies

- **Languages**: C, Python, Bash, Assembly
- **Libraries**: GMP, OpenSSL (MD5), libpcap
- **Tools**: iptables, Snort IDS, GDB debugger
- **Concepts**: Cryptography, Network Security, Web Security, Access Control, Binary Exploitation, Intrusion Detection

## Build Instructions

Each assignment includes a Makefile for compilation:
```bash
$ make
```

Refer to individual assignment directories for specific execution instructions.

---

*These projects were developed as part of the Security Systems coursework at the Technical University of Crete.*
