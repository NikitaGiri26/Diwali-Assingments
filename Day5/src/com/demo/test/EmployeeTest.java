package com.demo.test;


import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();

        // Create employees using different constructors
        Employee e1 = new Employee();
        e1.setEmpID(101);
        e1.setEmpName("Mani");
        e1.setEmpRole("Developer");

        Employee e2 = new Employee(102, "Ravi"); // Role hardcoded
        Employee e3 = new Employee(103, "Sneha", "Tester");

        // Add employees
        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);

        // Display all employees
        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);

        // Find employee by ID
        System.out.println("\nFind by ID (103):");
        System.out.println(service.getEmployee(103));

        // Remove employee
        System.out.println("\nRemoving ID 102...");
        service.deleteEmployee(102);

        System.out.println("\nEmployees after removal:");
        service.getAllEmployees().forEach(System.out::println);
    }
}
