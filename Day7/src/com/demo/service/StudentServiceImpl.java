package com.demo.service;

import java.util.*;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.comparators.AttendanceComparator;

public class StudentServiceImpl implements StudentService {
	private StudentDao sdao = new StudentDaoImpl();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void readFile(String fname) {
		sdao.readFile(fname);
	}

	@Override
	public boolean addNewStudent() {
		try {
			System.out.print("Enter Roll No: ");
			int r = sc.nextInt();
			System.out.print("Enter Name: ");
			String n = sc.next();
			System.out.print("Enter Course: ");
			String c = sc.next();
			System.out.print("Enter Attendance Percentage: ");
			double att = sc.nextDouble();
			System.out.print("Enter Score: ");
			double score = sc.nextDouble();
			Student s = new Student(r, n, c, att, score);
			return sdao.addStudent(s);
		} catch (Exception e) {
			System.out.println("Error adding student: " + e.getMessage());
			sc.nextLine();
			return false;
		}
	}

	@Override
	public boolean deleteByRoll(int roll) {
		return sdao.deleteByRoll(roll);
	}

	@Override
	public boolean modifyByRoll(int roll, double score, double att) {
		return sdao.modifyByRoll(roll, score, att);
	}

	@Override
	public Student getByRoll(int roll) {
		return sdao.getByRoll(roll);
	}

	@Override
	public List<Student> getAll() {
		return sdao.getAll();
	}

	@Override
	public List<Student> getAllSortedByAttendance() {
		List<Student> list = new ArrayList<>(sdao.getAll());
		Collections.sort(list, new AttendanceComparator());
		return list;
	}

	@Override
	public void writeFile(String fname) {
		sdao.writeFile(fname);
	}

}
