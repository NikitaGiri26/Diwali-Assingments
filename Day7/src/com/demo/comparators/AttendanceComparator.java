package com.demo.comparators;

import java.util.Comparator;
import com.demo.beans.Student;

public class AttendanceComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAttendance_percentage() < s2.getAttendance_percentage())
			return 1;
		else if (s1.getAttendance_percentage() > s2.getAttendance_percentage())
			return -1;
		else
			return 0;
	}
}
