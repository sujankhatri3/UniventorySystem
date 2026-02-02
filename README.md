# University Inventory Management System

> A Java-based console application for managing university equipment and staff assignments

##  Developer Information

**Developer:** Sujan Khatri  
**Student ID:** [Your Student ID]  
**Program:** Bachelor of Information Technology  
**Course Code:** ITS105 - Programming Fundamentals  
**Academic Term:** Trimester 3, 2025  
**Submission Date:** February 02, 2026  
**Institution:** National Academy of Professional Studies (NAPS)

---

##  Project Overview

This application addresses a real-world problem faced by educational institutions: managing thousands of assets efficiently. The system provides a centralized platform for tracking equipment inventory, monitoring staff assignments, and generating analytical reports.

### Problem Statement
Universities struggle with equipment management across multiple departments. This system solves issues like:
- Lost or misplaced equipment
- Unclear assignment tracking
- Expired warranty monitoring
- Manual reporting processes

### Solution
A streamlined console application that automates inventory operations and provides real-time insights into equipment utilization.

---

##  Core Functionality

### What This System Does

**Inventory Operations**
- Register new equipment with detailed specifications
- Track warranty status and expiration dates
- Categorize items (Computers, Projectors, Laboratory, Furniture)
- Monitor real-time availability status

**Staff Management**
- Maintain staff member database
- Track equipment assignments per staff member
- Enforce assignment limits (maximum 5 items per person)
- Quick lookup by staff ID or name

**Assignment Workflow**
- Assign available equipment to registered staff
- Validate assignments before processing
- Automatic availability updates
- Return processing with status changes

**Search Capabilities**
- Find equipment by name
- Filter by category and availability
- Search within warranty periods
- Quick retrieval using asset IDs

**Reporting & Analytics**
- Complete inventory overview
- Expired warranty alerts
- Department-wise assignment breakdown
- Equipment utilization metrics
- Automated maintenance scheduling

---

##  Technical Architecture

### Technology Stack
```
Language:        Java (JDK 8+)
Architecture:    Object-Oriented Programming
Design Pattern:  Inheritance & Polymorphism
Error Handling:  Custom Exception Framework
Data Structure:  Arrays + ArrayList Collections
```

### System Components
```
 UniversityInventorySystem
│
├──  models/                    Core data entities
│   ├── InventoryItem.java       Base abstraction layer
│   ├── Equipment.java           Equipment entity
│   ├── Furniture.java           Furniture entity  
│   ├── LabEquipment.java        Laboratory equipment entity
│   └── StaffMember.java         Staff entity
│
├── exceptions/                Error handling layer
│   └── InventoryException.java  Custom exception hierarchy
│
├──  managers/                  Business logic layer
│   ├── InventoryManager.java    CRUD operations & assignments
│   └── InventoryReports.java    Analytics & reporting
│
└──  UniversityInventorySystem.java  Application entry point
```

---

##  Getting Started

### System Requirements
- Java Development Kit (JDK) version 8 or newer
- Terminal/Command Prompt access
- Text editor or IDE (VS Code, IntelliJ IDEA, Eclipse)

### Installation & Execution

**Step 1: Download the Project**
```bash
git clone https://github.com/YOUR-USERNAME/UniversityInventorySystem.git
cd UniversityInventorySystem
```

**Step 2: Compile Source Files**
```bash
# Compile all files at once
javac src/**/*.java

# OR compile package by package
javac src/models/*.java
javac src/exceptions/*.java  
javac src/managers/*.java
javac src/UniversityInventorySystem.java
```

**Step 3: Run the Application**
```bash
java -cp src UniversityInventorySystem
```

**Step 4: Interact with the Menu**
Follow the numbered menu options to perform operations.

---

## Usage Guide

### Main Menu Navigation

Upon launching, you'll see:
```
========================================
  UNIVERSITY INVENTORY MANAGEMENT SYSTEM
========================================

========== MAIN MENU ==========
1. Add New Equipment
2. Register New Staff Member
3. Assign Equipment to Staff
4. Return Equipment
5. Search Inventory
6. Generate Reports
7. Exit System
===============================
Enter your choice:
```

### Quick Start Tutorial

**Adding Your First Equipment:**
```
Choose: 1
Enter Asset ID: LAP001
Enter Equipment Name: MacBook Pro
Enter Brand: Apple
Enter Category: Computer
Enter Warranty Months: 24
✓ Equipment added successfully!
```

**Registering Staff:**
```
Choose: 2
Enter Staff ID: 5001
Enter Staff Name: Sujan Khatri
Enter Email: sujan.khatri@university.edu
✓ Staff member registered successfully!
```

**Making an Assignment:**
```
Choose: 3
Enter Staff ID: 5001
Enter Equipment Asset ID: LAP001
✓ Assignment successful!
```

---

## Programming Concepts Applied

### 1. Object-Oriented Design Principles

**Encapsulation**
- All class attributes are private
- Access controlled through public methods
- Data integrity maintained

**Inheritance**
```
InventoryItem (Abstract Parent)
    ├── Equipment
    ├── Furniture
    └── LabEquipment
```

**Polymorphism**
- Single ArrayList holds multiple item types
- Dynamic method binding at runtime
- Type checking with `instanceof`

**Abstraction**
- Abstract base class defines contract
- Subclasses implement specific behaviors
- Interface consistency across types

### 2. Exception Management

**Custom Exception Hierarchy:**
```
InventoryException
    ├── EquipmentNotAvailableException
    ├── StaffMemberNotFoundException
    └── AssignmentLimitExceededException
```

**Error Handling Strategy:**
- Predictable exceptions are thrown explicitly
- Try-catch blocks prevent crashes
- User receives clear error messages
- System maintains stable state

### 3. Control Structures

**Conditional Logic:**
- If-else chains for validation
- Nested conditionals for complex checks
- Switch statements for menu routing
- Ternary operators for concise conditions

**Iteration Techniques:**
- Standard for loops with index control
- While loops for condition-based processing
- Do-while for guaranteed execution
- Enhanced for-each for collection traversal
- Nested loops for multi-dimensional operations

### 4. Method Engineering

**Method Overloading Demonstration:**
```java
searchEquipment(String name)
searchEquipment(String category, boolean availableOnly)
searchEquipment(int minWarranty, int maxWarranty)
```
Same method name, different parameters - compile-time polymorphism.

### 5. Data Structure Selection

**When I Used Arrays:**
- Staff equipment assignments (fixed limit of 5)
- Known maximum size at compile time
- Direct index access required

**When I Used ArrayList:**
- Inventory storage (unlimited items)
- Dynamic growth needed
- Frequent add/remove operations

---

## Learning Outcomes

### Technical Skills Developed

**Java Fundamentals:**
- Variable declaration and initialization
- Data type selection and conversion
- Operator usage (arithmetic, logical, relational)
- String manipulation and formatting

**OOP Mastery:**
- Class design from requirements
- Constructor overloading
- Access modifier selection
- Method signature design
- Inheritance hierarchy planning
- Abstract vs concrete implementation

**Error Resilience:**
- Exception class creation
- Throw vs throws understanding
- Try-catch-finally blocks
- Exception propagation
- Graceful failure handling

**Algorithm Design:**
- Search algorithm implementation
- Sorting considerations
- Validation logic
- Report generation algorithms
- Data aggregation techniques

**Software Engineering:**
- Code organization and packaging
- Naming conventions
- Comment documentation
- Version control with Git
- Project structure planning

### Problem-Solving Approach

**Challenge 1: Array Capacity Management**
- Issue: Tracking items in fixed-size staff equipment array
- Learning: Maintain separate counter variable
- Implementation: `equipmentCount` tracks filled positions
- Outcome: Clean add/remove operations without array scanning

**Challenge 2: Type Checking in Polymorphic Collections**
- Issue: ArrayList holds mixed item types
- Learning: Use `instanceof` operator before casting
- Implementation: Type check then safe cast in loops
- Outcome: No ClassCastException errors

**Challenge 3: Exception Flow Control**
- Issue: When to throw vs when to return false
- Learning: Exceptions for exceptional conditions only
- Implementation: Boolean for normal flow, exceptions for errors
- Outcome: Cleaner code, better performance

**Challenge 4: Circular Dependencies**
- Issue: Manager needs models, models reference each other
- Learning: Proper package organization prevents issues
- Implementation: Clear layer separation
- Outcome: Maintainable codebase

**Challenge 5: Menu Loop Logic**
- Issue: Keeping menu running until explicit exit
- Learning: Boolean flag with while loop
- Implementation: `running` variable controls main loop
- Outcome: Clean exit without breaking or System.exit()

---

##  Code Quality Features

### What Makes This Code Good

 **Readable Naming**
- Variables: `equipmentCount`, not `ec` or `x`
- Methods: `assignEquipment()`, not `doAssign()`
- Classes: `InventoryManager`, not `Manager`

 **Comprehensive Comments**
- Every class has purpose documentation
- Methods explain what, why, and how
- Complex logic includes inline comments
- Comments maintain professionalism

 **Consistent Formatting**
- 4-space indentation throughout
- Consistent brace placement
- Logical blank line separation
- Aligned similar statements

 **Error Prevention**
- Null checks before operations
- Boundary validation (array limits)
- Input sanitization
- Defensive programming practices

 **Modular Design**
- Single responsibility per class
- Methods do one thing well
- Low coupling between components
- High cohesion within components

---

## Testing & Validation

### Test Coverage

**Functional Tests Performed:**
-  Add equipment (all categories)
-  Register multiple staff members
-  Assign equipment until limit
-  Attempt over-assignment (exception test)
-  Return equipment (availability verification)
-  Search by each criteria type
-  Generate all report varieties
-  Invalid input handling
-  Null value management
-  Edge case scenarios

**Sample Data Included:**
The system initializes with test data:
- 3 Equipment items (varying warranties)
- 1 Furniture item
- 1 Laboratory equipment item  
- 2 Staff members
- Demonstrates polymorphism in action

---

## Future Enhancements

### Potential Improvements

**Short Term (Next Iteration):**
- Input validation with regex patterns
- Configuration file for system settings
- Logging framework for audit trails
- Data export to CSV/Excel

**Medium Term (Version 2.0):**
- Database integration (MySQL/PostgreSQL)
- Multi-user support with authentication
- Email notifications for due dates
- Barcode scanning integration

**Long Term (Production Ready):**
- RESTful API development
- React/Angular web frontend
- Mobile application (iOS/Android)
- Cloud deployment (AWS/Azure)
- Real-time analytics dashboard
- Machine learning for predictive maintenance

---

##  Development Process

### Tools & Resources Used

**Development Environment:**
- IDE: Visual Studio Code
- Java Version: JDK 11
- Version Control: Git & GitHub

**Learning Resources:**
- ITS105 lecture materials and slides
- Java API Documentation (docs.oracle.com)
- Course textbook chapters 1-8
- Stack Overflow for specific debugging
- GitHub for repository hosting
---

## Support & Contact

**Project Repository:** `https://github.com/YOUR-USERNAME/UniversityInventorySystem`

**Developer Contact:**
-  Email: Khatrisujan052@gmail.com
-  GitHub: sujankhatri3

**Course Instructor:**
-  Brighter Agyemang
-  brighter.agyemang@naps.edu.au

---

##  Academic Integrity Statement

This project represents original work completed independently for the ITS105 Programming Fundamentals course. All external resources, code snippets, and references have been properly documented and attributed within the source code comments.

No plagiarism detection tools were triggered during development. This work adheres to NAPS academic integrity policies.

**Sujan Khatri**  
February 02, 2026

---

##  Assignment Compliance

### Requirements Checklist

-  Task 1: Basic Classes & Arrays (6 marks)
-  Task 2: Inheritance & Polymorphism (8 marks)
-  Task 3: Exception Handling (6 marks)
-  Task 4: Decision Structures (7 marks)
-  Task 5: Loops & Processing (6 marks)
-  Task 6: Integration & Main App (4 marks)
-  GitHub Repository Setup (Public)
-  Comprehensive README.md
-  Code Comments & Documentation
-  Loom Video Presentation (Ready)

**Total Marks Available:** 40  
**Presentation Quality:** 5

---
**Copyright © 2026 Sujan Khatri - NAPS**

---
