package com.demo.dao;

import java.io.*;
import java.util.*;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slist = new ArrayList<>();

	@Override
	public void readFile(String fname) {
		File f = new File(fname);
		if (!f.exists())
			return;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))) {
			while (true) {
				Student s = (Student) ois.readObject();
				slist.add(s);
			}
		} catch (EOFException e) {
			// reached end of file
		} catch (Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	@Override
	public boolean addStudent(Student s) {
		return slist.add(s);
	}

	@Override
	public boolean deleteByRoll(int roll) {
		return slist.removeIf(s -> s.getRollno() == roll);
	}

	@Override
	public boolean modifyByRoll(int roll, double score, double att) {
		for (Student s : slist) {
			if (s.getRollno() == roll) {
				s.setScore(score);
				s.setAttendance_percentage(att);
				return true;
			}
		}
		return false;
	}

	@Override
	public Student getByRoll(int roll) {
		for (Student s : slist)
			if (s.getRollno() == roll)
				return s;
		return null;
	}

	@Override
	public List<Student> getAll() {
		return slist;
	}

	@Override
	public void writeFile(String fname) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
			for (Student s : slist) {
				oos.writeObject(s);
			}
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	}

}
