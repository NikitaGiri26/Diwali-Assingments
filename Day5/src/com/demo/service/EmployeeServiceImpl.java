package com.demo.service;


import java.util.List;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao dao;

    public EmployeeServiceImpl() {
        dao = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee(Employee e) {
        dao.addEmployee(e);
    }

    @Override
    public Employee getEmployee(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAll();
    }

    @Override
    public boolean deleteEmployee(int id) {
        return dao.removeById(id);
    }
}

