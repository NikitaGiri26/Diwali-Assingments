package com.demo.test;

import com.demo.beans.LowAttendanceException;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentApp {
    public static void main(String[] args) {
        StudentService sservice = new StudentServiceImpl();
        try {
            sservice.addStudents();
            sservice.saveStudentsToFile();
            sservice.displayAllStudents();
        } catch (LowAttendanceException e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        }
    }
}
