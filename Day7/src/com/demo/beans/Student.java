package com.demo.beans;

import java.io.Serializable;
import com.demo.exception.LowAttendanceException;

public class Student implements Serializable {
	private int rollno;
	private String sname;
	private String course;
	private double attendance_percentage;
	private double score;

	public Student() {
	}

	public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.attendance_percentage = attendance_percentage;
		this.score = score;
	}

	public int getRollno() {
		return rollno;
	}

	public String getSname() {
		return sname;
	}

	public String getCourse() {
		return course;
	}

	public double getAttendance_percentage() {
		return attendance_percentage;
	}

	public double getScore() {
		return score;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setAttendance_percentage(double attendance_percentage) {
		this.attendance_percentage = attendance_percentage;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String calculateGrade() throws LowAttendanceException {
		if (attendance_percentage < 60)
			throw new LowAttendanceException("Attendance below 60%! Grade cannot be calculated.");
		if (score >= 90)
			return "A+";
		else if (score >= 80)
			return "A";
		else if (score >= 70)
			return "B";
		else if (score >= 60)
			return "C";
		else
			return "D";
	}

	@Override
	public String toString() {
		return rollno + " | " + sname + " | " + course + " | Attendance: " + attendance_percentage + "% | Score: "
				+ score;
	}
}
