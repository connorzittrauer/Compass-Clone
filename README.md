# Compass Management System

The Compass Management System is a Java-based command-line application for managing a catalog of courses. Users can view, search, and manage a list of courses, as well as add and remove courses from their cart. 
This was the final project for CSC 285.

## Features

- View a list of all available courses
- Search for courses by Course ID (e.g., 'CHEM', 'MATH')
- Search for courses by Reference Number
- View course prerequisites
- Add and remove courses from the cart
- View cart and total price (including 15% sales tax)

## Design Patterns

This project implements the following design patterns:

- **Singleton**: The `CourseGenerator` and `UserGenerator` classes are Singletons, ensuring that only one instance of the class is created during the lifetime of the application. This pattern is used to manage the generation and storage of the course list and create users.
- **Composite**: The `Course` class uses the Composite design pattern to represent course prerequisites. This allows for courses to have complex prerequisite structures, including nested prerequisites.
- **Strategy**: The `ICourseManager` interface and its implementations (`FilterCourseID` and `FilterReferenceNumber`) demonstrate the Strategy design pattern. This pattern allows for different sorting and searching algorithms to be used interchangeably at runtime.