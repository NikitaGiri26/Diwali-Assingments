package com.demo.dao;

import java.util.List;
import com.demo.beans.Student;

public interface StudentDao {
	boolean addStudent(Student s);

	boolean deleteByRoll(int roll);

	boolean modifyByRoll(int roll, double score, double att);

	Student getByRoll(int roll);

	List<Student> getAll();

	void writeFile(String fname);

	void readFile(String fname);
}
