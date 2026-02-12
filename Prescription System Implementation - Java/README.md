# Electronic Prescription Management System

**Course**: PLH 102 - Structured Programming  
Technical University of Crete - School of Electrical and Computer Engineering  
Academic Year: Spring 2020  
**Student**: Georgia Bantouva (2019030006)

## Overview

A Java-based console application that simulates a digital platform for managing doctors, patients, medicines, and medical prescriptions. The system operates entirely in main memory using object associations, without external databases.

## Functionality

### Data Management
- **Patient Registration**: Store name and AMKA (Social Security Number)
- **Medicine Registration**: Store name, unique code, and price
- **Doctor Registration**: Store name, specialty, and license ID
- **Pre-loaded Sample Data**: System initializes with test data

### Prescription Creation
- Associate specific patient and doctor to new prescription
- Add up to 4 medicines per prescription
- Validate existence of patient, doctor, and medicines before creation
- Automatic calculation of total prescription cost
- Automatic assignment of unique system ID

### Search & Reporting
- Search prescriptions by patient AMKA
- Search prescriptions by date range
- Search prescriptions by prescribing doctor
- Search prescriptions containing specific medicine
- Display complete catalogs of patients, doctors, medicines, or prescriptions

### Deletion
- Delete patient by AMKA with cascading deletion of all associated prescriptions

## System Constraints

- Maximum 100 Patients
- Maximum 100 Doctors
- Maximum 50 Medicines
- Maximum 400 Prescriptions
- Non-persistent storage (RAM only)
- Input validation and error handling

## Technologies

- **Language**: Java
- **IDE**: Eclipse
- **Libraries**: `java.util.Date`

## Installation

1. Clone the repository
2. Import the project into Eclipse as a Java Project
3. Locate the `Main` class
4. Run as Java Application
5. Navigate through the console menu interface

---

*This project was developed as an educational assignment for the Structured Programming course at the Technical University of Crete.*
