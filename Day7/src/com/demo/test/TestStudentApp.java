package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.exception.LowAttendanceException;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService sservice = new StudentServiceImpl();
        sservice.readFile("students.dat");
        int choice = 0;

        do {
            System.out.println("\n==== Student Menu ====");
            System.out.println("1. Add new Student");
            System.out.println("2. Delete by Roll No");
            System.out.println("3. Modify by Roll No");
            System.out.println("4. Display all");
            System.out.println("5. Display by Roll No");
            System.out.println("6. Display sorted by Attendance");
            System.out.println("7. Calculate Grade");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = sservice.addNewStudent();
                    System.out.println(status ? "Added successfully" : "Not added");
                }
                case 2 -> {
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    System.out.println(sservice.deleteByRoll(roll) ? "Deleted" : "Not found");
                }
                case 3 -> {
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter new score: ");
                    double score = sc.nextDouble();
                    System.out.print("Enter new attendance: ");
                    double att = sc.nextDouble();
                    System.out.println(sservice.modifyByRoll(roll, score, att) ? "Modified" : "Not found");
                }
                case 4 -> {
                    List<Student> list = sservice.getAll();
                    list.forEach(System.out::println);
                }
                case 5 -> {
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    Student s = sservice.getByRoll(roll);
                    System.out.println(s != null ? s : "Not found");
                }
                case 6 -> {
                    List<Student> sorted = sservice.getAllSortedByAttendance();
                    sorted.forEach(System.out::println);
                }
                case 7 -> {
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    Student s = sservice.getByRoll(roll);
                    if (s != null) {
                        try {
                            System.out.println("Grade: " + s.calculateGrade());
                        } catch (LowAttendanceException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Not found");
                    }
                }
                case 8 -> {
                    sservice.writeFile("students.dat");
                    System.out.println("All data saved. Exiting...");
                    sc.close();
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}



// Create a class Student with following details: rollno, sname, course,
// attendance_percentage, score
// 1. Add constructors - default and parameterized
// 2. Add method – calculateGrade()
// 3. If the attendance_percentage is lesser than 60%, throw a user defined exception
// and print appropriate message
// 4. Store 10 student objects in file using serialization
// 5. Create appropriate collection for storing students in the decreasing order of
// attendance_percentage