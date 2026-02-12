# University Department Database System (PostgreSQL)

**Databases Course Project (PLH 303)**  
Technical University of Crete - School of Electrical and Computer Engineering  
Academic Year: 2021-2022  
**Team Members**: Maria Stefanaki (2019030179), Georgia Bantouva (2019030006)

## 📌 Project Description

This project involves the design and implementation of an Integrated Information System for managing an academic department. The database covers the complete range of school operations, including student registration, course and lab management, the grading process, and diploma thesis preparation.

The system was implemented in PostgreSQL and includes advanced SQL features such as **Triggers**, **Stored Procedures**, and **Views** to automate business logic.

## 🗄️ Structure & Schema

The project is divided into two main phases:

### Phase 1: Database Design
1. **ER Diagram**: Created a UML diagram in DIA format representing the Entity-Relationship model
2. **Relational Schema**: Converted the ER model into a relational database schema

### Phase 2: Implementation
The database was extended to support:
- **Thesis Management**: Topic assignment, three-member committee appointments, grading
- **Lab Groups**: Student group creation for laboratory exercises
- **Academic Structure**: Sectors, Laboratories, Professors (with ranks), Laboratory Staff
- **Grading System**: Comprehensive grading workflow with multiple grade types

## 🚀 Key Functionalities

### Data Management (Stored Functions)

#### Automatic Thesis Assignment
- **Function**: `insert_diplomaTitles_2_1_()`
- Randomly assigns thesis topics to students meeting requirements (4th year+, active status)

#### Bulk Grading Operations
Three specialized functions for inserting different grade types:
- `insert_exam_grade_2_3(semester integer)` - Written exam grades
- `insert_final_grade_2_3_()` - Final course grades
- `insert_lab_grade_2_3(semester integer)` - Laboratory grades

### Data Retrieval & Statistics

#### Student Information Retrieval
- **Function**: `get_name_and_amka_3_1_(num integer)`
- Retrieves student names and AMKA numbers

#### Grade Retrieval by Type
- **Function**: `get_course_and_grade_3_2_(amk character varying, gt grade_type)`
- Retrieves courses and grades for a specific student and grade type

#### Optional Courses Query
- **Function**: `get_optional_courses_3_3_(std_amka character varying)`
- Retrieves optional courses taken by a student

#### Lab Participation Check
- **Function**: `part_students_3_4_()`
- Verifies student participation in lab groups

#### Maximum Grades Finder
- **Function**: `get_max_grades_3_5_(se integer, gtype character)`
- Finds maximum grades for a semester and grade type

#### Sector Statistics
- **Function**: `find_sectors_3_6_()`
- Identifies sectors with highest thesis assignments

#### Staff Workload Calculation
- **Functions**: `add_total_workhours_3_7_()` and `get_total_workhours_3_7_()`
- Calculates total work hours for laboratory staff (teaching + group support hours)

## ⚙️ Triggers & Business Logic Automation

### Member Limit Enforcement
Two complementary triggers:
- **Functions**: `check_max_members_5_1a_()` + `get_committee_members_no_5_1_()`
  - Enforces maximum committee members for thesis committees

- **Functions**: `check_max_members_5_1b_()` + `get_labmodule_max_members_5_1_(module_number integer)`
  - Enforces maximum members in lab work groups

### Semester Update Automation
- **Function**: `update_semester_5_2_()`
- Automatically updates semester information when new academic periods begin

### Final Grade Calculation
- **Function**: `calculate_final_grades_5_3_()`
- Automatically calculates final grades based on weighted components (exam + lab percentages)
- Verifies minimum thresholds for lab and written exams
- Automatically updates pass/fail status

### Course Registration Validation
- **Functions**: `check_registration_5_4_()` and `passed_prerequisites(amk integer, coursecode character)`
- Validates course registration against prerequisites
- Checks credit limits (Max 20 ECTS) and course count (Max 6 per semester)
- Automatically approves or rejects registration applications

### Course Run Creation
- **Function**: `insert_courserun_5_5_()`
- Automatically generates course runs when a new semester is created
- Assigns instructors and labs automatically

## 🛠️ Technologies

- **Database**: PostgreSQL
- **Tools**: pgAdmin
- **Languages**: SQL, PL/pgSQL
- **Modeling**: DIA (ER Diagrams)

## 📥 Installation

1. Create an empty database in pgAdmin
2. Execute the provided SQL schema files in order:
   - Schema creation scripts
   - Function definitions
   - Trigger implementations
3. Load initial data using the provided data files

## 👥 Contributors

- **Maria Stefanaki** (AM: 2019030179)
- **Georgia Bantouva** (AM: 2019030006)

---

*This project was implemented as part of the laboratory coursework for the "Databases" course at the Technical University of Crete.*
