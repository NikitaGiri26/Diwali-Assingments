package com.demo.service;

import java.io.IOException;
import java.util.*;
import com.demo.beans.Student;
import com.demo.beans.LowAttendanceException;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
    private List<Student> slist;
    private StudentDao sdao;

    public StudentServiceImpl() {
        slist = new ArrayList<>();
        sdao = new StudentDaoImpl();
    }

    @Override
    public void addStudents() throws LowAttendanceException {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Student " + i);
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Course: ");
            String course = sc.next();
            System.out.print("Attendance Percentage: ");
            double att = sc.nextDouble();
            System.out.print("Score: ");
            double score = sc.nextDouble();

            if (att < 60)
                throw new LowAttendanceException("Attendance below 60% for Roll No: " + roll);

            slist.add(new Student(roll, name, course, att, score));
        }
        slist.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage())); // descending
    }

    @Override
    public void saveStudentsToFile() {
        try {
            sdao.saveAll(slist);
        } catch (IOException e) {
            System.out.println("❌ Error saving students: " + e.getMessage());
        }
    }

    @Override
    public void displayAllStudents() {
        try {
            List<Student> list = sdao.readAll();
            System.out.println("\n📚 Students from file:");
            list.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
}
