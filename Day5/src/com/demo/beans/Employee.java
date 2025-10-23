package com.demo.beans;

public class Employee {
    private String empName;
    private int empID;
    private String empRole;

    // No-argument constructor
    public Employee() {
        this.empRole = "Unknown";
    }

    // Constructor with empID and empName (empRole is hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee"; // hardcoded role
    }

    // Constructor with all three
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters and Setters
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    // toString
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }
}












