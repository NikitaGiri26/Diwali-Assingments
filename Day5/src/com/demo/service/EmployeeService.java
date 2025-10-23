package com.demo.service;


import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeService {
    void addEmployee(Employee e);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    boolean deleteEmployee(int id);
}
