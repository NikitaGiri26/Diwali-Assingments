package com.demo.service;

import java.util.List;
import com.demo.beans.Student;

public interface StudentService {
	boolean addNewStudent();

	boolean deleteByRoll(int roll);

	boolean modifyByRoll(int roll, double score, double att);

	Student getByRoll(int roll);

	List<Student> getAll();

	List<Student> getAllSortedByAttendance();

	void writeFile(String fname);

	void readFile(String fname);
}
