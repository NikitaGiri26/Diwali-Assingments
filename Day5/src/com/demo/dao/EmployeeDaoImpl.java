package com.demo.dao;


import java.util.*;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private static List<Employee> empList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        empList.add(e);
    }

    @Override
    public Employee findById(int id) {
        for (Employee e : empList) {
            if (e.getEmpID() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return empList;
    }

    @Override
    public boolean removeById(int id) {
        return empList.removeIf(e -> e.getEmpID() == id);
    }
}
