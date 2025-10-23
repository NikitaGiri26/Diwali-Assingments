package com.demo.dao;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeDao {
    void addEmployee(Employee e);
    Employee findById(int id);
    List<Employee> findAll();
    boolean removeById(int id);
}
