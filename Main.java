package com.example.employeemanagement;

import com.example.employeemanagement.dao.EmployeeDAO;
import com.example.employeemanagement.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Adding a new employee
        Employee emp1 = new Employee("John Doe", "Developer", new BigDecimal("60000"));
        employeeDAO.addEmployee(emp1);

        Employee emp2 = new Employee("Jane Smith", "Manager", new BigDecimal("80000"));
        employeeDAO.addEmployee