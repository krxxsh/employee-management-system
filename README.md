# Employee Management System

This is a simple Employee Management System implemented in Java. It allows you to add and retrieve employee records from a MySQL database.

## Features

- Add new employees with their name, designation, and salary.
- Retrieve a list of all employees from the database.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- JDBC Driver for MySQL

## Setup Instructions

1. **Clone the repository** or download the source code.

2. **Create a MySQL database**:
   - Open MySQL and run the following SQL command to create the database:
     ```sql
     CREATE DATABASE mydb;
     ```
   - Use the database:
     ```sql
     USE mydb;
     ```

3. **Create the Employee table**:
   - Run the SQL script located in `Data.sql` to create the necessary table:
     ```sql
     CREATE TABLE employee (
         id INT PRIMARY KEY AUTO_INCREMENT,
         name VARCHAR(100) NOT NULL,
         designation VARCHAR(50) NOT NULL,
         salary DECIMAL(10, 2) NOT NULL
     );
     ```

4. **Configure Database Connection**:
   - Open `DatabaseConnection.java` and update the following constants with your MySQL database credentials:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/mydb"; // Database name
     private static final String USER = "root"; // Database username
     private static final String PASSWORD = "password"; // Database password
     ```

5. **Compile and Run the Application**:
   - Compile the Java files:
     ```bash
     javac -d bin src/com/example/employeemanagement/*.java src/com/example/employeemanagement/dao/*.java src/com/example/employeemanagement/model/*.java src/com/example/employeemanagement/util/*.java
     ```
   - Run the application:
     ```bash
     java -cp bin com.example.employeemanagement.Main
     ```

## Usage

- The application will add a couple of employees to the database when run.
- You can modify the `Main.java` file to add more employees or to retrieve and display all employees from the database.

