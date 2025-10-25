package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendancePercentage;
    private double score;
    private String grade;

    public Student() {
        super();
    }

    public Student(int rollno, String sname, String course, double attendancePercentage, double score) {
        super();
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
        this.grade = calculateGrade();
    }

    public String calculateGrade() {
        if (attendancePercentage < 60) {
            grade = "Fail (Low Attendance)";
        } else if (score >= 85)
            grade = "A";
        else if (score >= 70)
            grade = "B";
        else if (score >= 50)
            grade = "C";
        else
            grade = "Fail";
        return grade;
    }

    // Getters and Setters
    public int getRollno() { return rollno; }
    public void setRollno(int rollno) { this.rollno = rollno; }

    public String getSname() { return sname; }
    public void setSname(String sname) { this.sname = sname; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getAttendancePercentage() { return attendancePercentage; }
    public void setAttendancePercentage(double attendancePercentage) { this.attendancePercentage = attendancePercentage; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course +
                ", attendance=" + attendancePercentage + "%, score=" + score + ", grade=" + grade + "]";
    }
}
