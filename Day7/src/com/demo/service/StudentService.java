package com.demo.service;

import java.util.List;
import com.demo.beans.Student;
import com.demo.beans.LowAttendanceException;

public interface StudentService {
    void addStudents() throws LowAttendanceException;
    void saveStudentsToFile();
    void displayAllStudents();
}
